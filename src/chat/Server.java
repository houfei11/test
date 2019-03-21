package chat;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 */
public class Server {
    // 运行在服务端的ServerSocket主要负责：1.向系统申请服务端口 2.监听申请的服务端口
    private ServerSocket server;
    // 保存所有客户端输出流的集合
    private List<PrintWriter> allOut;
    public Server()throws Exception{
        // 初始化的同时申请服务端口
        server = new ServerSocket(8198);
        allOut = new ArrayList<PrintWriter>();
    }
    // 将给定的输出流存入共享集合
    private synchronized void addOut(PrintWriter out){
        allOut.add(out);
    }
    // 将给定的输出流从共享集合中删除
    private synchronized void removeOut(PrintWriter out){
        allOut.remove(out);
    }
    // 将给定的消息发给所有客户端
    private synchronized void sendMessage(String message){
        for (PrintWriter out: allOut) {
            out.println(message);
        }
    }
    // 服务端开始方法
    public void start(){
        try{
            // ServerSocket的accept方法是一个阻塞方法，作用是监听服务端口
            while(true){
                System.out.println("等待客户端连接。。。");
                Socket socket = server.accept();
                System.out.println("连接成功！");
                // 启动一个线程，来完成客户端的交互工作
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try{
            Server server = new Server();
            server.start();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("服务端启动失败！！");
        }
    }
    // 该线程负责一个客户端的交互
    class ClientHandler implements Runnable{
        /**
         * 该线程处理客户端的Socket
         */
        private Socket socket;
        // 客户端的地址信息
        private String host;
        // 昵称
        private String nickName;

        public ClientHandler(Socket socket){
            this.socket = socket;
            // 通过sockt可以获取计算机的地址信息
            InetAddress address = socket.getInetAddress();
            // 获取ip地址
            host = address.getHostAddress();
        }
        @Override
        public void run() {
            PrintWriter pw = null;
            try{
                // 获取输入流，读取远程发送过来的消息
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                // 首先读取一串字符串
                nickName = br.readLine();
                sendMessage(nickName + "上线了！！");
                // 通过socket创建输出流用于把消息发给客户端
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
                pw = new PrintWriter(osw,true);
                // 将该客户端的输出流存入到共享集合中去
                addOut(pw);
                String message = null;
                while((message = br.readLine()) != null){
                  //  System.out.println(host + "说：" + message);
                  //  pw.println(host + "说：" + message);
                    // 广播消息
                    sendMessage(nickName + "说：" + message);
                }
            }catch(Exception e){
                e.printStackTrace();
            } finally {
                // 将该客户端的输出流从共享集合中删除
                removeOut(pw);
                // 处理当前客户端断开后的逻辑
                // System.out.println(host + "下线了！");
                sendMessage(nickName + "下线了！！");
                try{
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

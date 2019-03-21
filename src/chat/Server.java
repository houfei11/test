package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Server {
    // 运行在服务端的ServerSocket主要负责：1.向系统申请服务端口 2.监听申请的服务端口
    private ServerSocket server;
    public Server()throws Exception{
        // 初始化的同时申请服务端口
        server = new ServerSocket(8198);
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
        public ClientHandler(Socket socket){
            this.socket = socket;
            // 通过sockt可以获取计算机的地址信息
            InetAddress address = socket.getInetAddress();
            // 获取ip地址
            host = address.getHostAddress();
        }
        @Override
        public void run() {
            try{
                System.out.println(host + "上线了！");
                // 获取输入流，读取远程发送过来的消息
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String message = null;
                while((message = br.readLine()) != null){
                    System.out.println(host + "说：" + message);
                }
            }catch(Exception e){
                e.printStackTrace();
            } finally {
                // 处理当前客户端断开后的逻辑
                System.out.println(host + "下线了！");
                try{
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

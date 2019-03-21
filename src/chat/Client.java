package chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    // 封装了TCP协议，使用它就可以基于TCP协议进行网络通讯
    private Socket socket;
    public Client()throws Exception{
        System.out.println("正在连接服务端。。。");
        socket = new Socket("localhost",8198);
        System.out.println("服务端连接成功！");
    }
    // 启动客户端的方法
    public void start(){
        try{
            Scanner scanner = new Scanner(System.in);
            // 先要求用户输入一个昵称
            String nickName = null;
            while(true){
                System.out.println("请输入用户名：");
                nickName = scanner.nextLine();
                if (nickName.length()>0){
                    return;
                }
                System.out.println("输入有误！！");
            }
            System.out.println("欢迎你" + nickName + "! 开始聊天吧!");
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            PrintWriter pw = new PrintWriter(osw,true);
            // 先将昵称发送给服务器端
            pw.println(nickName);

            // 启动线程
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.start();
            while(true){
                // 将字符串发送至服务端
                pw.println(scanner.nextLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try{
            Client client = new Client();
            client.start();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("客户端启动失败！！");
        }
    }
    // 用来读取服务端发来的消息
    class ServerHandler implements Runnable{

        @Override
        public void run() {
            try{
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String message = null;
                while((message = br.readLine()) != null){
                    System.out.println(message);
                }
            }catch(Exception e){

            }
        }
    }
}

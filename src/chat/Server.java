package chat;

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
        server = new ServerSocket(8088);
    }
    // 服务端开始方法
    public void start(){
        try{
            // ServerSocket的accept方法是一个阻塞方法，作用是监听服务端口
            System.out.println("等待客户端连接。。。");
            Socket socket = server.accept();
            System.out.println("连接成功！");
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
}

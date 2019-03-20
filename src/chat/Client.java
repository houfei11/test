package chat;

import java.net.Socket;

/**
 * 聊天室客户端
 */
public class Client {
    // 封装了TCP协议，使用它就可以基于TCP协议进行网络通讯
    private Socket socket;
    public Client()throws Exception{
        System.out.println("正在连接服务端。。。");
        socket = new Socket("localhost",8088);
        System.out.println("服务端连接成功！");
    }
    // 启动客户端的方法
    public void start(){

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
}

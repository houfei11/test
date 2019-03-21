package chat;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            PrintWriter pw = new PrintWriter(osw,true);
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
}

package socket.UDPServer;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress=InetAddress.getByName("localhost");

        byte[] date="用户名：admin 密码：123".getBytes();
        DatagramPacket packet=new DatagramPacket(date,date.length,inetAddress,8800);

        DatagramSocket socket=new DatagramSocket();

        socket.send(packet);
        System.out.println("发送成功");

    }
}

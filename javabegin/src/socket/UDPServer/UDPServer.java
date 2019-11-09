package socket.UDPServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(8800);


        byte bytes[]=new byte[1024];
        DatagramPacket packet= new DatagramPacket(bytes,bytes.length);


        System.out.println("***服务器连接已建立***");
        socket.receive(packet);

        String info=new String(bytes,0,packet.getLength());
        System.out.println("服务器输出"+info);


    }
}

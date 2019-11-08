package socket.SignIn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8878);

        System.out.println("**等待客户端连接**");
        Socket socket =null;
        while (true){
            socket = serverSocket.accept();
            ServerThread st=new ServerThread(socket);
            st.start();

        }


//        socket.close();


    }
}

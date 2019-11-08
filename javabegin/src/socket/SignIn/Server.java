package socket.SignIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8878);

        System.out.println("**等待客户端连接**");
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        String line = null;
        while((line = br.readLine())!=null){
            System.out.print(line);
        }
        socket.shutdownInput();

        socket.close();
        is.close();
        isr.close();
        br.close();

    }
}

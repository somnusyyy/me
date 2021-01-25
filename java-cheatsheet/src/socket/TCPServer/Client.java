package socket.TCPServer;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8878);
        OutputStream os = socket.getOutputStream();
        PrintWriter pw=new PrintWriter(os);

        pw.write("用户名:admin 密码:123456");
        pw.flush();

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        String line = null;
        while((line = br.readLine())!=null){
            System.out.print(line);
        }
        socket.shutdownInput();

        is.close();
        isr.close();
        br.close();
        socket.close();
        os.close();
        pw.close();

    }
}
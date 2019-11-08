package socket.SignIn;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8878);
        OutputStream os = socket.getOutputStream();
//        OutputStreamWriter osw=new OutputStreamWriter(os);
//        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(os);

        pw.write("用户名:admin 密码:123456");
        pw.flush();

        socket.shutdownOutput();

        socket.close();
        os.close();
        pw.close();






    }
}

package socket.TCPServer;
/*
*使用多线程实现多端共用一台服务器
 */

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {


        InputStream is = null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        OutputStream os=null;
        PrintWriter pw=null;

        try {
            //服务器读取数据
            is = socket.getInputStream();
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            String line = null;
            while((line = br.readLine())!=null){
                System.out.print(line);
            }

            socket.shutdownInput();

            //服务器输出数据
            os = socket.getOutputStream();
            pw=new PrintWriter(os);
            pw.write("welcome");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //结束进程
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(pw!=null)
                pw.close();
            if(is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(isr!=null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

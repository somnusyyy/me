package socket;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class urlDemo {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.baidu.com");
        InputStream is = url.openStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        while(br.readLine()!=null){
            System.out.println(br.readLine());
        }
    }
}

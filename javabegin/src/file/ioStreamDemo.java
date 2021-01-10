package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fos=new FileInputStream("E:\\java\\javabegin\\src\\file\\/1234.txt");
        FileOutputStream fos2=new FileOutputStream("E:\\java\\javabegin\\src\\file\\123.txt");

        int by;
        while((by=fos.read())!=-1){
            fos2.write(by);
//            System.out.print((char)by);
        }

        fos.close();
        fos2.close();
    }
}

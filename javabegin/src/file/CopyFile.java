package file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {


//        InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\java\\javabegin\\src\\file\\FileDemo.java"));
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\java\\javabegin\\src\\file\\theCopyFile"));

        FileReader fr=new FileReader("E:\\java\\javabegin\\src\\file\\FileDemo.java");
        FileWriter fw=new FileWriter("E:\\java\\javabegin\\src\\file\\theCopyFile");
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);

        char[] chs=new char[1024];
        int len;
        while((len=br.read(chs))!=-1){
            bw.write(new String(chs,0,len));
//            System.out.print(new String(chs,0,len));
        }


        br.close();
        bw.close();
        fw.close();
        fr.close();
    }
}

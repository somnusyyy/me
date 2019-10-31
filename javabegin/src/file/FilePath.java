package file;

import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File F=new File("E:\\java\\javabegin");
        getPath(F);

    }

    public static void getPath(File File){
        File[] filesArray = File.listFiles();
        if(filesArray!=null){
            for(File file:filesArray){
                String name = file.getName();
                if(file.isDirectory())
                {
                    getPath(file);
                }
                else
                    System.out.println(name);

            }
        }


    }
}

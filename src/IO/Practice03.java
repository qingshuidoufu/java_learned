package IO;

import java.io.*;

public class Practice03 {
    public static void main(String[] args) {
        File src=new File("src/IO/practice01.java");
        InputStream is=null;
        try {
            is=new FileInputStream(src);
            int temp;
            while ((temp=is.read())!=-1){
                System.out.print((char)temp);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null==is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

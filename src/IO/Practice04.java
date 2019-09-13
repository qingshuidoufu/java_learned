package IO;

import java.io.*;

public class Practice04 {
    public static void main(String[] args) {
        File src=new File("pratice01.txt");
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
            if(null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package IO;

import java.io.*;

public class Practice02 {
    public static void main(String[] args) {
        File src=new File("pratice01.txt");
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(src);
            int temp;
            while((temp=inputStream.read())!=-1){
                System.out.print((char)temp);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if (null==inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

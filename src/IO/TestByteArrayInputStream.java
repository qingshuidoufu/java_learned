package IO;

import java.io.*;

public class TestByteArrayInputStream {
    public static void main(String[] args) {
        byte[] src="talk is cheap show me the code".getBytes();

        InputStream inputStream=null;

        try {
            inputStream=new ByteArrayInputStream(src);
            byte[] flush=new byte[5];
            int len=-1;
            while((len=inputStream.read(flush))!=-1){
                String str=new String(flush,0,len);
                System.out.print(str);
            }

        }  catch (IOException e) {
            e.printStackTrace();
        } finally {


            if(null==inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package IO;

import java.io.*;

public class Practice05 {
    public static void main(String[] args) {
        File src=new File("testOutPutStream");
        OutputStream os=null;
        try {
            os=new FileOutputStream(src);
            String st="this is my first txt";
            byte[] by=st.getBytes();
            os.write(by,0,by.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(null==os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

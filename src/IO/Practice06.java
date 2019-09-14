package IO;

import java.io.*;
import java.lang.reflect.Field;

public class Practice06 {
    public static void main(String[] args) {
        File src=new File("testOutPutStream.txt");
        OutputStream os=null;
        try {
            os=new FileOutputStream(src);
            String st=("hahahahhahahahahah xiao junqing is my king");
            byte[] by=st.getBytes();
            os.write(by,0,by.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

package IO;

import java.io.*;

public class Practice07 {
    public static void main(String[] args) {
        File src=new File("testOutPutStream.txt");
        OutputStream os=null;
        try {
            os=new FileOutputStream(src,true);
            String st="hello heool hoeel heel hahahah!";
            byte[] datas=st.getBytes();
            os.write(datas,0,datas.length);
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

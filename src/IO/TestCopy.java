package IO;

import java.io.*;

//使用文件输入流和输出流实现文件的拷贝
public class TestCopy {
    public static void main(String[] args)  {
        File src =new File("p.jpg");
        File dest=new File("pcopy.jpg");
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(src);
            os=new FileOutputStream(dest);

            byte[] flush=new byte[1024];
            int len=-1;
            while((len=is.read(flush))!=-1){
                    os.write(flush,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分别关闭:先打开的后关闭
            if(null==os){
                try {

                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

package IO;
//使用try...with...resource自动释放资源
import java.io.*;

//使用文件输入流和输出流实现文件的拷贝
public class TestCopyWithTryWithResource {
    public static void main(String[] args)  {
        File src =new File("p.jpg");
        File dest=new File("pcopy.jpg");

        try (InputStream is=new FileInputStream(src);
             OutputStream os=new FileOutputStream(dest)){

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
        }
    }
}

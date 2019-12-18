package IO;

import java.io.*;
import java.util.Scanner;

//使用文件输入流和输出流实现文件的拷贝
public class TestCopy {
    public static void main(String[] args)  {
        String myString,copyString;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的源文件名:");
        myString=scanner.nextLine();
        System.out.println("请输入你的目标文件名:");
        copyString=scanner.nextLine();
        File src =new File(myString);
        File dest=new File(copyString);
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
            System.out.println("复制成功!");
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

package IO;

import java.io.*;

//理解操作步骤
//1.创建源
//2.选择流
//3.操作
//4.是否释放资源
public class IOTest01 {
    public static void main(String[] args)  {
        //1.创建源
        File src =new File("abc.txt");
        InputStream is=null;
        //2.选择流
        try {
             is=new FileInputStream(src);
            //3.操作(读取)
            byte[] flush=new byte[1024*10];//缓冲容器
            int len=-1;//接受长度
            //3.操作(分段读取)
            while ((len=is.read(flush))!=-1){
                //字节数组还原到字符串
                String str=new String(flush,0,len);
                System.out.print(str);
            }

            //4.释放资源
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {if (null==is){
                is.close();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

package IO;
//文件字节输出流

import java.io.*;

//1.创建源
//2.选择流
//3.操作
//4.释放资源
public class IOTest04 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("dest.txt");
        //2.选择流
        OutputStream os=null;
        try {
            os=new FileOutputStream(src,true);//true为追加
            String msg="IO is so easy";
            byte[] datas=msg.getBytes();//字符串--->字节数组(编码)
            os.write(datas,0,datas.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{

            //释放资源
            if (null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

package IO;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

//转换流inuptStreamReader  OutputStreamWriter
//以字符流的作用操作字节流
//指定字符集
public class ConvertTest {
    public static void main(String[] args) {
        //操作System.in和System.out
        try(//操作网络流 下载百度的源代码
            BufferedReader reader = new BufferedReader(new  InputStreamReader(new URL("http://www.baidu.com").openStream(),"utf-8") );
            ){
            //操作 读取
               String msg;
                while ((msg=reader.readLine())!=null){
                    System.out.print(msg);
                }


        }catch (IOException e){
            System.out.println("操作异常");
        }



    }
}

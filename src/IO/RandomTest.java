package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;

public class RandomTest {
    public static void main(String[] args) throws IOException {

        //指定起始位置,读取剩余所有内容
        //随机读取和写入流RandomAccessFile
        RandomAccessFile raf = new RandomAccessFile(new File("C:/java_workplace/java_learned/println.txt"), "r");

        //随机读取
        raf.seek(2);
        byte[] flush=new byte[1024];
        int len =-1;
        while((len=raf.read(flush))!=-1){
            System.out.println(new String (flush,0,len));
        }

        raf.close();

    }
   public void  test01()throws IOException{
       RandomAccessFile raf = new RandomAccessFile(new File("C:/java_workplace/java_learned/println.txt"), "r");

       //随机读取
       raf.seek(2);
       byte[] flush=new byte[1024];
       int len =-1;
       while((len=raf.read(flush))!=-1){
           System.out.println(new String (flush,0,len));
       }

       raf.close();
   }
}

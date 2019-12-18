package HomeWork;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandom1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf=new RandomAccessFile("rtest.dat","rw");
            //上一行中的"rw"是什么意思?   答:以读写的方式打开文件
            for (int i=0;i<10;i++){
                rf.writeDouble(i*1.414);
            }
            rf.close();
            rf=new RandomAccessFile("rtest.dat","rw");
            rf.seek(5*8);//本行是什么意思?    答:以将指针移动到第五个值中,方便writeDouble将第五个值改为47.0001
            rf.writeDouble(47.0001);
            rf.close();
            rf=new RandomAccessFile("rtest.dat","r");
            for (int i = 0; i < 10; i++) {
                System.out.println("value"+i+":"+rf.readDouble());

            }
            rf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package HomeWork;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        //请问new ByteArrayOutputStream()做了哪些工作?
        //答:在堆空间一个ByteArrayOutputStream类的对象baos,
        // 实际上,这个对象是以数组实现的,内部维护了一个自动增加长度的字节数组

        DataOutputStream dos=new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            //请查查阅api文档,再说明baos.toByteArray()返回的是什么?
            //答:baos.toByteArray()返回的是一个字符数组
            System.out.println(bais.available());
            //请查查阅api文档,再说明bais.available()
            //答:bais.available()返回的是流中可读取的余下字节数,无字节可读则返回0
            DataInputStream dis=new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            //以上两行顺序可以交换吗?为什么?
            //答:不可交换,因为dos中输入适合是先输入一个double型数据在输入一个boolean型数据,
            // dis读取的时候也必须先读取double型数据再读取boolean型数据,否则会出错
            dos.close();dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

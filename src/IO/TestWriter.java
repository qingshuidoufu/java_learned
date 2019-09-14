package IO;

import java.io.*;

public class TestWriter {
    public static void main(String[] args) {
        File src =new File("abc.txt");

        Writer writer=null;

        try {
            writer=new FileWriter(src);
            //写法1
//            String msg="IO is so easy,我透你大爷";
//            char[] datas=msg.toCharArray();//字符串-->字节数组
//            writer.write(datas,0,datas.length);
//            writer.flush();
            //写法2
//            String msg="IO is so easy,我透你大爷";
//            writer.write(msg);
//            writer.flush();
            //写法3
            writer.append("IO is so easy,").append("我透你大爷");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {


            if(null==writer){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

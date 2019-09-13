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
            int temp;
            while ((temp=is.read())!=-1){
                System.out.println(temp);
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

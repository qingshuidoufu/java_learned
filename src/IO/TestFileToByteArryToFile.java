package IO;

import java.io.*;

public class TestFileToByteArryToFile {
    public static void main(String[] args) {
        //图片转成字节数组
        byte[] datas=fileToByteArray("p.jpg");
        System.out.println(datas.length);
        byteArrayToFile(datas,"p-byte.png");

    }
    //图片到字节数组
    //图片到程序 FileInputStream
    //程序到字节数组 ByteArrayOutputStream
    public static byte[] fileToByteArray(String filePath){
        File src=new File(filePath);
        FileInputStream fs=null;
        ByteArrayOutputStream baos=null;
        try {
            fs=new FileInputStream(src);
            baos=new ByteArrayOutputStream();
            byte[] flush=new byte[1024*10];
            int len=-1;
            while((len=fs.read(flush))!=-1){
                baos.write(flush,0,len);
            }
            baos.flush();
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(null!=baos){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=fs){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    //字节数组到图片
    //1.字节数组读取到程序中 ByteArrayInputStream
    //2.程序写出到文件 FileOutputStream
    //

    public static void byteArrayToFile(byte[] src,String filePath){
            File dest=new File(filePath);
            ByteArrayInputStream baos=null;
            FileOutputStream fos=null;

        try {
            baos=new ByteArrayInputStream(src);
            fos=new FileOutputStream(dest);
            byte[] datas=new byte[1024];
            int len=-1;
            while((len=baos.read(datas))!=-1){
                fos.write(datas,0,len);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}



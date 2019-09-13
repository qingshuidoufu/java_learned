package IO;

import java.io.File;

//构建File对象
public class FileDemo01 {
    public static void main(String[] args) {
        String path="C:/Users/清水豆腐/Pictures/微信图片_20190630132925.jpg";
        //构建1
        File f= new File(path);
        System.out.println(f);
        System.out.println(f.length());

        //构建2
        f= new File("C:/Users/清水豆腐/Pictures","微信图片_20190630132925.jpg");

        //构建3
        f=new File (new File("C:/Users/清水豆腐/Pictures"),"微信图片_20190630132925.jpg");



         //相对路径和绝对路径
        //存在盘符:绝对路径
        f=new File(path);
        System.out.println("++++++++++");
        System.out.println(f.getAbsolutePath());
        //没有盘符:相对路径
        f=new File("微信图片_20190630132925.jpg");
        System.out.println(f);
        System.out.println("+++++++++=");
        System.out.println(f.getAbsolutePath());//此路径不存在,File可构建不存在的

    }

}

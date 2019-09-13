package IO;

import java.io.File;

//其他信息
//字节数
public class Filedemo05 {
    public static void main(String[] args) {
        File src=new File("C:/Users/清水豆腐/Pictures/微信图片_20190630132925.jpg");

        System.out.println("长度:"+src.length());

        src=new File("C:/Users/清水豆腐/Pictures");
        System.out.println(src.length());
    }
}

package IO;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File src=new File("C:/Users/清水豆腐/Pictures/微信图片_20190630132925.jpg");
        //基本信息
        System.out.println("名称:"+src.getName());
        System.out.println("路径:"+src.getPath());
        System.out.println("绝对路径:"+src.getAbsolutePath());
        System.out.println("父路径:"+src.getParent());
        System.out.println("父对象:"+src.getParentFile());
        System.out.println("++++++++++++++");
        //文件状态
        //1.不存在:exits
        //2.存在:
                //文件:isFile
                //文件夹:isDirectory

        System.out.println("是否存在:"+src.exists());
        System.out.println("是否文件:"+src.isFile());
        System.out.println("是否文件夹:"+src.isDirectory());

        src=new File("xxx");
        if (!src.exists()){
            System.out.println("文件不存在");
        }else{
            if(src.isFile()){
                System.out.println("文件操作");
            }else{
                System.out.println("文件夹操作");
            }
        }



    }
}

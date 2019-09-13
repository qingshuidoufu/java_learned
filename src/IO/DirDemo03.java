package IO;
//递归:方法自己调用自己
//递归头:结束递归
//递归体:重复调用的

import java.io.File;

//打印子孙级目录和名称
public class DirDemo03 {
    public static void main(String[] args) {
        File src=new File("C:/java_workplace/java_learned");
            printName(src,0);
    }
    //打印子孙级目录和文件名称
    public static void printName(File src,int deep){
        //控制层次
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println(src.getName());
        if (null==src||!src.exists()){//递归头
            return;
        }else if (src.isDirectory()){//目录
            for(File s:src.listFiles()){
               printName(s,deep+1);//递归体
            }
        }
    }
}

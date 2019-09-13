package IO;

import java.io.File;

//列出下一级
//1.list():列出下一级名称
//2.listFileS():列出下一级File对象

public class DirDemo02 {
    public static void main(String[] args) {
        File dir=new File("C:/java_workplace/java_learned");
        //列出下级名称
        String[] subNames=dir.list();
        for (String s:subNames
             ) {
            System.out.println(s);
        }
        System.out.println("++++++++++++++");

        //下级对象listFileS()
        File [] subFiles=dir.listFiles();
        for (File f:subFiles
             ) {
            System.out.println(f);
        }
        System.out.println("+++++++++++++");
        //所有盘符
        File[] roots=dir.listRoots();
        for (File f:roots
             ) {
            System.out.println(f);
        }
    }
}

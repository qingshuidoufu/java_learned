package test;

import java.io.File;

//递归打印目录树
public class TestRecursionFileTree {
    public static void main(String[] args) {
        File f=new File("C:\\java_workplace");
        printFile(f,0);

    }
    static void printFile(File file,int level){
        //输出层数
        for (int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for (File temp:files){
                printFile(temp,level+1);
            }
        }
    }
}


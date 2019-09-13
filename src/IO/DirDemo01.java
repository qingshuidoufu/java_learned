package IO;
//创建目录
//mkdir():确保上级目录存在,不存在则失败
//mkdirs():上级目录可以不存在,不存在则一同创建

import java.io.File;

public class DirDemo01 {
    public static void main(String[] args) {
        File dir=new File("C:/java_workplace/java_learned/src/IO/dir/text");
        //创建目录
        boolean flag=dir.mkdirs();
        System.out.println(flag);

        //
    }
}

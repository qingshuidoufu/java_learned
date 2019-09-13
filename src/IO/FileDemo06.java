
package IO;
//创建文件,不存在才创建
//不能创建文件夹

import java.io.File;
import java.io.IOException;

public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        File src=new File("C:/java_workplace/java_learned/io.txt");
        boolean flag=src.createNewFile();
        System.out.println(flag);//不存在才创建
        //不是文件夹
//        src=new File("C:/java_workplace/java_learned");
//        flag=src.createNewFile();
//        System.out.println(flag);

        //删除
        flag=src.delete();
        System.out.println(flag);

        //补充: con com3....操作系统的设备名,不能正确创建


    }
}

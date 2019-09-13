package IO;

import java.io.File;

public class DirDemo05 {
    public static void main(String[] args) {
        File src = new File("C:/java_workplace/java_learned");

    }

    public static long len = 0;

    //获取大小
    public static void count(File src) {

        //获取大小
        if (null != src && src.exists()) {//递归头
            if (src.isFile()) {
                len += src.length();
            } else {//子孙级
                for (File s :
                        src.listFiles()) {
                    count(s);
                }
            }

        }
    }
}

package IO;

import java.io.*;

public class TestPrint {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=System.out;
        ps.println("打印流");
        ps.println(true);
        ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("println.txt")),true);
        ps.println(true);

        //重定向输出端
        System.setOut(ps);
        System.out.println("change");
        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("back");
    }
}

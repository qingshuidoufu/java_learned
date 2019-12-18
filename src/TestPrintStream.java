import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) {
        PrintStream ps=null;
        try {
            FileOutputStream fos=new FileOutputStream("d:\\test\\log.dat");
            ps=new PrintStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(ps!=null){
            System.setOut(ps);
        }
        int ln=0;
        for (char c=0;c<=60000;c++){
            System.out.print(c+" ");
            if(ln++>=100){
                System.out.println();
                ln=0;
            }
            //请问上两行在控制台上输出结果了吗?
            //答:没有在控制台上输出结果
            //如果没有,结果在哪里?为什么会出现这种情况?
            //答:结果在d:\test\log.dat中,因为System.setOut(ps);设置了输出端为一个文件
        }
    }
}

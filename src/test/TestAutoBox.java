package test;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.net.Inet4Address;

public class TestAutoBox {
    public static void main(String[] args) {
        Integer a=234;//Inerger a=Integer.valueOf(234)
        int b=a;//编译器会修改成int b=a.intValue();

        Integer c=null;
        if(c!=null) {
            int d = c;         //自动拆箱调用了c.intValue()
        }

        //缓存[-128,127]之间的数字.实际上就是系统初始化的时候创建了[-128,127]之间的缓存数组
        //当我们调用valueOf()的时候,首先检查是否在[-128,127],如果在这个范围则直接从缓存数组中拿出已经缓存好的对象
        Integer in1=-128;
        Integer in2=-128;
        System.out.println(in1==in2);//true 因为128在缓存范围
        System.out.println(in1.equals(in2));//true
        System.out.println("######");
        Integer in3=1234;
        Integer in4=1234;
        System.out.println(in3==in4);//false 不在缓存范围
        System.out.println(in3.equals(in4));//true
    }
}

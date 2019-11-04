package HomeWork;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class SampleBaozhuang {
    public static void main(String[] args) {
        Integer I1=new Integer(10);
        Integer I2=new Integer("20");
        int i1=I1.intValue();
        String s1=I2.toString();
        String s2=Integer.toString(30);
        String s3=Integer.toString(30,8);
        Integer I3=Integer.valueOf("40");
        Integer I4=Integer.valueOf("40",16);
        int i2=Integer.parseInt("50");
        int i3=Integer.parseInt("50",8);
        System.out.println(I1+"\n"+I2+"\n"+i1+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+I3+"\n"+I4+"\n"+i2+"\n"+i3+"\n");

    }
}

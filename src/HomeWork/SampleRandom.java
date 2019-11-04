package HomeWork;

import java.util.Random;

public class SampleRandom {
    public static void main(String[] args) {
        Random r=new Random();
        double d1=r.nextDouble();
        double d2=r.nextDouble()*5;
        double d3=r.nextDouble()*1.5+1;
        int n1=r.nextInt();
        int n2=r.nextInt(10);
        //int n2=Math.abs(r.nextInt()%10);
        System.out.println(d1+"\n"+d2+"\n"+d3+"\n"+n1+"\n"+n2+"\n");
    }

}

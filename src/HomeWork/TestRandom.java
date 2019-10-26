package HomeWork;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r=new Random();
        int[] a=new  int[10000];
        for(int i=0;i<10000;i++){
            a[i]=(Math.abs(r.nextInt()%6)+1);
            System.out.print(a[i]+" ");
        }
    }
}

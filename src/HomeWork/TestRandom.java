package HomeWork;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r=new Random();
        int[] a=new  int[10000];
        int[] count=new int[7];
        for(int i=0;i<10000;i++){
            a[i]=(Math.abs(r.nextInt()%6)+1);
            switch(a[i]){
                case 1:count[1]++;break;
                case 2:count[2]++;break;
                case 3:count[3]++;break;
                case 4:count[4]++;break;
                case 5:count[5]++;break;
                case 6:count[6]++;break;
                default:break;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 1; i <7; i++) {
            System.out.println(i+"出现的次数:"+count[i]);
        }
    }
}

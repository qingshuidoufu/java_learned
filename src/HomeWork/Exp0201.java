package HomeWork;

import com.sun.media.jfxmediaimpl.HostUtils;
import jdk.internal.util.xml.impl.Input;


import java.util.Scanner;

public class Exp0201 {
    public static void main(String[] args) {
        double result;
        System.out.println("请输入a,b,c:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入方程的a:");
        double  a=scanner.nextDouble();
        System.out.println("请输入方程的b:");
        double b=scanner.nextDouble();
        System.out.println("请输入方程的c:");
        double c=scanner.nextDouble();

        double deta=b*b-4*a*c;
        if ((b*b-4*a*c)>0){
            System.out.println("此方程有两个解:");
            System.out.println("x1="+((-b)+Math.sqrt(deta))/2);
            System.out.println("x2="+((-b)-Math.sqrt(deta))/2);
        }
        else if ((b*b-4*a*c)==0){
            System.out.println("此方程有一个解:");
            System.out.println("x="+(b+Math.sqrt(deta))/2);
        }
        else{
            System.out.println("此方程无实数解");
        }

    }


}

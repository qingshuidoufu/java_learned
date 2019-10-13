package HomeWork;

import java.awt.*;
import java.util.Scanner;

public class process {//求C1和C2的面积和周长

    public static void main(String[] args) {
        circle c1=new circle(1);
        circle c2=new circle(3,3,4);
        System.out.println("c1的面积:"+c1.S());
        System.out.println("c1的周长:"+c1.L());
        System.out.println("c2的面积:"+c2.S());
        System.out.println("c2的周长:"+c2.L());
        System.out.println("######################");

        System.out.println("c1和c2的关系:"+judgeCircle(c1,c2));
        System.out.println("###################");

        Scanner s=new Scanner(System.in);
        shape point=new shape(s.nextInt(),s.nextInt());
        System.out.println("点和c1的关系:"+judgePoint(c1,point));
        System.out.println("点和c2的关系:"+judgePoint(c2,point));


    }

    public static String judgeCircle(circle c1,circle c2){

        if(c1.distance(c2.getX(),c2.getY())>(c1.getR()+c2.getR())){
            return "相离";
        }
        else if (c1.distance(c2.getX(),c2.getY())==(c1.getR()+c2.getR())){
            return "外切";
        }

        else if (c1.distance(c2.getX(),c2.getY())>Math.abs(c1.getR()-c2.getR())&&c1.distance(c2.getX(),c2.getY())<c1.getR()+c2.getR()){
            return "相交";
        }
        else if (c1.distance(c2.getX(),c2.getY())==Math.abs(c1.getR()-c2.getR())){
            return "内切";
        }
        else {
            return "包含";
        }
    }
    public static String judgePoint(circle c,shape s){
        if (c.distance(s.getX(),s.getY())>c.getR()){
            return "在圆外";
        }
        else if (c.distance(s.getX(),s.getY())<=c.getR()){
            return "在圆内";
        }
        else{
            return null;
        }
    }
}

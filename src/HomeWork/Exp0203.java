package HomeWork;

import java.util.Scanner;

public class Exp0203 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的工资:");
        double wage=scanner.nextDouble();
        double tax = 0;
        if (wage<=3500){
            tax =0;
        }
        else if (wage<=5000){
            tax=wage*0.03;
        }
        else if (wage<=8000){
            tax=wage*0.1;
        }
        else if (wage<=12500){
            tax=wage*0.2;
        }
        else if (wage<=38500){
            tax=wage*0.25;
        }
        else if (wage<=58500){
            tax=wage*0.3;
        }
        else if (wage<=83500){
            tax=wage*0.35;
        }
        else if (wage>83500){
            tax=wage*0.35;
        }
        System.out.println("个人所得税:"+tax);
    }
}

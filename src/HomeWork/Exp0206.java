package HomeWork;

import javax.swing.*;
import java.util.Scanner;

public class Exp0206 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //弹出输入框输入的方法:
//        String str;
//        int n=0;
//        str= JOptionPane.showInputDialog("请输入n:");
//        n=Integer.parseInt(str);


        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i*10+2;
        }
        System.out.println(sum);
    }
}

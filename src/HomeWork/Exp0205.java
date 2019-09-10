package HomeWork;

import javax.swing.*;

public class Exp0205 {
    public static void main(String[] args) {
        String str;
        int n=0;
        str= JOptionPane.showInputDialog("请输入n:");
        n=Integer.parseInt(str);
        System.out.println(n);
        System.out.println(sum(n));
    }
    public static double sum(double n){
        if (n==1){
            return 1;
        }
        else {
            return ((1/n)+sum(n-1));

        }
    }
}

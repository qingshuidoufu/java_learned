package test;

public class testOverload {
    public static void main (String[] args){
        System.out.println(add(3,5));//8
       /* System.out.println(add(3,5,10));//18
        System.out.println(add(3.0,5));//8.0
        System.out.println(add(3,5.0));//8.0*/

    }
    //求和的方法
    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }}
    //返回值不同不构成重载
    /*public static double add(int n1,int n2){
        double sum=n1+n2;
        return sum;
    }*/
    //参数名不同不构成重载
   /* public static int add(int n2,int n1){
       int sum=n1+n2;
        return sum;
    }
}*/

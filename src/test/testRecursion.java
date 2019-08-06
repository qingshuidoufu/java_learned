package test;

public class testRecursion {
    public static void main (String[] args){
            a();
            long d1=System.currentTimeMillis();
            System.out.printf("%d阶乘的结果:%s%n",10,factoria(10));
            long d2=System.currentTimeMillis();
            System.out.printf("递归耗时:%s%n",d2-d1);
    }
    static int count=0;
     static void a(){
        System.out.println("a");
        count++;
        if (count<10){
            a();
        }
        else return;
    }
    static long factoria(int n){
         if (n==1){  //递归头
             return 1;
         }
         else {  //递归体
             return n*factoria(n-1);  //n!=n*(n-1)!
         }
    }
}


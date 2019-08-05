package test;

public class testMethod {
    public static void main(String[] args){
        //通过对象调用普通方法
        testMethod tm=new testMethod();
    tm.printMyName();
    int c=tm.add(30,40,50)+1000;
    System.out.println(c);
    }
    void printMyName(){
        System.out.println("我叫肖俊清");
        System.out.println("你叫肖俊清");
        System.out.println("我们都叫肖俊清");

    }
    int  add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
        return sum;   //1,结束方法的运行 2,返回值
    }
}

package test;

public class testThis {
    int a,b,c;
    testThis(int a,int b){
        this.a=a;
        this.b=b;
    }
    testThis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }
    void sing(){

    }
    void eat(){
        this.sing();//调用本类中的sing();
        System.out.println("你妈妈喊你回家吃饭");
    }
    public static void main (String[] args){
        testThis hi=new testThis(2,3);
        hi.eat();
    }

}



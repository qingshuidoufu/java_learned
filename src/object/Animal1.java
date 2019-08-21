package object;

abstract public class Animal1{    //抽象类
    //第一:没有实现
    //第二:子类必须实现
        abstract public void shout1();    //抽象方法
   public void run(){
       System.out.println("跑啊跑啊");
   }
}
class Dog1 extends Animal1{

    @Override
    public void shout1() {
        System.out.println("汪汪汪");
    }
}
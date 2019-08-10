package object;

public class TestOverride {

}
class Vehicle{
    public void run(){
        System.out.println("跑");
        }
    public void stop(){
        System.out.println("停止");
        }
        public Person whoIsPsg(){
        return new Person();
        }
}
class Horse extends Vehicle{
    public void run(){
        System.out.println("四蹄翻飞,得得得");//重写,覆盖
    }
    public Student whoIsPsg(){  //返回值类型小于等于父类类型
        return new Student("xnmk",19,"ddjfjdf");
    }
//    public Object whoIsPsg(){  //不能返回大于的
//        return new Object();
//    }
}
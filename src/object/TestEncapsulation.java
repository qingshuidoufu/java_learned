package object;

public class TestEncapsulation {
    public static void main (String[] args){
    Human h=new Human();
   // h.age=13;
        h.name ="bitch";
    }
}
class Human{
     private int age;
     String name;   //不加这包里的所有能用
    void sayAge(){
        System.out.println(age);
    }
}
class Boy extends Human{
    void sayHello(){
        //System.out.println(age);   //子类无法使用父类的属性和方法
    }
}

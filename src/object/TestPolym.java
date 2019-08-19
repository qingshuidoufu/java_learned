package object;

public class TestPolym {
    public static void main(String[] args) {
        Animal a=new Animal();
        animalCry(a);//正常调用
        System.out.println("******************");
        Dog d=new Dog();
        animalCry(d);//父类animal调用子类dog即为多态

        Animal d2=new Dog();//向上自动转型
        animalCry(d2);
        animalCry(new Cat());

        Dog d3=(Dog)d2; //强制向下转型
        d3.seeDoor();
    }
    static void animalCry(Animal a){    //父类调用调用子类方法
        a.shout();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}

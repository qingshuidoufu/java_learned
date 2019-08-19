package object;

public class TestPolym {
    public static void main(String[] args) {
        Animal a=new Animal();
        animalCry(a);//正常调用
        System.out.println("******************");
        Dog d=new Dog();
        animalCry(d);//父类animal调用子类dog

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
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}

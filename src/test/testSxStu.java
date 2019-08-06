package test;

public class testSxStu {  //一个java文件可以多个类,但是只能一个public的类


    //属性fields
    int id;
    String name;
    int age;
    Computer comp; //计算机
     //methods
    void study(){
        System.out.println("我在认真学习!!!"+comp.brand);
    }
    void play (){
        System.out.println("我在玩游戏");
    }
    //程序执行的入口,必须要有
    public static void main(String[] args){
        testSxStu stu=new testSxStu();  //创建一个对象
        stu.id=1001;
        stu.name="jack" ;
        stu.age=18;
        Computer c1=new Computer();
        c1.brand="lenovo";

        stu.comp=c1;

        stu.play();
        stu.study();
    }

}
class Computer{
    String brand;
}
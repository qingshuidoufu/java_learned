package test;

public class testSxStu {


    //属性fields
    int id;
    String name;
    int age;

     //methods
    void study(){
        System.out.println("我在认真学习!!!");
    }
    void play (){
        System.out.println("我在玩游戏");
    }
    public static void main(String[] args){
        testSxStu stu=new testSxStu();
        stu.play();
    }
}
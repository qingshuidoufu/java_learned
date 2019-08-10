package object;

public class TestExtends {
    public static void main (String[] args){
//        Student stu=new Student();
//        stu.name="小明";
//        stu.height=172;
//        stu.rest();
       Student stu2=new Student("嘻嘻",6,"挖掘机");
       stu2.rest();
       stu2.study();

        System.out.println(stu2 instanceof Student);
        System.out.println(stu2 instanceof Person);
        System.out.println(stu2 instanceof Object);   //默认继承的类

        Person per=new Person();
        System.out.println(per instanceof Student);


    }




}
class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一下");
    }

}
class Student extends Person{

    String major;

    public void study(){
        System.out.println("学习两个小时");
    }
public Student(String name,int height,String major){
this.name=name;
this.height=height;
this.major=major;
}
}
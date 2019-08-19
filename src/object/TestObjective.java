package object;

public class TestObjective {
    public static void main(String[] args){
       Object obj;
    TestObjective to=new TestObjective();
    System.out.println(to.toString());
    Person2 p2=new Person2("jack",6);
    System.out.println(p2);

    }
    public String toString(){
        return "测试object对象";
    }

}
class Person2{
    String name;
    int age;
    @Override
    public String toString (){
        return name +"年龄: "+"age";
    }
    public Person2 (String name ,int age ){
        this.name=name;
        this.age=age;
    }
}
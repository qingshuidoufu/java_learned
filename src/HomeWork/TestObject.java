package HomeWork;

class MyObject {
    public String toString(){
        return "MyObject" ;
    }
}
public class TestObject{
    public static void main(String[] args) {
        MyObject obj1=new MyObject();
        MyObject obj2=new MyObject();

        String s1=new String ("123456");
        String s2=new String ("123456");

        if (obj1==obj2) System.out.println("obj1引用==obj2引用");
        else System.out.println("obj1引用!=obj2引用");

        if (obj1.equals(obj2)) System.out.println("obj1对象==obj2对象");
        else System.out.println("obj1对象!=obj2对象");

        if (s1==s2) System.out.println("s1引用==s2引用");
        else System.out.println("s1引用!=s2引用");

        if(s1.equals(s2)) System.out.println("s1对象==s2对象");
        else System.out.println("s1对象!=s2对象");
    }
}

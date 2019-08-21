package object;

public class TestInnerClass {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner=new Outer().new Inner();
        inner.show();
    }
}
class  Outer{
    private int age=10;
    public void testOuter(){
        System.out.println("out");
    }
   class Inner{  //可以直接使用外部类属性方法
        int age=20;
        public void  show(){
            int age=30;
            System.out.println("外部类的成员变量age"+Outer.this.age);
            System.out.println("内部类成员变量age"+this.age);
            System.out.println("局部变量age"+age);

        }
    }
}
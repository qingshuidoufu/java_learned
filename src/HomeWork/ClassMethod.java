package HomeWork;

class FClassMethod{ //父类

}
public class ClassMethod extends FClassMethod{   //子类
    private int i;
    public ClassMethod(int i){
        this.i=i;
    }
    public ClassMethod(){this.i=1;}

    public static void main(String[] args) {
        ClassMethod t=new ClassMethod(10);
        Class c1=null;
        Class c2;
        Class<?> c3;

        try{
            c1=t.getClass();//getClass方法的作用是什么:获取这个对象运行时的类
            c2=double.class;//.class属性的作用是什么:返回基本数据类型double的class类型
            //c3=Class.forName("java.lang.Double");
            c3=Class.forName("HomeWork.ClassMethod");//Class.forName()是什么方法?作用是什么:是一个静态方法,用于加载对象,返回与给定的字符串名称相关联类或接口的Class对象。
            System.out.println("c1的表示实体名称:"+c1.getName());//getName()方法的作用是什么:getName以 String 的形式返回此 Class 对象所表示的实体名称。
            System.out.println("c2表示的实体名称:"+c2.getName());
            System.out.println("c3表示的实体名称 :"+c3.getName());

            ClassMethod t1=t.getClass().newInstance();
            ClassMethod t2=(ClassMethod)Class.forName("HomeWork.ClassMethod").newInstance();//(ClassMethod)的作用是什么:强制转型,将新创建的对象强制转型为(ClassMethod)类型的对象

            t2.i=200;
            System.out.println("新创建的TestClass对象的t1的成员变量i="+t1.i);
            System.out.println("新创建的TestClass对象的t2的成员变量i="+t2.i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("test类的父类名称:"+c1.getSuperclass().getName());//getSuperclass()的作用是什么获得c1对象的对应类的超类
        }
    }
}

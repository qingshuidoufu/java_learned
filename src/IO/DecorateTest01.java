package IO;

import java.awt.print.PageFormat;

//实现放大器对声音的放大功能
public class DecorateTest01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.say();

        //装饰
        Amplifer am=new Amplifer(p);
        am.say();
    }

}
interface Say{
    void say();
}
class Person implements Say{
//属性
    private int voidce=10;
    @Override
    public void say() {
        System.out.println("人的声音:"+this.getVoidce());
    }

    public int getVoidce() {
        return voidce;
    }

    public void setVoidce(int voidce) {
        this.voidce = voidce;
    }

}
class Amplifer implements Say{
    private Person p;
    @Override
    public void say() {
        System.out.println("人的声音:"+p.getVoidce()*100);
        System.out.println("噪音>>>>>");
    }

    public Amplifer(Person p) {
        this.p = p;
    }
}
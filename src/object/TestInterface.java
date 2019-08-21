package object;
//测试接口和实现类
public class TestInterface {
    public static void main(String[] args) {
       Angel v=new Angel();
       v.fly();
    }

}


//飞行接口类
interface  Volant{
    int     FLY_HEIGHT=100;
    void fly();
}


interface Honest{
    void helpOther();
}

//实现类


class Angel implements Volant, Honest { //可以实现多个父接口


    @Override
    public void fly() {
        System.out.println("飞起来");
    }

    @Override
    public void helpOther() {
        System.out.println("帮助别人");
    }
}
class GoodMan implements  Honest{

    @Override
    public void helpOther() {
        System.out.println("帮助别人");
    }
}
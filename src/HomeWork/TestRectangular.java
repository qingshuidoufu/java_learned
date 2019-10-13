package HomeWork;

public class TestRectangular {
    public static void main(String[] args) {
        Rectangular r=new Rectangular(0,0,20,10);
        shape s=new shape(30,40);
        System.out.println("矩形的周长为:"+r.L());
        System.out.println("矩形的面积为:"+r.S());
        System.out.println("矩形的对角线长度为:"+r.D());
        System.out.println("矩形和点的关系:"+r.judge(s));
    }
}

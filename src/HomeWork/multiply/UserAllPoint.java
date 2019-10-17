package HomeWork.multiply;

public class UserAllPoint {
    public static void main(String args[])
    {
        Point p1=new Point(1,2);//新创建一个Point对象
        p1.draw();       //调用P1的draw方法,打印Point:a point(1,2)
        p1=new ColorPoint(1,2,3);
        p1.draw();      //p1引用指向ColorPoint对象,调用p1的draw方法:ColorPoint: a color point. (1,2,3)
        p1=new MapPoint(1,2,3,"123");
        p1.draw();         // //p1引用指向MapPoint对象,调用p1的draw方法:MapPoint: a map color point. (1,2,3,123)
    }

}

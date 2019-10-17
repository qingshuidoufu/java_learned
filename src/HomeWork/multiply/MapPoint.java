package HomeWork.multiply;

public class MapPoint extends ColorPoint
/*类MapPoint 是类ColorPoint的直接子类, 类ColorPoint是类MapPoint 的
直接父类；类Object、Point是为MapPoint的不是直接父类，*/
{
    String  name;                   //地图上的点有自己的名字，如城市名
    protected MapPoint(int x,int y,int color,String name)
    {
        super(x,y,color);
        this.name=name;
    }
    public  void draw()            //覆盖了父类的draw（）类
    {
        System.out.println("MapPoint: a map color point. ("+this.x+","+this.y+","+this.color+","+this.name+")");
    }

}

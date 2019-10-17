package HomeWork.multiply;

public class ColorPoint extends Point{
    /*类ColorPoint是类Point的直接子类，类Point是类ColorPoint的
直接父类；类Object是为ColorPoint的缺省父类，但不是直接
父类*/

    protected  int color;
    protected ColorPoint(int x,int y,int color)
    {super(x,y);
        this.color=color;}
    public void draw()   //覆盖了父类的draw（）类
    {
        System.out.println("ColorPoint: a color point. ("+this.x+","+this.y+","+this.color+")");
    }

}

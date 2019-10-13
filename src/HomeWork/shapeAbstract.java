package HomeWork;

public abstract  class shapeAbstract {
    private double x;
    private double y;

    public abstract double getX();  //抽象方法

    public abstract double getY();  //抽象方法

    public abstract void  setX(double x);   //抽象方法

    public abstract void setY(double y);   //抽象方法

    public final double distance(double x,double y)   //最终方法
    {	return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));	}
    public abstract double S();    //抽象方法
    public abstract double L();    //抽象方法

}

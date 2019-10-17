package HomeWork.Interface;

public class Shape {
    private double x;
    private double y;
    public Shape()
    {	x=0;y=0;}
    public  Shape(double x,double y)
    {	this.x=x;this.y=y;	}
    public double getX()
    {	return x;	}
    public void  setX(double x)
    {	this.x=x;	}
    public double getY()
    {	return y;	}
    public void  setY(double y)
    {	this.y=y;	}
    public double distance(double x,double y)
    {	return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));	}

}

package HomeWork;

public class shape {
    private double x;
    private double y;
    public  shape()
    {	x=0;y=0;}
    public  shape(double x,double y)
    {	this.x=x;this.y=y;	}
    public double getX()
    {	return x;	}

    public double getY() {
        return y;
    }

    public void  setX(double x)
    {	this.x=x;	}
    public double distance(double x,double y)
    {	return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));	}

}

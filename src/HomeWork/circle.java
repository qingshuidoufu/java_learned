package HomeWork;

public class circle extends shape{
    private double r;
    public circle(){	super();		r=0;	}
    public circle(double r){super();	this.r=r;}
    public circle(double x,double y,double r){super(x,y);	this.r=r;}

    public double S(){
        return 3.14*r*r;
    }
    public double L(){
        return 3.14*2*r;
    }

    public double getR() {
        return r;
    }
}

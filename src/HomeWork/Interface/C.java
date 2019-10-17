package HomeWork.Interface;

public class C extends Shape implements  shapeIF              {
    private double r;
    public C(){	super();		r=0;	}
    public C(double r){super();	this.r=r;}
    public C(double x,double y,double r){super(x,y);	this.r=r;}

    public double S(){
        return PI*r*r;
    }

    @Override
    public double L() {
        return 2*PI*r;
    }


}

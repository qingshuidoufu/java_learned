package HomeWork;

public class Circle1 {
    double x;
    double y;
    double r;

    public Circle1(){
        x = 0;		y = 0;		r = 0;
    }

    public Circle1(double r){
        x = 0;
        y = 0;
        this.r = r;
    }
    public Circle1(double x,double y){
        this.x= x;
		this.y= y;
        r = 0;
    }

    public Circle1(double x,double y,double r){
        new Circle1(x,y);
        this.r = r;
    }

    public Circle1(Point p,double r){
        this( p.x,p.y);
        this.r = r;
    }

    public Circle1(double r,Point p){
        this(r);
        x=p.x;
        y=p.y;


    }

}

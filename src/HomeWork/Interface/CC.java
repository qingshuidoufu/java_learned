package HomeWork.Interface;

public class CC extends Shape implements DistanceIF,shapeIF  {
    private double r;
    public CC(){	super();		r=0;	}
    public CC(double r){super();	this.r=r;}
    public CC(double x,double y,double r){super(x,y);	this.r=r;}

    public double S(){
        return  PI *r*r;
    }
    public double L(){
        return PI*2*r;
    }

    public double D(double x,double y){
        return   distance(x,y);
    }

    public double DD(double x,double y){
        if(D(x,y)<r)return 0;        //返回0表示在圆内
        else if(D(x,y)==r)return 1;  //返回1表示在圆上
        else return 2;               //返回2表示在圆外
    }

}

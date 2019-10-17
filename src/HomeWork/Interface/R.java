package HomeWork.Interface;

public class R extends Shape implements shapeIF                                {
    private double a;//长
    private double b;//宽
    //构造方法
    R()
    {	super();a=0;b=0;	}
    R(double newA,double newB)
    {	super();a=newA;	b=newB;	}
    R(double newX,double newY,double newA,double newB)
    {	super(newX,newY);a=newA;	b=newB;	}

    @Override
    public double S() {
        return a*b;
    }

    @Override
    public double L() {
        return 2*(a+b);
    }
    //成员方法







}

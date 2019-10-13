package HomeWork;

public class circle1 extends shapeAbstract{
    private double x;
    private  double y;
    private double  length;
    private double  width;

    public circle1(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setX(double x) {
        this.x=x;
    }

    @Override
    public void setY(double y) {
        this.y=y;
    }

    @Override
    public double S() {
        return length*width;
    }

    @Override
    public double L() {
        return 2*length+2*width;
    }
}

package HomeWork;

public class Point {
    double x;
    double y;
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(double xx,double yy){
        return Math.sqrt(Math.pow(x-xx,2)+Math.pow(y-yy,2));
    }

    public static void main(String[] args) {
        Point p=new Point();
        p.x=3;
        p.y=4;
        System.out.println(p.distance());
        System.out.println(p.distance(3,4));
    }
}

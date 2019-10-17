package HomeWork;

public class CCCircle {
    class Point{
        int x;
        int y;

         public Point(int x, int y) {
             this.x = x;
             this.y = y;
     }
    }
    public  Point xin;
    public int r;
    public CCCircle() {

    }
    public CCCircle(Point p,int r) {
       this.xin=p;
        this.r=r;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.xin.x-p.x,2)+Math.pow(this.xin.y-p.y,2));
    }

    public static void main(String[] args) {
        //建立圆心
        CCCircle ccCircle= new CCCircle();
        Point yuanXin=ccCircle.new Point(10,10);
        //建立圆类
        CCCircle ccc=new CCCircle(yuanXin,2);
        //建立点类
        Point p=ccc.new Point(5,5);

        System.out.println("离圆心的距离"+ccc.distance(p));
        if (ccc.distance(p)<ccc.r){
            System.out.println("在圆内");
        }
        else if (ccc.distance(p)==ccc.r){
            System.out.println("在圆上");
        }
        else{
            System.out.println("在圆外");
        }

    }
}

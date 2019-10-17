package HomeWork.multiply;

public class Point {
    protected int x;
    protected int y;
    protected Point(int x, int y)
    { this.x=x;
        this.y=y;
    }
    public void draw()	             //父类的draw（）方法
    { System.out.println("Point:a point("+this.x+","+this.y+")");
    }

}

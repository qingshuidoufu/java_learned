package HomeWork;

public class Rectangular extends shape{
    int length;
    int width;

    public Rectangular(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangular(double x, double y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    //计算周长
    public int L(){
        return length*2+width*2;
    }
    //计算面积
    public int S(){
        return length*width;
    }
    //计算对角线长度
    public double D(){
        return this.distance(this.getX()+length,this.getX()+width);
    }
    //判断点与矩形的关系
    public String judge(shape s){
        if (s.getX()>=this.getX()&&s.getX()<=this.getX()+length&&s.getY()>=this.getY()&&s.getY()<=this.getY()+width){
            return "在矩形内";
        }
        else{
            return "在矩形外";
        }
    }
}

package HomeWork;

public class PPoint {
    int x;
    int y;
    int z;
    public double distance(){ //到原点的距离
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }
    public double distance (int xx,int yy,int zz){//两个点的距离
        return Math.sqrt(Math.pow(x-xx,2)+Math.pow(y-yy,2)+Math.pow(z-zz,2));
    }


}

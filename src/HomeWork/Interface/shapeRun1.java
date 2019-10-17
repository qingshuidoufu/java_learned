package HomeWork.Interface;

public class shapeRun1 {
    public static void main(String args[])
    {
        String str;





        CC c1=new CC(1,2,5);//如果把这句改为ShapeIF c1=new CC(1,2,5);
        //或者改为DistanceIF c1=new CC(1,2,5);
        //程序将会出现什么情况，请讲明原因！
        //程序会报错,接口不能new出对象


        System.out.println(c1.S());
        System.out.println(c1.L());
        System.out.println(c1.D(3, 4));
        if(c1.DD(3,4)==0)str="圆内";
        else if(c1.DD(3,4)==1)str="圆上";
        else str="圆外";
        System.out.println(str);
    }

}

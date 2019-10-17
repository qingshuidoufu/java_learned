package HomeWork.Interface;

public class shapeRun {
    public static void main(String args[])
    {
        R r1;
        C c1;
        r1=new R(2,2,8,10);
        System.out.println(r1.S());
        System.out.println(r1.L());

        c1=new C(1,2,5);

        System.out.println(c1.S());
        System.out.println(c1.L());
    }

}

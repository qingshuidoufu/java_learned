package HomeWork;

public class TestDivideByZero {
    public class DivideByZeroEx extends Exception{
        DivideByZeroEx(){
            System.out.println("出现错误:除数为0");
        }
    }
    public void div (double a,double b) throws DivideByZeroEx {
        if (b==0){
            throw new DivideByZeroEx();
        }
        else{
            System.out.println("b不为0除出来得到:"+a/b);
        }
    }

    public static void main(String[] args) {
        int a=2;
        int b=0;
        TestDivideByZero t=new TestDivideByZero();
        try {
            t.div(a,b);
        } catch (DivideByZeroEx divideByZeroEx) {
            divideByZeroEx.printStackTrace();
        }
        //改变b的值
        b=1;
        try {
            t.div(a,b);
        } catch (DivideByZeroEx divideByZeroEx) {
            divideByZeroEx.printStackTrace();
        }
    }

}

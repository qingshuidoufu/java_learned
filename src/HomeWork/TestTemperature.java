package HomeWork;

import java.util.Random;

public class TestTemperature {
    public class MyException extends Exception {
        public MyException(){ }
        public MyException(String msg){
            super(msg);
            System.out.println("体温高于38");
        }
    }

    double[] temperature =new double[3];
    double sum=0;
    double pin;
    public TestTemperature(){
        for(int i=0;i<3;i++){
            temperature[i]=37.5+Math.random()%2;
        }
        for (int i = 0; i < 3; i++) {
            sum+=temperature[i];
        }
        pin=sum/3;
    }
    public void TemperatureException()throws MyException{

        if (pin>38){
            throw new MyException("体温高于38");
        }
    }
    public static void main(String[] args) {
       TestTemperature t=new TestTemperature();
        System.out.println("第一次体温:"+t.temperature[0]);
        System.out.println("第二次体温:"+t.temperature[1]);
        System.out.println("第三次体温:"+t.temperature[2]);
        System.out.println("平均体温:"+t.pin);


        try {
            t.TemperatureException();
        } catch (MyException e) {
            e.printStackTrace();
        }


    }
}

package HomeWork;

public class Complex {
    private int realValue;
    private int notRealValue;

    public Complex(int realValue, int notRealValue) {
        this.realValue = realValue;
        this.notRealValue = notRealValue;
    }
   Complex(){

    }

    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }

    public void setNotRealValue(int notRealValue) {
        this.notRealValue = notRealValue;
    }

    public int getRealValue() {
        return realValue;
    }

    public int getNotRealValue() {
        return notRealValue;
    }

    public Complex  add(Complex c){//加
        realValue=realValue+c.realValue;
        notRealValue=realValue+c.notRealValue;
        return this;
    }
    public Complex minus(Complex c){ //减
        realValue=realValue-c.realValue;
        notRealValue=notRealValue-c.notRealValue;
        return  this;
    }
    public Complex multiply(Complex c){  //乘
        realValue=realValue*c.realValue-notRealValue*c.notRealValue;
        notRealValue=notRealValue*c.realValue+realValue*c.notRealValue;
      return this;
    }
    public Complex divide(Complex c){  //除
        realValue=(realValue*c.realValue+notRealValue*c.notRealValue)/(c.realValue*c.realValue+c.notRealValue*c.notRealValue);
        notRealValue=(notRealValue*c.realValue-realValue*c.notRealValue)/(c.realValue*c.realValue+c.notRealValue*c.notRealValue);
        return  this;
    }
    public double mode(){ //取模
        double m;
        m=Math.sqrt(realValue*realValue+notRealValue*notRealValue);
        return m;
    }
}

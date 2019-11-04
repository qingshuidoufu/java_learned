package HomeWork.Exception;



public class Student {
    public class MyException  extends Exception{
       public  MyException(){
           System.out.println("m大于1000");
        }
    }
    public void speak(int m) throws MyException{
        if(m>1000){
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        Student s=new Student();
        try {
            s.speak(1200);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

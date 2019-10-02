package HomeWork;
 public class Human{

        private int age; //私有(只能在同一个类中访问)
        String sex;//默认(能在同一个类中,同一个包中访问)
        protected  int money;//被保护(在同一个类中,同一个包中,子类中,都可以访问,其他类中不能访问)
        public String name;//公有(都能访问)

     public void introduce(){
        //本类中都能访问
         System.out.println("姓名:"+name+"年龄:"+age+"性别:"+sex+"钱:"+money);
     }

 }
 class RichMan extends Human{//子类


 public void introduce(){
     //在子类中私有属性age不能访问(报错)
     System.out.println("姓名:"+name+"年龄:"+age+"性别:"+sex+"钱:"+money);
 }

}

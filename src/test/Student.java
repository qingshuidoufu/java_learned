package test;

import HomeWork.Human;

public class Student  {
    public void introduce(){
        Human human = new Human();
        //在其他类中只有public 的属性可以访问
        System.out.println("姓名:"+human.name+"年龄:"+human.age+"性别:"+human.sex+"钱:"+human.money);
    }

}

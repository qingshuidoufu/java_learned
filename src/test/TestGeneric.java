package test;

import java.util.ArrayList;
import java.util.List;

//测试泛型
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc=new MyCollection<String>();
        mc.set("jack",0);
        String b=mc.get(0);
        List list=new ArrayList();

    }
}
class MyCollection <E>{
    Object[] objs=new Object[5];

    public void set(E e,int index){
        objs[index]=e;
    }
    public E get(int index){
        return (E)objs[index];
    }
}

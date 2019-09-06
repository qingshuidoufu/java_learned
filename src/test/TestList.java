package test;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

//测试collection接口的方法
public class TestList {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("jack");
        c.add("marry");
        System.out.println(c);
        System.out.println(c.size());
        Object[] objs=c.toArray();
        System.out.println(c.contains("jack"));

        System.out.println(objs);

        c.remove("jack");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());



    }
}

package test;
//测试collections工具类
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add("jack"+i);
        }
        System.out.println(list);
        Collections.shuffle(list);//随机填充list中的元素
        System.out.println(list);

        Collections.reverse(list);//逆序
        System.out.println(list);

        Collections.sort(list);//按照递增的方式序....自定义类用Comparable排接口
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"jack8"));





    }

}

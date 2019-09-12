package map;

import java.util.HashSet;
import java.util.Set;
//set没有顺序不可重复
//list有顺序可重复
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("aaa");
        set1.add("abb");
        set1.add("aaa");
        System.out.println(set1);
        set1.remove("abb");
        System.out.println(set1);

        Set<String> set2=new HashSet<>();
        set2.add("jack");
       set2.addAll(set1);
        System.out.println(set2);

    }
}

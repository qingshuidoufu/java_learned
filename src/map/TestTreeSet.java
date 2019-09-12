package map;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(300);
        set.add(200);
        set.add(600);
        //按照元素递增的方式排好序
        for (Integer m:set
             ) {
            System.out.println(m);
        }
    }
}

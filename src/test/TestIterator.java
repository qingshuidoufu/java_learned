package test;
//使用iterator遍历
import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        //testIterator();
        testIteratorMap();
    }
    public static void testIterator(){
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for(Iterator<String> iter=list.iterator();iter.hasNext();){
           String temp= iter.next();
            System.out.println(temp);
        }
    }
    public static void testIteratorMap(){
        Map<Integer,String> map1=new HashMap<>();
        map1.put(100,"aa");
        map1.put(200,"bb");
        map1.put(300,"cc");
        //第一种方式
        Set<Map.Entry<Integer,String>> ss=map1.entrySet();
        for (Iterator<Map.Entry<Integer,String>>iter=ss.iterator ();iter.hasNext();){
            Map.Entry<Integer,String> temp=iter.next();
            System.out.println(temp.getKey()+"--"+temp.getValue());
        }
        System.out.println("++++++++++");
        //第二种方式
        Set<Integer> keySet=map1.keySet();
        for (Iterator<Integer>iter=keySet.iterator();iter.hasNext();){
            Integer key=iter.next();
            System.out.println(key+"---"+map1.get(key));
        }
    }


}

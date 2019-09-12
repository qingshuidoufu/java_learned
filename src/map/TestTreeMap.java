package map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treeMap1=new TreeMap<>();
        treeMap1.put(20,"aa");
        treeMap1.put(3,"bb");
        treeMap1.put(6,"cc");
        //Set按照key递增的方向排序,map无排序
        for(Integer key:treeMap1.keySet()){
            System.out.println(key+"---"+treeMap1.get(key));
        }
        Map<Emp,String> treeMap2=new TreeMap<>();
        treeMap2.put(new Emp(100,"张三",5000),"张三是个好小伙子");
        treeMap2.put(new Emp(200,"李四",6000),"李四工作不积极");
        treeMap2.put(new Emp(150,"王五",8000),"王五工作还不错");
        treeMap2.put(new Emp(160,"赵六",8000),"赵六是个傻子");

        for(Emp key:treeMap2.keySet()){
            System.out.println(key+"---"+treeMap2.get(key));
        }
    }

}
class Emp implements Comparable <Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+id+","+"name:"+name+"salary:"+salary;
    }

    @Override
    public int compareTo(Emp o) {//负数小于,0等于,整数大于
        if (this.salary>o.salary){
            return 1;
        }else if (this.salary<o.salary){
            return -1;
        }else{
            if (this.id>o.id){
                return 1;
            }else if(this.id<o.id) {
                return -1;
            }
        }
        return 0;
    }
}

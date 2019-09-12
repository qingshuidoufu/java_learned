package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {
            Employee e1=new Employee(1001,"jack",50000);
        Employee e2=new Employee(1002,"mary",30000);
        Employee e3=new Employee(1003,"jason",20000);
        Employee e4=new Employee(1001,"lili",80000);
        Map<Integer,Employee> map=new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        map.put(1001,e4);
        Employee emp=map.get(1001);
        System.out.println(emp.getEname());
        System.out.println(map);


    }

}//雇员信息
class Employee{
    private int id;
    private String ename;
    private double salary;

    @Override
    public String toString() {
        return "id:"+id+"+name:"+ename;
    }

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package object;

public class TestPersonEncapsulation {
    private int id;
    private String name ;
    private int age;
    private boolean man;

    public void setName(String name){
        this.name=name;
    }
    public String  getName(){
        return this.name;
    }
    public void setAge(int age){   //通过设置属性私有提供方法实现高内聚的功能
        if (age>=1&&age<=130){
            this.age=age;
        }
        else {
            System.out.println("请输入正常的年龄");
        }
    }

    public int getAge() {
        return this.age;
    }
    public int getId(){
        return this.id;
    }
}

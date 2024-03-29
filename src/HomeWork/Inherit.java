package HomeWork;
class Person{
    private String name;
    private String location;

    public Person(String name){
        this.name=name;
        this.location="beijing";
    }
    public Person(String name,String location){
        this.name=name;
        this.location=location;
    }
    public String info(){
        return "name:"+name+"  location:"+location;
    }
}

class Student extends Person{
    private String school;
    public Student(String name,String school){
        this(name,"beijing",school);
    }
    public Student(String n,String l,String school){
        super(n,l);
        this.school=school;
    }

    public String info(){
        return super.info()+" school:"+school;
    }
}

public class Inherit {
    public static void main(String[] args) {
        Person p1=new Person("A");
        Person p2=new Person("B","shanghai");
        Student s1=new Student("C","S1");
        Student s2=new Student("C","shanghai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
    }
}

package object;

public interface MyInterface { //比抽象类更抽象的抽象
    int MAX_AGE=100;  //默认public static final
    void test01();   //默认加public abstract
}

class MyClass implements MyInterface{

    @Override
    public void test01() {
        System.out.println(MAX_AGE);
        System.out.println("hahahah");
    }
}

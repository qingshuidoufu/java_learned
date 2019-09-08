package myCollection;
//自定义一个ArrayList,体会底层
public class MyArrayList <E>{
    private Object [] elementData;
    private int size;
    public static  final int        DEFALT_CAPACITY=10;

    public MyArrayList() {
        this.elementData = new Object[DEFALT_CAPACITY];

    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       //[a,b,c]
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
    return sb.toString();
    }

    public MyArrayList(int capacity) {
        this.elementData = new Object[capacity];
    }
    public void add (E e){
        elementData[size++]=e;
    }
    public static void main(String[] args) {
        MyArrayList s1=new MyArrayList(20);
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);
    }
}

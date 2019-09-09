package myCollection;

import javax.management.RuntimeErrorException;

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
        //什么时候扩容
        if (size==elementData.length){
            //怎么扩容
            Object[] newArray=new Object[elementData.length+(elementData.length>>1)];//10+5=15
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData=newArray;

    }

        elementData[size++]=e;

    }
    public E get(int index){
        checkRange(index);
        return (E)elementData[index];

    }
    public void set(E element,int index){
        checkRange(index);
        elementData[index]=element;

    }
    public void checkRange(int index){
        if (index<0||index>size-1){
            throw new RuntimeException("索引不合法:"+index);
        }
    }
    public static void main(String[] args) {
        MyArrayList s1=new MyArrayList(20);
        for (int i = 0; i <40 ; i++) {
        s1.add("jack"+i);
        }
        System.out.println(s1);
        s1.set("gcgcgc",10);
        System.out.println(s1.get(10));

    }
}

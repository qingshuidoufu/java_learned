package map;

import com.sun.javafx.sg.prism.NodeEffectInput;
import test.Node;

public class HashMap {
        Node2[] table;  //位桶数组. bucket array
        int size;       //键值对的个数
    public HashMap(){
        table =new Node2[16];  //长度一般定义成2的整数次幂
    }
    public void put(Object key,Object value){
        Node2 newNode =new Node2();
        newNode.hash=myHash(key.hashCode(),table.length);
        newNode.key=key;
        newNode.value=value;
        newNode.next=null;

        Node2 temp=table[newNode.hash];
        Node2 iterLast=null;//正在遍历的最后一个元素
        boolean keyRepeat=false;
        if (temp==null){
            //此处数组元素为空直接放进去
            table[newNode.hash]=newNode;
        }else{
            //不为空,遍历链表放进去
            while(temp!=null) {
                //判断key如果重复,则覆盖
                if(temp.key.equals(key)){
                    System.out.println("key重复了");
                    temp.value=value;//只是覆盖value即可,hash,key,next不变
                    keyRepeat=true;
                    break;
                }else{
                    //key不重复,则遍历下一个
                    iterLast=temp;
                    temp=temp.next;

                }
            }
            if (!keyRepeat){  //不发生key重复,则添加到链表最后
                iterLast.next=newNode;
            }

        }

    }
    public  static int myHash(int v,int length){
        System.out.println("hash in myHash"+(v&(length-1)));//按位与,效率高(要求长度为2的整数次幂)
        System.out.println("hash in myHash"+(v%(length-1)));//效率低

        return v&(length-1);
    }

    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        m.put(20,"sss");
        m.put(53,"gg");
        m.put(69,"hh");
        m.put(85,"kk");
        System.out.println(m);
        for (int i = 10; i <100 ; i++) {
            System.out.println(i+"----"+myHash(i,16));//53,69,85
        }

    }
}


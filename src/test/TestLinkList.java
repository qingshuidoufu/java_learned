package test;

public class TestLinkList <E>{
    private Node first;
    private Node last;
    private int size;
    //[]
    //["a","b","c","d","e","f"] 2
    public Object get(int index){
        checkRange(index);
       Node temp=getNode(index);

        return temp!=null?temp.element:null;
    }
public Node getNode(int index){
    Node temp=null;
    checkRange(index);
    if (index<(size>>1)){
        temp=first;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
    }else{
        temp=last;
        for (int i = size-1; i >index; i--) {
            temp=temp.previous;
        }
    }
    return temp;
}

public void add(int index,E e){
        checkRange(index);
        Node newNode=new Node(e);
        Node temp=getNode(index);
        if (temp!=null){
            Node up=temp.previous;
            up.next=newNode;
            newNode.previous=up;
            newNode.next=temp;
            temp.previous=newNode;
        }


}
public void checkRange(int index){
    if (index<0||index>size-1){
        throw new RuntimeException("索引数字不合法"+index);
    }
}
    public void add(E e){
        Node node =new Node(e);
        if (first==null){
           //node.previous=null;
           // node.next=null;
            first=node;
            last=node;
            size++;
        }else {
            node.previous=last;
            node.next=null;
            last.next=node;
            last=node;
            size++;
        }
    }
    public String toString(){
        //[a,b,c]first=a,last=c
        //a,b,c
        StringBuilder sb=new StringBuilder("[");
        Node temp=first;

        while (temp!=null){
            sb.append(temp.element+",");

            temp=temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();

    }
public void remove(int index){
        checkRange(index);
        Node temp=getNode(index);
        if (temp!=null){
            Node up=temp.previous;
            Node down=temp.next;
            if (up!=null){
                up.next=down;
            }
           if (down!=null){
               down.previous=up;
           }
           if (index==0){
               first=down;
           }
           if(index==size-1){
               last=up;
           }
          size--;

        }

}
    public static void main(String[] args) {
            TestLinkList<String> list=new TestLinkList();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(3);
        System.out.println(list);
        list.add(3,"jack");
        System.out.println(list);
    }
}

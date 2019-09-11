package test;

public class TestLinkList {
    private Node first;
    private Node last;
    private int size;
    //[]
    //["a","b","c","d","e","f"] 2
    public Object get(int index){

            Node temp=null;
        if (index<0||index>size-1){
            throw new RuntimeException("索引数字不合法"+index);
        }
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

        return temp.element;
    }



    public void add(Object obj){
        Node node =new Node(obj);
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

    public static void main(String[] args) {
            TestLinkList list=new TestLinkList();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
        System.out.println(list);
        System.out.println(list.get(1));

    }
}

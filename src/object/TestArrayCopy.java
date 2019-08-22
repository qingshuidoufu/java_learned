package object;
//测试数组的拷贝
public class TestArrayCopy {
    public static void main(String[] args) {
            String[] str={"阿里","腾讯","京东","苏宁","亚马逊"};
            removeElem(str,1);
        System.out.println("###########");
        extendRange();
    }
    public static void testBasicCopy(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2=new String[10];
        System.arraycopy(s1,2,s2,6,3);
        for (int i = 0; i <s2.length ; i++) {
            System.out.println(i+"--"+s2[i]);
        }
    }
    //删除数组中指定位置的元素,将原来的数组返回
    public static String[] removeElem(String[] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+"--"+s[i]);

        }
        return s;
    }
    //数组扩容(本质上先定义一个更大的数组,将本数组拷贝到新的数组中)
    public static void extendRange(){
        String []s1= {"aa", "bb", "cc"};
        String[] s2=new String[s1.length+10];
        System.arraycopy(s1,0,s2,0,s1.length);//将s1中所有元素拷贝到s2
        for (String temp:s2) {
            System.out.println(temp);
        }

    }

}

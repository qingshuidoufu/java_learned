package string;
//测试StringBuilder,StringBuffer可变字符序列
public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder线程不安全,效率高(一般用这个);
        //StringBuffer线程安全,效率低
        StringBuilder sb=new StringBuilder("abcdefg");
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        sb.setCharAt(2,'M');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);


    }
}

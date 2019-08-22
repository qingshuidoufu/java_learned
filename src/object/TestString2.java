package object;

public class TestString2 {
    public static void main(String[] args) {
        String s1="core Java";
        String s2="Core Java";
        System.out.println(s1.charAt(3));//提取下标为3的字符;
        System.out.println(s2.length());
        System.out.println(s1.equalsIgnoreCase(s2));//比较(忽略大小写)
        System.out.println(s1.indexOf("Java"));//字符串中是否包含java
        System.out.println( s1.indexOf("apple"));

        String s=s1.replace(' ','&');  //将s1中空格换成&(s1中不变)
        System.out.println("result is :"+s);

        
    }
}

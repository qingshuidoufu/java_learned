package object;

public class TestString {
    public static void main(String[] args) {
      String str="abc";
      String str2=new String();
      String str3="abc"+"ked";
      String str4="18"+19;
        System.out.println(str4);
        System.out.println("##########");

        String str10="gaoji";
        String str11="gaoji";
        String str12=new String("gaoji");

        System.out.println(str10==str11);
        System.out.println(str11==str12);

        //通常字符串比较使用equals
    }
}

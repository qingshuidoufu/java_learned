package string;
//测试可变字符串的常用方法
public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append((char)('a'+i));
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3,'牛');
        System.out.println(sb);
        //链式调用:核心就是该方法调用了return this,把自己返回了
        sb.insert(0,'你').insert(6,'爱').insert(9,'他');
        System.out.println(sb);

        sb.delete(20,30);
        System.out.println(sb);

    }
}

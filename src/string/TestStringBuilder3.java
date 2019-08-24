package string;
//测试可变字符序列和不可变字符序列的陷阱
public class TestStringBuilder3 {
    public static void main(String[] args) {
/**使用String进行字符串的拼接*/
       /* String str8 = "";
        for (int i = 0; i < 5000; i++) {
            str8 = str8 + i;//相当于产生了10000个对象,浪费时间空间
        }
        System.out.println(str8);*/

        //替换方法,使用StringBuilder进行字符串拼接
        StringBuilder sb1=new StringBuilder("");
        for (int i=0;i<5000;i++){
            sb1.append(i);
        }


    }
}

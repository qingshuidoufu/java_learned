package string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestString {
    public static void main(String[] args) {

      /*  String str= "aaaabbbb";

        String str2 = string.substring(2, 5);
        System.out.println(str);
        System.out.println(str2);*/
      //编译器直接做优化,把字符串拼接
        String str1="Hello"+" java";//相当于Str1="Hello java"
        String str2="Hello java";
        System.out.println(str1==str2);//true
        String str3="hello";
        String str4 ="java";
                //编译的时候不知道变量中存的是什么,无法在编译的时候优化
        String str5=str3+str4;
        System.out.println(str2==str5);//false

        System.out.println(str2.equals(str5));//一般用equals而不是==

    }

}

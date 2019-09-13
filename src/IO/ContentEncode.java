package IO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        //编码:字节数组
        byte[] data = msg.getBytes();//默认使用工程编码字符集
        System.out.println(data.length);

//        data=msg.getBytes("GBK");
//        System.out.println(data.length);

        //解码:
        msg=new String(data,0,data.length, "utf8");
        System.out.println(msg);

        //乱码:
        //1.字节数不够
        //2.字符集不统一
        //

    }
}
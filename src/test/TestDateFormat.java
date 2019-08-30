package test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) {
        //把对象按照"格式字符串指定的格式"转成相应的对象
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       String str= df.format(new Date(40000000));
        System.out.println(str);
            //把字符串按照"格式字符串指定的格式"转成相应的时间对象
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        try {
            Date date=df2.parse("1983年5月10日 10时45分59秒");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}

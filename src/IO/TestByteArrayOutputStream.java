package IO;
//byteArrayOutputStream
//内部维护,不用释放


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestByteArrayOutputStream  {

    public static void main(String[] args) {
        byte[] dest=null;
            //选择流(用新增方法,不能发生多态)
        ByteArrayOutputStream baos =null;
        try {
            baos=new ByteArrayOutputStream();
           String msg="Show me the code";
            byte[] datas=msg.getBytes();
            baos.write(datas,0,datas.length);
            baos.flush();
            dest=baos.toByteArray();
            System.out.println(dest.length+"-->"+new String(dest,0,baos.size()));

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}

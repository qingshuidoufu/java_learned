package IO;

import java.io.File;

//测试路径
public class PathDemo {
    public static void main(String[] args) {
        String path="C:\\Users\\清水豆腐\\Pictures\\微信图片_20190630132925.jpg";
        System.out.println(File.separatorChar);
        //建议:推荐"/"
        // 或许常量拼接path="C:"+Fiie.separator+".........

    }
}

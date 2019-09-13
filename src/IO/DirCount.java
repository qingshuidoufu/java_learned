package IO;

import java.io.File;

public class DirCount {
    //大小
    private long len;
    //路径
    private  String Path;
    //源
    private File src;
    public DirCount(String path){
        this.len=0;
        this.Path=path;
        this.src=new File(path);
        count(this.src);
    }

    public static void main(String[] args) {
        DirCount dir=new DirCount("C:/java_workplace/java_learned");
        System.out.println(dir.getLen());
    }

    public long getLen() {
        return len;
    }

    public void setLen(long len) {
        this.len = len;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public File getSrc() {
        return src;
    }

    public void setSrc(File src) {
        this.src = src;
    }

    private void count(File src) {

        //获取大小
        if (null != src && src.exists()) {//递归头
            if (src.isFile()) {
                len += src.length();
            } else {//子孙级
                for (File s :
                        src.listFiles()) {
                    count(s);
                }
            }

        }
    }
}

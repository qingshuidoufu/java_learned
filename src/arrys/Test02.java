package arrys;

public class Test02 {
    public static void main (String[] args){
        int[] a={2,4,65};
        User[] b={
                new User (1001,"jack"),
                new User (1002,"marry"),
                new User (1003,"niko")
        };

        //默认初始化
        int[] bi =new int[3];// 和对象的成员变量赋值规则一致

        //动态初始化,先分配空间再赋值
        int[]a1=new int [2];
        a1[0]=1;
        a1[1]=2;
    }

}

package HomeWork;

import java.io.*;

public class sumNumChar {
    public static void main(String[] args) throws IOException {
        String str="d://test//file5.txt";
        BufferedReader br=new BufferedReader(new FileReader(str));

        int num=0,c=0,others=0;
        int tem;
        while((tem=br.read())!=-1){
            if(((char)tem>='a'&&(char)tem<='z')||((char)tem>='A'&&(char)tem<='Z')){
                c++;
            }
            else if(tem>='0'&&tem<='9'){
                num++;
            }
            else{
                others++;
            }
        }
        br.close();
        System.out.println("数字:"+num+"字符:"+c+"其他:"+others);

    }
}

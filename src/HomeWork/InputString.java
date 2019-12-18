package HomeWork;

import java.io.*;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) throws IOException {
        File f=new File("file5.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fw=new BufferedWriter(new FileWriter(f));

        String msg;
        msg=br.readLine();
        fw.write(msg);
        fw.flush();
        fw.close();
        br.close();



    }
}

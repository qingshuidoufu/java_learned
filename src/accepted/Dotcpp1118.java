package accepted;

/*题目描述
正整数的各位数字之和被Tom称为Tom数。求输入数（<2^32）的Tom数!

输入
每行一个整数(<2^32).

输出
每行一个输出,对应该数的各位数之和.

样例输入
12345
56123
82
样例输出
15
17
10*/
import java.io.EOFException;
import java.util.Scanner;

public class Dotcpp1118 {
		public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			String temp;
			
			while(true) {
				if(scanner.hasNext()) {   //hasNext有下一行就返回true,用来判断是否结束输入
					temp=scanner.nextLine();  //读取一行整数
					int sum=0;
					for (int i = 0; i < temp.length(); i++) {
						sum+=Character.getNumericValue(temp.charAt(i));  //String转char再转Character再转int
					}
					System.out.println(sum);
					
				}
				else {
					break;//hasNext读到ctrl+z就退出循环
				}
				
			}
		}
}

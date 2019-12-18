package accepted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dotcpp1458 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);  //定义Scanner类,读取
		int n=scanner.nextInt();
		scanner.nextLine();				//读入n,跳到下一行
		List l=new ArrayList();   //使用容器
		for (int i = 0; i < n; i++) {
			Scanner sc=new Scanner(scanner.nextLine());   //循环内多定义一个|Scanner类,读一行用
			while(sc.hasNext()){  //判断一行是否读完
				l.add(sc.nextInt());
			}
			
		}
		l.sort(null);  //小到大排序
		int k1=0,k2=0;
		for (int i = 0; i < l.size()-1; i++) {
			int tem=(int)l.get(i);
			if((tem+2)==(int)l.get(i+1)) {   //断号
				k1=tem+1;
			}
			
			if(tem==(int)l.get(i+1)) {  //重号
				k2=tem;
			}
			
		}
		System.out.println(k1+" "+k2);
		
	}

}

package accepted;

import java.util.Scanner;

public class Dotcpp1647 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Integer du=scanner.nextInt();
	String string=du.toString();
	char[] c=string.toCharArray();
	int[] n=new int[c.length];
	for (int i = 0; i < c.length; i++) {
		Character temCharacter=c[i];
		n[i]=Character.getNumericValue(temCharacter);
	}
	int sum=0;
	for (int i = 0; i < n.length; i++) {
		sum+=Math.pow(n[i],3);
	}
	if(sum==du) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
}
}

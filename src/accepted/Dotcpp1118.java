package accepted;

import java.io.EOFException;
import java.util.Scanner;

public class Dotcpp1118 {
		public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			String temp;
			
			while(true) {
				if(scanner.hasNext()) {
					temp=scanner.nextLine();
					int sum=0;
					for (int i = 0; i < temp.length(); i++) {
						sum+=Character.getNumericValue(temp.charAt(i));
					}
					System.out.println(sum);
					
				}
				else {
					break;
				}
				
			}
		}
}

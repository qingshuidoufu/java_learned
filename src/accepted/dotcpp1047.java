package accepted;
	import java.util.Scanner;
/*题目描述
有n人围成一圈，顺序排号。从第1个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来的第几号的那位。
输入
初始人数n
输出
最后一人的初始编号
样例输入
3
样例输出
2*/

//模拟循环队列(最后一个等于数组长度-1)

public class dotcpp1047 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int[] queue=new int[n];//n个数组
		for (int i = 0; i < queue.length; i++) {//置1,还在圈子
			queue[i]=1;
		}	
		int count=0;int out=0; //count用来喊123,out设置一个循环退出的条件(out=n-1)
		for (int i = 0; i < queue.length; i++) {  
			if(queue[i]==1) {    
				count+=1;      //未退圈喊123
				if (count==3) {
					queue[i]=0;  //退圈
					count=0;     //重置122
					out+=1;    //一人退圈
				}
			}
			if (i==queue.length-1) {   //循环队列循环条件
				i=-1;      //由于循环结束i会加1,故回到队头i设-1
			}
			if (out==n-1) {  //循环退出条件
				break;
			}
		}
		for (int i = 0; i < queue.length; i++) {
			if(queue[i]==1) {//检查元素输出i+1
				System.out.println(i+1);
			}
		}
		
	}

}

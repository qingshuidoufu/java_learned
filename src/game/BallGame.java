package game;
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//画窗口的方法
	double x=100; //小球的横坐标
	double y=100;  //小球的纵坐标
	boolean right=true;  //方向
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		if (right) {
		x=x+10;
		}
		else {
			x=x-10;
		}
		if(x>856-40-30) { //856是窗口高度,40是边框宽度,30是小球的直径
			right=false;
		}
		if(x<40) {//桌子边框的宽度
			right=true;
		}
	}
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口,美秒25次
		while (true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1s=1000ms,约1秒画20次窗口
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//main 方法是程序执行的入口
	public static void main(String[]args) {
		System.out.println("你好!");
		BallGame game=new BallGame();
		game.launchFrame();
	}
}

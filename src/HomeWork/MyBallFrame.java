package HomeWork;

import homeWorkTank.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyBallFrame extends JFrame {
    Ball ball=new Ball();
   MyBallFrame(){
       this.setBounds(200,200,800,800);
       this.setBackground(Color.blue);
       this.getContentPane().setVisible(false);
       this.setVisible(true);

       new PaintThread().start();  //启动重画窗口的线程
       addKeyListener(new KeyMonitor()); //增加键盘的监听


   }
   class KeyMonitor extends KeyAdapter {
       @Override
       public void keyPressed(KeyEvent e) {
           ball.addDirection(e);

       }

       @Override
       public void keyReleased(KeyEvent e) {
           ball.minusDirection(e);
       }
   }



    @Override
    public void paint(Graphics g) {
       super.paint(g);
       ball.painSelf(g);
    }
    class PaintThread extends Thread{
        @Override
        public void run(){
            while (true){
                repaint();  //重画
                try {
                    Thread.sleep(40); //1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        MyBallFrame myBallFrame=new MyBallFrame();

    }
}
class Ball{
    int x;
    int y;
    int length;
    int width;
    int speed;
    boolean left,up,right,down;
    //按下某个键增加相应的方向
    public void addDirection(KeyEvent e){

        switch(e.getKeyCode()){
            case KeyEvent.VK_A:
                left=true;
                break;
            case KeyEvent.VK_W:
                up=true;
                break;
            case KeyEvent.VK_D:
                right=true;
                break;
            case KeyEvent.VK_S:
                down=true;
                break;

        }
    }
    //按下某个键取消相应的方向
    public void minusDirection(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_A:
                left=false;

                break;
            case KeyEvent.VK_W:
                up=false;
                break;
            case KeyEvent.VK_D:
                right=false;
                break;
            case KeyEvent.VK_S:
                down=false;
                break;

        }
    }

  Ball(){
      x=200;
      y=200;
      length=50;
      width=50;
      speed=2;
  }
  public void painSelf(Graphics g){
      g.setColor(Color.RED);
      g.fillOval(x,y,length,width);
      if(left){
          x-=speed;

      }
      if (right){
          x+=speed;
      }
      if(up){
          y-=speed;
      }
      if (down){
          y+=speed;
      }
  }
}

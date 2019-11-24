package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ThreadBall extends JFrame implements Runnable{
    MyBall mb=new MyBall();  //建立小球对象

     public ThreadBall(){
         this.setBounds(200,200,800,800);  //设置边界
         this.setBackground(Color.blue);                        //设置背景
         this.getContentPane().setVisible(false);           //设置内容框颜色不显示
         this.setVisible(true);     //窗体显示

         addKeyListener(new KeyAdapter() {  //加入键盘监听,按下s球改变状态
             @Override
             public void keyPressed(KeyEvent e) {
                 if (e.getKeyCode()==KeyEvent.VK_S){
                     System.out.println("按下了s");
                    mb.move=!mb.move;
                 }
             }
         });

    }

    @Override
    public void paint(Graphics g) {  //重写paint类
         super.paint(g);
        mb.painSelf(g);   //球的自己画自己方法
    }

    public static void main(String[] args) {
        ThreadBall threadBall=new ThreadBall();  //新建球和框的对象
        Thread th=new Thread(threadBall);
        th.start();   //启动线程

    }

    @Override
    public void run() { //改写线程内run方法
         while (true){
            if (mb.move==true){
                repaint();      //重画窗口和小球
            }
             try {
                 Thread.sleep(40);   //一秒约20次
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }


    }
}
class MyBall{
    double x;
    double y;
    int length;
    int width;
    int speed;
    double degree;
    boolean move;

    MyBall(){
        x=200;
        y=200;
        length=50;
        width=50;
        speed=10;
        degree=3.14/3;
        move=true;
    }
    public void painSelf(Graphics g){
        g.setColor(Color.RED);
        g.fillOval((int)x,(int)y,length,width);
        if(move){
            x=x+speed*Math.cos(degree);   //x改变
            y=y+speed*Math.sin(degree);   //y改变
            if(x<0||x>800-50){      //左右边界检测
                degree=3.14-degree; //左右法线反弹
            }
            if (y<0+40||y>800-50){      //上下边界检测
                degree=-degree;         //上下法线反弹
            }

        }
    }
}

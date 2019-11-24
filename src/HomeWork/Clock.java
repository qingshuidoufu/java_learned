package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Clock extends JFrame implements Runnable {
    private boolean runing = true;          //设置一个布尔变量判断程序是否在运行
    public Clock(){                         //Clock类的构造方法
        super("aaaaa");                 //调用父类的方法设置名称
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //设置窗口的关闭动作为退出程序
        final JPanel panel = new JPanel();                  //新建一个画布
        getContentPane().add(panel, BorderLayout.NORTH);    //获得一个布局容器,添加画布到容器中,设置容器的布局为北部
        final JButton button = new JButton("stop");     //设置一个按键,名为stop
        button.addActionListener(new ActionListener() {      //为按键添加监听
            public void actionPerformed(ActionEvent e) {     //匿名内部类新建一个监听类
                do_button_actionPerformed(e);                  //调用 do_button_actionPerformed(e)
            }
        });
        panel.add(button);  //按键挂载到画布中
    }
    public void run(){    //线程的运行方法
        while(runing){
            this.repaint();  //重绘窗体
            try{
                Thread.sleep(1000);   //休眠1s
            }catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g){
        Date now=new Date();            //新建一个日期对象
        g.clearRect(0, 70, 300, 100);   //清除出来一片区域
        g.setFont(new java.awt.Font("Tahoma", 1, 20));  //设置字体
        g.drawString(now.getHours()+":"+now.getMinutes()+":"+now.getSeconds(),100,100);  //在清除出的区域内重绘String
    }
    protected void do_button_actionPerformed(ActionEvent e) {
        stopThread();  //调用停止线程
    }
    public void stopThread() {
        this.runing = false;   //标志程序停止运行
    }
    public static void main(String args[]){
        Clock T=new Clock();   //新建一个Clock对象
        T.setBounds(500,500,300,120);  //设置窗口边界
        T.setVisible(true);   //窗口可见
        Thread A=new Thread(T);  //新建线程
        A.start();   //启动线程
}

}

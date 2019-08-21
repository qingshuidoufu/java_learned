package game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//飞机飞行的主窗口
public class MyGameFrame extends JFrame {
    //初始化窗口
    public void launchFrame(){
        this.setTitle("萧先生手稿");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        MyGameFrame f=new MyGameFrame();
        f.launchFrame();
    }
}

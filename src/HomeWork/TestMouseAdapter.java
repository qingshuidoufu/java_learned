package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestMouseAdapter {
    public static void main(String[] args) {
        MFrame mf=new MFrame();
        mf.launchFrame();
    }
}
class MFrame extends Frame {
    public void launchFrame(){
        this.setBounds(400,300,300,600);
        this.setLayout(null);
        this.setBackground(Color.white);
        MFMonitor mfm=new MFMonitor();
        JButton b1=new JButton("测试左中按钮");
        b1.setBounds(50,100,150,30);
        b1.setBackground(Color.cyan);
        b1.setActionCommand("b1");
        b1.addMouseListener(mfm);

        JButton b2=new JButton("测试拖动");
        b2.setBounds(50,150,150,80);
        b2.setBackground(Color.MAGENTA);
        b2.setActionCommand("b2");
        b2.addMouseListener(mfm);

        JButton b3=new JButton("测试鼠标进入");
        b3.setBounds(50,250,150,100);
        b3.setBackground(Color.green);
        b3.setActionCommand("b3");
        b3.addMouseListener(mfm);
        b3.addMouseWheelListener(mfm);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        //下面是一个窗口关闭的匿名类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(-1);
            }
        });
        this.setVisible(true);

    }
}
class MFMonitor extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        if(((Button )e.getSource()).getActionCommand()=="b1"){
            if(e.getButton()==1){
                System.out.println("mouse left have clicked");
            }
            else if (e.getButton()==2){
                System.out.println("mouse center have clicked");
            }
            else if (e.getButton()==3){
                System.out.println("mouse right have clicked" );
            }
        }
        if(((Button )e.getSource()).getActionCommand()=="b2"){
            System.out.println("b2 have clicked");
        }
    }
    public void mouseDragged(MouseEvent e){
        if(((Button )e.getSource()).getActionCommand()=="b2"){
            System.out.println(e.getX()+" "+e.getY());
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你已经进入b3");
    }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你已经离开b3");
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你在b3上移动");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你按下了b3");
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你释放了b3");
        }

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if(((Button )e.getSource()).getActionCommand()=="b3"){
            System.out.println("你在b3上移动了中轴");
        }
    }
}

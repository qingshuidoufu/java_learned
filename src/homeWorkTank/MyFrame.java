package homeWorkTank;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {
    Image backgrand;
   File src=new File("src/homeWorkTank/gameTank.png");
    Tank tank=new Tank(src);
    File ene=new File("C:\\java_workplace\\java_learned\\src\\homeWorkTank\\enemyTank.png");
    enermyTank enermyTank0=new enermyTank(ene);
    enermyTank enermyTank1=new enermyTank(ene,200,100);
    enermyTank enermyTank2=new enermyTank(ene,300,100);
    enermyTank enermyTank3=new enermyTank(ene,400,100);
    enermyTank enermyTank4=new enermyTank(ene,500,100);
    File bl=new File("C:\\java_workplace\\java_learned\\src\\homeWorkTank\\bullet.png");





    public MyFrame() throws IOException {
    }
    void launchFrame() throws IOException {
        File bg=new File("C:\\java_workplace\\java_learned\\src\\homeWorkTank\\backgrand.jpg");
         backgrand = ImageIO.read(bg);
      this.getContentPane().setVisible(true);
      setBackground(Color.DARK_GRAY);
        setSize(1540,900);
       setLocation(50,50);
       setVisible(true);

        new PaintThread().start();  //启动重画窗口的线程
        addKeyListener(new KeyMonitor()); //增加键盘的监听

    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(backgrand,0,0,null);
       tank.drawSelf(g);
       enermyTank0.drawSelf(g);
        enermyTank1.drawSelf(g);
        enermyTank2.drawSelf(g);
        enermyTank3.drawSelf(g);
        enermyTank4.drawSelf(g);


    }
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            tank.addDirection(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
            tank.minusDirection(e);
        }
    }
    //内部类帮助我们反复重画窗口
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



        public static void main(String[] args) throws IOException {
            MyFrame myFrame=new MyFrame();
           myFrame.launchFrame();
    }

}

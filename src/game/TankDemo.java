package game;

import javax.swing.*;
import java.awt.*;

public class TankDemo extends JFrame {
    int x;//横坐标
    int y;//纵坐标
    int speed;//移动速度
    int width;//宽度
    int high;//高度
    int bulletNumber;//子弹数量

    void launchFrame(){
        this.getContentPane().setVisible(false);
        setBackground(Color.DARK_GRAY);
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);g.drawRect(150,150,80,130);
        g.fillRect(150,150,80,130);//主体
        g.setColor(Color.GRAY);
        g.setColor(Color.LIGHT_GRAY);g.fillRect(165,180,50,60); //炮台
        g.setColor(Color.LIGHT_GRAY);g.fillRect(165,250,20,20);//se1
        g.setColor(Color.LIGHT_GRAY);g.fillRect(195,250,20,20);//se2
        //炮台2
        int px1[]={165,215,180,165};
        int py1[]={180,180,160,180};
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(px1,py1,4);


        g.fillRect(175,120,10,80); //炮管
        g.fillRect(170,110,20,10); //炮口
        //炮口尖
        int x1[]={170,190,185,175,170};
        int y1[]={110,110,105,105,110};
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(x1,y1,4);

        //护履带a
        int ax[]={150,150,175,170,150};
        int ay[]={140,150,150,140,140};
        g.setColor(Color.GRAY);
        g.fillPolygon(ax,ay,4);

        //护履带b
        int bx[]={205,231,231,210,205};
        int by[]={150,150,140,140,150};
        g.setColor(Color.GRAY);
        g.fillPolygon(bx,by,4);

        //护履带c
        int cx[]={150,175,170,150,150};
        int cy[]={280,280,290,290,280};
        g.setColor(Color.GRAY);
        g.fillPolygon(cx,cy,4);

        //护履带d
        int dx[]={205,231,231,210,205};
        int dy[]={280,280,290,290,280};
        g.setColor(Color.GRAY);
        g.fillPolygon(dx,dy,4);

        g.setColor(Color.WHITE);g.fillOval(190,190,20,20);// 机枪炮台
        g.fillRect(197,165,5,43);//机枪炮管

    }
    void move(){

    }
    void fire(){

    }
    void lifeIncrease(){

    }
    void lifeDecrease(){

    }
    void boom(){

    }
    void bulletNumberUp(){

    }
    void bulletNumberDown(){}


    public static void main(String[] args) {
                    TankDemo myTank=new TankDemo();
                    myTank.launchFrame();
    }
}


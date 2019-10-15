package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TankDemo extends JFrame {
    int x=0;//横坐标
    int y=0;//纵坐标
    int speed;//移动速度
    int width;//宽度
    int high;//高度
    int bulletNumber;//子弹数量

    void launchFrame() throws IOException {

        this.getContentPane().setVisible(false);
        setBackground(Color.DARK_GRAY);
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

    }

    @Override

    //学号1820501146
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);g.drawRect(x+150,y+150,80,130);
        g.fillRect(x+150,y+150,80,130);//主体
        g.setColor(Color.GRAY);
        g.setColor(Color.LIGHT_GRAY);g.fillRect(x+165,x+180,50,60); //炮台
        g.setColor(Color.LIGHT_GRAY);g.fillRect(x+165,y+250,20,20);
        g.setColor(Color.LIGHT_GRAY);g.fillRect(x+195,y+250,20,20);
        //炮台2
        int px1[]={x+165,x+215,x+180,x+165};
        int py1[]={y+180,y+180,y+160,y+180};
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(px1,py1,4);


        g.fillRect(x+175,x+120,10,80); //炮管
        g.fillRect(x+170,y+110,20,10); //炮口
        //炮口尖
        int x1[]={x+170,x+190,x+185,x+175,x+170};
        int y1[]={y+110,y+110,y+105,y+105,y+110};
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(x1,y1,4);

        //护履带a
        int ax[]={x+150,x+150,x+175,x+170,x+150};
        int ay[]={y+140,y+150,y+150,y+140,y+140};
        g.setColor(Color.GRAY);
        g.fillPolygon(ax,ay,4);

        //护履带b
        int bx[]={x+205,x+231,x+231,x+210,x+205};
        int by[]={y+150,y+150,y+140,y+140,y+150};
        g.setColor(Color.GRAY);
        g.fillPolygon(bx,by,4);

        //护履带c
        int cx[]={x+150,x+175,x+170,x+150,x+150};
        int cy[]={y+280,y+280,y+290,y+290,y+280};
        g.setColor(Color.GRAY);
        g.fillPolygon(cx,cy,4);

        //护履带d
        int dx[]={x+205,x+231,x+231,x+210,x+205};
        int dy[]={y+280,y+280,y+290,y+290,y+280};
        g.setColor(Color.GRAY);
        g.fillPolygon(dx,dy,4);

        g.setColor(Color.WHITE);g.fillOval(x+190,y+190,20,20);// 机枪炮台
        g.fillRect(x+197,y+165,5,43);//机枪炮管

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


    public static void main(String[] args) throws IOException {
                    TankDemo myTank=new TankDemo();
                    myTank.launchFrame();
    }
}


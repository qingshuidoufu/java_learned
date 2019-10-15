package homeWorkTank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Tank extends GameObject{


    int shellNumber=8;
        boolean live=true;
        boolean left,up,right,down;

    public Tank(File f) throws IOException {

        this.x=600;
         this.y=600;
        this.speed=20;
        this.height=150;
        this.width=80;
        this.shellNumber=8;
        this.img=GameUtil.getImage(f);

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    public int getShellNumber() {
        return shellNumber;
    }

    public boolean isLive() {
        return live;
    }

    public void drawSelf(Graphics g){
        if (live){
            g.drawImage(img,x,y,null);
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
    //按下某个键增加相应的方向
    public void addDirection(KeyEvent e){

        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left=true;
                break;
            case KeyEvent.VK_UP:
                up=true;
                break;
            case KeyEvent.VK_RIGHT:
                right=true;
                break;
            case KeyEvent.VK_DOWN:
                down=true;
                break;

        }
    }

    //按下某个键取消相应的方向
    public void minusDirection(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left=false;

                break;
            case KeyEvent.VK_UP:
                up=false;
                break;
            case KeyEvent.VK_RIGHT:
                right=false;
                break;
            case KeyEvent.VK_DOWN:
                down=false;
                break;

        }
    }
}

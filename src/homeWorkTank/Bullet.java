package homeWorkTank;

import java.awt.*;

public class Bullet extends GameObject {
    public Bullet() {
        this.x=0;
        this.y=0;
        speed=20;
        width=10;
        height=10;
    }

    public Bullet(Image img,int x, int y) {
            this.img=img;
            this.x=x;
            this.y=y;
    }
    public void drawSelf(Graphics g){

            g.drawImage(img,x,y,null);

        }


}

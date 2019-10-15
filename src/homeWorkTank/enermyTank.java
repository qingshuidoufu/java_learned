package homeWorkTank;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class enermyTank extends Tank{

    public enermyTank(File f) throws IOException {
        super(f);
        this.x=100;
        this.y=100;


    }

    public enermyTank(File f,int x,int y) throws IOException {
        super(f);
        this.x=x;
        this.y=y;
    }

    public void drawSelf(Graphics g){
        if (live){
            g.drawImage(img,x,y,null);
        }
    }
}

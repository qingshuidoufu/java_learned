package HomeWork;

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class Clock1 extends Applet implements Runnable {
    Thread clockThread;
    public void start(){
        if(clockThread==null){
            clockThread=new Thread(this,"Clock");
            clockThread.start();
        }
    }
    public void run(){
        while(clockThread !=null){
            repaint();
            try{
                clockThread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g){
        Date now=new Date();
        g.drawString(now.getHours()+";"+now.getMinutes()+";"+now.getSeconds(), 5,10);
    }
    public void stop(){
        clockThread.stop();
        clockThread=null;
    }

}

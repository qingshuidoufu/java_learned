package HomeWork;

import java.awt.*;

public class MyFlow {
    Frame f;
    Button b1,b2,b3;
    public static void main(String args[]){
        MyFlow that=new MyFlow();
        that.go();
    }
    public void go(){
        f=new Frame("FlowLayout");
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        b1=new Button("OK");
        b2=new Button("OPEN");
        b3=new Button("CLOSE");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(100,100);
        f.setVisible(true);
    }

}

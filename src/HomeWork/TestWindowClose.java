package HomeWork;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClose {
    public static void main(String[] args) {
        new MyFrameSS("MyFrame");
    }
}
class MyFrameSS extends Frame {
    public MyFrameSS(String s){
        super(s);
        setLayout(null);
        setBounds(300,300,400,300);
        this.setBackground(new Color(204,204,255));
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
    }
}

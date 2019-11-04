package HomeWork;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample extends WindowAdapter implements ItemListener {
    Frame f;
    Choice c;
    Label l;
    TextArea tf;

    public static void main(String[] args) {
        ChoiceExample ce =new ChoiceExample();
        ce.go();
    }

    void go(){
        f=new Frame("选择框");
        f.setLayout(new FlowLayout());
        l=new Label("your choice");
        f.add(l);
        c=new Choice();
        c.addItem("first");
        c.addItem("second");
        c.addItem("third");
        f.add(c);
        tf=new TextArea();
        f.add(tf);
        c.addItemListener(this);
        f.addWindowListener(this);
        f.setSize(300,150);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c.getSelectedItem()=="second")
            tf.setText("tom is a good boy");
        if(c.getSelectedItem()=="first"){
            tf.setText("sam is a bad boy");
        }
    }
}

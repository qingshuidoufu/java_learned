package HomeWork;




import java.awt.*;

import java.awt.event.*;

public class TestActionEven {
    public static void main(String[] args) {
        Frame f=new Frame ("ActionEven");
        Button b=new Button("Press me!");
        Monitor m= new Monitor();
       b.addActionListener(m);
       f.add(b,BorderLayout.CENTER);
       f.pack();
       f.setVisible(true);
    }
}
class Monitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed!");
    }


}

package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestGUI {
    public static void main(String[] args) {
        MyFrame myFrame=new MyFrame();
        myFrame.launchFrame();

    }
}
class MyFrame extends JFrame {
    public void launchFrame(){
       JFrame jf=new JFrame("判断素数");
        Container c=jf.getContentPane();
       JPanel jp=new JPanel();

       JTextField jtf1=new JTextField(15);
        jtf1.setLocation(10,20);
       jtf1.setEditable(true);
        JLabel is=new JLabel();
        JLabel isnt=new JLabel();

        JButton jb=new JButton("确定");
        jb.setActionCommand("jb");

        jb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton()==java.awt.event.MouseEvent.BUTTON1){
                    String s=jtf1.getText();
                    int i=Integer.parseInt(s);
                    if(isPrime(i)){
                        is.setText("是素数");
                    }
                    else   {
                        isnt.setText("不是素数");
                    }

                }


            }
        });


        jp.add(jtf1);
        jp.add(jb);

        jp.add(is);
        jp.add(isnt);

        c.add(jp);
       jf.setBounds(200,200,400,400);
        jf.setVisible(true);
   }
    public boolean isPrime(int n)

    {

        if(n < 2) return false;

        for(int i = 2; i < n; ++i)

            if(n%i == 0) return false;

        return true;

    }
}

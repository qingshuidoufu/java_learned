package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestMathGUI extends JFrame {
   public  TestMathGUI(){
       Container container =this.getContentPane();
       JPanel jPanel=new JPanel();
       JTextField jTextField1=new JTextField(8);
       JTextField jTextField2=new JTextField(8);
       JTextField jTextField3=new JTextField(8);

       String[] items=new String[4];
       items[0]="+";
       items[1]="-";
       items[2]="*";
       items[3]="/";
       JComboBox jComboBox=new JComboBox(items);
       JButton jButton=new JButton("=");
       jButton.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
               double result = 0;
               String sResult;
               String text1=jTextField1.getText();
               double i1=Double.parseDouble(text1);
               String text2=jTextField2.getText();
               Double i2=Double.parseDouble(text2);

               String sign=(String)jComboBox.getSelectedItem();


               if(sign.equals("+")){
                   result=i1+i2;
               }
               else if (sign.equals("-")){
                   result=i1-i2;
               }
               else if (sign.equals("*")){
                   result=i1*i2;
               }
               else if (sign.equals("/")){
                   result=i1/i2;
               }
               sResult=Double.toString(result);
               jTextField3.setText(sResult);
           }
       });

       jPanel.add(jTextField1);
       jPanel.add(jComboBox);
       jPanel.add(jTextField2);
       jPanel.add(jButton);
       jPanel.add(jTextField3);
       container.add(jPanel);
       this.setBounds(400,400,800,400);
       this.setVisible(true);

    }


    public static void main(String[] args) {
        TestMathGUI testMathGUI =new TestMathGUI();


    }

}

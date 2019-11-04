package HomeWork;

import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String args[])
    {
        Frame f=new Frame("框架");


        f.add(new Button("This is arross the top"), "North");
        f.add(new Label("The message is on the bottom"),BorderLayout.SOUTH);
        f.add(new Button("Left"),BorderLayout.WEST);
        f.add(new Button("Right"),BorderLayout.EAST);
        String message="This is the message in the Center!";
        f.add(new TextArea(message),BorderLayout.CENTER);
        f.setVisible(true);
        f.setSize(200,200);
    }

}

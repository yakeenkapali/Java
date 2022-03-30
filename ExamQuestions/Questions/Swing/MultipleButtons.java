import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;

class MultipleButtons extends JFrame{
    MultipleButtons(){
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("4");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);

        getContentPane();

        setSize(500, 500);
        setVisible(true); 
    }

    public static void main(String[] args){
        new MultipleButtons();
    }

}
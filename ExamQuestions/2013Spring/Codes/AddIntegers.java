// Write a simple GUI addition application that used two input dialogs to obtain integers from the user and a message dialog to display the sum. 

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class AddIntegers extends JFrame {
    
    AddIntegers(){
        JTextField t1, t2, t3;
        JLabel l1, l2, l3;
        JButton b1;

        t1 = new JTextField("Input First Number:");
        t2 = new JTextField("Input First Number:");
        t3 = new JTextField();

        l1 = new JLabel("Number1");
        l2 = new JLabel("Number2");
        l3 = new JLabel("Result");

        b1 = new JButton("ADD");

        t1.setBounds(50,100, 200,30);
        t2.setBounds(50,200, 200,30);
        t3.setBounds(50,300, 200,30);

        l1.setBounds(50,70, 200,30);
        l2.setBounds(50,170, 200,30);
        l3.setBounds(50,270, 200,30);

        b1.setBounds(50,350, 200,30);

        add(t1);
        add(t2);
        add(t3);

        add(l1);
        add(l2);
        add(l3);

        add(b1);

        setSize(400,700);  
        setLayout(null);  
        setVisible(true);

        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                String getNum1 = t1.getText();
                String getNum2 = t2.getText();

                // double a = Integer.parseDouble(getNum1);
                // double b = Integer.parseDouble(getNum2);
                // double c = a +b;

                float a = Float.parseFloat(getNum1);
                float b = Float.parseFloat(getNum2);
                float c = a + b;

                t3.setText(String.valueOf(c));
            }  
        });
    }

    public static void main(String[] args){
        new AddIntegers();
    }
    
}

/* int = 
*/ 
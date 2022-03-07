//  The frame should contain three text fields with labels arg1, arg2 and result respectively, a menu called file with sub menus add, subtract and close.

import javax.swing.*;

public class MenuTextfield extends JFrame{

    MenuTextfield(){
        JTextField t1, t2, t3;
        JLabel l1, l2, l3;

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        l1 = new JLabel("arg1");
        l2 = new JLabel("arg2");
        l3 = new JLabel("Result");

        t1.setBounds(50,100, 200,30);
        t2.setBounds(50,200, 200,30);
        t3.setBounds(50,300, 200,30);

        l1.setBounds(50,70, 200,30);
        l2.setBounds(50,170, 200,30);
        l3.setBounds(50,270, 200,30);

        add(t1);
        add(t2);
        add(t3);

        add(l1);
        add(l2);
        add(l3);


        JMenuBar menuBar;
        JMenu menu;
        JMenuItem mi1, mi2, mi3;

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        mi1 = new JMenuItem("Add");
        mi2 = new JMenuItem("Subtract");
        mi3 = new JMenuItem("Close");

        menuBar.add(menu);
        menu.add(mi1);
        menu.add(mi2);
        menu.add(mi3);

        setJMenuBar(menuBar);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);
        
    }  

    public static void main(String[] args){
        new MenuTextfield();
    }
}

//Write a program to change the font of text in Jtextfield of the JFrame. The Jframe contains 3 checkboxes named bold, italic and plain.

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ChangeFont{
    
    ChangeFont(){
        JFrame f = new JFrame();
        JTextField t1 = new JTextField();
        t1.setBounds(50, 100, 200, 30);

        JCheckBox checkBox1 = new JCheckBox("Bold", false);    
        checkBox1.setBounds(100,130, 100,50);    
        JCheckBox checkBox2 = new JCheckBox("Italic", false);    
        checkBox2.setBounds(100,180, 100,50);
        JCheckBox checkBox3 = new JCheckBox("Plain", true);    
        checkBox3.setBounds(100,230, 100,50);

        f.add(t1);  
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);   
   
        f.setSize(500, 500);    
        f.setLayout(null);    
        f.setVisible(true);  

        checkBox1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setFont(new Font("Serif", Font.BOLD, 20));
                checkBox3.setSelected(false);  
                checkBox2.setSelected(false);
            }  
        }); 

        
        checkBox2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setFont(new Font("Serif", Font.ITALIC, 20));
                checkBox3.setSelected(false);
                checkBox1.setSelected(false);  
            }  
        }); 

        
        checkBox3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setFont(new Font("Serif", Font.PLAIN, 20));
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);  
            }  
        }); 
    }    

    public static void main(String[] args){
        new ChangeFont();
    } 
}
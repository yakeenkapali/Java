import java.awt.event.*;
import javax.swing.*;

class ByOuterClass extends JFrame {
	JButton b1;
	JTextField t1;
	
	ByOuterClass(){
		
	t1 = new JTextField();
	b1 = new JButton("Click");
	
	t1.setBounds(50,100, 350,30);
	b1.setBounds(50,200, 80,50);
	
	add(t1);
	add(b1);
	
	TheOuterClass tos = new TheOuterClass(this);
	
	b1.addActionListener(tos);
	
	setSize(500,500);  
	setLayout(null);  
	setVisible(true);
	
	
	}
	
	public static void main(String[] args){
		new ByOuterClass();
	}
}
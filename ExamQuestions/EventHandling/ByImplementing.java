import java.awt.event.*;
import javax.swing.*;

class ByImplementing extends JFrame implements ActionListener{
	JButton b1;
	JTextField t1;
	
	ByImplementing(){
		
	t1 = new JTextField();
	b1 = new JButton("Click");
	
	t1.setBounds(50,100, 300,30);
	b1.setBounds(50,200, 100,100);
	
	add(t1);
	add(b1);
	
	b1.addActionListener(this);
	
	setSize(400,400);  
	setLayout(null);  
	setVisible(true);
	
	
	}
	
	public void actionPerformed(ActionEvent e){
		t1.setText("This is Event Handling Example by Implementing ActionListener");
	}
	
	public static void main(String[] args){
		new ByImplementing();
	}
}
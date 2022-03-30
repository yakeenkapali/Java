import java.awt.event.*;
import javax.swing.*;

class ByAnonymousClass extends JFrame {
	JButton b1;
	JTextField t1;
	
	ByAnonymousClass(){
		
	t1 = new JTextField();
	b1 = new JButton("Click");
	
	t1.setBounds(50,100, 350,30);
	b1.setBounds(50,200, 80,50);
	
	add(t1);
	add(b1);
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t1.setText("This is Event Handling Example by Anonymous Class");
		}
	
	});
	
	setSize(500,500);  
	setLayout(null);  
	setVisible(true);
	
	
	}
	
	public static void main(String[] args){
		new ByAnonymousClass();
	}
}
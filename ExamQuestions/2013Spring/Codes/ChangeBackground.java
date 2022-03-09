/* Write a program to generate a Frame with two buttons 'BLACK' AND 'BLUE'. When a button is clicked it should change the background color of the Frame to respective color. */

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class ChangeBackground extends JFrame{
	
	ChangeBackground(){
		
		JButton buttonBlack = new JButton("Black");
		JButton buttonBlue = new JButton("Blue");
		
		buttonBlack.setBounds(80, 30, 120, 40);
		buttonBlue.setBounds(80, 70, 120, 40);
		
		add(buttonBlack);
		add(buttonBlue);
		
		setSize(400, 400);
		setLayout(null);  
		setVisible(true);
		
		
		buttonBlack.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				getContentPane().setBackground(Color.BLACK);
			}
		});
		
		
		buttonBlue.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				getContentPane().setBackground(Color.BLUE);
			}
		});
	}
	
	public static void main(String[] args){
		new ChangeBackground();
	}
}
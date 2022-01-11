import java.awt.*;    
import javax.swing.*;    

public class LayoutManagerDemo{

    JFrame frame = new JFrame(); 

    LayoutManagerDemo(int n){
                      
        TextField input, result;

        // initialization

        input = new TextField("Input");
        result = new TextField("Result");

        input.setBounds(120, 100, 150, 30);
        result.setBounds(120, 200, 150, 30);

        frame.add(input); frame.add(result);

        frame.setSize(500, 500);    
        frame.setVisible(true);
    }

    

    LayoutManagerDemo(){
        
        JButton btn1 = new JButton("C");    
        JButton btn2 = new JButton("DEL");    
        JButton btn3 = new JButton("%");    
        JButton btn4 = new JButton("/");    
        JButton btn5 = new JButton("7");    
        JButton btn6 = new JButton("8");    
        JButton btn7 = new JButton("9");    
        JButton btn8 = new JButton("X");    
        JButton btn9 = new JButton("4");
        JButton btn10 = new JButton("5");
        JButton btn11 = new JButton("6");
        JButton btn12 = new JButton("-");
        JButton btn13 = new JButton("1"); 
        JButton btn14 = new JButton("2");
        JButton btn15 = new JButton("3");
        JButton btn16 = new JButton("+");
        JButton btn17 = new JButton("M");
        JButton btn18 = new JButton("0");
        JButton btn19 = new JButton(".");
        JButton btn20 = new JButton("=");


        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
        frame.add(btn5); frame.add(btn6); frame.add(btn7); frame.add(btn8);
        frame.add(btn9); frame.add(btn10); frame.add(btn11); frame.add(btn12);
        frame.add(btn13); frame.add(btn14); frame.add(btn15); frame.add(btn16);
        frame.add(btn17); frame.add(btn18); frame.add(btn19); frame.add(btn20);  

        frame.setLayout(new GridLayout(5, 4, 10, 10));    
  
  
        frame.setSize(500, 500);    
        frame.setVisible(true);     
    }

    public static void main(String[] args){
        new LayoutManagerDemo();
        new LayoutManagerDemo(2);
    }
}
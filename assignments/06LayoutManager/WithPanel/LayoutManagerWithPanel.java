import java.awt.*;    
import javax.swing.*;    

public class LayoutManagerWithPanel{

    LayoutManagerWithPanel(){

        JFrame frame = new JFrame(); 
        
        Panel input = new Panel();
        TextField inputNumber, showResult;

        inputNumber = new TextField("Input");
        showResult = new TextField("Result");

        // inputNumber.setBounds(120, 100, 150, 30);
        // showResult.setBounds(120, 200, 150, 30);

        input.add(inputNumber);
        input.add(showResult);
        input.setBackground(Color.blue);
        input.setBounds(50, 20, 100, 100);



        Panel panel = new Panel();
        panel.setBounds(50, 50, 300, 300);    
        panel.setBackground(Color.gray);  


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


        panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4);
        panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8);
        panel.add(btn9); panel.add(btn10); panel.add(btn11); panel.add(btn12);
        panel.add(btn13); panel.add(btn14); panel.add(btn15); panel.add(btn16);
        panel.add(btn17); panel.add(btn18); panel.add(btn19); panel.add(btn20);  

        panel.setLayout(new GridLayout(5, 4, 10, 10));    
        // input.setLayout(new FlowLayout()); 

        frame.add(panel);
        frame.add(input);
        frame.setSize(900, 900);    
        frame.setVisible(true);     
    }

    public static void main(String[] args){
        new LayoutManagerWithPanel();
    }
}
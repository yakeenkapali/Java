import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Exception;

public class ActionEventWithinClass extends Frame
{

    Frame frame;
    Button add, sub, multiply, divide;
    TextField num1, num2, result;
    Label l1, l2, l3;

    public ActionEventWithinClass()
    {
      /*  Frame frame;
        Button add, sub, multiply, divide;
        TextField num1, num2, result;
        Label l1, l2, l3;*/

        frame= new Frame("Calculator");

        num1 = new TextField();
        num2 = new TextField();
        result = new TextField();
   
        l1 = new Label ("Number 1 :");   
        l2 = new Label ("Number 2 :");
        l3 = new Label ("Result :");

        add = new Button("ADD");
        sub = new Button("SUB");
        multiply = new Button("MULTIPLY");
        divide = new Button("DIVIDE");


        frame.setSize(900, 900);
        num1.setBounds(120, 100, 150, 30);
        num2.setBounds(120, 200, 150, 30);
        result.setBounds(120, 300, 150, 30);

        l1.setBounds(30, 100, 100, 30);    
        l2.setBounds(30, 200, 100, 30);  
        l3.setBounds(30, 300, 100, 30);

        add.setBounds(30, 400, 80, 30);
        sub.setBounds(120, 400, 80, 30);
        multiply.setBounds(210, 400, 80, 30);
        divide.setBounds(300, 400, 80, 30); 

        frame.add(add);
        frame.add(sub);
        frame.add(multiply);
        frame.add(divide);

        frame.add(num1);
        frame.add(num2);
        frame.add(result);

        frame.add(l1);  
        frame.add(l2);
        frame.add(l3);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    
    public static void main(String[] args)
    {
        new ActionEventWithinClass();
    }
	
    class EventHandler implements ActionListener {
    
    ActionEventOutsideClass obj;

    public EventHandler(ActionEventOutsideClass obj) {
        this.obj = obj;
    }
    
    
    public void actionPerformed(ActionEvent e)
	{ 
        String number1 = num1.getText();
        String number2 = num2.getText();
		double finalResult = 0.0;

        try{
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);

            if (e.getSource() == add){    
                finalResult = a + b;    
            } else if (e.getSource() == sub){    
                finalResult = a - b;    
            } else if (e.getSource() == divide){
                finalResult = a / b;
            } else if (e.getSource() == multiply){    
                finalResult = a * b;    
            }
        } catch (Exception error) {
            result.setText("Give valid Input");
        } 

        String outcome = String.valueOf(finalResult);
        result.setText(outcome);
    }

}
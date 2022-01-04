import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class FrameWithInheritance extends Frame
{

    public static void main(String[] args)
    {
        /*  CREATING OBJECT  */

        // creating object of FrameWithInheritance Class

        FrameWithInheritance frame = new FrameWithInheritance();


        // creating the object of Button, TextField and Label Class 
        
        Button add, sub, multiply, divide;

        TextField num1, num2, result;

        Label l1, l2, l3;


        /*  INITIALIZATION  */

        // initializing the textfield
        num1 = new TextField("Input first number");
        num2 = new TextField("Input second number");
        result = new TextField("Result is shown here");

        // initializing the labels   
        l1 = new Label ("Number 1 :");   
        l2 = new Label ("Number 2 :");
        l3 = new Label ("Result :");

        // initializing the button class
        add = new Button("ADD");
        sub = new Button("SUB");
        multiply = new Button("MULTIPLY");
        divide = new Button("DIVIDE");


        /*  SET SIZE AND LOCATION */

        // set the size of frame 
        frame.setSize(900, 900);

        // set the location and size of textfields
        num1.setBounds(120, 100, 150, 30);
        num2.setBounds(120, 200, 150, 30);
        result.setBounds(120, 300, 150, 30);

        // set the location and size of labels  
        l1.setBounds(30, 100, 100, 30);    
        l2.setBounds(30, 200, 100, 30);  
        l3.setBounds(30, 300, 100, 30);

        // set the location and size of button (x coordinate, y coordinate, width, height)
        add.setBounds(30, 400, 80, 30);
        sub.setBounds(120, 400, 80, 30);
        multiply.setBounds(210, 400, 80, 30);
        divide.setBounds(300, 400, 80, 30); 


        /*  ADDING TO FRAME  */
        
        // adding buttons to the frame
        frame.add(add);
        frame.add(sub);
        frame.add(multiply);
        frame.add(divide);

        // adding textfields to the frame
        frame.add(num1);
        frame.add(num2);
        frame.add(result);

        // adding labels to the frame    
        frame.add(l1);  
        frame.add(l2);
        frame.add(l3);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}
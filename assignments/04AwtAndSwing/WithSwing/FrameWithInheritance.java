import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

class FrameWithInheritance extends JFrame
{

    public static void main(String[] args)
    {
        /*  CREATING OBJECT  */

        // creating object of FrameWithInheritance Class

        FrameWithInheritance frame = new FrameWithInheritance();


        // creating the object of JButton, JTextField and JLabel Class 
        
        JButton add, sub, multiply, divide;

        JTextField num1, num2, result;

        JLabel l1, l2, l3;


        /*  INITIALIZATION  */

        // initializing the Jtextfield
        num1 = new JTextField("Input first number");
        num2 = new JTextField("Input second number");
        result = new JTextField("Result is shown here");

        // initializing the Jlabels   
        l1 = new JLabel ("Number 1 :");   
        l2 = new JLabel ("Number 2 :");
        l3 = new JLabel ("Result :");

        // initializing the Jbutton class
        add = new JButton("ADD");
        sub = new JButton("SUB");
        multiply = new JButton("MULTIPLY");
        divide = new JButton("DIVIDE");


        /*  SET SIZE AND LOCATION */

        // set the size of frame 
        frame.setSize(900, 900);

        // set the location and size of Jtextfields
        num1.setBounds(120, 100, 150, 30);
        num2.setBounds(120, 200, 150, 30);
        result.setBounds(120, 300, 150, 30);

        // set the location and size of Jlabels  
        l1.setBounds(30, 100, 100, 30);    
        l2.setBounds(30, 200, 100, 30);  
        l3.setBounds(30, 300, 100, 30);

        // set the location and size of Jbutton (x coordinate, y coordinate, width, height)
        add.setBounds(30, 400, 80, 30);
        sub.setBounds(120, 400, 80, 30);
        multiply.setBounds(210, 400, 80, 30);
        divide.setBounds(300, 400, 80, 30); 


        /*  ADDING TO FRAME  */
        
        // adding Jbuttons to the frame
        frame.add(add);
        frame.add(sub);
        frame.add(multiply);
        frame.add(divide);

        // adding Jtextfields to the frame
        frame.add(num1);
        frame.add(num2);
        frame.add(result);

        // adding Jlabels to the frame    
        frame.add(l1);  
        frame.add(l2);
        frame.add(l3);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}
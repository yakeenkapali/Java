import java.awt.event.*;

class TheOuterClass implements ActionListener{
	
	ByOuterClass obj;
	
	TheOuterClass(ByOuterClass obj){
		this.obj = obj;
	}
	
	public void actionPerformed(ActionEvent e){
		obj.t1.setText("This is Event Handling Example by Outer Class");
	}
}
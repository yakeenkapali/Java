import java.applet.Applet;
import java.awt.Graphics;

public class PassingParameter extends Applet{
  String param;
  
  public void init(){
		param = getParameter("param");
	}
	
  public void paint(Graphics g){
		g.drawString(param, 50, 30);
	}
}
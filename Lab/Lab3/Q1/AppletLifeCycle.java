import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet{

	public void init(){
		System.out.println("Initializing");
	}

	public void start(){
		System.out.println("Starting");
	}

	public void paint(Graphics g){
    g.drawString("Painting", 25, 50);
	}

	public void stop(){
		System.out.println("Stopping");
	}
	
	public void destroy(){
		System.out.println("Destroying");
	}	
}
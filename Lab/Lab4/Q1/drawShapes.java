import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class drawShapes extends JFrame {

	drawShapes() {
		setSize(800, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// circle
        g.setColor(Color.RED);
		g.fillOval(50, 50, 60, 60);

		// ellipse
		g.setColor(Color.GREEN);
		g.fillOval(200, 50, 100, 60);

		// triangle
		g.setColor(Color.BLUE);
		int[] triangleX = { 500, 340, 500 };
		int[] triangleY = { 40, 100, 100 };

		Polygon triangle = new Polygon(triangleX, triangleY, triangleX.length);
		g.fillPolygon(triangle);


		// hexagon
        g.setColor(Color.BLACK);
		int[] hexagonX = {150, 250, 250, 150, 50, 50};
		int[] hexagonY = { 250, 300, 400, 450, 400, 300 };

		Polygon hexagon = new Polygon(hexagonX, hexagonY, hexagonX.length);
		g.fillPolygon(hexagon);


		// pentagon
		g.setColor(Color.MAGENTA);
		int[] pentagonX = { 450, 550, 500, 400, 350};
		int[] pentagonY = { 270, 350, 450, 450, 350};

		Polygon pentagon = new Polygon(pentagonX, pentagonY, pentagonX.length);
		g.fillPolygon(pentagon);
	}

	public static void main(String[] args) {
		new drawShapes();
	}

}
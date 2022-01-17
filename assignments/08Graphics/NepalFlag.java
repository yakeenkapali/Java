import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
class NepalFlag extends Frame
{
 Polygon triangle1,triangle2;

	public NepalFlag()
	{
		super("Nepal Flag");
		setSize(900, 1000);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
        drawTriangle1(g);
        drawTriangle2(g);
        drawFlag(g);
	}

    public void drawTriangle1(Graphics g)
    {
 		int xaxis[] = {650, 700 , 750}; 
		int yaxis[] = {100, 200, 100}; 

        triangle1 = new Polygon(xaxis,yaxis,3);
		g.drawPolygon(triangle1);
		g.setColor(Color.green);  
		g.fillPolygon(triangle1); 
    }
    public void drawTriangle2(Graphics g)
    {

		int xaxis[] = {500, 550, 600}; 
 		int yaxis[] = {200, 100, 200}; 
		g.setColor(Color.blue);  

        triangle2 = new Polygon(xaxis,yaxis,3);
		g.drawPolygon(triangle2);

    }

    public void drawFlag(Graphics flag)
    {
        Polygon topRedTriangle, belowRedTriangle, border, pole, star;

        Color flagRed = new Color(221,12,39); 


        int borderX[] = {100, 420, 150, 450, 100}; 
		int borderY[] = {80, 270, 270, 520, 520};
		border = new Polygon(borderX,borderY,5);
		flag.drawPolygon(border);
		flag.setColor(Color.blue);
		flag.fillPolygon(border);

        int topRedxaxis[] = {100, 350, 100};
        int topRedyaxis[] = {100, 250, 250};

        topRedTriangle = new Polygon(topRedxaxis, topRedyaxis,3);
		flag.drawPolygon(topRedTriangle);
		flag.setColor(flagRed);  
		flag.fillPolygon(topRedTriangle);

        
        int belowRedxaxis[] = {100, 400, 100};
        int belowRedyaxis[] = {250, 500, 500};

        belowRedTriangle = new Polygon(belowRedxaxis, belowRedyaxis,3);
		flag.drawPolygon(belowRedTriangle);
		flag.setColor(flagRed);  
		flag.fillPolygon(belowRedTriangle);


        int poleX[] = {100, 100, 80, 80 };
		int poleY[] = {80, 820, 820, 80}; 
		pole = new Polygon(poleX, poleY, 4);
		flag.drawPolygon(pole);
		flag.setColor(Color.black);
		flag.fillPolygon(pole);

        //circles
		flag.fillOval(65, 40, 50, 50);
        flag.setColor(Color.white);


        int starX[] = {150, 160, 180, 170, 180, 150, 120, 130, 120, 140 };
		int starY[] = {150, 160, 160, 170, 190, 175, 190, 170, 160, 160}; 
		star = new Polygon(starX,starY,10);
		flag.drawPolygon(star);
		flag.setColor(Color.black);
		flag.fillPolygon(star);	



        
    }
    
public static void main(String[] args){
    new NepalFlag();
}
}
import java.awt.*;
import java.applet.*;
/*
<applet code="Smiley.java" width=500 height=500></applet>
*/
public class Smiley extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(60,60,200,200);       //(x, y, width, height)
		g.setColor(Color.black);
		g.fillOval(90,120,30,30);
		g.fillOval(190,120,30,30);
		g.drawLine(160,120,160,170);     //(x1 ,y1 ,x2 ,y2)
		g.drawArc(120,180,80,70,0,180);	 //(x, y, width, height, startAngle, arcAngle)
	}
}
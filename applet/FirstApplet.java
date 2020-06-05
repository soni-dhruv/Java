import java.awt.*;
import java.applet.*;
/*<applet code="FirstApplet.class" width=800 height=800></applet>*/
public class FirstApplet extends Applet
{
  	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.BOLD|Font.ITALIC,72);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Welcome in Java Applet.",400,200);
		g.drawLine(140,150,100,250);
		g.drawRect(25,50,60,78);
		g.setColor(Color.black);
		g.fillRect(500,300,260,150);
		g.drawOval(1000,400,60,50);
		g.fillOval(100,400,60,50);
	}
} 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<Applet code="KeyEvents" height=300 width=300></Applet>
public class KeyEvents extends Applet implements KeyListener
{
	String msg="PGDIT";
	int x=150, y=200;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Down");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke) 
	{
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		setForeground(Color.white);
		g.drawString(msg,x,y);
	}
}
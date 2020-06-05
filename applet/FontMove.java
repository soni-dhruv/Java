import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="FontMove" width=200 height=200></applet>
public class FontMove extends Applet implements MouseListener,MouseMotionListener{
	String name, msg="";
	int mx=50, my=50;
	Font f=new Font("Arial",Font.ITALIC,40);
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		name="Pgdit";
	}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseMoved(MouseEvent me){
		showStatus("Moving Location: "+me.getX()+","+me.getY());
	}
	public void mouseDragged(MouseEvent me){
		mx=me.getX();
		my=me.getY();
		msg=name;
		repaint();
	}
	public void paint(Graphics g){
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString(name,mx,my);
	}
}


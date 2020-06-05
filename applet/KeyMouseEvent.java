import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<Applet code="KeyMouseEvent" height=300 width=300></Applet>
public class KeyMouseEvent extends Applet implements KeyListener,MouseListener,MouseMotionListener{
	//Key Events
	String msg="PGDIT";
	int x=150, y=150;
	public void init(){
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		name="Pgdit";
	}
	public void keyPressed(KeyEvent ke){
		showStatus("Key Down");
	}
	public void keyReleased(KeyEvent ke){
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		setBackground(Color.white);
		setForeground(Color.black);
		g.drawString(msg,x,y);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(name,mx,my);
	}
	//Mouse Events
    public void mouseClicked(MouseEvent me){
        showStatus("Mouse Clicked...");
    }
    public void mouseEntered(MouseEvent me){
        showStatus("Mouse Entered...");
    }
    public void mouseExited(MouseEvent me){
        showStatus("Mouse Exited...");
    }
    public void mousePressed(MouseEvent me){
        showStatus("Mouse Pressed...");
    }
    public void mouseReleased(MouseEvent me){
        showStatus("Mouse Released...");
    }
    //Mouse Motion
    String name;
	int mx=50, my=50;
	Font f = new Font("Arial",Font.ITALIC,40);
	public void mouseMoved(MouseEvent me){
		showStatus("Moving Location: "+me.getX()+","+me.getY());
	}
	public void mouseDragged(MouseEvent me){
		mx=me.getX();
		my=me.getY();
		msg=name;
		repaint();
	}
}
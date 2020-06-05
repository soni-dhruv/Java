import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*
<applet code=Mouse height=200 width=200></applet>
*/
public class Mouse extends Applet implements MouseListener
{
        public void init()
        {
                addMouseListener(this);
        }
        public void mouseClicked(MouseEvent me)
        {
                showStatus("Mouse clicked...");
        }
        public void mouseExited(MouseEvent me)
        {
                showStatus("Mouse exited...");
        }
        public void mouseEntered(MouseEvent me)
        {
                showStatus("Mouse entered...");
        }
        public void mouseReleased(MouseEvent me)
        {
                showStatus("Mouse released...");
        }
        public void mousePressed(MouseEvent me)
        {
                showStatus("Mouse pressed...");
        }
}


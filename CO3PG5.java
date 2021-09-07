import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="Mouse" width=500 height=500>
 </applet>
*/

public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
    int mx=0;
    int my=0;
    String msg="";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        mx=1000;
        my=1000;
        msg="Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        mx=300;
        my=600;
        msg="Mouse Pressed";

        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        mx=300;
        my=600;
        msg="Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        mx=400;
        my=800;
        msg="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        mx=400;
        my=800;
        msg="Mouse Exited";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        mx=me.getX();
        my=me.getY();
        showStatus("Currently mouse dragged"+mx+" "+my);

        repaint(); }
    public void mouseMoved(MouseEvent me)
    {
        mx=me.getX();
        my=me.getY();
        showStatus("Currently mouse is at"+mx+" "+my);
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Handling Mouse Events",300,200);
        g.drawString(msg,600,400);
    }
}
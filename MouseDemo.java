import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<APPLET CODE="MouseDemo" WIDTH =300 HEIGHT=200></APPLET> */
public class MouseDemo extends Applet implements MouseListener
{
    Label l;

    public void init()
    {
        setLayout(null);
        l = new Label("Hello World");
        l.setBounds(50, 150, 200, 100);
        add(l);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e)
    {
        l.setText("Mosue Pressed no of click " + e.getClickCount() + "at position" + e.getX() + "," + e.getY());
        
    }

    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released ; # of clicks: " + e.getClickCount());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked(# of clicks"+e.getClickCount());
    }
}
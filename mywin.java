import java.awt.*;
import java.awt.event.*;
public class mywin extends Frame implements MouseListener
{
mywin()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
Graphics g=getGraphics();
g.setColor(Color.red);
g.drawString("*", me.getX(), me.getY()); 
}
public void mousePressed(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseExited(MouseEvent me)
{}


public static void main(String args[])
{
mywin ob = new mywin();
ob.setSize(400,300);
ob.setTitle("My Frame");
ob.setVisible(true);
ob.setBackground(Color.cyan);
}
}
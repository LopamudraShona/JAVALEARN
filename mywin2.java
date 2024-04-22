import java.awt.*;
import java.awt.event.*;
public class mywin2 extends Frame implements MouseListener
{
int x1 ,y1 ,x2, y2;
mywin2()
{
addMouseListener(this);
}

public void mouseClicked(MouseEvent me)
{
 
}
public void mousePressed(MouseEvent me)
{
x1=me.getX();
y1=me.getY();
}
public void mouseReleased(MouseEvent me)
{
x2=me.getX();
Graphics g=getGraphics();
g.setColor(Color.red);
g.drawLine(x1,y1,x2,y2);
}
public void mouseEntered(MouseEvent me)
{}
public void mouseExited(MouseEvent me)
{}


public static void main(String args[])
{
mywin2 ob = new mywin2();
ob.setSize(400,300);
ob.setTitle("My Frame");
ob.setVisible(true);
ob.setBackground(Color.cyan);
}
}
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
//impots all need packages
//creates out extended class
public class TetrimoGameBlocks extends JComponent
{
  public void paintComponent(Graphics g)
  {
    //sets our paint brush to "brush"
    Graphics2D brush = (Graphics2D) g;

    //creates I box
    Rectangle boxI = new Rectangle(0,0,80,20);
    //creates J box
    Rectangle boxJ1 = new Rectangle(0,0,60,20);
    Rectangle boxJ2 = new Rectangle(40,20,20,20);
    //creates L box
    Rectangle boxL1 = new Rectangle(0,0,60,20);
    Rectangle boxL2 = new Rectangle(40,-20,20,20);
    //creates O box
    Rectangle boxO = new Rectangle(0,0,40,40);
    //creates Z box
    Rectangle boxZ1 = new Rectangle(0,0,40,20);
    Rectangle boxZ2 = new Rectangle(20,20,40,20);
    //creates S box
    Rectangle boxS1 = new Rectangle(20,0,40,20);
    Rectangle boxS2 = new Rectangle(0,20,40,20);
    //creates T box
    Rectangle boxT1 = new Rectangle(20,0,20,20);
    Rectangle boxT2 = new Rectangle(0,20,60,20);

    //Code to move boxes (repeated for every box)
    brush.translate(0,320);

    //draws and colors each box (repeated for each box)
    brush.setColor(Color.MAGENTA);
    brush.fill(boxT1);
    brush.fill(boxT2);

    brush.translate(60,0);

    brush.setColor(Color.GREEN);
    brush.fill(boxS1);
    brush.fill(boxS2);

    brush.translate(60,0);

    brush.setColor(Color.RED);
    brush.fill(boxZ1);
    brush.fill(boxZ2);

    brush.translate(-80,-20);

    brush.setColor(Color.YELLOW);
    brush.fill(boxO);

    brush.translate(40,0);

    brush.setColor(Color.PINK);
    brush.fill(boxL1);
    brush.fill(boxL2);

    brush.translate(120,20);
    //Code to rotate box. PI for 180 degrees, PM/2 for 90 degrees, and PI/-2 for -180 degrees
    //(Repeated as needed)
    brush.rotate(Math.PI);

    brush.setColor(Color.GRAY);
    brush.fill(boxJ1);
    brush.fill(boxJ2);

    brush.translate(60,20);
    brush.rotate(Math.PI/2);

    brush.setColor(Color.GREEN);
    brush.fill(boxS1);
    brush.fill(boxS2);

    brush.translate(-40,-140);

    brush.setColor(Color.CYAN);
    brush.fill(boxI);

    brush.rotate(Math.PI/-2);
    brush.translate(-120,40);

    brush.fill(boxI);

    brush.translate(60,60);
    brush.rotate(Math.PI/-2);

    brush.setColor(Color.MAGENTA);
    brush.fill(boxT1);
    brush.fill(boxT2);


    brush.rotate(Math.PI/-2);
    brush.translate(-20,0);

    brush.setColor(Color.RED);
    brush.fill(boxZ1);
    brush.fill(boxZ2);

    brush.translate(60,0);

    brush.setColor(Color.YELLOW);
    brush.fill(boxO);

    brush.translate(-40,0);
    brush.rotate(Math.PI);

    brush.setColor(Color.PINK);
    brush.fill(boxL1);
    brush.fill(boxL2);

    brush.translate(0,20);

    brush.setColor(Color.GRAY);
    brush.fill(boxJ1);
    brush.fill(boxJ2);
  }
}

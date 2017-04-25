import javax.swing.JFrame;
// Imports program for the frame
//Creates Trtrimo based game class
public class TetrimoGameArea
{
  public static void main(String[] args)
  {
    // Creates frame area
    JFrame area = new JFrame();
    //sets size of frame and adds title and exits program when window closed
    area.setSize(220,400);
    area.setTitle("Tetrimo Based Game");
    area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //imports class from the TetrimoGameBlocks class
    TetrimoGameBlocks component = new TetrimoGameBlocks();
    //Allows to add components from other class
    area.add(component);

    // makes everything visible
    area.setVisible(true);


  }
}

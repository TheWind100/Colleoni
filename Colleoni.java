import java.awt.*;
import javax.swing.*;

// Scaling resolution


public class Colleoni
{
   public static JFrame frame;
   public static Screen screen;

   public static void main( String[] args )
   {
      screen = new Screen();
      frame = new JFrame("Colleoni");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,600);
      frame.setLocationRelativeTo(null);
      frame.setContentPane(screen);
      frame.setVisible(true);
   }
}
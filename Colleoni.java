import java.awt.*;
import javax.swing.*;

// Scaling resolution


public class Colleoni
{
   public static JFrame frame;
   public static View view;

   public static void main( String[] args )
   {
      view = new View();
      frame = new JFrame("Colleoni");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
      frame.setUndecorated(true);
      //frame.setSize(1200,800);
      //frame.setLocationRelativeTo(null);
      frame.setContentPane(view);
      frame.setVisible(true);
   }
}
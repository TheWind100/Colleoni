import java.awt.*;
import javax.swing.*;

// Top down map movement.
// Custom art style. Game Menu.
// Screen before Game Menu. Settings page.
// About page. Play Button. 

public class Screen extends JPanel
{
   protected static boolean titleScreen;
   protected static boolean menu;
   protected static boolean map;

   public Screen()
   {
      setLayout(GridBagLayout());
      titleScreen = false;
      menu = false;
      map = true;
      
      ImageDisplay.loadImages();
      
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      ImageDisplay.drawMainScreen(g);
   }
}
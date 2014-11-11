import java.awt.*;
import javax.swing.*;

// Top down map movement.
// Custom art style. Game Menu.
// Screen before Game Menu. Settings page.
// About page. Play Button. 

public class View extends JPanel
{
   protected static boolean titleScreen;
   protected static boolean menu;

   public View()
   {
      titleScreen = true;
      menu = false;
      
      ImageDisplay.loadImages();
      
   }
   
   public static void resetGame()
   {
      ImageDisplay.loadImages();
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      ImageDisplay.drawMainScreen(g);
   }
}
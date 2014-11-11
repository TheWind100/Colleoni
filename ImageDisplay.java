import java.awt.*;
import javax.swing.*;

public class ImageDisplay extends View
{
   private static ImageIcon title;

   public static void loadImages()
   {
      
      
      title = new ImageIcon("Images/TitleScreen/title0.jpg");
   }
   
   public static void drawMainScreen(Graphics g)
   {
      if(titleScreen)
      {
         g.drawImage(title.getImage(), 0, 0, null);
      }
   }
}
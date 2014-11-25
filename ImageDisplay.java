import java.awt.*;
import javax.swing.*;

public class ImageDisplay extends Screen
{
   private static ImageIcon title;
   private static ImageIcon map;

   public static void loadImages()
   {
      title = new ImageIcon("CCursor.png");
      map = new ImageIcon();
   }
   
   public static void drawMainScreen(Graphics g)
   {
      if(titleScreen)
      {
         g.drawImage(title.getImage(), 0, 0, null);
      }
   }
}
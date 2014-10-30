// Jimsteroni
import java.util.*;
public class Sea extends Tile
{
   private Fleet fleet;
   //private ArrayList<Province> ports;
   public Sea()
   {
      fleet = null;
      //ports = null;
   }
   public Sea( String name, String owner )
   {
      super( name, owner );
      fleet = null;
      //ports = null;
   }
   public Sea( String name )
   {
      super( name );
      fleet = null;
      //ports = null;
   }
   public void setFleet (Fleet boat)
   {
      fleet = boat;
   }
   public Fleet getFleet()
   {
      return fleet;
   }
   /*public void addPort(Province port)
   {
      ports.add(port);
   }*/
}
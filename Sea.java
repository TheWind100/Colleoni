// Jimsteroni
import java.util.*;
public class Sea extends Tile
{
   private Fleet fleet;
   private ArrayList<City> ports;
   //start constructors
   public Sea()
   {
      fleet = null;
      ports = new ArrayList<City>();
   }
   public Sea( String name, String owner )
   {
      super( name, owner );
      fleet = null;
      ports = new ArrayList<City>();
   }
   public Sea( String name )
   {
      super( name );
      fleet = null;
      ports = new ArrayList<City>();
   }
   //end constructors
   public void setFleet (Fleet boat)
   {
      fleet = boat;
   }
   public Fleet getFleet()
   {
      return fleet;
   }
   public void addCity(City c)
   {
      ports.add(c);
   }
}
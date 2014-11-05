import java.util.*;
// kyle
public class Province extends Tile
{
   private City city;
   private Army unit;
   private Fleet fleet;
   private boolean famine;
   private boolean rebellion;
   private String home_of;
   //start constructors
   public Province()
   {
      super();
      city = null;
      unit = null;
      famine = false;
      rebellion = false;
      fleet = null;
   }
   public Province(String nomen, String home)
   {
      super(nomen);
      city = null;
      unit = null;
      home_of = home;
      famine = false;
      rebellion = false;
      fleet = null;
   }
   public Province(String nomen)
   {
      super(nomen);
      city = null;
      unit = null;
      home_of = null;
      famine = false;
      rebellion = false;
      fleet = null;
   }
   public Province(String nomen, City c, String home)
   {
      super(nomen);
      city = c;
      unit = null;
      home_of = home;
      famine = false;
      rebellion = false;
   }
   public Province(String nomen, City c)
   {
      super(nomen);
      city = c;
      unit = null;
      home_of = null;
      famine = false;
      rebellion = false;
   }
   // end constructors
   //start famine + rebellion methods
   public void toggle_famine()
   {
      famine = !famine;
   }
   public void toggle_rebellion()
   {
      rebellion = !rebellion;
   }
   public boolean isRebellion()
   {
      return rebellion;
   }
   public boolean isFamine()
   {
      return famine;
   }
   // end famine + rebellion methods
   //start unit + fleet methods
   public Unit getUnit()
   {
      return unit;
   }
   public Fleet getFleet()
   {
      return fleet;
   }
   public void setUnit(Army army)
   {
      unit = army;
   }
   public void setFleet (Fleet boat)
   {
      fleet = boat;
   }
   // end unit + fleet methods
   void addCity(City c)
   {
      city = c;
   }
}
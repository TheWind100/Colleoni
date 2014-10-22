import java.util.*;
// kyle
public abstract class Province extends Tile
{
   private City city;
   private Army unit;
   private Fleet fleet;
   private boolean famine;
   private boolean rebellion;
   private String home_of;
   private Sea port;
   //start constructors
   public Province()
   {
      super();
      city = null;
      unit = null;
      famine = false;
      rebellion = false;
      port = null;
      fleet = null;
   }
   public Province(String nomen, City c, Sea harbor, String own, String home)
   {
      super(nomen, own);
      city = c;
      unit = null;
      home_of = home;
      famine = false;
      rebellion = false;
      port = harbor;
      fleet = null;
   }
   public Province(String nomen, String own, String home)
   {
      super(nomen, own);
      city = null;
      unit = null;
      home_of = home;
      famine = false;
      rebellion = false;
      port = null;
      fleet = null;
   }
   public Province(String nomen, City c, String own, String home)
   {
      super(nomen, own);
      city = c;
      unit = null;
      home_of = home;
      famine = false;
      rebellion = false;
      port = null;
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
}
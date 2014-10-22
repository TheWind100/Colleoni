import java.util.*;
// kyle
public abstract class Province extends Tile
{
   private City city;
   private Army unit;
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
   public void toggle_famine()
   {
      famine = !famine;
   }
   public void toggle_rebellion()
   {
      rebellion = !rebellion;
   }
}
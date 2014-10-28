//kyle
public class City
{
   private Garrison unit;
   private boolean rebellion;
   private boolean famine;
   private Province province;
   private String owner;
   private Sea port;
   //start constructors
   public City()
   {
      province = null;
      unit = null;
      famine = false;
      rebellion = false;
      port = null;
   }
   public City(Province p)
   {
      province = p;
      unit = null;
      famine = false;
      rebellion = false;
      port = null;
   }
   //end constructors
   public String setOwner(String new_owner)
   {
      String temp = owner;
      owner = new_owner;
      return temp;
   }
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
   public Garrison getUnit()
   {
      return unit;
   }
   public void setUnit(Garrison garrison)
   {
      unit = garrison;
   }
   public void addPort(Sea p)
   {
      port = p;
   }
}
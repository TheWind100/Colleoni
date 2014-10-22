//kyle
public class City
{
   private Garrison unit;
   private boolean rebellion;
   private boolean famine;
   private Province province;
   private String owner;
   //start constructors
   public City()
   {
      province = null;
      unit = null;
      famine = false;
      rebellion = false;
   }
   public City(Province p)
   {
      province = p;
      unit = null;
      famine = false;
      rebellion = false;
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
}
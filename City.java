//kyle
public class City
{
   private Garrison unit;
   private boolean rebellion;
   private boolean famine;
   private Province province;
   private String owner;
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
   public String setOwner(String new_owner)
   {
      String temp = owner;
      owner = new_owner;
      return temp;
   }
   public void toggle_famine()
   {
      famine = !famine;
   }
   public void toggle_rebellion()
   {
      rebellion = !rebellion;
   }
}
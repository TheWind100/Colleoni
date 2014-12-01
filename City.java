//kyle
public class City extends Tile
{
   private Garrison unit;
   private boolean rebellion;
   private boolean famine;
   //start constructors
   public City()
   {
      super();
      unit = null;
      famine = false;
      rebellion = false;
   }
   public City(Tile p)
   {
      super(p.getName());
      unit = null;
      famine = false;
      rebellion = false;
      this.addBorder(p);
   }
   //end constructors
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
   public void addCity(City c)
   {
      System.out.println("You can't put a city in a city\n\n\n"+"ya dingus");
   }
}
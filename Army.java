public class Army extends Unit
{
   private Province province;
   public Army()
   {
      super();
      province = null;
   }
   public Army(String own)
   {
      super(own);
      province = null;
   }
   public Army(String own, Province prov)
   {
      super(own);
      province = prov;
   }
   public Tile setTile(Tile t)
   {
      if(t instanceof Province)
      {
         Province temp = province;
         province = (Province) t;
         return temp;
      }
      else
      {
         System.out.println("Can only put Army in Province");
         return null;
      }
   }
   public Province getTile()
   {
      return province;
   }
}
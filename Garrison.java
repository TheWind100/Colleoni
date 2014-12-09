public class Garrison extends Unit
{
   private City city;
   public Garrison()
   {
      super();
      city = null;
   }
   public Garrison(String own)
   {
      super(own);
      city = null;
   }
   public Tile getTile()
   {
      return city;
   }
   public Tile setTile(Tile t)
   {
      if(t instanceof City)
      {
         City temp = city;
         city = (City) t;
         return temp;
      }
      else
      {
         System.out.println("Can only put Garrison in City");
         return null;
      }
   }
}
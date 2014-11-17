//kyle
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
}
public class Fleet extends Unit
{
   private Tile sea;
   public Fleet()
   {
      super();
      sea = null;
   }
   public Fleet(String own)
   {
      super(own);
      sea = null;
   }
   public Tile setTile( Tile t )
   {
      if (!(t instanceof City))
      {
         Tile temp = sea;
         sea = t;
         return temp;
      }
      else
      {
         System.out.println("Can't put a fleet in a City");
         return null;
      }
   }
   public Tile getTile()
   { 
      return sea;
   }
}
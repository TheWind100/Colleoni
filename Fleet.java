//kyle
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
   public Tile setTile( Tile newSea )
   {
      Tile temp = sea;
      sea = newSea;
      return temp;   
   }
   public Tile getTile()
   { 
      return sea;
   }
}
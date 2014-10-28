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
   public Tile setTile() // Jimsteroni
   {
      return sea;
   }
   public Tile setTile( Tile newSea )
   {
      Tile temp = sea;
      sea = newSea;
      return temp;   
   }
}
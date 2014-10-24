public class Map
{
   private Tile[] tiles;
   private String[] names = {"Venice", "Milan"};
   public Map()
   {
      tiles = new Tile[names.length];
   }
   public void addTile(Tile tile, int k)
   {
      tiles[k] = tile;
   }
}
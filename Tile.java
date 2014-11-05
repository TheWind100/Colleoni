import java.util.*;
// kyle
public abstract class Tile
{
   private String owner;
   private ArrayList<Tile> borders;
   private String name;
   abstract void addCity(City c);
   public Tile()
   {
      owner = null;
      borders = null;
      name = null;
   }
   public Tile(String n)
   {
      owner = null;
      borders = null;
      name = n;
   }
   public Tile(String n, String o)
   {
      owner = o;
      borders = null;
      name = n;
   }
   public void addBorder(Tile border)
   {
      borders.add(border);
   }
   public String setOwner(String new_owner)
   {
      String temp = owner;
      owner = new_owner;
      return temp;
   }
   public String getName()
   {
      return name;
   }
   public String getOwner()
   {
      return owner;
   }
   public ArrayList<Tile> getBorders()
   {
      return borders;
   }
}
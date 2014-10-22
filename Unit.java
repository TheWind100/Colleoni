// kyle
public abstract class Unit
{
   private String owner;
   public Unit()
   {
      owner = null;
   }
   public Unit(String own)
   {
      owner = own;
   }
   public String setOwner(String own)
   {
      String temp = owner;
      owner = own;
      return temp;
   }
   public String getOwner() // Jimsteroni
   {
      return owner;
   }
}
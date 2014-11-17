//kyle
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
   public Province setTile(Province prov)
   {
      Province temp = province;
      province = prov;
      return temp;
   }
   public Province getTile()
   {
      return province;
   }
}
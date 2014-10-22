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
   public String setProvince(Province prov)
   {
      String temp = province.getName();
      province = prov;
      return temp;
   }
   public Province getProvince()
   {
      return province;
   }
}
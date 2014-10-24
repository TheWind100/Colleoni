public class Map
{
   private Tile[] tiles;
   private String[] landnames = {"Avingnon","Swiss","Tyrol","Austria","Hungary","Marseille","Provence","Saluzzo","Turin",
                              "Como","Milan","Carinthia","Slavonia","Savoy","Montferral","Pavia","Milan","Trent",
                              "Genoa","F???","Parma","Cremona","Bergamo","Trent","Modena","Mantua","Verona"
                              "Friuli","Carnola","Lucca","Bologna","Ferrara","Padua","Traviso","Pisa","Pistoia"
                              ,"Florence","Urbino","Piombino","Siena","Arezzo","P???","Perugia","Spoleto","Ancona"
                              ,"Rome","Capua","Aquila","Naples","Salerno","Bari","Otranio","Sardinia"
                              ,"Corsica","Tunis","Palermo","Messina","Venice","Istria","Croatia","Dalmatia"
                              ,"Bosnia","Herzegovina","Ragusa","Albania","Durazzo"};
   private String[] seanames = {"Gulf of Lions","Ligurian Sea","Tyrrhenian Sea",
                                 "Western Mediterranean","Central Mediterranean",
                                 "Gulf of Naples","Ionian Sea","Upper Adriatic",
                                 "Lower Adriatic"};
   public Map()
   {
      tiles = new Tile[landnames.length+seanames.length];
   }
   public void addTile(Tile tile, int k)
   {
      tiles[k] = tile;
   }
}
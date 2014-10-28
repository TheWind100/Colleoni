public class Map
{
   private Tile[] tiles;
  /* private String[] landnames = {"Avingnon","Swiss","Tyrol","Austria","Hungary","Marseille","Provence","Saluzzo","Turin",
                              "Como","Milan","Carinthia","Slavonia","Savoy","Montferral","Pavia","Milan","Trent",
                              "Genoa","F???","Parma","Cremona","Bergamo","Trent","Modena","Mantua","Verona",
                              "Friuli","Carnola","Lucca","Bologna","Ferrara","Padua","Traviso","Pisa","Pistoia"
                              ,"Florence","Urbino","Piombino","Siena","Arezzo","P???","Perugia","Spoleto","Ancona"
                              ,"Rome","Capua","Aquila","Naples","Salerno","Bari","Otranio","Sardinia"
                              ,"Corsica","Tunis","Palermo","Messina","Venice","Istria","Croatia","Dalmatia"
                              ,"Bosnia","Herzegovina","Ragusa","Albania","Durazzo"};
   private String[] seanames = {"Gulf of Lions","Ligurian Sea","Tyrrhenian Sea",
                                 "Western Mediterranean","Central Mediterranean",
                                 "Gulf of Naples","Ionian Sea","Upper Adriatic",
                                 "Lower Adriatic"};*/
   public Map()
   {
      tiles = new Tile[75];
      
      //start provinces
      Province Avignon = new Province("Avignon", new City(Avignon), "France");
      Province Swiss = new Province("Swiss", new City(Swiss), "France");
      Province Tyrol = new Province("Tyrol", new City(Tyrol), "Austria");
      Province Austria = new Province("Austria", new City(Austria), "Austria");
      Province Hungary = new Province("Hungary", new City(Hungary), "Austria");
      Province Marseille = new Province("Marseille", new City(Marseille), "France");
      Province Provence = new Province("Provence","France");
      Province Saluzzo = new Province("Saluzzo", new City(Saluzzo));
      Province Turin = new Province("Turin", new City(Turin));
      Province Como = new Province("Como", "Milan");
      Province Milan = new Province("Milan", new City(Milan), "Milan");
      Province Trent = new Province("Trent", new City(Trent));
      Province Carinthia = new Province("Carinthia", new City(Carinthia), "France");
      Province Slavonia = new Province("Slavonia", new City(Slavoinia));
      Province Savoy = new Province("Savoy", new City(Savoy));
      Province Montferrat = new Province("Montferrat", new City(Montferrat));
      Province Pavia = new Province("Pavia", new City(Pavia), "Milan");
      Province Parma = new Province("Parma", "Milan");
      Province Cremona = new Province("Cremona", new City(Cremona), "Milan");
      Province Bergamo = new Province("Bergamo", "Venice");
      Province Verona = new Province("Verona", "Venice");
      Province Friuli = new Province("Friuli", "Venice");
      Province Carnola = new Province("Carnola", new City(Carnola));
      Province Genoa = new Province("Genoa", new City(Genoa));
      Province Fornovo = new Province("Fornovo", "Milan");
      Province Croatia = new Province("Croatia", new City(Croatia));
      Province Istria = new Province("Istria", "Venice");
      Province Dalmatia = new Province("Dalmatia", new City(Dalmatia), "Venice");
      Province Bosnia = new Province("Bosnia", "Turks");
      Province Herzegovina = new Province("Herzegovina", "Turks");
      Province Ragusa = new Province("Ragusa", new City(Ragusa));
      Province Albania = new Province("Albania", new City(Albania), "Turks");
      Province Durazzo = new Province("Durazzo", new City(Durazzo), "Turks");
      Province Tunis = new Province("Tunis", new City(Tunis), "Turks");
      Province Sardinia = new Province("Sardinia", new City(Sardinia));
      Province Corsica = new Province("Corsica", new City(Corsica));
      Province Modena = new Province("Modena", new City(Modena));
      Province Mantua = new Province("Mantua", new City(Mantua));
      Province Ferrara = new Province("Ferrara", new City(Ferrara));
      Province Padua = new Province("Padua", new City(Padua), "Venice");
      Province Lucca = new Province("Lucca", new City(Lucca));
      Province Bologna = new Province("Bologna", new City(Bologna), "Papacy");
      Province Pisa = new Province("Pisa", new City(Pisa), "Florence");
      Province Pistoia = new Province("Pistoia", new City(Pistoia), "Florence");
      Province Florence = new Province("Florence", new City(Florence), "Florence");
      Province Urbino = new Province("Urbino", new City(Urbino), "Papacy");
      Province Piombino = new Province("Piombino", new City(Piombino));
      Province Sienna = new Province("Sienna", new City(Sienna),);
      Province Avignon = new Province("", new City(), "");
      
      
   }
   public void addTile(Tile tile, int k)
   {
      tiles[k] = tile;
   }
}
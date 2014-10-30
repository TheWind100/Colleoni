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
      Province Avignon = new Province("Avignon", "France");
      City avignon = new City(Avignon);
      Avignon.addCity(avignon);
      
      Province Swiss = new Province("Swiss", "France");
      City swiss = new City(Swiss);
      Swiss.addCity(swiss);
      
      Province Tyrol = new Province("Tyrol", "Austria");
      City tyrol = new City(Tyrol);
      Tyrol.addCity(tyrol);
      
      Province Austria = new Province("Austria", "Austria");
      City austria = new City(Austria);
      Austria.addCity(austria);
      
      Province Hungary = new Province("Hungary", "Austria");
      City hungary = new City(Hungary);
      Hungary.addCity(hungary);
      
      Province Marseille = new Province("Marseille", "France");
      City marseille = new City(Marseille);
      Marseille.addCity(marseille);
      
      Province Provence = new Province("Provence","France");
      
      Province Saluzzo = new Province("Saluzzo");
      City saluzzo = new City(Saluzzo);
      Saluzzo.addCity(saluzzo);
      
      Province Turin = new Province("Turin");
      City turin = new City(Turin);
      Turin.addCity(turin);
      
      Province Como = new Province("Como", "Milan");
      
      Province Milan = new Province("Milan", "Milan");
      City milan = new City(Milan);
      Milan.addCity(milan);
      
      Province Trent = new Province("Trent");
      City trent = new City(Trent);
      Trent.addCity(trent);
      
      Province Carinthia = new Province("Carinthia", "France");
      City carinthia = new City(Carinthia);
      Carinthia.addCity(carinthia);
      
      Province Slavonia = new Province("Slavonia");
      City slavonia = new City(Slavonia);
      Slavonia.addCity(slavonia);
      
      Province Savoy = new Province("Savoy");
      City savoy = new City(Savoy);
      Savoy.addCity(savoy);
      
      Province Montferrat = new Province("Montferrat");
      City montferrat = new City(Montferrat);
      Montferrat.addCity(montferrat);
      
      Province Pavia = new Province("Pavia", "Milan");
      City pavia = new City(Pavia);
      Pavia.addCity(pavia);
      
      Province Parma = new Province("Parma", "Milan");
      
      Province Cremona = new Province("Cremona", "Milan");
      City cremona = new City(Cremona);
      Cremona.addCity(cremona);
      
      Province Bergamo = new Province("Bergamo", "Venice");
      
      Province Verona = new Province("Verona", "Venice");
      
      Province Friuli = new Province("Friuli", "Venice");

      Province Carnola = new Province("Carnola");
      City carnola = new City(Carnola);
      Carnola.addCity(carnola);
      
      Province Genoa = new Province("Genoa");
      City genoa = new City(Genoa);
      Genoa.addCity(genoa);
      
      Province Fornovo = new Province("Fornovo", "Milan");
      
      Province Croatia = new Province("Croatia");
      City croatia = new City(Croatia);
      Croatia.addCity(croatia);
      
      Province Istria = new Province("Istria", "Venice");
      
      Province Dalmatia = new Province("Dalmatia", "Venice");
      City dalmatia = new City(Dalmatia);
      Dalmatia.addCity(dalmatia);
      
      Province Bosnia = new Province("Bosnia", "Turks");
      
      Province Herzegovina = new Province("Herzegovina", "Turks");
      
      Province Ragusa = new Province("Ragusa");
      City ragusa = new City(Ragusa);
      Ragusa.addCity(ragusa);
      
      Province Albania = new Province("Albania", "Turks");
      City albania = new City(Albania);
      Albania.addCity(albania);
      
      Province Durazzo = new Province("Durazzo", "Turks");
      City durazzo = new City(Durazzo);
      Durazzo.addCity(durazzo);
      
      Province Tunis = new Province("Tunis", "Turks");
      City tunis = new City(Tunis);
      Tunis.addCity(tunis);
      
      Province Sardinia = new Province("Sardinia");
      City sardinia = new City(Sardinia);
      Sardinia.addCity(sardinia);
      
      Province Corsica = new Province("Corsica");
      City corsica = new City(Corsica);
      Corsica.addCity(corsica);
      
      Province Modena = new Province("Modena");
      City modena = new City(Modena);
      Modena.addCity(modena);
      
      Province Mantua = new Province("Mantua");
      City mantua = new City(Mantua);
      Mantua.addCity(mantua);
      
      Province Ferrara = new Province("Ferrara");
      City ferrara = new City(Ferrara);
      Ferrara.addCity(ferrara);
      
      Province Padua = new Province("Padua", "Venice");
      City padua = new City(Padua);
      Padua.addCity(padua);
      
      Province Lucca = new Province("Lucca");
      City lucca = new City(Lucca);
      Lucca.addCity(lucca);
      
      Province Bologna = new Province("Bologna", "Papacy");
      City bologna = new City(Bologna);
      Bologna.addCity(bologna);
      
      Province Pisa = new Province("Pisa", "Florence");
      City pisa = new City(Pisa);
      Pisa.addCity(pisa);
      
      Province Pistoia = new Province("Pistoia", "Florence");
      City pistoia = new City(Pistoia);
      Pistoia.addCity(pistoia);
      
      Province Florence = new Province("Florence", "Florence");
      City florence = new City(Florence);
      Florence.addCity(florence);
      
      Province Urbino = new Province("Urbino", "Papacy");
      City urbino = new City(Urbino);
      Urbino.addCity(urbino);
      
      Province Piombino = new Province("Piombino");
      City piombino = new City(Piombino);
      Piombino.addCity(piombino);
      
      Province Sienna = new Province("Sienna");
      City sienna = new City(Sienna);
      Sienna.addCity(sienna);
      
      Province Arezzo = new Province("Arezzo");
      City arezzo = new City(Arezzo);
      Arezzo.addCity(arezzo);
      
      Province Patrimony = new Province("Patrimony");
      
      Province Perugia = new Province("Perugia");
      
      Province Spoleto = new Province("Spoleto");
      
      Province Ancona = new Province("Ancona");
      
      Province Rome = new Province("Rome");
      City rome = new City(Rome);
      Rome.addCity(rome);
      
      Province Capua = new Province("Capua");
      
      Province Aquila = new Province("Aquila");
      
      Province Naples = new Province("Naples");
      City naples = new City(Naples);
      Naples.addCity(naples);
      
      Province Salerno = new Province("Salerno");
      
      Province Bari = new Province("Bari");
      City bari = new City(Bari);
      Bari.addCity(bari);
      
      Province Otranio = new Province("Otranio");
      
      Province Messina = new Province("Messina");
      City messina = new City(Messina);
      Messina.addCity(messina);
      
      Province Palermo = new Province("Palermo");
      City palermo = new City(Palermo);
      Palermo.addCity(palermo);
      //end provinces
      
      //start seas
      Sea Gulf_of_Lions = new Sea("Gulf of Lions");
      Sea Ligurian_Sea = new Sea("Ligurian Sea");
      Sea Tyrrhenian_Sea = new Sea("Tyrrhenian Sea");
      Sea Western_Mediterranean = new Sea("Western Mediterranean");
      Sea Centeral_Mediterranean = new Sea("Central Mediterranean");
      Sea Ionian_Sea = new Sea("Ionian Sea");
      Sea Upper_Adriatic = new Sea("Upper Adriatic");
      Sea Lower_Adriatic = new Sea("Lower Adriatic");
   }
   public void addTile(Tile tile, int k)
   {
      tiles[k] = tile;
   }
}
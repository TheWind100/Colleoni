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
      tiles = new Tile[70];
      
      
      //start provinces
      tiles[0] = new Province("Avignon", "France");
      City avignon = new City(tiles[0]);
      tiles[0].addCity(avignon);
      
      tiles[1] = new Province("Swiss", "France");
      City swiss = new City(tiles[1]);
      tiles[1].addCity(swiss);
      
      tiles[2] = new Province("Tyrol", "Austria");
      City tyrol = new City(tiles[2]);
      tiles[2].addCity(tyrol);
      
      tiles[3] = new Province("Austria", "Austria");
      City austria = new City(tiles[3]);
      tiles[3].addCity(austria);
      
      tiles[4] = new Province("Hungary", "Austria");
      City hungary = new City(tiles[4]);
      tiles[4].addCity(hungary);
      
      tiles[5] = new Province("Marseille", "France");
      City marseille = new City(tiles[5]);
      tiles[5].addCity(marseille);
      
      tiles[6] = new Province("Provence","France");
      
      tiles[7] = new Province("Saluzzo");
      City saluzzo = new City(tiles[7]);
      tiles[7].addCity(saluzzo);
      
      tiles[8] = new Province("Turin");
      City turin = new City(tiles[8]);
      tiles[8].addCity(turin);
      
      tiles[9] = new Province("Como", "Milan");
      
      tiles[10] = new Province("Milan", "Milan");
      City milan = new City(tiles[10]);
      tiles[10].addCity(milan);
      
      tiles[11] = new Province("Trent");
      City trent = new City(tiles[11]);
      tiles[11].addCity(trent);
      
      tiles[12] = new Province("Carinthia", "France");
      City carinthia = new City(tiles[12]);
      tiles[12].addCity(carinthia);
      
      tiles[13] = new Province("Slavonia");
      City slavonia = new City(tiles[13]);
      tiles[13].addCity(slavonia);
      
      tiles[14] = new Province("Savoy");
      City savoy = new City(tiles[14]);
      tiles[14].addCity(savoy);
      
      tiles[15] = new Province("Montferrat");
      City montferrat = new City(tiles[15]);
      tiles[15].addCity(montferrat);
      
      tiles[16] = new Province("Pavia", "Milan");
      City pavia = new City(tiles[16]);
      tiles[16].addCity(pavia);
      
      tiles[17] = new Province("Parma", "Milan");
      
      tiles[18] = new Province("Cremona", "Milan");
      City cremona = new City(tiles[18]);
      tiles[18].addCity(cremona);
      
      tiles[19] = new Province("Bergamo", "Venice");
      
      tiles[20] = new Province("Verona", "Venice");
      
      tiles[21] = new Province("Friuli", "Venice");

      tiles[22] = new Province("Carnola");
      City carnola = new City(tiles[22]);
      tiles[22].addCity(carnola);
      
      tiles[23] = new Province("Genoa");
      City genoa = new City(tiles[23]);
      tiles[23].addCity(genoa);
      
      tiles[24] = new Province("Fornovo", "Milan");
      
      tiles[25] = new Province("Croatia");
      City croatia = new City(tiles[25]);
      tiles[25].addCity(croatia);
      
      tiles[26] = new Province("Istria", "Venice");
      
      tiles[27] = new Province("Dalmatia", "Venice");
      City dalmatia = new City(tiles[27]);
      tiles[27].addCity(dalmatia);
      
      tiles[28] = new Province("Bosnia", "Turks");
      
      tiles[29] = new Province("Herzegovina", "Turks");
      
      tiles[30] = new Province("Ragusa");
      City ragusa = new City(tiles[30]);
      tiles[30].addCity(ragusa);
      
      tiles[31] = new Province("Albania", "Turks");
      City albania = new City(tiles[31]);
      tiles[31].addCity(albania);
      
      tiles[32] = new Province("Durazzo", "Turks");
      City durazzo = new City(tiles[32]);
      tiles[32].addCity(durazzo);
      
      tiles[33] = new Province("Tunis", "Turks");
      City tunis = new City(tiles[33]);
      tiles[33].addCity(tunis);
      
      tiles[34] = new Province("Sardinia");
      City sardinia = new City(tiles[34]);
      tiles[34].addCity(sardinia);
      
      tiles[35] = new Province("Corsica");
      City corsica = new City(tiles[35]);
      tiles[35].addCity(corsica);
      
      tiles[36] = new Province("Modena");
      City modena = new City(tiles[36]);
      tiles[36].addCity(modena);
      
      tiles[37] = new Province("Mantua");
      City mantua = new City(tiles[37]);
      tiles[37].addCity(mantua);
      
      tiles[38] = new Province("Ferrara");
      City ferrara = new City(tiles[38]);
      tiles[38].addCity(ferrara);
      
      tiles[39] = new Province("Padua", "Venice");
      City padua = new City(tiles[39]);
      tiles[39].addCity(padua);
      
      tiles[40] = new Province("Lucca");
      City lucca = new City(tiles[40]);
      tiles[40].addCity(lucca);
      
      tiles[41] = new Province("Bologna", "Papacy");
      City bologna = new City(tiles[41]);
      tiles[41].addCity(bologna);
      
      tiles[42] = new Province("Pisa", "Florence");
      City pisa = new City(tiles[42]);
      tiles[42].addCity(pisa);
      
      tiles[43] = new Province("Pistoia", "Florence");
      City pistoia = new City(tiles[43]);
      tiles[43].addCity(pistoia);
      
      tiles[44] = new Province("Florence", "Florence");
      City florence = new City(tiles[44]);
      tiles[44].addCity(florence);
      
      tiles[45] = new Province("Urbino", "Papacy");
      City urbino = new City(tiles[45]);
      tiles[45].addCity(urbino);
      
      tiles[46] = new Province("Piombino");
      City piombino = new City(tiles[46]);
      tiles[46].addCity(piombino);
      
      tiles[47] = new Province("Sienna");
      City sienna = new City(tiles[47]);
      tiles[47].addCity(sienna);
      
      tiles[48] = new Province("Arezzo");
      City arezzo = new City(tiles[48]);
      tiles[48].addCity(arezzo);
      
      tiles[47] = new Province("Patrimony");
      
      tiles[50] = new Province("Perugia");
      
      tiles[51] = new Province("Spoleto");
      
      tiles[52] = new Province("Ancona");
      
      tiles[53] = new Province("Rome");
      City rome = new City(tiles[53]);
      tiles[53].addCity(rome);
      
      tiles[54] = new Province("Capua");
      
      tiles[55] = new Province("Aquila");
      
      tiles[56] = new Province("Naples");
      City naples = new City(tiles[56]);
      tiles[56].addCity(naples);
      
      tiles[57] = new Province("Salerno");
      
      tiles[58] = new Province("Bari");
      City bari = new City(tiles[58]);
      tiles[58].addCity(bari);
      
      tiles[59] = new Province("Otranio");
      
      tiles[60] = new Province("Messina");
      City messina = new City(tiles[60]);
      tiles[60].addCity(messina);
      
      tiles[61] = new Province("Palermo");
      City palermo = new City(tiles[61]);
      tiles[61].addCity(palermo);
      //end provinces
      
      //¡¡¡Alter fleet movement with regards to Venice!!!
      
      tiles[70] = new Sea("Venice");
      City venice = new City(tiles[70]);
      tiles[70].addCity(venice);
            
      //start seas
      tiles[62] = new Sea("Gulf of Lions");
      tiles[63] = new Sea("Ligurian Sea");
      tiles[64] = new Sea("Tyrrhenian Sea");
      tiles[65] = new Sea("Western Mediterranean");
      tiles[66] = new Sea("Central Mediterranean");
      tiles[67] = new Sea("Ionian Sea");
      tiles[68] = new Sea("Upper Adriatic");
      tiles[69] = new Sea("Lower Adriatic");
      //end seas
      
   }
   public void addTile(Tile tile, int k)
   {
      tiles[k] = tile;
   }
}
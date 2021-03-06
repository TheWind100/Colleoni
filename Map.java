public class Map
{
   private Tile[] tiles;
   public Map()
   {
      tiles = new Tile[73];
      
      
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
      
      tiles[12] = new Province("Carinthia", "Austria");
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
      
      tiles[49] = new Province("Patrimony");
      
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
      
      tiles[71] = new Province("Treviso", "Venice");
      City treviso = new City(tiles[71]);
      tiles[71].addCity(treviso);
      //end provinces
      
      //start Venice
      tiles[70] = new Sea("Venice");
      City venice = new City(tiles[70]);
      tiles[70].addCity(venice);
      //end Venice
            
      //start seas
      tiles[62] = new Sea("Gulf of Lions");
      tiles[63] = new Sea("Ligurian Sea");
      tiles[64] = new Sea("Tyrrhenian Sea");
      tiles[65] = new Sea("Western Mediterranean");
      tiles[66] = new Sea("Central Mediterranean");
      tiles[67] = new Sea("Ionian Sea");
      tiles[68] = new Sea("Upper Adriatic");
      tiles[69] = new Sea("Lower Adriatic");
      tiles[72] = new Sea("Gulf of Naples");
      //end seas
      
      //start borders
      
      //tiles[].addBorder(tiles[]);
      
      tiles[0].addBorder(tiles[1]);
      tiles[0].addBorder(tiles[8]);
      tiles[0].addBorder(tiles[6]);
      tiles[0].addBorder(tiles[5]);
      
      tiles[1].addBorder(tiles[0]);
      tiles[1].addBorder(tiles[2]);
      tiles[1].addBorder(tiles[8]);
      
      tiles[2].addBorder(tiles[1]);
      tiles[2].addBorder(tiles[8]);
      tiles[2].addBorder(tiles[9]);
      tiles[2].addBorder(tiles[10]);
      tiles[2].addBorder(tiles[12]);
      tiles[2].addBorder(tiles[3]);
      
      tiles[3].addBorder(tiles[2]);
      tiles[3].addBorder(tiles[12]);
      tiles[3].addBorder(tiles[13]);
      tiles[3].addBorder(tiles[4]);
      
      tiles[4].addBorder(tiles[3]);
      tiles[4].addBorder(tiles[13]);
      
      tiles[5].addBorder(tiles[0]);
      tiles[5].addBorder(tiles[6]);
      tiles[5].addBorder(tiles[62]);
      
      tiles[6].addBorder(tiles[0]);
      tiles[6].addBorder(tiles[5]);
      tiles[6].addBorder(tiles[8]);
      tiles[6].addBorder(tiles[7]);
      tiles[6].addBorder(tiles[14]);
      tiles[6].addBorder(tiles[62]);
      tiles[6].addBorder(tiles[63]);
      
      tiles[7].addBorder(tiles[6]);
      tiles[7].addBorder(tiles[14]);
      tiles[7].addBorder(tiles[8]);
      
      tiles[8].addBorder(tiles[0]);
      tiles[8].addBorder(tiles[1]);
      tiles[8].addBorder(tiles[2]);
      tiles[8].addBorder(tiles[9]);
      tiles[8].addBorder(tiles[16]);
      tiles[8].addBorder(tiles[15]);
      tiles[8].addBorder(tiles[14]);
      tiles[8].addBorder(tiles[7]);
      tiles[8].addBorder(tiles[6]);
      
      tiles[9].addBorder(tiles[8]);
      tiles[9].addBorder(tiles[16]);
      tiles[9].addBorder(tiles[10]);
      tiles[9].addBorder(tiles[2]);
      
      tiles[10].addBorder(tiles[9]);
      tiles[10].addBorder(tiles[16]);
      tiles[10].addBorder(tiles[17]);
      tiles[10].addBorder(tiles[18]);
      tiles[10].addBorder(tiles[19]);
      tiles[10].addBorder(tiles[11]);
      tiles[10].addBorder(tiles[12]);
      tiles[10].addBorder(tiles[2]);
      
      tiles[11].addBorder(tiles[10]);
      tiles[11].addBorder(tiles[19]);
      tiles[11].addBorder(tiles[20]);
      tiles[11].addBorder(tiles[12]);
      
      tiles[12].addBorder(tiles[11]);
      tiles[12].addBorder(tiles[20]);
      tiles[12].addBorder(tiles[21]);
      tiles[12].addBorder(tiles[22]);
      tiles[12].addBorder(tiles[13]);
      tiles[12].addBorder(tiles[3]);
      tiles[12].addBorder(tiles[2]);
      tiles[12].addBorder(tiles[10]);
      
      tiles[13].addBorder(tiles[4]);
      tiles[13].addBorder(tiles[3]);
      tiles[13].addBorder(tiles[12]);
      tiles[13].addBorder(tiles[22]);
      tiles[13].addBorder(tiles[25]);
      
      tiles[14].addBorder(tiles[6]);
      tiles[14].addBorder(tiles[7]);
      tiles[14].addBorder(tiles[8]);
      tiles[14].addBorder(tiles[15]);
      tiles[14].addBorder(tiles[23]);
      tiles[14].addBorder(tiles[63]);
      
      tiles[15].addBorder(tiles[14]);
      tiles[15].addBorder(tiles[8]);
      tiles[15].addBorder(tiles[17]);
      tiles[15].addBorder(tiles[24]);
      tiles[15].addBorder(tiles[23]);
      
      tiles[16].addBorder(tiles[8]);
      tiles[16].addBorder(tiles[15]);
      tiles[16].addBorder(tiles[24]);
      tiles[16].addBorder(tiles[17]);
      tiles[16].addBorder(tiles[10]);
      tiles[16].addBorder(tiles[9]);
      
      tiles[17].addBorder(tiles[16]);
      tiles[17].addBorder(tiles[24]);
      tiles[17].addBorder(tiles[36]);
      tiles[17].addBorder(tiles[37]);
      tiles[17].addBorder(tiles[18]);
      tiles[17].addBorder(tiles[10]);
      
      tiles[18].addBorder(tiles[10]);
      tiles[18].addBorder(tiles[17]);
      tiles[18].addBorder(tiles[37]);
      tiles[18].addBorder(tiles[19]);
      
      tiles[19].addBorder(tiles[10]);
      tiles[19].addBorder(tiles[18]);
      tiles[19].addBorder(tiles[37]);
      tiles[19].addBorder(tiles[20]);
      tiles[19].addBorder(tiles[11]);
      
      tiles[20].addBorder(tiles[11]);
      tiles[20].addBorder(tiles[19]);
      tiles[20].addBorder(tiles[37]);
      tiles[20].addBorder(tiles[38]);
      tiles[20].addBorder(tiles[39]);
      tiles[20].addBorder(tiles[71]);
      tiles[20].addBorder(tiles[21]);
      tiles[20].addBorder(tiles[12]);
      
      tiles[21].addBorder(tiles[20]);
      tiles[21].addBorder(tiles[71]);
      tiles[21].addBorder(tiles[12]);
      tiles[21].addBorder(tiles[22]);
      tiles[21].addBorder(tiles[70]);
      tiles[21].addBorder(tiles[68]);
      
      tiles[22].addBorder(tiles[12]);
      tiles[22].addBorder(tiles[13]);
      tiles[22].addBorder(tiles[25]);
      tiles[22].addBorder(tiles[26]);
      tiles[22].addBorder(tiles[21]);
      tiles[22].addBorder(tiles[68]);
      
      tiles[23].addBorder(tiles[14]);
      tiles[23].addBorder(tiles[15]);
      tiles[23].addBorder(tiles[24]);
      tiles[23].addBorder(tiles[36]);
      tiles[23].addBorder(tiles[63]);
      
      tiles[24].addBorder(tiles[23]);
      tiles[24].addBorder(tiles[15]);
      tiles[24].addBorder(tiles[16]);
      tiles[24].addBorder(tiles[17]);
      tiles[24].addBorder(tiles[36]);
      
      tiles[25].addBorder(tiles[22]);
      tiles[25].addBorder(tiles[13]);
      tiles[25].addBorder(tiles[26]);
      tiles[25].addBorder(tiles[27]);
      tiles[25].addBorder(tiles[28]);
      tiles[25].addBorder(tiles[68]);
      
      tiles[26].addBorder(tiles[25]);
      tiles[26].addBorder(tiles[22]);
      tiles[26].addBorder(tiles[68]);
      
      tiles[27].addBorder(tiles[25]);
      tiles[27].addBorder(tiles[28]);
      tiles[27].addBorder(tiles[29]);
      tiles[27].addBorder(tiles[68]);
      tiles[27].addBorder(tiles[69]);
      
      tiles[28].addBorder(tiles[25]);
      tiles[28].addBorder(tiles[27]);
      tiles[28].addBorder(tiles[29]);
      
      tiles[29].addBorder(tiles[27]);
      tiles[29].addBorder(tiles[28]);
      tiles[29].addBorder(tiles[30]);
      tiles[29].addBorder(tiles[31]);
      tiles[29].addBorder(tiles[69]);
      
      tiles[30].addBorder(tiles[29]);
      tiles[30].addBorder(tiles[31]);
      tiles[30].addBorder(tiles[69]);
      
      tiles[31].addBorder(tiles[30]);
      tiles[31].addBorder(tiles[29]);
      tiles[31].addBorder(tiles[32]);
      tiles[31].addBorder(tiles[69]);
      
      tiles[32].addBorder(tiles[31]);
      tiles[32].addBorder(tiles[69]);
      tiles[32].addBorder(tiles[67]);
      
      tiles[33].addBorder(tiles[65]);
      tiles[33].addBorder(tiles[66]);
      
      tiles[34].addBorder(tiles[62]);
      tiles[34].addBorder(tiles[65]);
      tiles[34].addBorder(tiles[64]);
      tiles[34].addBorder(tiles[35]);
      
      tiles[35].addBorder(tiles[34]);
      tiles[35].addBorder(tiles[62]);
      tiles[35].addBorder(tiles[64]);
      tiles[35].addBorder(tiles[63]);
      
      tiles[36].addBorder(tiles[23]);
      tiles[36].addBorder(tiles[24]);
      tiles[36].addBorder(tiles[17]);
      tiles[36].addBorder(tiles[37]);
      tiles[36].addBorder(tiles[41]);
      tiles[36].addBorder(tiles[40]);
      tiles[36].addBorder(tiles[63]);
      
      tiles[37].addBorder(tiles[36]);
      tiles[37].addBorder(tiles[17]);
      tiles[37].addBorder(tiles[18]);
      tiles[37].addBorder(tiles[19]);
      tiles[37].addBorder(tiles[20]);
      tiles[37].addBorder(tiles[38]);
      tiles[37].addBorder(tiles[41]);
      
      tiles[38].addBorder(tiles[41]);
      tiles[38].addBorder(tiles[37]);
      tiles[38].addBorder(tiles[20]);
      tiles[38].addBorder(tiles[39]);
      tiles[38].addBorder(tiles[68]);
      
      tiles[39].addBorder(tiles[38]);
      tiles[39].addBorder(tiles[20]);
      tiles[39].addBorder(tiles[71]);
      tiles[39].addBorder(tiles[70]);
      tiles[39].addBorder(tiles[68]);
      
      tiles[40].addBorder(tiles[63]);
      tiles[40].addBorder(tiles[36]);
      tiles[40].addBorder(tiles[41]);
      tiles[40].addBorder(tiles[42]);
      tiles[40].addBorder(tiles[43]);
      
      tiles[41].addBorder(tiles[40]);
      tiles[41].addBorder(tiles[36]);
      tiles[41].addBorder(tiles[37]);
      tiles[41].addBorder(tiles[38]);
      tiles[41].addBorder(tiles[68]);
      tiles[41].addBorder(tiles[45]);
      tiles[41].addBorder(tiles[44]);
      tiles[41].addBorder(tiles[43]);
      
      tiles[42].addBorder(tiles[40]);
      tiles[42].addBorder(tiles[43]);
      tiles[42].addBorder(tiles[44]);
      tiles[42].addBorder(tiles[47]);
      tiles[42].addBorder(tiles[46]);
      tiles[42].addBorder(tiles[63]);
      
      tiles[43].addBorder(tiles[40]);
      tiles[43].addBorder(tiles[41]);
      tiles[43].addBorder(tiles[44]);
      tiles[43].addBorder(tiles[42]);
      
      tiles[44].addBorder(tiles[43]);
      tiles[44].addBorder(tiles[41]);
      tiles[44].addBorder(tiles[45]);
      tiles[44].addBorder(tiles[48]);
      tiles[44].addBorder(tiles[47]);
      tiles[44].addBorder(tiles[42]);
      
      tiles[45].addBorder(tiles[41]);
      tiles[45].addBorder(tiles[44]);
      tiles[45].addBorder(tiles[48]);
      tiles[45].addBorder(tiles[50]);
      tiles[45].addBorder(tiles[51]);
      tiles[45].addBorder(tiles[52]);
      tiles[45].addBorder(tiles[68]);
      
      tiles[46].addBorder(tiles[42]);
      tiles[46].addBorder(tiles[47]);
      tiles[46].addBorder(tiles[63]);
      tiles[46].addBorder(tiles[64]);
      
      tiles[47].addBorder(tiles[43]);
      tiles[47].addBorder(tiles[42]);
      tiles[47].addBorder(tiles[44]);
      tiles[47].addBorder(tiles[48]);
      tiles[47].addBorder(tiles[50]);
      tiles[47].addBorder(tiles[49]);
      tiles[47].addBorder(tiles[64]);
      
      tiles[48].addBorder(tiles[44]);
      tiles[48].addBorder(tiles[45]);
      tiles[48].addBorder(tiles[47]);
      tiles[48].addBorder(tiles[50]);
      
      tiles[49].addBorder(tiles[47]);
      tiles[49].addBorder(tiles[50]);
      tiles[49].addBorder(tiles[53]);
      tiles[49].addBorder(tiles[64]);
      
      tiles[50].addBorder(tiles[47]);
      tiles[50].addBorder(tiles[48]);
      tiles[50].addBorder(tiles[45]);
      tiles[50].addBorder(tiles[49]);
      tiles[50].addBorder(tiles[53]);
      tiles[50].addBorder(tiles[51]);
      
      tiles[51].addBorder(tiles[50]);
      tiles[51].addBorder(tiles[45]);
      tiles[51].addBorder(tiles[52]);
      tiles[51].addBorder(tiles[55]);
      tiles[51].addBorder(tiles[54]);
      tiles[51].addBorder(tiles[53]);
      
      tiles[52].addBorder(tiles[45]);
      tiles[52].addBorder(tiles[51]);
      tiles[52].addBorder(tiles[55]);
      tiles[52].addBorder(tiles[68]);
      tiles[52].addBorder(tiles[69]);
      
      tiles[53].addBorder(tiles[49]);
      tiles[53].addBorder(tiles[50]);
      tiles[53].addBorder(tiles[51]);
      tiles[53].addBorder(tiles[54]);
      tiles[53].addBorder(tiles[53]);
      
      tiles[54].addBorder(tiles[53]);
      tiles[54].addBorder(tiles[55]);
      tiles[54].addBorder(tiles[51]);
      tiles[54].addBorder(tiles[56]);
      tiles[54].addBorder(tiles[64]);
      
      tiles[55].addBorder(tiles[52]);
      tiles[55].addBorder(tiles[51]);
      tiles[55].addBorder(tiles[54]);
      tiles[55].addBorder(tiles[56]);
      tiles[55].addBorder(tiles[57]);
      tiles[55].addBorder(tiles[58]);
      tiles[55].addBorder(tiles[68]);
      
      tiles[56].addBorder(tiles[54]);
      tiles[56].addBorder(tiles[55]);
      tiles[56].addBorder(tiles[57]);
      tiles[56].addBorder(tiles[72]);
      tiles[56].addBorder(tiles[64]);
      
      tiles[57].addBorder(tiles[56]);
      tiles[57].addBorder(tiles[55]);
      tiles[57].addBorder(tiles[58]);
      tiles[57].addBorder(tiles[59]);
      tiles[57].addBorder(tiles[72]);
      
      tiles[58].addBorder(tiles[55]);
      tiles[58].addBorder(tiles[57]);
      tiles[58].addBorder(tiles[59]);
      tiles[58].addBorder(tiles[69]);
      
      tiles[59].addBorder(tiles[57]);
      tiles[59].addBorder(tiles[58]);
      tiles[59].addBorder(tiles[69]);
      tiles[59].addBorder(tiles[67]);
      tiles[59].addBorder(tiles[72]);
      tiles[59].addBorder(tiles[60]);
      
      tiles[60].addBorder(tiles[59]);
      tiles[60].addBorder(tiles[72]);
      tiles[60].addBorder(tiles[67]);
      tiles[60].addBorder(tiles[61]);
      
      tiles[61].addBorder(tiles[60]);
      tiles[61].addBorder(tiles[66]);
      tiles[61].addBorder(tiles[64]);
      tiles[61].addBorder(tiles[72]);
      
      //seas
      
      tiles[62].addBorder(tiles[0]);
      tiles[62].addBorder(tiles[5]);
      tiles[62].addBorder(tiles[6]);
      tiles[62].addBorder(tiles[63]);
      tiles[62].addBorder(tiles[64]);
      tiles[62].addBorder(tiles[65]);
      tiles[62].addBorder(tiles[34]);
      tiles[62].addBorder(tiles[35]);
      
      tiles[63].addBorder(tiles[6]);
      tiles[63].addBorder(tiles[14]);
      tiles[63].addBorder(tiles[23]);
      tiles[63].addBorder(tiles[36]);
      tiles[63].addBorder(tiles[40]);
      tiles[63].addBorder(tiles[42]);
      tiles[63].addBorder(tiles[46]);
      tiles[63].addBorder(tiles[64]);
      tiles[63].addBorder(tiles[35]);
      tiles[63].addBorder(tiles[62]);
      
      tiles[64].addBorder(tiles[72]);
      tiles[64].addBorder(tiles[66]);
      tiles[64].addBorder(tiles[65]);
      tiles[64].addBorder(tiles[62]);
      tiles[64].addBorder(tiles[63]);
      tiles[64].addBorder(tiles[61]);
      tiles[64].addBorder(tiles[34]);
      tiles[64].addBorder(tiles[35]);
      tiles[64].addBorder(tiles[46]);
      tiles[64].addBorder(tiles[47]);
      tiles[64].addBorder(tiles[49]);
      tiles[64].addBorder(tiles[53]);
      tiles[64].addBorder(tiles[54]);
      tiles[64].addBorder(tiles[56]);
      
      tiles[65].addBorder(tiles[34]);
      tiles[65].addBorder(tiles[33]);
      tiles[65].addBorder(tiles[66]);
      tiles[65].addBorder(tiles[64]);
      tiles[65].addBorder(tiles[62]);
      
      tiles[66].addBorder(tiles[64]);
      tiles[66].addBorder(tiles[65]);
      tiles[66].addBorder(tiles[67]);
      tiles[66].addBorder(tiles[33]);
      tiles[66].addBorder(tiles[61]);
      
      tiles[67].addBorder(tiles[59]);
      tiles[67].addBorder(tiles[60]);
      tiles[67].addBorder(tiles[61]);
      tiles[67].addBorder(tiles[32]);
      tiles[67].addBorder(tiles[66]);
      tiles[67].addBorder(tiles[72]);
      tiles[67].addBorder(tiles[69]);
      
      tiles[68].addBorder(tiles[70]);
      tiles[68].addBorder(tiles[69]);
      tiles[68].addBorder(tiles[52]);
      tiles[68].addBorder(tiles[45]);
      tiles[68].addBorder(tiles[41]);
      tiles[68].addBorder(tiles[38]);
      tiles[68].addBorder(tiles[39]);
      tiles[68].addBorder(tiles[71]);
      tiles[68].addBorder(tiles[21]);
      tiles[68].addBorder(tiles[22]);
      tiles[68].addBorder(tiles[25]);
      tiles[68].addBorder(tiles[26]);
      tiles[68].addBorder(tiles[27]);
      
      tiles[69].addBorder(tiles[68]);
      tiles[69].addBorder(tiles[67]);
      tiles[69].addBorder(tiles[52]);
      tiles[69].addBorder(tiles[55]);
      tiles[69].addBorder(tiles[58]);
      tiles[69].addBorder(tiles[59]);
      tiles[69].addBorder(tiles[32]);
      tiles[69].addBorder(tiles[31]);
      tiles[69].addBorder(tiles[30]);
      tiles[69].addBorder(tiles[29]);
      tiles[69].addBorder(tiles[27]);
      
      //start venice
      tiles[70].addBorder(tiles[39]);
      tiles[70].addBorder(tiles[71]);
      tiles[70].addBorder(tiles[21]);
      tiles[70].addBorder(tiles[68]);
      //end venice
      
      tiles[71].addBorder(tiles[20]);
      tiles[71].addBorder(tiles[39]);
      tiles[71].addBorder(tiles[21]);
      tiles[71].addBorder(tiles[70]);
      
      tiles[72].addBorder(tiles[64]);
      tiles[72].addBorder(tiles[67]);
      tiles[72].addBorder(tiles[56]);
      tiles[72].addBorder(tiles[57]);
      tiles[72].addBorder(tiles[59]);
      tiles[72].addBorder(tiles[60]);
      tiles[72].addBorder(tiles[61]);
      
      //end borders
   }
   
}
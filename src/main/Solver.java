package main;

import grafic.Frame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michal
 */
public class Solver {

    

    public Solver() {

    }
/*
    public void Working(List<Pravidlo> vsetkyPravidla) {
        List<String> vypisaneSpravy = new ArrayList<>();
        do {
            List<String[]> aplikovatelneAKCIE = new ArrayList<>();

            /* ziskanie a a najdenie aplikovatelnych instancii
             *
             *//*
            for (Pravidlo prav : vsetkyPravidla) {
                List<String[]> naviazania = new ArrayList<>();
                searching(prav.Nazov, prav.Podmienka, prav.Akcia, naviazania);
            }
           // filtrovaneINSTANCIEpravidiel = new ArrayList<>();

            //filtrovanie aplikovatelnych instancii
            for (String[] instancia : aplikovatelneAKCIE) {
                List<String> filterPravidiel = new ArrayList<>();
                for (String s : instancia) {
                    String prikaz = s.substring(0, s.indexOf(" "));
                    String tempFakt = s.substring(s.indexOf(" ") + 1, s.length());
                    //prikaz ak ma nieco pridavat
                    if (prikaz.equals("pridaj")) {
                        //ak sa v pamati este nenachadza podobny prikaz
                        if (Pamat.contains(tempFakt) == false) {
                            String filterFakt = prikaz + " " + tempFakt;
                            //pridanie do zoznamu filtrovanych pravidiel
                            filterPravidiel.add(filterFakt);
                        }
                    } else if (prikaz.equals("vymaz")) {
                        if (Pamat.contains(tempFakt) == true) {
                            String filterFakt = prikaz + " " + tempFakt;
                            //pridanie do zoznamu filtrovanych pravidiel
                            filterPravidiel.add(filterFakt);
                        }

                    } else {
                        //bude vypisovat spravu
                        if (vypisaneSpravy.contains(tempFakt) == false) {
                            String filterFakt = prikaz + " " + tempFakt;
                            filterPravidiel.add(filterFakt);
                        }
                    }
                } // koniec for cyklus pre instanciu
                
                if (filterPravidiel.isEmpty() == false) {
                    filtrovaneINSTANCIEpravidiel.add(filterPravidiel);
                }
            //samotne vykonavanie
            //vypise zatial na pracovnu plochu
            System.out.println("Aplikovatelne instancie: ");
            for (String [] instancie : aplikovatelneAkcie) {
                for (String tmp: instancia) {
                    System.out.println(tmp + " ");
                }
                System.out.println("");
            }
            //uz filtrovane spravy
            System.out.println("Filtrovane instancie: " );
            
            StringBuilder bb = new StringBuilder();
            bb.append("Filtrovane instancie: ");
            for(List<String> inst: filtrovaneINSTANCIEpravidiel) {
                for(String tmp: inst) {
                    bb.append(tmp).append(", ");
                    System.out.println(tmp  + " ");
                }
                bb.append("\n");
                System.out.println(""); 
            }
            
            
            
                
            } // koniec cyklu pre vsetky aplikovatelne akcie

        } while (filtrovaneINSTANCIEpravidiel.size() > 0);

        
        
    } // koniec tried WORKING
*/
    
    
    //prehladavanie 
    public void searching(String meno, List<String> podmienka, List<String> akcia, List<String[]> naviazania) {

    }

}

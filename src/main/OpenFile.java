package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michal
 */
public class OpenFile {

    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch", "null", "CallToPrintStackTrace"})
    public static ArrayList<Pravidlo> openPravidla() {

        ArrayList<Pravidlo> vsetkyPravidla = new ArrayList<>();
        BufferedReader br1 = null;
        try {
            br1 = new BufferedReader(new InputStreamReader(
                    new FileInputStream("udaje/pravidla.txt")));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            String line;
            try {
                while ((line = br1.readLine()) != null) {

                    Pravidlo p = new Pravidlo();
                    p.Nazov = line.substring(6);

                    line = br1.readLine();
                    String podmienka = line.substring(3);
                    String podmienky[] = podmienka.split(",");

                    p.Podmienka.addAll(Arrays.asList(podmienky));

                    line = br1.readLine();
                    String akcia = line.substring(6);
                    String akcie[] = akcia.split(",");

                    p.Akcia.addAll(Arrays.asList(akcie));

                    vsetkyPravidla.add(p);

                    line = br1.readLine();

                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                br1.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return vsetkyPravidla;
    }

    public static ArrayList openFakty() {
        ArrayList<String> pamat = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("udaje/fakty.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String riadok;
            try {
                while ((riadok = br.readLine()) != null) {
                    pamat.add(riadok);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return pamat;
    }

    public static List<String> PravidlaNaVypis() {
        List<String> cele = new ArrayList<>();
        try {
            File text = new File("udaje/pravidla.txt");
            Scanner sc = new Scanner(text);
            int number = 0;

            while (sc.hasNextLine()) {
                String tmp = sc.nextLine();
                cele.add(tmp);
            }
            return cele;
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        return cele;
    }

}

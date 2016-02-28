package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventar ruksak = new Inventar(); //voláme konstruktorovou funkci, proto to má závorky;
        ruksak.pridej("brnění");
        ruksak.pridej("čepice");
        ruksak.pridej("kalhoty");
        ruksak.pridej("tunika");
                                          //treti hodina
        ruksak.odeber("brnění");
                                            // ruksak.vypiš();  -bylo smazáno






        Scanner nacitej = new Scanner(System.in);
        while (nacitej.hasNextLine()) {
            String akce = nacitej.nextLine();
            if (akce.equals("vypiš")) {
                System.out.println("V ruksaku mám:");
                ruksak.vypiš();
            }
            String[] rozdeleni = akce.split(" ");
            if (rozdeleni[0].equals("seber")){
             ruksak.pridej(rozdeleni[1]);
            }

            if (rozdeleni[0].equals("polož")) {
                ruksak.odeber(rozdeleni[1]);
            }
            if (rozdeleni[0].equals("zabij")) {
                if (ruksak.over(rozdeleni[1])) {

                    ruksak.odeber(rozdeleni[1]);
                    ruksak.pridej("ocas " + rozdeleni[1]);
                }
                else {
                    System.out.println("hele kámo nemáš " + rozdeleni[1]);
                }
            }


        }
    }
}
// DU:  povolit co může dělat a ověřit, že to dělá
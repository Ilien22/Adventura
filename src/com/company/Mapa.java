package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tibor on 14. 2. 2016.
 */
public class Mapa {  //souradnice x,y pole, a kam muzeme jit
    public Pozice aktualniPozice;
    ArrayList povoleneLokace;

    public Mapa() {
        povoleneLokace = new ArrayList();
        povoleneLokace.add(new Pozice(0, 1));
        povoleneLokace.add(new Pozice(1, 0));
        povoleneLokace.add(new Pozice(1, 1));
        povoleneLokace.add(new Pozice(1, 2));
        povoleneLokace.add(new Pozice(2, 1));
        aktualniPozice = new Pozice(1, 1);
    }

    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povoleneLokace.contains(nova);      //contains - metoda, ktera zkonroluje, jestli to na co to volame to obsahuje
        } else if (smer.equals("jih")) {   //pokud by tam bylo všude jen if (ne else if) tak by se else nakonci vztahovalo jen k poslednímu if, ne ke všem
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povoleneLokace.contains(nova);
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povoleneLokace.contains(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povoleneLokace.contains(nova);
        } else {
            return false;
        }
    }

    public Pozice jdi(String smer) {
        if (smer.equals("sever")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return aktualniPozice;
        } else if (smer.equals("jih")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return aktualniPozice;
        } else if (smer.equals("vychod")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return aktualniPozice;
        } else if (smer.equals("zapad")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return aktualniPozice;
        } else
            return aktualniPozice;
    }


}

//  public void vypsat (){
//      for (Object Pozice:povoleneLokace) { //hranatý závork umožní přidat kus kódu pro každou věc
//          System.out.println(Pozice);
//      }


// DU napsat aby se šlo pohybovat na sever, či někam

package com.company;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class Akce { // každá akce nějekej příkaz a ... - konstruktor pro dva parametry + pole parametru
    public Akce(String prikaz, int pocetParametru) { //konstruktor; int=Integer
        this.prikaz = prikaz;                           // this - ukazatel na konkrétní metodu
        this.pocetParametru = pocetParametru;
    }

    public String prikaz;
    public int pocetParametru;

    public boolean rozumimPrikazu(String[] parametry) {     //chceme zjistit počet slov a jestli to první známe
        if (parametry[0].equals(prikaz)) {
            if (parametry.length == pocetParametru + 1) {      // == znamená porovnej
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;           // return vrátí to za tím
        }     // Testování - Junit testování
    }

}

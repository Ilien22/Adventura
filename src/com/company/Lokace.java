package com.company;

import com.company.akce.Akce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class Lokace { //důležitý kam můžeme jít a co tam můžeme provádět
    //seskupení sekcí, co můžeme na nějakým místě dělat

    private List predmety;
    public List povoleneAkce;

    public Lokace (List akce) { //List - definuje listy, seznamy (ArrayList je podmnožina List)
        this (akce,new ArrayList<>());    //voláme (this.povoleneAkce = akce;) z hruhýho konstruktoru;
    }
    public Lokace (List akce, List predmety){
        this.povoleneAkce = akce;
        this.predmety = predmety;
    }

    public boolean jdeProvest (String akce) { //přepsáno Akce na String
        return povoleneAkce.contains(akce);
    }
    public boolean muzuVzit (String predmet){
        return predmety.contains(predmet);
    }
    public void odeberPredmet (String predmet) {
        predmety.remove(predmet);
    }
}



// konstruktor se jmenuje stejne jako třída
            // interface (např.List) - nemůžou obsahovat proměnný, ale jen signatury metod. Používá implements (místo dědičnosti) - rozdíl je, že jedna třída může implementovat více interfaců
// Struktura třídy - nejdřív promenné,pak konstruktory a pak metody










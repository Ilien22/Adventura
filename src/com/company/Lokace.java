package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class Lokace { //důležitý kam můžeme jít a co tam můžeme provádět
    //seskupení sekcí, co můžeme na nějakým místě dělat
    public List povoleneAkce;

    public Lokace (List akce) { //List - definuje listy, seznamy (ArrayList je podmnožina List)
        this.povoleneAkce = akce;
    }
    public boolean jdeProvest (List akce) {
        return povoleneAkce.contains(akce);
    }





            // interface (např.List) - nemůžou obsahovat proměnný, ale jen signatury metod. Používá implements (místo dědičnosti) - rozdíl je, že jedna třída může implementovat více interfaců









}

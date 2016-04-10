package com.company.akce;

import com.company.*;

/**
 * Created by Tibor on 10. 4. 2016.
 */
public class Utok extends Akce {
    Mapa mapa;
    Hrdina hrdina;
    Boj boj;
    Lokace lokace;

    public Utok (Mapa mapa, Hrdina hrdina){
        super("utok", 0);   //přijímá dva parametry, to druhý je počet slov (takže psát jen útok, ne útok na goblina
        this.hrdina = hrdina;   //tohle je pokud potřebuju něco ukládat
        this.mapa = mapa;
        this.boj = new Boj();
    }
    public void proved(String[] parametry){
        Lokace aktualniLokace = mapa.aktualniLokace();
        Bytost bytost = aktualniLokace.getBytost();
        boj.kolo(hrdina, bytost, lokace, mapa);
    }
}

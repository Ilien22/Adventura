package com.company;

import java.util.ArrayList;

/**
 * Created by Tibor on 14. 2. 2016.
 */
public class Mapa {  //souradnice x,y pole, a kam muzeme jit
    public Pozice aktualniPozice;
    ArrayList povoleneLokace;
    public Mapa (){
        povoleneLokace = new ArrayList();
        povoleneLokace.add(new Pozice(0,1));
        povoleneLokace.add(new Pozice(1,0));
        povoleneLokace.add(new Pozice(1,1));
        povoleneLokace.add(new Pozice(1,2));
        povoleneLokace.add(new Pozice(2,1));
        aktualniPozice = new Pozice(1,1);
    }




}
// DU napsat aby se šlo pohybovat na sever, či někam
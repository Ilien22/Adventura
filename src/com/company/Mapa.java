package com.company;

import com.company.akce.Jdi;
import com.company.akce.Zvedni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tibor on 14. 2. 2016.
 */
public class Mapa {  //souradnice x,y pole, a kam muzeme jit
    public Pozice aktualniPozice;

    Map<Pozice, Lokace> povoleneLokace; //ArrayList přpsán na mapu; přidáno <> abysme tam mohli definovat klíč a hodnotu (proto aby jsme nemuseli přtypovávat vracení na aktualniLokace


    public Mapa(Inventar inventar) {
        Jdi prikazJdi = new Jdi(this);
        Zvedni prikazZvedni = new Zvedni(this,inventar);

        ArrayList jdi = new ArrayList<>();
        jdi.add(prikazJdi.getPrikaz());

        ArrayList jdiZvedni = new ArrayList();
        jdiZvedni.add(prikazJdi.getPrikaz());
        jdiZvedni.add(prikazZvedni.getPrikaz());
        ArrayList predmety = new ArrayList();  //provizorně
        predmety.add("veverka") ;
        predmety.add("klacek");
        predmety.add("trpaslik");

        povoleneLokace = new HashMap();
        povoleneLokace.put(new Pozice(0, 1), new Lokace(jdi));   //přepsáno add na put, protože Map neumí add
        povoleneLokace.put(new Pozice(1, 0), new Lokace(jdi));
        povoleneLokace.put(new Pozice(1, 1), new Lokace(jdiZvedni, predmety));
        povoleneLokace.put(new Pozice(1, 2), new Lokace(jdi));
        povoleneLokace.put(new Pozice(2, 1), new Lokace(jdi));
        aktualniPozice = new Pozice(1, 1);
    }
    public Lokace aktualniLokace () {
        return povoleneLokace.get(aktualniPozice); //z povolenejch lokací dostáváme hodnotu ke klíči (Pozice)
    }

    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povoleneLokace.containsKey(nova);      //contains - metoda, ktera zkonroluje, jestli to na co to volame to obsahuje
        } else if (smer.equals("jih")) {   //pokud by tam bylo všude jen if (ne else if) tak by se else nakonci vztahovalo jen k poslednímu if, ne ke všem
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
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


    // u věcí typu list můžeme definovat jen určitý klíč (třeba auta) a jen určitý



//Map - interfaces implementaacema (?), funguje jako klíč + hodnodta (Pozice+Lokace)
    
}

//  public void vypsat (){
//      for (Object Pozice:povoleneLokace) { //hranatý závork umožní přidat kus kódu pro každou věc
//          System.out.println(Pozice);
//      }


// DU napsat aby se šlo pohybovat na sever, či někam

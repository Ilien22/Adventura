package com.company;

import com.company.akce.Jdi;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Tibor on 17. 4. 2016.
 */
public class JdiTest { //testovací sekvence jsou vždy void a public

    @Test
    public void proved () { //většinou se tam vždycky píše throws Exception
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi testovana = new Jdi(mapa);
        Pozice pozice = new Pozice(1,1);

        testovana.proved(new String[]{"jdi", "sever"}); //takhle jsem vytvořila pole a rovnou ho inicializovcala hodnotama new String[]{}
        assertEquals (new Pozice (1, 2), mapa.aktualniPozice); // assertEquals () nutno naimportovat (Alt+Enter); statická metoda (
    }
    @Test
    public void tamNejdu (){
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi testovana = new Jdi(mapa);
        Pozice pozice = new Pozice(1,1);

        testovana.proved(new String[]{"jdi", "jih"});
        testovana.proved(new String[]{"jdi", "jih"});
        testovana.proved(new String[]{"jdi", "jih"});
        assertEquals(new Pozice(1, 0), mapa.aktualniPozice);
    }
}

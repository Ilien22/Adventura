package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class AkceTest {

    @Test
    public void testRozumimPrikazu() throws Exception {
        Akce testovana = new Akce("jdi", 1);
        String[] prikazy = "jdi sever".split (" ");     //teĎ si ukážeme, jak se definuje pole

        assertEquals(true, testovana.rozumimPrikazu(prikazy)); //funkce, která ověřuje rovnosti funkcí, má volitelný parametr, který vypíše v případě neúspěchu


    }
}
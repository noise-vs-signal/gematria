package gematria;

import java.util.Collections;

/**
 * Return Gematria values for Latin-based alphabets (including English), based on the mappings
 * given in "The Serpent Tongue (Liber 187)" by Jake Stratton-Kent (2011).
 *
 *     https://en.wikipedia.org/wiki/English_Qabalah
 */
public class ThelemicQabalah extends Gematria {
    public ThelemicQabalah() {
        initializeLetterTable();
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Usage: ThelemicQabalah <String>");
            System.exit(-1);
        }

        ThelemicQabalah thelemicQabalah= new ThelemicQabalah();
        System.out.println(thelemicQabalah.gematriaValue(args[0]));
    }

    private void initializeLetterTable() {
        letterTable.put("A", 1);
        letterTable.put("B", 20);
        letterTable.put("C", 13);
        letterTable.put("D", 6);
        letterTable.put("E", 25);
        letterTable.put("F", 18);
        letterTable.put("G", 11);
        letterTable.put("H", 4);
        letterTable.put("I", 23);
        letterTable.put("J", 16);
        letterTable.put("K", 9);
        letterTable.put("L", 2);
        letterTable.put("M", 21);
        letterTable.put("N", 14);
        letterTable.put("O", 7);
        letterTable.put("P", 26);
        letterTable.put("Q", 19);
        letterTable.put("R", 12);
        letterTable.put("S", 5);
        letterTable.put("T", 24);
        letterTable.put("U", 17);
        letterTable.put("V", 10);
        letterTable.put("W", 3);
        letterTable.put("X", 22);
        letterTable.put("Y", 15);
        letterTable.put("Z", 8);
        letterTable = Collections.unmodifiableMap(letterTable);
    }
}

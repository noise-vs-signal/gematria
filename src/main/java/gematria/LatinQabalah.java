package gematria;

import java.util.Collections;

/**
 * Return Gematria values for Latin-based alphabets (including English), based on the mappings
 * given in Chapter XX of "De Occulta Philosophia libri III" by Cornelius Agrippa (1531).
 *
 *     https://en.wikipedia.org/wiki/Three_Books_of_Occult_Philosophy
 *     https://en.wikipedia.org/wiki/Latin_alphabet
 *     https://en.wikipedia.org/wiki/English_alphabet
 *
 * The classical Latin alphabet had 23 letters, and did not contain the letters J, U or W.
 * Agrippa handles these missing as follows:
 *
 *     J -> I (Simple consonant), Value = 600
 *     U -> V (Simple consonant), Value = 700
 *     W -> VV (Aspirated consonant), represented by HV, Value = 900
 */
public class LatinQabalah extends Gematria {
    public LatinQabalah() {
        initializeLetterTable();
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Usage: LatinQabalah <String>");
            System.exit(-1);
        }

        LatinQabalah latinQabalah = new LatinQabalah();
        System.out.println(latinQabalah.gematriaValue(args[0]));
    }

    private void initializeLetterTable() {
        letterTable.put("A", 1);
        letterTable.put("B", 2);
        letterTable.put("C", 3);
        letterTable.put("D", 4);
        letterTable.put("E", 5);
        letterTable.put("F", 6);
        letterTable.put("G", 7);
        letterTable.put("H", 8);
        letterTable.put("I", 9);
        letterTable.put("K", 10);
        letterTable.put("L", 20);
        letterTable.put("M", 30);
        letterTable.put("N", 40);
        letterTable.put("O", 50);
        letterTable.put("P", 60);
        letterTable.put("Q", 70);
        letterTable.put("R", 80);
        letterTable.put("S", 90);
        letterTable.put("T", 100);
        letterTable.put("V", 200);
        letterTable.put("X", 300);
        letterTable.put("Y", 400);
        letterTable.put("Z", 500);
        letterTable.put("J", 600);
        letterTable.put("U", 700);
        letterTable.put("W", 900);
        letterTable = Collections.unmodifiableMap(letterTable);
    }
}

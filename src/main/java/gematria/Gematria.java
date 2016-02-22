package gematria;

import java.util.HashMap;
import java.util.Map;

public abstract class Gematria {
    protected Map<String, Integer> letterTable = new HashMap<String, Integer>();

    public int gematriaValue(String input) throws IllegalArgumentException {
        int gematriaValue = 0;

        if (null != input && !("").equals(input)) {
            String[] letters = input.replaceAll("[^a-zA-Z ]", "").toUpperCase().split("");

            for (String letter : letters) {
                if (letterTable.containsKey(letter)) {
                    gematriaValue += letterTable.get(letter);
                }
                else {
                    throw new IllegalArgumentException("Invalid character in input string: " + input);
                }
            }
        }
        else {
            gematriaValue = -1;
        }

        return gematriaValue;
    }
}

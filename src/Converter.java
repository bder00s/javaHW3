import com.sun.java.accessibility.util.Translator;

import java.util.HashMap;

public class Converter {

    // HASHMAP AANGEMAAKT /////////////////////////////////////
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    //CONSTRUCTOR ///////////////////////////////////////////
    public Converter(String[] alphabetic, Integer[] numeric) {

        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }

    }
    //METHODE VOOR HET CONVERTEREN VAN EEN NUMBER //////////////////////////
    public String translate(Integer number) {
        String result = numericAlpha.get(number);
        return result;

    }

}


package collections;

import java.util.HashMap;

/**
 * ExemploHashMap
 */
public class ExemploHashMap {

    public static void main(String[] args) {

        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasilia");
        capitais.put("Franca", "Paris");
        capitais.put("Japao", "Toquio");

        System.out.println(capitais.get("Franca"));

        if (capitais.containsKey("Japao")) {
            System.out.println(capitais.get("Brasil"));
        } 

        for (String chave : capitais.keySet()){
            System.out.println(chave + " - " + capitais.get(chave));
        }

    }
}
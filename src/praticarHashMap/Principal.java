package praticarHashMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static Map<Character, Integer> contaFrequencia(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println(contaFrequencia("Catharina"));
    }
}

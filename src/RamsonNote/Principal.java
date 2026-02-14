package RamsonNote;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static boolean canConstruct(String ransomNote, String magazine){
        if (magazine.length() < ransomNote.length()) return false;
        Map<Character, Integer> contadorLetrasMagazine = new HashMap<>();
        Map<Character, Integer> contadorLetrasRansom = new HashMap<>();
        char[] letrasRansom = ransomNote.toLowerCase().toCharArray();

        for(Character c: ransomNote.toLowerCase().toCharArray()){
            contadorLetrasRansom.put(c, contadorLetrasRansom.getOrDefault(c, 0) + 1);
        }

        for(Character c: magazine.toLowerCase().toCharArray()){
            contadorLetrasMagazine.put(c, contadorLetrasMagazine.getOrDefault(c, 0) + 1);
        }

        for (Character c: letrasRansom) {
            if (contadorLetrasMagazine.getOrDefault(c, 0) == 0 || contadorLetrasMagazine.get(c) < contadorLetrasRansom.get(c)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("Mateus", "mtaues"));
    }
}

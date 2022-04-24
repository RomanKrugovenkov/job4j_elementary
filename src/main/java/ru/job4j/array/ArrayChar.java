package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            String w = String.valueOf(word[i]);
            String p = String.valueOf(pref[i]);
            if (!w.equals(p)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

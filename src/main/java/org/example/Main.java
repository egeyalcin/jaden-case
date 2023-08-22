package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) return null;
        String[] array = phrase.split(" ");
        for(int i = 0; i < array.length;i++) {
            char[] charArray = array[i].toCharArray();
            char c = array[i].toCharArray()[0];
            if(Character.isLowerCase(c)) {
                charArray[0] = Character.toUpperCase(charArray[0]);
            }
            array[i] = new String(charArray);
        }
        return String.join(" ", array);
    }
}
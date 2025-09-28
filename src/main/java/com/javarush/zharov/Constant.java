package com.javarush.zharov;

import java.util.HashMap;

public class Constant {
    public static final String russian = "ЁЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    public static final String english = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public static final String numbers = "1234567890";
    public static final String symbols = "!@#$%^&*()_+~-=[]{}\\|;:'\"<>,.?/";
    public static final String FULL_ALPHABET = russian + russian.toLowerCase() + english + english.toLowerCase() + numbers + symbols;
    public static final HashMap charsMap = new HashMap();
    public static char[] ALPHABET = FULL_ALPHABET.toCharArray();

    static {
        for (int i = 0; i < ALPHABET.length; i++) {
            charsMap.put(ALPHABET[i], i);
        }
    }
}

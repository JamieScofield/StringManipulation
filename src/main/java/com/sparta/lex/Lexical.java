package com.sparta.lex;

import java.util.Arrays;

public class Lexical {

    public int numOfChar(String input) {
        int num = 0;
        String[] splitInput = input.split(" ");
        for (String s : splitInput) {
            num += s.length();
        }
        return num;
    }

    public int numOfWords(String input) {
        int num = 0;
        String[] splitInput = input.split(" ");
        for (String s : splitInput) {
            num++;
        }
        return num;
    }
}

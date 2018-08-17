package com.company;

public class Strings {

    public void replace(String msg, String what) {
        int i;
        String word = "";
        for (i = 0; i < msg.length(); i++) {
            if (msg.substring(i, i + 1).equals(" ")) {
                System.out.print(word);
                word = "";
                System.out.print(" ");
            } else {
                word = word + msg.substring(i, i + 1);
            }

            if (word.equals(what)) {
                word = "***";
            }
        }
        System.out.print(word);
    }
}
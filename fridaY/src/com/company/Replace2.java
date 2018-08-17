package com.company;

public class Replace2 {
    public void replace(String msg, String what) {
        int i = 0, num = 0, j;

        for (j = 0; j < msg.length(); j++) {
            if (msg.substring(j, j + 1).equals(what.substring(0, 1))) {
                num = j;
                //for (; i < msg.length() - (what.length() - 1); i++) {
                    String before = "";
                    before = (msg.substring(0, num - 1));
                    //System.out.println(before);
                    String word = "";
                    word = msg.substring(num, num + what.length() - 1);
                    word = "****";
                    //System.out.println(word);
                    String after = "";
                    after = (msg.substring(num + (what.length()), msg.length()));
                    //System.out.println(after);
                    System.out.print(before + word + after);
                C:\Users\Admin\IdeaProjects\fridaY\src\com\company\Replace2.java
            }


        }
    }
}


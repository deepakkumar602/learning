package com.learning.mumbai.string;

import java.util.HashMap;

class CompressedString {

    void compare(String input) {
        String cs = compressedString(input);
        if (cs.length() < input.length()) {
            System.out.println(cs);
        } else {
            System.out.println(input);
        }
    }

    String compressedString(String input) {
        int frequency = 1;
        String temp1 = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (i < input.length() - 1 && ch == input.charAt(i + 1)) {
                frequency++;
            } else {
                temp1 = temp1 + (Character.toString(ch) + frequency);
                frequency = 1;
            }
        }
        return temp1;
    }

    //using HashMap
    void str(String str) {
        int frequency = 0;
        String temp = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                frequency++;
            } else {
                frequency = 1;
            }
            map.put(str.charAt(i), frequency);
        }

        for (char ch : map.keySet()) {
            frequency = map.get(ch);
            temp += Character.toString(ch) + frequency;
        }

        System.out.println(temp);
    }

    public static void main(String... s) {
        String inputString = "aaaabbbccd";

        String inputString2 = "aaabbbccdadasdfasdfaeeeeeeeeeeeeee";

        String inputString3 = "abcd";

        CompressedString cs = new CompressedString();
        cs.compare(inputString);
        cs.compare(inputString2);
        cs.str(inputString3);
    }
}	
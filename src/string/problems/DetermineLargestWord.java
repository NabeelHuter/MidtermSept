package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        String[] word = s.split(" ");
        String rts = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= rts.length()) {
                rts = word[i];
            }
        }
        System.out.println(rts);
        System.out.println(rts.length());

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}


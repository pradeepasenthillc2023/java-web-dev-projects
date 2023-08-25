package org.launchcode;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        HashMap<Character, Integer> charCountMap = countCharacters(phrase);

        for (char c : charCountMap.keySet()) {
            System.out.printf("%c: %d%n", c, charCountMap.get(c));
        }
    }

    public static HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap;
    }
}







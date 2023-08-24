package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        // Replace 'arrayName' with 'integerArray'
        System.out.println(Arrays.toString(integerArray));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
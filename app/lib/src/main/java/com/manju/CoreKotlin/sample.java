package com.manju.CoreKotlin;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class sample {
    public static void main(String[] args) {
                String inputString = "easjkfajfnkldwawddwije";
                // Remove duplicate characters
                String uniqueString = removeDuplicates(inputString);
                // Print the result
                System.out.println(uniqueString);
            }
    private static String removeDuplicates(String str) {
        // Convert the string to a char array
        char[] chars = str.toCharArray();
        // Create a LinkedHashSet to store unique characters
        Set<Character> uniqueChars = new LinkedHashSet<>();
        // Add each character to the set
        for (char c : chars) {
            uniqueChars.add(c);
        }
        // Build a new string from the set
        StringBuilder sb = new StringBuilder();
        for (Character c : uniqueChars) {
            sb.append(c);
        }
        return sb.toString();
    }
}

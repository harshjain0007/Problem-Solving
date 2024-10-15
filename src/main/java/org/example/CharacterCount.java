package org.example;

public class CharacterCount {

    public static void countCharacterOccurrences(String name) {
        // Assuming only lowercase letters a-z
        int[] counts = new int[26]; // Array to store counts of each letter

        // Loop through the string and count occurrences
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z')
            { // Check if it's a lowercase letter
                counts[ch - 'a']++; // Increment the count for that letter
            }
        }

        // Print the results
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char ch = (char) (i + 'a'); // Convert index back to character
                System.out.println("Character '" + ch + "' occurs " + counts[i] + " times.");
            }
        }
    }

    public static void main(String[] args) {
        String name = "harsh";
        System.out.println("harsh has ");
        countCharacterOccurrences(name);
    }
}
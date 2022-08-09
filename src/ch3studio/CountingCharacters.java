package ch3studio;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        // Create a program that counts the number of occurrences of each character in a string
        // "Pearce"
        // Ex output: P: 1, e: 2, a: 1 etc...

        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = str.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // for each character in str
        for (char letter : charactersInString) {
            System.out.println(letter);
            // Store/update the count for the current letter in our HashMap
            // On the first iteration of this foreach loop,
            // what will letter be equal to?
            // letter = 'P'
            // So far that means that there is one 'P' in our string
            // 'P': 1

            // If characterCounts already contains a given letter,
            // we should update the count value for that letter instead
            // of trying to add in a new KVP
            if (characterCounts.containsKey(letter)) {
                // update the count for current letter
                // first we have to get the current count for letter
                int currentCount = characterCounts.get(letter);
                characterCounts.put(letter, currentCount + 1);
                System.out.println(currentCount);
            } else {
                characterCounts.put(letter, 1);
            }
        }

        System.out.println(characterCounts);
    }
}

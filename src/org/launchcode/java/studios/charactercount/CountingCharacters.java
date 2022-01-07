package org.launchcode.java.studios.charactercount;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String textIn;
        String text;
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        String request;

        System.out.println("Would you like to break down string? yes or no: ");
        request = input.nextLine();
        if ( request.equals("yes")) {
            System.out.println("What word would you like to break down?");
            textIn = input.nextLine();
            text = textIn.replaceAll("[^A-Za-z]+", "").toLowerCase();
            char[] charactersInString = text.toCharArray();
            for ( char i : charactersInString){
                if (!charCount.containsKey(i)){
                    charCount.put(i,0);
                }
                if (charCount.containsKey(i)){
                    charCount.put(i, charCount.get(i).intValue() + 1);
                }
            }
            for(Map.Entry<Character, Integer> letter : charCount.entrySet()){
                System.out.println(letter.getKey() +" : " +letter.getValue());
            }
            System.out.println("ThankYouGoodbye");
        }
        else {
            System.out.println("that's too bad...");
            System.out.println("Goodbye");
        }


    }
}

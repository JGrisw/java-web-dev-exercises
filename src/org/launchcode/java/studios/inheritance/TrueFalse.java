package org.launchcode.java.studios.inheritance;
import  java.util.Scanner;


public class TrueFalse extends Question{

    TrueFalse(String Q, String A) {
        super(Q, A);
    }

    @Override
    public void askQuestion() {
        System.out.println(TrueFalse.getQuestion());
        Scanner input;
        input = new Scanner(System.in);
        String guess = input.nextLine().toLowerCase().trim();
        this.setUserAnswer(guess);
    }
}

package org.launchcode.java.studios.inheritance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultiChoice extends Question{
    public String choiceA;
    public String choiceB;
    public String choiceC;
    public String choiceD;

    MultiChoice(String Q, String A) {
        super(Q, A);

    }
    ArrayList<String> choices = new ArrayList<>();

    public void setChoices(String a, String b, String c, String d){
        this.choiceA = a;
        this.choiceB = b;
        this.choiceC = c;
        this.choiceD = d;
            Collections.addAll(choices, this.choiceA , this.choiceB, this.choiceC, choiceD);
    }
    @Override
    public void askQuestion(){
        System.out.println(MultiChoice.getQuestion());
        for( String choice : choices){
            System.out.println(choice);
        }
        Scanner input;
        input = new Scanner(System.in);
        String guess = input.nextLine().toLowerCase();
        this.setUserAnswer(guess);

    }
}

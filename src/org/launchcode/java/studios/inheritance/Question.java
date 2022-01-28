package org.launchcode.java.studios.inheritance;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public abstract class Question {
    private static String question;
    private String trueAnswer;
    private String userAnswer;

    Question (String Q, String A){
        question = Q;
        this.trueAnswer = A;
    }

    public static String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String answer) {
        this.trueAnswer = answer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public abstract void askQuestion();
}

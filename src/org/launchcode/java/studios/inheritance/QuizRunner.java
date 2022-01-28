package org.launchcode.java.studios.inheritance;

public class QuizRunner {
    public static void main(String[] args) {
    MultiChoice easyQ = new MultiChoice("what is the letter 1", "one");
    TrueFalse easyPeasy = new TrueFalse("is green a color", "true");
    easyQ.setChoices("one", "two", "green", "space");

    Quiz quiz = new Quiz();
    quiz.addQuestion(easyQ);
    quiz.addQuestion(easyPeasy);
    quiz.runQuiz();



    }
}

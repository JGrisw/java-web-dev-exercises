package org.launchcode.java.studios.inheritance;

import java.util.ArrayList;

public class Quiz {
ArrayList<Question> quizIt = new ArrayList<>();
int numCorrect = 0;
int totalQuestions = 0;

public void addQuestion(Question q){
    quizIt.add(q);
}
public void gradeQuiz(){
    for(Question Q: quizIt){
        totalQuestions ++;
        if(Q.getUserAnswer() == Q.getTrueAnswer()){
            numCorrect ++;
        }
    }
    System.out.println("Your score is " + numCorrect +"/"+ totalQuestions);
}
public void runQuiz(){
    for(Question Q : quizIt){
        Q.askQuestion();
    }
    gradeQuiz();
}


}

package org.launchcode;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args){
        Quiz q = new Quiz();
        q.addQns("What is al dente?");
        q.addQns("What are common baking ingredients?");
        q.addQns("Wright brothers invented the planes. True or False?");
        q.addAns("Tender to the bite.");
        q.addAns("Eggs, Sugar");
        MultipleChoiceQns question1 = new MultipleChoiceQns("What is al dente?","Tender to the bite",1,"Tender to the bite","soft","undercooked");
        question1.displayQns();
        question1.displayAns();
//        question1.displayScore();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer");
        String answer = input.nextLine();
        q.gradeQuiz(answer);

    }
}

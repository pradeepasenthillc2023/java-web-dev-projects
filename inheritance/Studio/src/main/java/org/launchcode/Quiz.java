package org.launchcode;

import java.util.ArrayList;
public class Quiz {
    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();
    private int grade = 0;
    public Quiz(){

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addQns(String qns){
        questions.add(qns);
    }

    public void addAns(String ans){
        answers.add(ans);
    }
    public void displayQuiz(){
        System.out.println("QUESTIONS:");
        for(String q : questions ){
            System.out.println(q);
        }
        System.out.println("ANSWERS:");
        for(String a : answers) {
            System.out.println(a);
        }
        System.out.println("GRADE: " +grade);
    }
    public void gradeQuiz(String answer){
        for(String ans : answers){
            if(ans.equals(answers)){
                System.out.println("Correct Answer");
                grade++;
            }
            else{
                System.out.println("Incorrect Answer");
            }
        }
    }

}

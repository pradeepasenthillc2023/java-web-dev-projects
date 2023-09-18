package org.launchcode;

public class TrueFalseQns extends Questions{
    private boolean correctAns;
    public TrueFalseQns(String question, String answer,int Score, boolean correctAns){
        super(question,answer,Score);
        this.correctAns = correctAns;
    }

    public boolean isCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(boolean correctAns) {
        this.correctAns = correctAns;
    }

    @Override
    public void displayQns() {
        System.out.println(super.getQuestion());
        System.out.println(isCorrectAns());

    }
    @Override
    public void displayAns(){
        System.out.println(super.getAnswer());
    }

    @Override
    public void displayScore(){
        System.out.println(super.getScore());
    }
}

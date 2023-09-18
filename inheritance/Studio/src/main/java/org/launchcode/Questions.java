package org.launchcode;

public abstract class Questions {
    private String question;
    private String answer;
    private int score;

    public Questions(String question, String answer, int score){
        this.question = question;
        this.answer = answer;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public abstract void displayQns();
    public abstract void displayAns();
    public abstract void   displayScore();
}

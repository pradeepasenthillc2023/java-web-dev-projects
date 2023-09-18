package org.launchcode;

public class MultipleChoiceQns extends Questions{
    private String option1;
    private String option2;
    private String option3;
    public MultipleChoiceQns(String question, String answer, int score,String option1,String option2, String option3){
        super(question, answer, score);
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    @Override
    public void displayQns() {
        System.out.println(super.getQuestion());
        System.out.println(getOption1());
        System.out.println(getOption2());
        System.out.println(getOption3());

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

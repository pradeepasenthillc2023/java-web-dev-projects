package org.launchcode;

public class CheckBoxQns extends Questions{
    private String check1;
    private String check2;
    private String check3;
    public CheckBoxQns(String question, String answer, int score,String check1, String check2, String check3){
        super(question,answer,score);
        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
    }

    public String getCheck1() {
        return check1;
    }

    public String getCheck2() {
        return check2;
    }

    public String getCheck3() {
        return check3;
    }

    public void setCheck1(String check1) {
        this.check1 = check1;
    }

    public void setCheck2(String check2) {
        this.check2 = check2;
    }

    public void setCheck3(String check3) {
        this.check3 = check3;
    }

    @Override
    public void displayQns() {
        System.out.println(super.getQuestion());
        System.out.println(getCheck1());
        System.out.println(getCheck2());
        System.out.println(getCheck3());

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
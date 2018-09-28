package com.example.sg00251.arithmeticchallenge;

public abstract class ArithmeticChallenge {

    private String mText;
    private String mQuestionText;
    public int[] mChoices = new int[3];
    public String[] mChoiceText = new String[3];

    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL){

    }


    protected abstract String createQuestion();
    protected abstract int[] createChoices();

    public String getQuestionText() {
        return mQuestionText;
    }

    public void setQuestionText(String questionText) {
        mQuestionText = questionText;
    }



    public String getChoice(int index) {

        return "";

    }

    public void setChoices(int[] choice) {
        mChoices = choice;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }




}

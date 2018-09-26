package com.example.sg00251.arithmeticchallenge;

public abstract class ArithmeticChallenge {

    private String mQuestionText;

    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL){

    }

    public String getQuestionText() {
        return mQuestionText;
    }

    public void setQuestionText(String questionText) {
        mQuestionText = questionText;
    }
}

package com.example.sg00251.arithmeticchallenge;

public abstract class ArithmeticChallenge {

    private String mText;
    private String mQuestionText;
    public int[] mChoices = new int[3];
    public String[] mChoicesText = new String[3];

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

        return mChoicesText[index];

    }

    public void setChoices(int[] choices) {
        for(int i=0; i<3;i++)
            shuffleChoices(choices);

    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

public boolean isCorrect(int choice) {
    return true;
}
private void shuffleChoices(int[] choices){
        int choice =(int) (3*Math.random()+1);
        switch (choice){
            case 1:
                mChoicesText[0] = "" + choices[0] + "";
                mChoicesText[1] = "" + choices[1] + "";
                mChoicesText[2] = "" + choices[2] + "";
                break;

            case 2:
                mChoicesText[0] = "" + choices[1] + "";
                mChoicesText[1] = "" + choices[0] + "";
                mChoicesText[2] = "" + choices[2] + "";
                break;

            case 3:
                mChoicesText[0] = "" + choices[2] + "";
                mChoicesText[1] = "" + choices[1] + "";
                mChoicesText[2] = "" + choices[0] + "";
                break;


        }



}


}

package com.example.sg00251.arithmeticchallenge;

public abstract class ArithmeticChallenge {

    private boolean ccorect;
    private int mAnswer;
    private int mProgress, mScore, mHighScore;
    private String mText;
    private String mQuestionText;
    public int[] mChoices = new int[3];
    public String[] mChoicesText = new String[3];
    private long mStartTime;

    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        //to be implemented
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
        shuffleChoices(choices);
        mStartTime = System.currentTimeMillis();
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setHighScore(int highScore){
        mHighScore = highScore;
    }

    public int getHighScore(){
        return mHighScore;
    }

    protected boolean isCorrect(int choice) {

      boolean correct = (Integer.parseInt(mChoicesText[choice]) ==mAnswer) ? true : false;
      ccorect = correct;
      return correct;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(boolean isCorrect) {
        if (isCorrect){
             long duration = System.currentTimeMillis()- mStartTime;
             if(duration > 5000){
                 mScore += 100 - duration/100;
             }
        }
    }

    public int getProgress() {
        mProgress +=10;
        return mProgress;
    }

    public void setProgress(int progress) {
        mProgress = progress;
    }

    private void shuffleChoices(int[] choices){
        int choice =(int) (3*Math.random()+1);
        switch (choice){
            case 1:
                mChoicesText[0] = Integer.toString(choices[0]);
                mChoicesText[1] = Integer.toString(choices[1]);
                mChoicesText[2] = Integer.toString(choices[2]);

                break;

            case 2:
                mChoicesText[0] = Integer.toString(choices[1]);
                mChoicesText[1] = Integer.toString(choices[0]);
                mChoicesText[2] = Integer.toString(choices[2]);

                break;

            case 3:
                mChoicesText[0] = Integer.toString(choices[2]);
                mChoicesText[1] = Integer.toString(choices[1]);
                mChoicesText[2] = Integer.toString(choices[0]);

                break;
        }
    }
}

package com.example.sg00251.arithmeticchallenge;

public class Multiplication extends ArithmeticChallenge {

        int mNum,mNum2;
        int[] choices = new int[3];

    public Multiplication(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
            super(TOTAL_LEVELS, TURNS_PER_LEVEL);
        }

        protected String createQuestion() {
            mNum = (int) (12 * Math.random());
            mNum2 = (int) (12 * Math.random());
            String equation = (mNum + " X " + mNum2);
            return equation;
        }


        protected int[] createChoices(){
            for(int i=0; i < choices.length;i++)
                choices[i] = (int) (50*(Math.random()));
            choices[0]= mNum * mNum2;
            return choices;
            //hey


        }
    }




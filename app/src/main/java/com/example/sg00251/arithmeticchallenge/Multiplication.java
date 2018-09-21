package com.example.sg00251.arithmeticchallenge;



// duplicate this for addition, subtraction, and division

public class Multiplication extends ArithmeticChallenge {
    int eNum,eNum2;
    int[] choices = new int[3];

    public Multiplication(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion() {
        eNum = (int) (12 * Math.random());
        eNum2 = (int) (12 * Math.random());
        String equation = ((char) eNum + "X" + (char) eNum2);
        return equation;
    }


    protected int[] createChoices(){
        for(int i=0; i < choices.length;i++)
            choices[i] = (int) (50*(Math.random()));
            choices[(int)(3*Math.random())]= eNum * eNum2;
            return choices;
            //hey


    }
}









}

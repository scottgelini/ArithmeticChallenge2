package com.example.sg00251.arithmeticchallenge;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

public class GameActivity extends AppCompatActivity {
    private Button[] mChoice = new Button[3];
    private Button mMenu;
    private TextView mQuestionText, mScoreText, mHighScoreText;
    private ProgressBar mProgressBar;
    private ArithmeticChallenge game;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setViewObjects();
    }

    /************************************************************************
     *  Chooses type of game and then links screen objects to
     *  this class' fields.  Declares current high score.
     ************************************************************************/
    private void setViewObjects(){
        // Get data from Main Activity ************************************************
        Intent intent = getIntent();
        String operation = intent.getStringExtra("Operation");

        // Use data to set game object to current game ********************************
        //if(operation.equals("addition"))
            //game = new Addition(1,10); // you may change parameters
        //if(operation.equals("subtraction"))
            //game = new Subtraction(1,10); // you may change parameters
        if(operation.equals("multiplication"))
           game = new Multiplication(1,10); // you may change parameters
        //if(operation.equals("division"))
           // game = new Division(1,10); // you may change parameters

        // Assign screen objects to fields ********************************************
        mQuestionText = findViewById(R.id.textView_Equation);
        mProgressBar = findViewById(R.id.progressBar);
        mScoreText = findViewById(R.id.textView_YourScore);
        mHighScoreText = findViewById(R.id.textView_HighScore);
        mChoice[0] = findViewById(R.id.button_Answer1);
        mChoice[1] = findViewById(R.id.button_Answer2);
        mChoice[2] = findViewById(R.id.button_Answer3);
        mMenu = findViewById(R.id.button_Menu);
        retrieveHighScore(operation);
        listenForClicks(true);
    }

    /************************************************************************
     *  Displays question on view and listens for answer
     ************************************************************************/
    private void listenForClicks(boolean newQuestion){
        if(newQuestion)
            game.setQuestionText(game.createQuestion());
        mQuestionText.setText(game.getQuestionText());
        game.setChoices(game.createChoices());


        // ****** sets choices to view ************************************************
        for(int index = 0; index < 3; index++){
            final int innerIndex = index;
            mChoice[index].setText(game.getChoice(index));
            // ****** listens for user input ******************************************
            mChoice[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                   // setScoreTextAndProgressBar(game.isCorrect(innerIndex));
                }
            });
        }
        mMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.exit(0);
            }
        });
    }

    /************************************************************************
     *  Grades answer and updates score and progress.
     ************************************************************************/
    private void setScoreTextAndProgressBar(boolean isCorrect){
// more to be implemented
        listenForClicks(true);
    }

    /************************************************************************
     * Ends game or starts next round.
     ************************************************************************/
    private void endGame(){
        // to be implemented
    }

    protected void retrieveHighScore(String operation) {
        // to be implemented

    }

    protected void updateHighScore() {
        // to be implemented

    }
}







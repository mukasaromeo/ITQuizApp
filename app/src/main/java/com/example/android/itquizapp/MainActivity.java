package com.example.android.itquizapp;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        final CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #2 (1880s)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        RadioButton question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        answer1 = question1_choice2.isChecked();
        if (answer1) {
            answer1_score = 5;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "Field"
        //------------------------------------------------------------------------------------------
        String answer2;
        EditText question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("Field")) {
            answer2_score = 5;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #3 (Operating System)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;

        CheckBox question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        CheckBox question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        CheckBox question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        CheckBox question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question3_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (!answer3_choice1 && !answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_score = 5;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "Flash"
        //------------------------------------------------------------------------------------------
        String answer4;
        EditText question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("Flash")) {
            answer4_score = 5;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #1 "Alan Turing"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        RadioButton question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice1.isChecked();
        if (answer5) {
            answer5_score = 5;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "David Filo" and "Jerry Yang"
        //------------------------------------------------------------------------------------------
        String answer6;
        EditText question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("clouds") && answer6.equals("cloud")) {
            answer6_score = 5;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answer #3 (Resistor)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;

        CheckBox question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        CheckBox question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        CheckBox question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        CheckBox question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && !answer7_choice4) {
            answer7_score = 5;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "Pumping"
        //------------------------------------------------------------------------------------------
        String answer8;
        EditText question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("Pumping")) {
            answer8_score = 5;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "Squirrel cage motor"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        RadioButton question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 5;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "Smelting"
        //------------------------------------------------------------------------------------------
        String answer10;
        EditText question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("1983")) {
            answer10_score = 5;
        } else {
            answer10_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 50) {
            resultsDisplay = "Perfect! \n \n 50 out of 50";
        } else {
            resultsDisplay = final_score + " OUT OF 50 TRY AGAIN.";
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        // 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage(resultsDisplay).setTitle("YOU SCORED");

        // Add the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });

        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    //Clear RadioGroup Actions
    public void clearRadioButtons() {
        RadioButton question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        question1_choice2.setChecked(false);
        RadioButton question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        question1_choice1.setChecked(false);
        RadioButton question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        question1_choice3.setChecked(false);
        RadioButton question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice1);
        question5_choice1.setChecked(false);
        RadioButton question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        question5_choice2.setChecked(false);
        RadioButton question5_choice3 = (RadioButton) this.findViewById(R.id.question5_choice3);
        question5_choice3.setChecked(false);
        RadioButton question9_choice1 = (RadioButton) this.findViewById(R.id.question9_choice1);
        question9_choice1.setChecked(false);
        RadioButton question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        question9_choice2.setChecked(false);
    }

    //Clear EditText
    public void clearEditText() {
        EditText question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        question2_answer.setText(null);
        EditText question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        question4_answer.setText(null);
        EditText question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        question6_answer.setText(null);
        EditText question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        question8_answer.setText(null);
        EditText question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        question10_answer.setText(null);
    }

    //Clear Checked boxes
    public void clearCheckedBoxes() {
        CheckBox question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice1.setChecked(false);
        CheckBox question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice2.setChecked(false);
        CheckBox question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice3.setChecked(false);
        CheckBox question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        question7_choice4.setChecked(false);
        CheckBox question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice1.setChecked(false);
        CheckBox question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice2.setChecked(false);
        CheckBox question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice3.setChecked(false);
        CheckBox question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        question3_choice4.setChecked(false);
    }

    //Restart button to reset quiz
    public void restartButton(View view) {

        //Clear or hide answers
        clearEditText();
        clearRadioButtons();
        clearCheckedBoxes();
    }


}

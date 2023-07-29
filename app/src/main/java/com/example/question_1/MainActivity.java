package com.example.question_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java is a person.", "Java was introduced in 1233.",
            "Java was created using Python.",
            "Java has abstract classes.", "Java supports interfaces.", "Java was created by Alok Agnihotri in India.", "Constructor overloading is not possible in Java.", "In your Java program, you can use reserved words as variable names.","Java is a case-sensitive language.", "Java is considered a low-level programming language."};
    private boolean[] answers = {false, false, false, true, true, false,false,false,true,false};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    // If you have given correct answer
                    //  if(answers[index]==true){
                    if (answers[index]) {
                        score++;
                    }
                    // Go to the next question
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your Score Is : " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(MainActivity.this, "Restart The App To Play Again.", Toast.LENGTH_SHORT).show();
                }
            }

        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if(index <= questions.length - 1) {
                    // If you have given correct answer
                    //  if(answers[index]==false){
                    if (!answers[index]) {
                        score++;
                    }
                    // Go to the next question
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your Score Is : " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart The App To Play Again.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
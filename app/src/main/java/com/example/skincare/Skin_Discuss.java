package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class Skin_Discuss extends AppCompatActivity {
    private ImageView quizpic;
    private TextView question, optionA, optionB, optionC, optionD;
    int CurrentQuizPic, CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;
    int currentIndex;
    int qn = 1;
    public static int mscore = 0;

    private QuizModel[] questionBank = new QuizModel[]{
            new QuizModel(R.drawable.discuss1, R.string.SkinDiscuss_q1, R.string.SkinDiscuss_a11, R.string.SkinDiscuss_a12, R.string.SkinDiscuss_a13, R.string.SkinDiscuss_a14),
            new QuizModel(R.drawable.discuss2, R.string.SkinDiscuss_q2, R.string.SkinDiscuss_a21, R.string.SkinDiscuss_a22, R.string.SkinDiscuss_a23, R.string.SkinDiscuss_a24),
            new QuizModel(R.drawable.discuss3, R.string.SkinDiscuss_q3, R.string.SkinDiscuss_a31, R.string.SkinDiscuss_a32, R.string.SkinDiscuss_a33, R.string.SkinDiscuss_a34),
            new QuizModel(R.drawable.discuss4, R.string.SkinDiscuss_q4, R.string.SkinDiscuss_a41, R.string.SkinDiscuss_a42, R.string.SkinDiscuss_a43, R.string.SkinDiscuss_a44)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_discuss);
        Intent intent = getIntent();

        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        quizpic = findViewById(R.id.q1pic);
        question = findViewById(R.id.question);

        CurrentQuizPic = questionBank[currentIndex].getQuizpic();
        quizpic.setImageResource(CurrentQuizPic);
        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutAnswer(CurrentOptionA);
                updateQuestion();
            }
        });
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutAnswer(CurrentOptionB);
                updateQuestion();
            }
        });
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutAnswer(CurrentOptionC);
                updateQuestion();
            }
        });
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutAnswer(CurrentOptionD);
                updateQuestion();
            }
        });
    }

    private void checkoutAnswer(int userSelection) {
        if (userSelection == CurrentOptionA) mscore = mscore + 4;
        if (userSelection == CurrentOptionB) mscore = mscore + 3;
        if (userSelection == CurrentOptionC) mscore = mscore + 2;
        if (userSelection == CurrentOptionD) mscore = mscore + 1;
    }

    private void updateQuestion() {
        currentIndex = (currentIndex + 1) % questionBank.length;

        if (currentIndex == 0) {
            if(mscore<=4) {
                mscore=0;
                Intent intent = new Intent(this, Final_drySkin.class);
                startActivity(intent);
            }
            if(mscore>4&&mscore<=8) {
                mscore=0;
                Intent intent = new Intent(this, Final_midSkin.class);
                startActivity(intent);
            }
            if(mscore>8&&mscore<=12) {
                mscore=0;
                Intent intent = new Intent(this, Final_mixSkin.class);
                startActivity(intent);
            }
            if(mscore>12) {
                mscore=0;
                Intent intent = new Intent(this, Final_oilSkin.class);
                startActivity(intent);
            }
        }

        CurrentQuizPic = questionBank[currentIndex].getQuizpic();
        quizpic.setImageResource(CurrentQuizPic);
        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn = qn + 1;
    }
}
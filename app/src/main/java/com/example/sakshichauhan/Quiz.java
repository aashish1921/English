package com.example.sakshichauhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Quiz extends AppCompatActivity {
    LinearLayout linearLayout;
    CountDownTimer countDownTimer;
    ArrayList<QA_ModelClass> list;
    int timer_value = 100;
    RoundedHorizontalProgressBar progressBar;
    TextView card_question, optionA, optionB, optionC, optionD;
    CardView cardA, cardB, cardC, cardD;
    QA_ModelClass qa_modelClass;
    List<QA_ModelClass> allQuestionList;
    int index = 0;
    int correctCount = 0;
    int wrongCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Hooks();

        list = new ArrayList<>();
        list.add(new QA_ModelClass("बुद्धि-लब्धि परीक्षण में 16 साल के एक बच्चे का स्कोर 75 है, उसकी मानसिक आयु कितनी होगी? ", "6 वर्ष", "8 वर्ष", "10 वर्ष", "12 वर्ष  ", "12 वर्ष"));
        list.add(new QA_ModelClass("hh", "A", "B", "C", "D", "A"));
        list.add(new QA_ModelClass("hh", "A", "B", "C", "D", "A"));
        list.add(new QA_ModelClass("hh", "A", "B", "C", "D", "A"));


        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gb)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.gb));
        }
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.gb));

        }


        qa_modelClass = list.get(index);

        setAllData();


//        progressBar.animateProgress(20000,100,0);

//        countDownTimer = new CountDownTimer(20000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                timer_value = timer_value - 5;
//                progressBar.setProgress(timer_value);
//
//            }
//
//            @Override
//            public void onFinish() {
//                Intent intent = new Intent(Quiz.this, watchActivity.class);
//                startActivity(intent);
//
////               Dialog dialog = new Dialog(Quiz.this, R.style.Dialog);
////                dialog.setContentView(R.layout.timer_layout);
////                dialog.show();
//
//            }
//        }.start();


    }

    private void setAllData() {
        card_question.setText(qa_modelClass.getQuestion());
        optionA.setText(qa_modelClass.getoA());
        optionB.setText(qa_modelClass.getoB());
        optionC.setText(qa_modelClass.getoC());
        optionD.setText(qa_modelClass.getoD());


    }

    private void Hooks() {
        progressBar = findViewById(R.id.progress_bar_1);
        card_question = findViewById(R.id.Question);
        optionA = findViewById(R.id.A);
        optionB = findViewById(R.id.B);
        optionC = findViewById(R.id.C);
        optionD = findViewById(R.id.D);

        cardA = findViewById(R.id.Card_A);
        cardB = findViewById(R.id.Card_B);
        cardC = findViewById(R.id.Card_C);
        cardD = findViewById(R.id.Card_D);
        linearLayout = findViewById(R.id.linearBtn);
    }

    public void Correct( CardView cardView) {
        cardView.setCardBackgroundColor(getResources().getColor(R.color.green));
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctCount++;
                qa_modelClass = list.get(index);
                setAllData();
                resetColor();

            }
        });


    }

    public void Wrong(CardView cardA) {
        cardA.setCardBackgroundColor(getResources().getColor(R.color.red));
        wrongCount++;
        if (index < list.size() - 1) {
            index++;
            qa_modelClass = list.get(index);


        } else {
            gameWin();
        }


    }

    private void gameWin() {

        Intent intent = new Intent(Quiz.this, watchActivity.class);
        startActivity(intent);

    }

    public void enableButton() {
        cardA.setClickable(true);
        cardB.setClickable(true);
        cardC.setClickable(true);
        cardD.setClickable(true);
    }

    public void disableButton() {
        cardA.setClickable(false);
        cardB.setClickable(false);
        cardC.setClickable(false);
        cardD.setClickable(false);
    }

    public void resetColor() {
        cardA.setCardBackgroundColor(getResources().getColor(R.color.card));
        cardB.setCardBackgroundColor(getResources().getColor(R.color.card));
        cardC.setCardBackgroundColor(getResources().getColor(R.color.card));
        cardD.setCardBackgroundColor(getResources().getColor(R.color.card));


    }


    public void OptionAClick(View view) {

        if (qa_modelClass.getoA().equals(qa_modelClass.getAns())) {
            cardA.setCardBackgroundColor(getResources().getColor(R.color.green));
            if (index < list.size() - 1) {

                Correct(cardA);
//                setAllData();
//                resetColor();

            } else {
                gameWin();
            }

        } else {
            Wrong(cardA);
        }
    }

    public void OptionBClick(View view) {

        if (qa_modelClass.getoB().equals(qa_modelClass.getAns())) {
            cardB.setCardBackgroundColor(getResources().getColor(R.color.green));
            if (index < list.size() - 1) {
                Correct(cardB);
//                setAllData();
//                resetColor();

            } else {
                gameWin();
            }

        } else {
            Wrong(cardB);
        }
    }

    public void OptionCClick(View view) {
        if (qa_modelClass.getoC().equals(qa_modelClass.getAns())) {
            cardC.setCardBackgroundColor(getResources().getColor(R.color.green));
            if (index < list.size() - 1) {
                Correct(cardC);
//                setAllData();
//                resetColor();

            } else {
                gameWin();
            }

        } else {
            Wrong(cardC);
        }

    }

    public void OptionDClick(View view) {

        if (qa_modelClass.getoD().equals(qa_modelClass.getAns())) {
            cardD.setCardBackgroundColor(getResources().getColor(R.color.green));
            if (index < list.size() - 1) {
                Correct(cardD);

            } else {
                gameWin();
            }

        } else {
            Wrong(cardD);
        }
    }
}
package com.example.quizgeografia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout tela;
    private TextView pergunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela = findViewById(R.id.telaToda);
        pergunta = findViewById(R.id.tvPergunta);

        tela.setOnTouchListener(new OnSwipeTouchListener(this) {

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                pergunta.setText("Para Baixo!!");
            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                pergunta.setText("Para Cima!!");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                pergunta.setText("Para Esquerda!!");
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                pergunta.setText("Para Direita !!");
            }
        });


    }


}

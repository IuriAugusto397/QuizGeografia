package com.example.quizgeografia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout tela;
    private TextView pergunta;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela = findViewById(R.id.telaToda);
        pergunta = findViewById(R.id.tvPergunta);

        //Exibe oque há no array indice '0'
        pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));



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
                if(Pergunta.contador == 0){
                    Pergunta.contador = Pergunta.retornaTamanhoArray();
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));

                }else{
                    Pergunta.contador = (Pergunta.contador-1);
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                }

            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                if(Pergunta.contador == Pergunta.retornaTamanhoArray()){
                    Pergunta.contador = 0;
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));

                }else{
                    Pergunta.contador = (Pergunta.contador+1);
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                }

                /*if(Pergunta.contador < Pergunta.retornaTamanhoArray()){
                     pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                     Pergunta.contador = (Pergunta.contador+1);
                }else {
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                    Pergunta.contador = 0;
                }*/

            }
        });


    }


}

package com.example.quizgeografia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class telaFinal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        TextView qtdAcertos;
        qtdAcertos = findViewById(R.id.tvAcertos);
        qtdAcertos.setText(Dados.contaAcertos());

    }
}

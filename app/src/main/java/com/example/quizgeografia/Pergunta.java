package com.example.quizgeografia;

import java.util.ArrayList;

public class Pergunta {

    public static int contador = 0;

    public static int retornaTamanhoArray(){
        return 4;
    }

    public static ArrayList<String> retornaArray(){
        final ArrayList<String> question = new ArrayList();

        question.add("É verdade que a capital da inglaterra é londres? 1");
        question.add("É verdade que a america do sul tem grandes placas tectónicas? 2 ");
        question.add("É verdade que Moscou foi atingida por uma bomba nuclear nos anos 60 ? 3");
        question.add("É verdade que a Floresta amazonica é presente em 9 paises ? 4 ");
        question.add("É verdade que o brasil fica no lado oriental do globo ? 5");

        return question;
    }







}

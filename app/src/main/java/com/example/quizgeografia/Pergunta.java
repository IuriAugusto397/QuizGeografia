package com.example.quizgeografia;

import java.util.ArrayList;

public class Pergunta {

    public static int contador = 0;

    public static int retornaTamanhoArray(){
        return 3;
    }

    public static ArrayList<String> retornaArray(){
        final ArrayList<String> question = new ArrayList();

        question.add("A capital da ingalterra é londres? 1");
        question.add("A america do sul tem grandes placas tectonicas? 2 ");
        question.add("Moscou foi atingida por uma bomba nuclear ? 3");
        question.add("A Floresta amazonica fica em 4 paises ? 4 ");

        return question;
    }







}

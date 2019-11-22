package com.example.quizgeografia;

import java.util.ArrayList;

public class Pergunta {

    public static int contador = 0;

    public static int retornaTamanhoArray() {
        return 4;
    }

    public static ArrayList<String> retornaArray() {
        final ArrayList<String> question = new ArrayList();

        question.add("1 - É verdade que a capital da inglaterra é londres?");
        question.add("2 - É verdade que a america do sul tem grandes placas tectónicas?");
        question.add("3 - É verdade que Moscou foi atingida por uma bomba nuclear nos anos 60 ?");
        question.add("4 - É verdade que a Floresta amazonica é presente em 9 paises ?");
        question.add("5 - É verdade que o brasil fica no lado oriental do globo ?");

        return question;
    }


}

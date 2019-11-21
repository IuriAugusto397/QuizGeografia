package com.example.quizgeografia;

public class Dados {

    public static boolean [][] matriz = new boolean[2][5];

    public static void populaMatriz(){
        matriz[0][0] = true;
        matriz[0][1] = true;
        matriz[0][2] = false;
        matriz[0][3] = true;
        matriz[0][4] = false;
    }

    public static void insereResposta(int indice, boolean valor){
        matriz [1][indice] = valor;
    }

    public static String contaAcertos(){
     int acertos = 0;
     for(int i = 0; i <= 4; i++){
         if(matriz[1][i] == matriz[0][i]){
             acertos++;
         }
     }

     return Integer.toString(acertos);
    }

}

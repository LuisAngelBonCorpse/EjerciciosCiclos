package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	   EJERCICIO 1
	    Solicitar un número al usuario y hacer la serie de Fibonacci hasta ese numero

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números de la serie de Fibonacci que deses ver.");
        int num = sc.nextInt();
        int salida = 0;
        int salidaAnterior1 = 0;
        int salidaAnterior2 = 0;


        if (num > 0){
            System.out.println("INICIO");
            System.out.println(salida);
        } else  {
            System.out.println("No es un número valido para la serie de Fibonacci");
        }

        for (int i = 0; i < num-1; i++){

            if ( i == 0) {
                salida = 1;
                salidaAnterior1 = salida;
                System.out.println(salida);
            }else {
                salida = salidaAnterior1 + salidaAnterior2;

                System.out.println(salida);

                salidaAnterior2 = salidaAnterior1;

                salidaAnterior1 = salida;
            }
        }
        System.out.println("FIN");

        /*
            EJERCICIO 2
            Solicitar un número al usuario y darle el factorial al mismo, con While.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número del que quieras ver el factorial.");
        int num = sc.nextInt();
        int i = 0;
        int salida = 1;

        while (i < num){
            i++;
            salida = i * salida;
        }
        System.out.println(salida);
    }
}

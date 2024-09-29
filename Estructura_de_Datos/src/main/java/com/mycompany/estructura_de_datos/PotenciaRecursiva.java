package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class PotenciaRecursiva {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Solicitar al usuario que ingrese la base
        System.out.print("Ingrese la base: ");
        int base = scaner.nextInt();

        //Solicitar al usuario que ingrese el exponente
        System.out.print("Ingrese el Exponente: ");
        int exponente = scaner.nextInt();

        //Calcular la potencia utilizando una funcion recursiva
        int resultado = calcularPotencia(base, exponente);

        //MOstrar el resultado
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        scaner.close();
    }

    //Funcion recursiva para calcular la potencia
    public static int calcularPotencia(int base, int exponente) {
        //Caso base: cualquier numero elevado a la potencia 0 es 1
        if (exponente == 0) {
            return 1;
        }
        //Caso recursivo: base *base^(exponente-1)
        return base * calcularPotencia(base, exponente - 1);
    }
}

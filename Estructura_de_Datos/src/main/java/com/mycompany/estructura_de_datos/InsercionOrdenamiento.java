package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class InsercionOrdenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // Solicitar al usuario que ingrese diez datos
        System.out.println("Ingrese diez números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("\nArreglo original:");
        imprimirArreglo(arreglo);

        ordenarPorInsercion(arreglo);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);

        scanner.close();
    }
    
    public static void ordenarPorInsercion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 1; i < n; ++i) {
            int key = arreglo[i];
            int j = i - 1;

            // Mover los elementos del arreglo[0..i-1], que son mayores que key,
            // a una posición adelante de su posición actual
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

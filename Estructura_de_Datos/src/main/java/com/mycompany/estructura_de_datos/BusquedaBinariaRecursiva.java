package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class BusquedaBinariaRecursiva {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Definir el arreglo
        int[] arreglo = new int[tamano];

        // Solicitar al usuario que ingrese los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Ordenar el arreglo usando el método de burbuja
        ordenarBurbuja(arreglo);

        // Mostrar el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);

        // Solicitar al usuario que ingrese el número a buscar
        System.out.print("\nIngrese el número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        // Llamar a la función de búsqueda binaria recursiva
        int resultado = busquedaBinaria(arreglo, 0, arreglo.length - 1, numeroBuscado);

        // Mostrar el resultado
        if (resultado == -1) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        } else {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice: " + resultado);
        }

        scanner.close();
    }
    
    // Función recursiva de búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int bajo, int alto, int objetivo) {
        if (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;

            // Si el elemento está presente en el medio
            if (arreglo[medio] == objetivo) {
                return medio;
            }

            // Si el elemento es menor que el medio, entonces solo puede estar en la mitad izquierda
            if (arreglo[medio] > objetivo) {
                return busquedaBinaria(arreglo, bajo, medio - 1, objetivo);
            }

            // Si el elemento es mayor que el medio, entonces solo puede estar en la mitad derecha
            return busquedaBinaria(arreglo, medio + 1, alto, objetivo);
        }

        // Si el elemento no está presente en el arreglo
        return -1;
    }

    // Método de ordenamiento por burbuja
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


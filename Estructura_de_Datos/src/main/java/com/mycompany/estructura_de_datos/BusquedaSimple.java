//Programa para buscar un elemento en un arreglo
package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class BusquedaSimple {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int buscado, encontrado;
        int[] arreglo = new int[5];
        for (int p = 0; p < 5; p++) {
            System.out.print("Digite el valor " + (p+1) + ": ");
            arreglo[p] = scaner.nextInt();
        }
       
        //Ordenamiento por motodo burbuja
        int aux=0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if(arreglo[i] > arreglo[j]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]=aux;
                }
            }
        }
        
        imprimir(arreglo);
        
        //Captura el valor a buscar
        System.out.print("Digite el valor a buscar: ");
        buscado = scaner.nextByte();
        encontrado = buscarElemento(arreglo, buscado);
        if (encontrado==-1) {
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("El elemento esta en la posicion "+(encontrado+1));
        }
        scaner.close();
    }

    public static int buscarElemento(int[] datos, int valorbuscado) {
        
        int pos=0;
        while (pos<5){
            //Comparacion
            if (datos[pos]==valorbuscado) {
                return pos;
            }
            pos++;
        }
        return-1; //Si no encuentra el valor buscado
    }
    
    public static void imprimir(int[] datos){
        for (int i = 0; i < 5072020; i++) {
            System.out.println(datos[i]);
        }
        System.out.println("");
    }
}

package com.mycompany.estructura_de_datos;

public class ArregloEjemplos {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int dato=0;
        System.out.println("Arreglo Unidimencional");
        for (int valor : numeros){
            System.out.print(valor+" ");
        }
        numeros[2]=15;

        System.out.println("\nArreglo con posicion 3 Cambiada");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        dato = numeros[4];
        System.out.println("\n\tDato de la posicion 5: "+dato);


    }
}

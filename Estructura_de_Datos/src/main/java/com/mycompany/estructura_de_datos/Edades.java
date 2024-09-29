package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        //Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in); //CApturar entradas al sistema

        //Declarar un arreglo para almacenar las edades
        int [] edades = new int[10];

        //Capturar las edades de 10 personas
        for (int p = 0; p < edades.length; p++) {
            System.out.print("Ingrese la edad de la persona "+(p+1)+": ");
            edades[p] = scanner.nextInt();
        }

        //Contar el numero de mayores y menores de edad
        int mayores = 0;
        int menores = 0;

        for (int edad : edades){ //Simular al foreach
            if (edad >=18){
                mayores++;
            }else{
                menores++;
            }
        }

        //Calcular los porcentajes
        double porcentajeMayores = ((mayores * 100) / edades.length);
        double porcentajeMenores = ((menores * 100) / edades.length);

        //Mostrar los resultado
        System.out.println("Porcentaje de Mayores de Edad: "+porcentajeMayores+"%");
        System.out.println("Porcentaje de Menores de Edad: "+porcentajeMenores+"%");

        //Cerrar la Variable Escaner
        scanner.close();
    }
}

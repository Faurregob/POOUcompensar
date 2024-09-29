/*
Elaborar un programa en java que lea desde teclado la informacion sobre
altura, edad y sexo (F/M) de los participantes de un concurso. La lectura
finaliza cuando se lee un valor de altura negativo.

Luego que calcule:

a. Promedio de altura de las mujeres.
b. Promedio de altura de los varones.
c. Promedio de edad de los participantes.
 */
package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class PromedioSinClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asumimos un tamaño maximo de participantes
        final int MAX_PARTICIPANTES = 100;
        double[] alturas = new double[MAX_PARTICIPANTES];
        int[] edades = new int[MAX_PARTICIPANTES];
        char[] sexos = new char[MAX_PARTICIPANTES];

        int contador = 0;

        //Ler informacion de los participantes
        while (contador < MAX_PARTICIPANTES) {
            System.out.print("Ingrese la altura del partipante (Negativo para terminar): ");
            double altura = scanner.nextDouble();
            if (altura < 0) {
                break;
            }

            System.out.print("Ingrese la edad del participante: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese el sexo del participante (F/M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            alturas[contador] = altura;
            edades[contador] = edad;
            sexos[contador] = sexo;
            contador++;
        }
        
        //Calcular los promedios
        double sumaAlturaMujeres = 0;
        int contadorMujeres = 0;
        double sumaAlturaVarones = 0;
        int contadorVarones = 0;
        int sumaEdad = 0;
        
        for (int i = 0; i < contador; i++) {
            sumaEdad += edades[i];
            if (sexos[i] == 'F') {
                sumaAlturaMujeres += alturas[i];
                contadorMujeres++;
            }else if(sexos[i] == 'M'){
                sumaAlturaVarones += alturas[i];
                contadorVarones++;
            }
        }
        
        double promedioAlturaMujeres = (contadorMujeres > 0) ? (sumaAlturaMujeres / contadorMujeres) : 0;
        double promedioAlturaVarones = (contadorVarones > 0) ? (sumaAlturaVarones / contadorVarones) : 0;
        double promedioEdad = (contador > 0) ? (sumaEdad / (double) contador) : 0;
        
        //Mostrar los resultados
        System.out.printf("Promedio de altura de las mujeres: %.2f\n", promedioAlturaMujeres);
        System.out.printf("Promedio de altura de los Varones: %.2f\n", promedioAlturaVarones);
        System.out.printf("Promedio de edad de los participantes: %.2f\n",promedioEdad);
                
        //Cerrar el escaner
        scanner.close();
    }
}

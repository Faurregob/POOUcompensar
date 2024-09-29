/*
Gestion de Compras de Clientes

Escribe un programa en java que:

Solicite al usuario ingresar el numero de clientes.
Para cada cliente, solicite el nombre, el articulo a comprar, el precio del articulo y la cantidad a comprar
calcule el total de cada compra
Muestre un resumen de las compras de todos los clientes.
 */
package com.mycompany.estructura_de_datos;

import java.util.Scanner;

public class GestiondeCompraClientes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Paso 1: Ingresar el numero de clientes
        System.out.print("Ingrese el numero de clientes: ");
        int numClientes = scanner.nextInt();
        scanner.nextLine();

        //Variables de Entrada
        //Crear arreglos para almacenar los datos de los clientes
        String[] Nombres = new String[numClientes];
        String[] Articulos = new String[numClientes];
        double[] Precios = new double[numClientes];
        int[] Cantidades = new int[numClientes];
        double[] Totales = new double[numClientes];

        //Paso 2: Capturar datos para cada cliente
        for (int i = 0; i < numClientes; i++) {
            //Ingresa el consecutivo del clientes
            System.out.println("Cliente " + (i + 1) + ": ");
            //Ingresa el nombre del cliente
            System.out.print("Ingrese el nombre del cliente: ");
            Nombres[i] = scanner.nextLine();
            //Ingresa  el articulo que quiere comprar
            System.out.print("Ingrese el articulo a comprar: ");
            Articulos[i] = scanner.nextLine();
            //Ingresa el precio del articulo
            System.out.print("Ingrese el precio del Articulo: ");
            Precios[i] = scanner.nextDouble();
            //Ingresa la catidad de los articulo a comprar
            System.out.print("Ingrese la cantidad a comprar: ");
            Cantidades[i] = scanner.nextInt();
            scanner.nextLine(); //Consumir la nueva linea

            //Paso 3: Calcular el total de cada compra
            Totales[i] = Precios[i] * Cantidades[i];
        }

        //Paso 4: Mostrar el resumen de las compras
        System.out.println("\nResumen de las Compras");

        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente: " + Nombres[i]);
            System.out.println("Articulo: " + Articulos[i]);
            System.out.println("Precio: " + Precios[i]);
            System.out.println("Cantidad: " + Cantidades[i]);
            System.out.println("Total: " + Totales[i]);
            System.out.println();
        }
        scanner.close();
    }
}

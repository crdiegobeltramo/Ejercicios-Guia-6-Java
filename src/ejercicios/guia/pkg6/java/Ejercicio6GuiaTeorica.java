/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg6.java;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio6GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) {

            System.out.println("Al menos uno de los numeros ingresados es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
    }
}

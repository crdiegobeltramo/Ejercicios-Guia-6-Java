/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg6.java.EjerciciosPracticaGuia6;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio8PracticaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String palabra;
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        palabra=leer.nextLine();
        if (palabra.length()==8) {
            System.out.println("CORRECTO");
        }
        else
            System.out.println("INCORRECTO");
    }
    
}

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
public class Ejercicio5PracticaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un número");
        num= leer.nextInt();
        System.out.println("El doble de " + num + " es igual a " + num*2);
        System.out.println("El  triple de " + num + " es igual a " + num*3);
        System.out.println(Math.sqrt(num));
        
        
    }
    
}

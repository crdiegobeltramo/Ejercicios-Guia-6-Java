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
public class Ejercicio4PracticaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
               float grados, Farenheit;
               System.out.println("Ingrese una cantidad de grados centigrados para conocer su equivalente en grados Farenheit");
               grados = leer.nextFloat();
               Farenheit = 32 + (9*grados/5);
               System.out.println(grados + " grados centígrados equivalen a "+ Farenheit + " grados Farenheit");      
    }
    
}


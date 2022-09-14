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
public class Ejercicio6PracticaCondicionalesEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
       
        System.out.println("Ingrese un número");
         num = leer.nextInt();
         if (num%2 == 0) {
             System.out.println("El número ingresado es par");
         }

             else {
                     System.out.println("El numero ingresado es impar");
                     }    
        
        
    }
    
}

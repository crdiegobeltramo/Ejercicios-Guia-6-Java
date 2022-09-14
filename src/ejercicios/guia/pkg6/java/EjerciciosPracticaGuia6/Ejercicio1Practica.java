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
public class Ejercicio1Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un nùmero entero");
        int num1, num2, suma;
        num1= leer.nextInt();
        System.out.println("Ingrese otro nùmero entero");
        num2= leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma entre "+ num1+ "y"+ num2 + "es igual a "+ suma );
    }
    
}

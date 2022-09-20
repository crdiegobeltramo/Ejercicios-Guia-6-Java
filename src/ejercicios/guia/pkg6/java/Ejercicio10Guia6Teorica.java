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
public class Ejercicio10Guia6Teorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Ejercicio 10 guia 6
        
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor*/
        
       Scanner leer = new Scanner(System.in);
        
        int num,num1,num2,num3,num4;
        
        
        
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        
        System.out.print(num1);
        
        for (int i = 0; i < num1; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num2);
        
        for (int i = 0; i < num2; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num3);
        
        for (int i = 0; i < num3; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num4);
        
        for (int i = 0; i < num4; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
       
      }
    
}


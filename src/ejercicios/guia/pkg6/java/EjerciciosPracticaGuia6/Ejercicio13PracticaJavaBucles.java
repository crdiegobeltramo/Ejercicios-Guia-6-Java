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
public class Ejercicio13PracticaJavaBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
       int cuad;
		int i;
		int j;
		System.out.println("ingrese numero entero");
		cuad= leer.nextInt();
		for (i=1;i<=cuad;i++) {
			for (j=1;j<=cuad;j++) {
				if ((i==1 || i==cuad || j==1 || j==cuad)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}



        
    }
    


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
public class Ejercicio10PracticaJavaBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int limite, num,suma;
        suma=0;
        System.out.println("Ingrese un numero limite");
        limite= leer.nextInt();
        if (limite<suma) {
            System.out.println("El numero ingresado es negativo");
        }
        else    {
            while(suma<=limite){
                System.out.println("Ingrese otro numero");
                num = leer.nextInt();
                suma=suma+num;
                System.out.println("El valor sumado es "+ suma);
            } 
        }
    }
    
}

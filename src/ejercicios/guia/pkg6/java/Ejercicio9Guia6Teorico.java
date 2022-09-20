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
public class Ejercicio9Guia6Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
        int num, cont, suma;
        boolean bandera = true;
        suma = 0;
        cont = 0;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num == 0) {
                bandera = false;
                break;
            } else if (num > 0) {
                suma = suma + num;
            }
            cont++;
        } while (cont < 5);
        
        if (bandera == false){
            
            System.out.println("Se capturo el 0");}
        System.out.println("La suma de todos los valores ingresados es " + suma);
    }
    
}

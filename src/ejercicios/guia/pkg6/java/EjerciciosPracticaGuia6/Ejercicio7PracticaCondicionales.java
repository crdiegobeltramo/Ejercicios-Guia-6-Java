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
public class Ejercicio7PracticaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 7 Guia 6 condicionales
        
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.*/
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
              
        System.out.println("Ingrese una frase");
        
        frase = leer.nextLine();
        
        if(frase.equals("Eureka")){
     
                System.out.println("La frase es correcta");
        }
        else{
                
                System.out.println("no coincide con la frase");}
        
    
        
        
    
        
    


    
    }
    
}

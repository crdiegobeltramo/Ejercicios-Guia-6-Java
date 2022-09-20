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
public class Ejercicio13Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del equipo");
        
        int tam = leer.nextInt();
        
        String[] Equipo = new String [tam];
        
        leer.nextLine();
                
        for (int i = 0; i < tam; i++) {
            
            System.out.println("Ingrese los nombres de los jugadores");
            
            Equipo[i] = leer.nextLine();
            
            
            
        }
        
            System.out.println("");
            System.out.println("");
        
         for (int i = 0; i < tam; i++) {
            
            System.out.println(Equipo[i]);
            //arraytoString(equipo)
                   
            
        }
       
        
        
        
    }
    
}
    
    


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
public class Ejercicio16PracticaJavaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
*/
 /*  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y
        le pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
        encuentra el numero y si se encuentra repetido*/
        
        Scanner leer = new Scanner(System.in);
        
        int n, buscado, contador;
        
        contador=0;
        
        int[] numeros, posiciones;
        
        System.out.println("Ingrese el tamaño del vector");
        
        n = leer.nextInt();
        
        numeros = new int [n];
        posiciones = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            numeros[i]= (int) (Math.random()* 9 + 1);
              
            System.out.println(numeros[i]);
                                  
        }
        
        System.out.println("Ingrese el valor buscado");
        
        buscado=leer.nextInt();
        
        
        
        for (int i = 0; i < n; i++) {
            
            if (buscado==numeros[i]) {
                
                
                posiciones[contador]=i;  
                contador++;
                          
                
               // System.out.println(contador + " " + posiciones[i]);
                
            }
            
            
        }
        
        System.out.println("El valor buscado se encontro " + contador + " veces");
         System.out.println(" ");
         
        System.out.print("en las posiciones ");
        for (int i = 0; i < contador; i++) {
            
            System.out.print(posiciones[i] + ", ");
            
        }
        
        
        
        
    }
    
}
     //version2
      /*  Scanner leer = new Scanner(System.in);
        int N, i=0, x=0;
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        int[] numeros = new int[N];

        for (i=0; i < N; i++){
            numeros[i] = (int) Math.floor(Math.random()*(1-99+1)+99);
        }
        muestra_numeros(numeros, N);
        System.out.println("Ingrese el valor de N: ");
        x = leer.nextInt();
        busca_numero(numeros, x, N);
    

    private static void busca_numero(int[] numeros, int x , int N) {
        int i = 0, encontro=0, pos=0;
        for (i=0; i <N; i++){
            if (numeros[i] == x ){
                if (encontro == 0) {
                    pos= i;
                }
                encontro++ ;
            }
        }
        
        if (encontro > 0) {
            System.out.println("El numero se encontró en la posición " + pos);
            System.out.println("El numero está " + encontro + " veces en el vector");
        }
    }

    private static void muestra_numeros(int[] numeros , int N) {
        int i=0;
        for (i=0; i <N; i++){
            System.out.println("numero: " + numeros[i]);
        }
    }

}*/
      
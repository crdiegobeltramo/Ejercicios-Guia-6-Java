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
public class Ejercicio12PrácticaJava {

    /**
     * @param args the command line arguments
     */
   
     
    /**
     * @param args the command line arguments
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals(). */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String frase;
       int correcto,incorrecto;
       correcto= 0;
       incorrecto= 0;
       frase= "";
        do {  
            System.out.println("Ingrese una cadena de 5");
            frase = leer.next();
            
            if (frase.length()==5 && frase.substring(0,1).equalsIgnoreCase("x") && frase.substring(4,5).equalsIgnoreCase("o")){
               correcto++;
           
                
            }
            else {
                if (!frase.equals("&&&&&")){
                incorrecto++;
            }
            }
                
        }while (!frase.equals("&&&&&")); //(!"&&&&&".equals(frase));
                
            System.out.println("Se ingresaron: " + correcto + " cadenas correctas ");   
            System.out.println("Se ingresaron: " + incorrecto + " cadenas incorrectas ");
  
      
    }
    
}

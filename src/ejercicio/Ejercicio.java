/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        
        int lista[]= new int[100];
        
        int i,lim,suma=0,prom = 0;
        
        System.out.println("ingrese el NUMERO de estudiantes");
        lim=lector.nextInt();
        
        
       
          
          
      
        
        
    
        
        for(i=0;i<lim;i++){
            System.out.print(" NOTA ESTUDIANTE["+(i+1)+"]=");
            
            lista[i]=lector.nextInt();
            
        }
        
        for(i=0;i<lim;i++){
            
            System.out.println(lista[i]+",  ");
        }
            System.out.println("la suma es ");
        for(i=0;i<lim;i++){
            
                       suma=lista[i]+suma;
                       
                       prom=suma/lim;
                       
                       

        }
       
        System.out.println(suma);
        
         System.out.println("el promedio es ");
        System.out.println(prom);
        // TODO code application logic here
    }
    
}

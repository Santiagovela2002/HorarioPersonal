/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariopersonal;

import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Horariopersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);

        System.out.println("Coloca una hora y te recordaré tu actividad:");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora >= 6 && hora < 7){
                System.out.println("Levantarse y darle de comer a mi perrito");
            } else if(hora >= 7 && hora < 8){
                System.out.println("Acomodar la casa ");
            } else if(hora >= 8 && hora < 9){
                System.out.println("Desayunar");
            } else if(hora >= 9 && hora < 11){
                System.out.println("Entrar a clase de Fisica");
            } else if(hora >= 11 && hora < 13){
                System.out.println("Entrar a clases de Inglés");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Entrar a clases de Organización computacional");
            } else if(hora >= 15 && hora < 16){
                System.out.println("Almorzar");
            } else if(hora >= 16 && hora <18){
                System.out.println("Ir a entrenar al gimnsaio");
            } else if(hora >= 18 && hora < 19){
                System.out.println("Bañarse");
            } else if(hora >= 19 && hora < 21){
                System.out.println("Entrar a clase de Programación");
             } else if(hora >= 21 && hora < 22){
                System.out.println("Cenar");
            } else if(hora >= 22 && hora < 24){
                System.out.println("Jugar, distraerme y ver vídeos");
            } else if(hora >= 24 && hora < 5){
                System.out.println("Dormir");    
            }
        } else {
            System.out.println("No es una hora válida");
    }
}
    
}
    
    

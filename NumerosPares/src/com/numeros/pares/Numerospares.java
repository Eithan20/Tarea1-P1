/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeros.pares;

/**
 *
 * @author eitha
 */
//4. Realizar un programa que imprima los números pares del 2 al 100 utilizando ciclos "while".
public class Numerospares {
    public static void main(String[] args) {
        
        //Se inicia la variable en 2.
        int i = 2;
        
            //Se repite mientras i sea menor o igual a 100.
            while(i <= 100){
                
                //Se imprime el número actual.
                System.out.println(i);
                
                //Incrementa la variable en 2, para que sea par siempre.
                i += 2;
                
            }
        
    }
}

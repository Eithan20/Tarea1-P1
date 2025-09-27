/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeros.impares;

/**
 *
 * @author eitha
 */
//3. Realizar un programa que imprima los números impares del 1 al 100 utilizando ciclos "for".
public class Numerosimpares {
    public static void main(String[] args) {
        
        //Ciclo for que recorre los numeros del 1 a l 100.
        for (int i = 1 ;i <= 100; i++){
            
            //verifica si el numero es impar usando el operador de modulo (%)
            if (i % 2 != 0) {
                
                //Si el numero es impar, se imprimirá por consola.
                 System.out.println(i);
            }
           
        }
    }
}
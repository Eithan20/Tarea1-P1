/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tabla.multiplicar;

/**
 *
 * @author eitha
 */

//6. Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.

public class Tablademultiplicar {
    public static void main(String[] args) {
   
        //Inicializamos la variable numero de la tabla que queremos multiplicar.
        int numero = 7;
        
        //Mensaje de inicio.
        System.out.println("Tabla del " + numero + " : ");
        
        
        //Bucle for que recorre los numeros del 1 al 10.
        for(int i = 1; i <= 10; i++){
            
            //Imprime cada multiplicación.
            System.out.println(numero + " x " + i + " : " + (numero * i));
            
        }
    
    }
}

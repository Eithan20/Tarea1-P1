/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeros.hasta50;

/**
 *
 * @author eitha
 */

// 5. Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
public class Numeroshastael50 {
    public static void main(String[] args) {
        
        //inicializamos las variables.
        int i = 1; //Contador de los numeros del 1 hasta el 50.
        int sum = 0; //Variable acumuladora de la sumatoria.
        
        //Ciclo do-while, se ejecutará al menos una vez antes de que se verifique la condición.
        do {
            //Se acumula el valor de i en la sumatoria.
            sum += i;
            
            //Se incrementa el contador.
            i++;
        } while (i <= 50); // Condición, esta se repite mientras 1 sea menor o igual a 50.
        
        //se imprime el resultado de la sumatoria.
        System.out.println("La sumatoria de los numeros es: " + sum);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeromayor.menor;

/**
 *
 * @author eitha
 */

// 7. Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
public class numeromayor_menor {
    public static void main(String[] args) {
    
        
     //Inicializamos las variables.
        int num1 = 17;
        int num2 = 23;
      
        //Comparamos los dos numeros para determinar cual es el mayor.
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
            System.out.println("El numero menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);
        } else {
            System.out.println("Los numeros son iguales.");
        }
     
    }
}

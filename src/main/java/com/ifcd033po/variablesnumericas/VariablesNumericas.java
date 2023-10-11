/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ifcd033po.variablesnumericas;

/**
 *
 * @author Ángel Redondo
 */

import java.util.*; 

public class VariablesNumericas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        input.useDelimiter("\n");
        input.useLocale(Locale.US);
        
        int primerNumero = 0, segundoNumero = 0;
        
        System.out.println("Vamos a comparar dos numeros ");
        System.out.println("Introduce el primer numero ");
        primerNumero = input.nextInt();
        
        System.out.println("Introduce el segundo numero ");
        segundoNumero = input.nextInt();
        
        if( primerNumero > segundoNumero) 
            System.out.println(primerNumero + " > " + segundoNumero);
        
        if( primerNumero < segundoNumero) 
            System.out.println(primerNumero + " < " + segundoNumero);
        
        if( primerNumero == segundoNumero) 
            System.out.println(primerNumero + " = " + segundoNumero);
        
        
    }
}

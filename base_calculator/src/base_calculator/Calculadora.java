/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_calculator;

import base_calculator.servicios.Operaciones;

/**
 *
 * @author 54223
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operaciones o1 = new Operaciones(); 

        System.out.println(o1.suma(4, 5));
        System.out.println(o1.resta(4, 5));
        System.out.println(o1.division(4, 5));
        System.out.println(o1.multiplicacion(4, 5));

    }

}

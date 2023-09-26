/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_calculator;

/**
 *
 * @author 54223
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        
    }
    
    public int suma(int a, int b) {
    return a+b;
    }
    
    public int resta (int a, int b) {
    return b-a;
    }
    
    public int multiplicacion(int a,int b){
        return a*b;
    }
    
    public double division(int a, int b){
        return a/b;
    }
    
    public double powElevado(int a, int b){
        return Math.pow(a, b);
    }

    
}

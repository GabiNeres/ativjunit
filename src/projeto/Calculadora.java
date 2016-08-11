package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe que subtrai e multiplica números
 * @author Andresa e Gabriela
 * @version 1.00
 */
public class Calculadora {
    /** Método para imprimir os números das operações
     * @param x 
     * @param y
     */
    
    public void numeros(int x, int y){
        System.out.println("Num1: "+x);
        System.out.println("Num2: "+y);
    }
    
    /** Método para subtração dos números
     * @param x 
     * @param y
     * @return int - retorna a subtração dos números
     */
    public int subtracao(int x, int y){
        int subtracao = x-y;
        return subtracao;
    }
    
    /** Método para multiplicação dos números
     * @param x 
     * @param y
     * @return double - retorna a multiplicação dos números
     */
    public double multiplicacao(int x, int y){
        double mult = x*y;
        return mult;
    }

}

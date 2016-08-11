package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe realiza soma de dois números e diz se um número é par
 * @author Andresa e Gabriela
 * @version 1.00
 */
public class Soma {
    /** Método para imprimir os números para a soma
     * @param x 
     * @param y
     */
    
    public void numeros(int x, int y){
        System.out.println("Num1: "+x);
        System.out.println("Num2: "+y);
    }
    
    /** Método para somar os números
     * @param x 
     * @param y
     * @return int - retorna a soma dos números
     */
    public int soma(int x, int y){
        int soma = x+y;
        return soma;
    }
    
    /** Método para verificar se x é par
     * @param x 
     * @return String - retorna String se o x for par
     */
    public String num(double x){
        String numero = null;
        if(x%2==0){
            numero = "Par";
        }
        return numero;
    }
}

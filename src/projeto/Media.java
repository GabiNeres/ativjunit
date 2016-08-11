package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe que calcula média aritmética de dois números
 * @author Andresa e Gabriela
 * @version 1.00
 */
public class Media {
    /** Método para imprimir os números para a média
     * @param x 
     * @param y
     */
    
    public void numeros(int x, int y){
        System.out.println("Num1: "+x);
        System.out.println("Num2: "+y);
    }
    
    /** Método que retorna a média dos dois números
     * @param x 
     * @param y
     * @return double - média aritmética dos números 
     */
    public double media(int x, int y){
        int soma = x+y;
        int media = soma/2;
        return media;
    }
    
    /** Método que retorna mensagem se x < y
     * @param x 
     * @param y
     * @return String - retorna String se x < y
     */
    public String num(int x, int y){
        String numero = null;
        if(x<y){
            numero = "X < Y";
        }
        return numero;
    }
}

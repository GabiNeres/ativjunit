package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para controle de vendas
 * @author Andresa e Gabriela
 * @version 1.00
 */
public class Vendas {
    
    /** Método para imprimir os preços das vendas
     * @param x 
     * @param y
     */
    public void venda(int x, int y){
        System.out.println("venda1: "+x);
        System.out.println("venda2: "+y);
    }

    /** Método para informar saldo
     * @return int - retorna o saldo
     */
    public int saldo(){
        int saldo = 3000;
        return saldo;
    }
    /** Método para desconto da venda
     * @param x 
     * @param y
     * @return float - retorna venda com desconto
     */
    public double desconto(int x, int y){
        double desc;
        int soma = x+y;
        desc = soma*0.1;
        return desc;
    }
}

package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe que informa características de uma pessoa
 * @author Andresa e Gabriela
 * @version 1.00
 */
public class Pessoa {
    
    /** Método para imprimir uma mensagem*/
    public void fala(){
        System.out.println("Oi");
    }
    
    /** Método para retorno da idade da pessoa
     * @param idade
     * @return int - Idade se a pessoa for maior de 18 anos*/
    public int idade(int idade){
        int idad=0;
        if(idade>18){
            idad = idade;
        }
        return idad;
    }
    
    /** Método para retorno do nome da pessoa
     * @param nome
     * @return String - Nome da pessoa*/
    public String nome(String nome){
        return nome;
    }
}

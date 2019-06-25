/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

public class Teste {
    
    public static void main(String[] args) {
        
        try {
            Pessoa  P;
            P = new Pessoa("Rafael", -15);
        } catch (IdadeInvalidaException ex) {
            System.out.println(ex.getMessage());
        }
       
        
    }
    
}

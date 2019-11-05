/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto23contacorrente;

/**
 *
 * @author Beatriz_2
 */
public class Projeto23ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Pessoa pess1 = new Pessoa("Beatriz", "Rattighieri", "1234567891011 ");
        //Autor aut2 = new Autor();
        
        Conta cont1 = new Conta(123456, 100, 2000, 200, 1000);
        
        Endereco end1 = new Endereco ("nicolau zarvos", "750", "Lins", "SP", "123456789");
        
        
        pess1.setConta(cont1);
        cont1.setDono(pess1);
        pess1.setReside(end1);
        
         
        System.out.println("Pessoa: " + cont1.getDono().getNome());
        System.out.println("Conta " + pess1.getConta().getNumero());
        System.out.println("Endereço: " + pess1.getReside().getRua());
        System.out.println("Sald Inicial: "+ pess1.getConta().getSaldo()); 
        System.out.println("Valor de deposito " + pess1.getConta().getValordeDeposito());
        System.out.println("Saldo " + pess1.getConta().depositar());
        System.out.println("Valor de Saque " + pess1.getConta().getValordeSaque());
         System.out.println("Saldo " + pess1.getConta().sacar());
        
        
        
    }
    
}

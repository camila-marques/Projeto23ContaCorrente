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
public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    protected Conta conta;
    protected Endereco reside;
    public Pessoa() {
    
    }
    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Endereco getReside() {
        return reside;
    }

    public void setReside(Endereco reside) {
        this.reside = reside;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

public void validarCPF(){
if((this.CPF != null) && (CPF.equals(this.getCPF())))
 System.out.println("CPF: " + this.getCPF() + "Validado com sucesso");
else 
    System.out.println("CPF : " + this.getCPF() + "Invalido.");
        
}

}
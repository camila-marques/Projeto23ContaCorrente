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
public class Conta {
    protected int numero;
    protected double saldo;
    protected double limite;
    protected double ValordeSaque;
    protected double ValordeDeposito;
    private Pessoa Dono;
    public Conta(){
    
    }

    public Conta(int numero, double saldo, double limite, double ValordeSaque, double ValordeDeposito) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.ValordeSaque = ValordeSaque;
        this.ValordeDeposito = ValordeDeposito;
    }

    public double getValordeDeposito() {
        return ValordeDeposito;
    }

    public void setValordeDeposito(double ValordeDeposito) {
        this.ValordeDeposito = ValordeDeposito;
    }

    public double getValordeSaque() {
        return ValordeSaque;
    }

    public void setValordeSaque(double ValordeSaque) {
        this.ValordeSaque = ValordeSaque;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getDono() {
        return Dono;
    }

    public void setDono(Pessoa Dono) {
        this.Dono = Dono;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double sacar (){
    return (this.saldo - this.ValordeSaque);
    }
    public double depositar(){
    return (this.saldo = this.saldo + this.ValordeDeposito);
    
    }
    
    public void tranferir (){
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Lenovo
 */
public class CuentaCorriente {
    
    private int NumeroCuenta;
    private int Saldo = 0;
    

    public CuentaCorriente() {
        
    }
    
    public CuentaCorriente(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    public int ConsultarSaldo(){
        return Saldo;
    }
    
    public int Deposito(int MontoDepositado){
        Saldo = Saldo + MontoDepositado;
        return Saldo;
    }
    
    public int Giro(int MontoGiro){
        Saldo = Saldo - MontoGiro;
        return Saldo;
    }
    
}

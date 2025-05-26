/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class CuentaCorriente {
    
    private int NumeroCuenta;
    private int Saldo = 0;
    
    public CuentaCorriente() {
        this.NumeroCuenta = GenerarCuentaAleatorio();
    }
    
    private int GenerarCuentaAleatorio(){
        Random random = new Random();
        return 100_000_000 + random.nextInt(900_000_000);
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    public boolean Deposito(int MontoDepositado){
        if (MontoDepositado <= 0) {
            System.out.println("Error: No se permite el ingreso de montos menores o iguales a cero");
            return false;
        }
        
        this.Saldo += MontoDepositado;
        System.out.println("Deposito realizado exitosamente");
        System.out.println("Su saldo actual es de: " + this.Saldo + " pesos.");
        return true;
    }

    public boolean giro(int MontoGiro){
        if (MontoGiro <= 0){
            System.out.println("Error: Nose permite el ingreso de montos menores o iguales a cero para girar.");
            return false;
        }
        if (MontoGiro > this.Saldo){
            System.out.println("Error: No se permite realizar giros mayores al saldo de su cuenta.");
            System.out.println("Saldo disponible: " + this.Saldo + "$");
            return false;
        }
        this.Saldo -= MontoGiro;
        System.out.println("Giro realizado de manera exitosa");
        System.out.println("Usted tiene un saldo actual de: " + this.Saldo + "$");
        return true;
    }

    public int ConsultarSaldo(){
        return Saldo;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    
    private int Rut;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Comuna;
    private String DomicilioCalle;
    private int NumeroCalle;
    private int Telefono;

    
    public Cliente (){
        
    }
    
    public Cliente(int Rut, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Comuna, String DomicilioCalle, int NumeroCalle, int Telefono) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Comuna = Comuna;
        this.DomicilioCalle = DomicilioCalle;
        this.NumeroCalle = NumeroCalle;
        this.Telefono = Telefono;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public String getDomicilioCalle() {
        return DomicilioCalle;
    }

    public void setDomicilioCalle(String DomicilioCalle) {
        this.DomicilioCalle = DomicilioCalle;
    }

    public int getNumeroCalle() {
        return NumeroCalle;
    }

    public void setNumeroCalle(int NumeroCalle) {
        this.NumeroCalle = NumeroCalle;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bostonbank;
import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.model.Cliente;
import com.mycompany.model.CuentaCorriente;
import com.mycompany.utils.ValidaEntrada;
import com.mycompany.utils.BuscarCliente;

/**
 *
 * @author Lenovo
 */
public class BostonBank {
    
static Scanner sc = new Scanner(System.in);  
public static ArrayList<Cliente> ListaNuevoCliente = new ArrayList<>();


    public static void main(String[] args) {
        
        
        for(;;){
            
            System.out.println("---------------Bienvenido al Banco Boston---------------");
            System.out.println("");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos de cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            System.out.println("");
            int opcion = ValidaEntrada.EnteroEnRango(sc, "Para comenzar por favor elija una de las opciones del 1 al 6", 1, 6);
            switch (opcion) {
                case 1://Registrar cliente
                       System.out.println("---------------Bienvenido al sistema de registro del Banco Boston---------------");
                       System.out.println("          Por favor ingrese los datos que se le solicitan a continuacion        ");
                       System.out.println("Ingrese su Rut: ");
                       String Rut = sc.nextLine();
                       sc.nextLine();
                       System.out.println("Ingrese su primer nombre: ");
                       String Nombre = sc.nextLine();
                       System.out.println("Ingrese su primer apellido: ");
                       String ApellidoPaterno = sc.nextLine();
                       System.out.println("Ingrese su segundo apellido: ");
                       String ApellidoMaterno = sc.nextLine();
                       System.out.println("Ingrese su comuna: ");
                       String Comuna = sc.nextLine();
                       System.out.println("Ingrese su direccion de domicilio: ");
                       String Domicilio = sc.nextLine();
                       System.out.println("Ingrese su numero de telefono: ");
                       String Telefono = sc.nextLine();
                       
                       CuentaCorriente NuevaCuenta = new CuentaCorriente();
                       Cliente NuevoCliente = new Cliente(Rut,Nombre,ApellidoPaterno,ApellidoMaterno,Comuna,Domicilio,Telefono, NuevaCuenta);
                       ListaNuevoCliente.add(NuevoCliente);
                       
                    break;
                case 2://Ver datos de cliente
                    
                    break;
                case 3://Depositar
                    
                    break;
                case 4://Girar
                    
                    break;
                case 5://Consultar saldo
                    
                    break;
                case 6://Salir
                    
                    break;
            }//final del switch
            
        }//final del bucle principal
    }
}

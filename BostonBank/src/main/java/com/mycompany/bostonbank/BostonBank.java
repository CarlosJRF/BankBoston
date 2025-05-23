/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bostonbank;
import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.model.Cliente;

/**
 *
 * @author Lenovo
 */
public class BostonBank {
    
static Scanner sc = new Scanner(System.in);    

    public static void main(String[] args) {
        
        
        for(;;){
            
            System.out.println("---------------Bienvenido al banco Boston---------------");
            System.out.println("Para comenzar por favor elija una de las siguientes opciones");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos de cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1://Registrar cliente
                    
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

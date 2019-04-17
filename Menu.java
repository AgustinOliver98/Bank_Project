/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluativo_agustin;

/**
 *
 * @author PC
 */
public class Menu {
  
    public void menu(){
        System.out.println("************MENU************\n1.Agregar Persona\n2.Modificaciones\n3.Mostrar Datos\n4.Salir");
        System.out.print("Elije una opcion: ");
    }
    
    public void submenu(){
        System.out.println("***************SubMenu***************\n1.ModificarPersona\n2.Cuentas\n3.Atras");
        System.out.print("Elije una opcion: ");
    }
    
    public void modificar_personas(){
        System.out.println("***************ModificacionPersona***************\n1.Nombre\n2.Apellido\n3.Edad\n4.Fecha de Nacimiento\n5.Casado\n6.Atras");
        System.out.print("Elije una opcion: ");
    }
    public void cuentas(){
        System.out.println("***************Cuentas***************\n1.Crear Cuenta\n2.Modificar Cuentas\n3.Hacer Transaccion\n4.Mostrar Cuentas\n5.Atras");
        System.out.print("Elije una opcion: ");
    }
    
}

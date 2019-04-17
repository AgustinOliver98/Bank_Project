/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluativo_agustin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Persona {
    private String nombre,apellido,fechanac;
    private int edad; 
    private boolean casado; 
    private  ArrayList <Cuenta> cuentas;
    Scanner sc =new Scanner (System.in);
    Fecha fec;
    

    public Persona() {
        System.out.print("Ingrese su nombre: ");
        this.setNombre(sc.next());
        System.out.print("Ingrese su apellido: ");
        this.setApellido(sc.next());
        System.out.print("Ingrese su edad: ");
        this.setEdad(sc.nextInt());
        System.out.println("Eres Casado? ");
        this.setCasado(sc.nextBoolean());
        do{
            System.out.print("Ingrese el dia: ");
            int dia= sc.nextInt();
            System.out.print("Ingrese el mes: ");
            int mes= sc.nextInt();
            System.out.print("Ingrese el anio: ");
            int año= sc.nextInt();
          fec = new Fecha(dia, mes, año);
            
        }while(fec.validarFecha(fec.toString()));
        this.fechanac=fec.toString();
       this.cuentas = new ArrayList<Cuenta>();
    }
    
    public void nuevafecha(){
        do{
            System.out.print("Ingrese el dia: ");
            int dia= sc.nextInt();
            System.out.print("Ingrese el mes: ");
            int mes= sc.nextInt();
            System.out.print("Ingrese el anio: ");
            int año= sc.nextInt();
             fec = new Fecha(dia, mes, año);
            
        }while(fec.validarFecha(fec.toString()));
    }

    public void generarcuentas(){
        Cuenta cuenta= new Cuenta();
        cuenta.crearcuentas();
        cuentas.add(cuenta);
    }
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void modificarcuentas() {
        System.out.println("Que cuenta quiere modificar?");
       for(int i=0;i<cuentas.size();i++){
           System.out.println("Cuenta"+(i+1));
       }
    }

    void transaccionpropia() {
       for(int i=0;i<cuentas.size();i++){
           System.out.println("Cuenta "+(i+1));
       }
       System.out.print("Desde que cuenta quiere enviar: ");
       int cuentarecibe=sc.nextInt()-1;
       System.out.print("A que cuenta quiere recibir: ");
       int cuentadescuenta=sc.nextInt()-1;
       if(cuentas.get(cuentadescuenta).comprobadormonto()){
       int dinero=cuentas.get(cuentarecibe).transaccion();
       cuentas.get(cuentadescuenta).descuenta(dinero);
       }
       else{
           System.out.println("No hay fondos suficientes");
       }
    }

    void transaccionenvia() {
       for(int i=0;i<cuentas.size();i++){
             System.out.println("Cuenta "+(i+1));
       }
        System.out.print("Desde que cuenta quiere enviar?");
        cuentas.get(sc.nextInt()-1).descuenta();
        
    }

    void mostrarcuenta() {
      for(int i=0;i<cuentas.size();i++){
          System.out.println("Cuenta "+i+"\n"+cuentas.get(i).toString());
      }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechanac=" + fechanac + ", edad=" + edad + ", casado=" + casado + ", cuentas=" + cuentas +'}';
    }

    
    
}

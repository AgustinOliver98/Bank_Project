/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluativo_agustin;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Cuenta {

    int monto, numerocuenta;
    String fechadealta,ultimomov;
    Scanner sc = new Scanner(System.in);

    public void crearcuentas() {
        System.out.print("Numero de cuenta: ");
        this.numerocuenta = sc.nextInt();
        System.out.print("Monto: ");
        this.monto = sc.nextInt();
    }
    public void modificarcuenta(){
        System.out.println("Ingresar numero de cuenta:");
        this.setNumerocuenta(sc.nextInt());
        System.out.print("Ingresar monto: ");
        this.setMonto(sc.nextInt());
    }
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int transaccion() {
        System.out.print("Que monto quiere enviar?");
        int recibe = sc.nextInt();
        this.monto=this.monto+recibe;
         return recibe;
    }

    void descuenta(int dinero) {
        this.monto-=dinero;
    }
    
    public boolean comprobadormonto(){
        if(this.monto<=0){
            return false;
        }else{
             return true;
        }
       
    }
    public int descuenta(){
        System.out.print("Cuanto dinero quiere enviar: ");
        int dinero = sc.nextInt();
        this.monto=this.monto-dinero;
        return dinero;
    }

    @Override
    public String toString() {
        return "Numero de Cuenta: "+numerocuenta+"Monto: "+monto;
    }
    
    public void recibir(int monto){
        this.monto+=monto;
}
    
}

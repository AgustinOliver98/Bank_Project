/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluativo_agustin;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author PC
 */
public class Acciones {

    ArrayList<Persona> per = new ArrayList<Persona>();
    Menu men = new Menu();
    int opcion ;
       Scanner sc = new Scanner(System.in);
    // Menu principal
    public void accion_menu() {
        
        men.menu();
        opcion = sc.nextInt();
        accionarprimermenu(opcion);
    }
        
    
    //Elije una opccion del menu principal y acciona
    public void accionarprimermenu(int opcion) {
        switch (opcion) {
            case 1:
                Persona persona = new Persona();
                per.add(persona);
                break;
            case 2:
                men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            case 3:for(int i=0;i<per.size();i++){
                System.out.println(per.get(i).toString());
            }
            break;
            case 4:
                System.exit(0);
                break;
        }
        men.menu();
        opcion = sc.nextInt();
        accionarprimermenu(opcion);
    }
    
    //Acciona el submenu
    public void accionarsubmenu(int opcion) {
        switch (opcion) {
            case 1:
                for (int i = 0; i < per.size(); i++) {
                    System.out.println("Que persona quiere modificar:\n" + (i + 1) + per.get(i).getNombre());
                }
                System.out.print("Elija la persona: ");
                int prs = sc.nextInt();
                men.modificar_personas();
                modificacionespersonas(sc.nextInt(), prs - 1);
                break;
            case 2:
                men.cuentas();
                this.accioncuentas(sc.nextInt());
                break;
            case 3: men.menu();
                    accionarprimermenu(sc.nextInt());
                    break;
        }
         men.submenu();
                this.accionarsubmenu(sc.nextInt());
    }
    
    //Opcion 1 de submenu
    private void modificacionespersonas(int op, int indice) {
        System.out.println("******************************");
        switch (op) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                per.get(indice).setNombre(sc.next());
                
                break;
            case 2:
                System.out.print("Ingrese el nuevo apellido: ");
                per.get(indice).setApellido(sc.next());
                break;
            case 3:
                System.out.println("Ingrese la nueva edad: ");
                per.get(indice).setEdad(sc.nextInt());
                break;
            case 4:
                System.out.println("Ingrese la fecha de nacimiento: ");
                per.get(indice).nuevafecha();
                break;
            case 5:
                System.out.println("Ingrese si eres casado: ");
                per.get(indice).setCasado(sc.nextBoolean());
                break;
            case 6:men.submenu();
                   this.accionarsubmenu(sc.nextInt());
            break;
            default:
                System.out.println("Eleccion Incorrecta");
        }
        System.out.println("************Modificacion Exitosa************\n");
         men.submenu();
                this.accionarsubmenu(sc.nextInt());
    }
    //Opcion 2 de Submenu
    private void accioncuentas(int op) {
        switch (op) {
            case 1:
                System.out.println("De que persona quiere crear la persona: ");
                for (int i = 0; i < per.size(); i++) {
                    System.out.println((i + 1) + per.get(i).getNombre());
                }
                System.out.print("Eleccion: ");
                per.get(sc.nextInt()-1).generarcuentas();
                 men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            case 2:
                System.out.println("De que persona quiere crear la persona: ");
                for (int i = 0; i < per.size(); i++) {
                    System.out.println((i + 1) + per.get(i).getNombre());
                }
                System.out.println("Eleccion: ");
                per.get(sc.nextInt()).modificarcuentas();
                 men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            case 3:
                System.out.println("1.Hacer Transaccion a una cuenta propia\n2.Hacer Transaccion a otra persona");
                int opc= sc.nextInt();
                if (opc == 1) {
                    System.out.println("De que persona quiere hacer?");
                    for (int i = 0; i < per.size(); i++) {
                        System.out.println((1 + i) + "." + per.get(i).getNombre());
                    }
                    System.out.println("Elija una persona: ");
                    per.get(sc.nextInt()-1).transaccionpropia();
                }
                if (opc== 2) {
                    System.out.println("De que persona quiere hacer?");
                    for (int i = 0; i < per.size(); i++) {
                        System.out.println((1 + i) + "." + per.get(i).getNombre());
                    }
                    System.out.println("Elija ambas personas: ");
                    System.out.print("Que persona envia dinero: ");
                    int envia=sc.nextInt()-1;
                    System.out.print("Que persona recibe dinero: ");
                    int recibe= sc.nextInt()-1;
                    
                    
                }
                 men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            case 4:
                System.out.print("De que persona quiere mostrar las cuentas?");
                for (int i = 0; i < per.size(); i++) {
                    System.out.println((1 + i) + "." + per.get(i).getNombre());
                }
                System.out.print("eleccion:");
                per.get(sc.nextInt()-1).mostrarcuenta();
                 men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            case 5:
                men.submenu();
                this.accionarsubmenu(sc.nextInt());
                break;
            default:
                System.out.println("Eleccion Incorrecta");
        }
        
    }

    
}

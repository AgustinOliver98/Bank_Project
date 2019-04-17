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
public class Fecha {
    
    int dia,mes,año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
    
    public boolean validarFecha(String fechanac) {
        if (fechanac.length() < 9) {
            return false;
        }
        if (fechanac.charAt(0) > '3') {
            return false;
        }
        if (fechanac.charAt(3) > '1') {
            return false;
        }
        if (fechanac.charAt(4) > '5' && fechanac.charAt(6) > '2' && fechanac.charAt(8) > '1' && fechanac.charAt(9) > '8') {
            return false;
        }
        if (fechanac.charAt(2) != '/' || fechanac.charAt(5) != '/') {
            return false;
        }
        return true;
    }
    
    
}

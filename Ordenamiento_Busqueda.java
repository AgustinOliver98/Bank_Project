/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluativo_agustin;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Ordenamiento_Busqueda {

    public void ordenamiento(ArrayList<Persona> persona) {
        for (int i = 0; i < persona.size(); i++) {
            for (int j = 1; j < persona.size(); j++) {
                if (persona.get(i).getNombre().compareTo(persona.get(j).getNombre()) > 0) {
                    Persona per = persona.get(i);
                    persona.add(i, persona.get(j));
                    persona.add(j, per);
                }
            }
        }
    }
}

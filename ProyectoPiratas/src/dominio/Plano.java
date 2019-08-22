/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author ANDRES ARIAS
 */
public final class Plano implements Serializable{
    
    public static LinkedList<Isla>Islas= new LinkedList<>();
    public static LinkedList<Conexion>Conexiones= new LinkedList<>();
    public static LinkedList<Continente>Continentes= new LinkedList<>();
    
    public void agregarIslas(Isla isla){
        Islas.add(isla);
    }

    /**
     * este metodo retorna la isla a partir del nombre
     * @param nombre
     * @return isla
     */
    public static Isla obtenerIsla(String nombre){
        Isla isla=null;
        for (int i = 0; i < Islas.size(); i++) {
            if(Islas.get(i).getNombre().equals(nombre)){
                isla=Islas.get(i);
            }
        }
        return isla;
    }
//     @Override
//    public Isla toString() {
//        return "Grafo [Islas=" + Islas + "]";
//    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.LinkedList;

/**
 *
 * @author ANDRES ARIAS
 */
public final class Plano {
    
    public static LinkedList<Isla>Islas= new LinkedList<>();
    public static LinkedList<Conexion>Conexiones= new LinkedList<>();
    public void agregarIslas(Isla isla){
        Islas.add(isla);
    }

    
//     @Override
//    public Isla toString() {
//        return "Grafo [Islas=" + Islas + "]";
//    }
    
}

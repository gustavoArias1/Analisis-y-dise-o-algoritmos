/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import dominio.*;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author ANDRES ARIAS
 */
public class Logica {
  
    /**
     * Es un algoritmo de programacion dinamica que funciona bajo el enfoque bottom up, que lo que hace es listarme las rutas y los
     * costos minimos
     * @param Origen
     * @param Destino
     * @param Costos
     * @param Caminos
     * @param Nodos 
     */
     public  static void FloydWarshall(Isla Origen ,Isla Destino ,int Costos[][], String Caminos[][], LinkedList<Isla> Nodos) {
        LinkedList<Conexion> Conexiones = new LinkedList<>();
        int suma = 0;
        for (int i = 0; i < Nodos.size(); i++) {
            for (int j = 0; j < Nodos.size(); j++) {
                if (i == j) {
                    Costos[i][j] = 0;
                    Caminos[i][j] = Nodos.get(j).getNombre();
                } else {
                    Costos[i][j] = 1000000;
                    Caminos[i][j] = Nodos.get(j).getNombre();
                }
            }
        }

        for (int i = 0; i < Nodos.size(); i++) {
            Conexiones = Nodos.get(i).Conexiones;
            for (int j = 0; j < Conexiones.size(); j++) {
                for (int k = 0; k < Nodos.size(); k++) {
                    if (Conexiones.get(j).getIslaDestino().getNombre().equals(Nodos.get(k).getNombre())) {
                        Costos[i][k] = (int) Nodos.get(i).Conexiones.get(j).getDistancia();
                    }
                }
            }
        }

        for (int i = 0; i < Costos.length; i++) {
            for (int j = 0; j < Costos.length; j++) {
                for (int k = 0; k < Costos.length; k++) {
                    suma = Costos[i][j] + Costos[k][i];
                    if (suma < Costos[k][j]) {
                        Costos[k][j] = suma;
                        Caminos[k][j] = Nodos.get(i).getNombre();
                    }

                }
            }
        }
        
        Camino(Origen, Destino, Costos, Caminos, Nodos);

    }
     
     /**
      * Con este metodo podemos obtener el camino optimo para llegar de una isla a otra
      * @param Origen
      * @param Destino
      * @param Costos
      * @param Caminos
      * @param Nodos 
      */
    public static void Camino(Isla Origen, Isla Destino, int Costos[][], String Caminos[][], LinkedList<Isla> Nodos) {
        LinkedList<String> Ruta = new LinkedList<>();
        Ruta.add(Destino.getNombre());
        Boolean camino=false;
        String nDestino = Destino.getNombre();
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        
        while(!camino){
            while(y==0){
                if(Nodos.get(i).getNombre().equals(Origen.getNombre())){
                    y=1;  
                    
                }else{
                    i++;
                }
            }
            while(x==0){
                if(Nodos.get(j).getNombre().equals(nDestino)){
                    x=1;
                   
                }else{
                    j++;
                }
            }
            Ruta.add(Caminos[i][j]);
            nDestino=Caminos[i][j];
            if(Caminos[i][j].equals(Nodos.get(j).getNombre())){
                //Ruta.add(Origen.getNombre());
                camino=true;
            }
            i=0;
            j=0;
        }
        Collections.reverse(Ruta);
        System.out.println(Ruta+"esta es la ruta");
       
        for (int l = 0; l < Ruta.size(); l++) {
            System.out.println(Ruta.get(l)+"  ggg");
            Barco.Ruta.add(Plano.obtenerIsla(Ruta.get(l)));
        }
        for (int m = 0; m < Barco.Ruta.size(); m++) {
            System.out.println(Barco.Ruta.get(m));
        }
        
    } 
     
    /**
     * Me pone la siguiente isla como destino
     * @param origen 
     */
    public static void siguienteIsla(Isla origen){
            Barco.x=origen.getX();
            Barco.y=origen.getY();
            Barco.Destino=Barco.Ruta.get(2); 
               
    }
}

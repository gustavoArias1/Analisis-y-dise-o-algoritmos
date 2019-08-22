/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author ANDRES ARIAS
 */
public class MainPruebas {

    public static void main(String args[]) {

        int Costos[][] = new int[4][4];
        String Caminos[][] = new String[4][4];

        Isla isla1 = new Isla(5, 3, 4, "A");
        Isla isla2 = new Isla(2, 1, 8, "B");
        Isla isla3 = new Isla(3, 1, 20, "C");
        Isla isla4 = new Isla(2, 1, 5, "D");

        isla1.adicionarConexiones(new Conexion(isla1, isla2, 3, ""));
        isla2.adicionarConexiones(new Conexion(isla2, isla4, 5, ""));
        isla4.adicionarConexiones(new Conexion(isla4, isla1, 8, ""));
        isla1.adicionarConexiones(new Conexion(isla1, isla3, 4, ""));
        isla3.adicionarConexiones(new Conexion(isla3, isla4, 3, ""));

        Plano PlanoGeneral = new Plano();

        PlanoGeneral.agregarIslas(isla1);
        PlanoGeneral.agregarIslas(isla2);
        PlanoGeneral.agregarIslas(isla3);
        PlanoGeneral.agregarIslas(isla4);

        System.out.println(PlanoGeneral);

        System.out.println(isla1.Conexiones.size());

        FloydWarshall(Costos, Caminos, Plano.Islas);
        imprimir(Costos, Caminos);
        Camino(isla1, isla4, Costos, Caminos, Plano.Islas);

    }

    /**
     * Es un algoritmo de programacion dinamica que funciona bajo el enfoque bottom up, que lo que hace es listarme las rutas y los
     * costos minimos
     * @param Costos
     * @param Caminos
     * @param Nodos 
     */
    public static void FloydWarshall(int Costos[][], String Caminos[][], LinkedList<Isla> Nodos) {
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

    }

    /**
     * 
     * @param Costos
     * @param Caminos 
     */
    public static void imprimir(int Costos[][], String Caminos[][]) {
        String mensaje = "";
        for (int i = 0; i < Costos.length; i++) {
            for (int j = 0; j < Costos[i].length; j++) {
                mensaje = mensaje + "[" + Costos[i][j] + "]";
            }
            System.out.println(mensaje);
            mensaje = "";
        }
        String mensaje2 = "";
        for (int i = 0; i < Caminos.length; i++) {
            for (int j = 0; j < Caminos[i].length; j++) {
                mensaje2 = mensaje2 + "[" + Caminos[i][j] + "]";
            }
            System.out.println(mensaje2);
            mensaje2 = "";
        }
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
                if(Nodos.get(j).getNombre().equals(Destino.getNombre())){
                    x=1;
                   
                }else{
                    j++;
                }
            }
            Ruta.add(Caminos[i][j]);
            Destino.setNombre(Caminos[i][j]);
            if(Caminos[i][j].equals(Nodos.get(j).getNombre())){
                Ruta.add(Origen.getNombre());
                camino=true;
            }
            i=0;
            j=0;
        }
        Collections.reverse(Ruta);
        for (int l = 0; l < Ruta.size(); l++) {
            System.out.println(Ruta.get(l));
        }
    }

}

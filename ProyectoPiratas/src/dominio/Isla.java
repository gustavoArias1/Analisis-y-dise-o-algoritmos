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
public class Isla {
    private int Estrellas;
    private int numeroEsclavos;
    private int Tesoros;
    private String Nombre;
    LinkedList<Conexion> Conexiones = new LinkedList<>();

    public Isla() {
        
    }

    public Isla(int Estrellas, int numeroEsclavos, int Tesoros, String Nombre) {
        this.Estrellas = Estrellas;
        this.numeroEsclavos = numeroEsclavos;
        this.Tesoros = Tesoros;
        this.Nombre = Nombre;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public LinkedList<Conexion> getConexiones() {
        return Conexiones;
    }

    public void setConexiones(LinkedList<Conexion> Conexiones) {
        this.Conexiones = Conexiones;
    }

    public int getNumeroEsclavos() {
        return numeroEsclavos;
    }

    public void setNumeroEsclavos(int numeroEsclavos) {
        this.numeroEsclavos = numeroEsclavos;
    }

    public int getTesoros() {
        return Tesoros;
    }

    public void setTesoros(int Tesoros) {
        this.Tesoros = Tesoros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void adicionarConexiones(Conexion Nuevaconexion){
        Conexiones.add(Nuevaconexion);
    }
    @Override
    public String toString() {
        return "\n \tIsla [Isla=" + Nombre + ", Conexiones=" + Conexiones + "]";
    }
             
}

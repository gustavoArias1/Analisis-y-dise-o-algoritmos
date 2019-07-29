/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author ANDRES ARIAS 
 */
public class Conexion {
    private Isla islaOrigen;
    private Isla islaDestino;
    private double Distancia;

    public Conexion() {
    }

    public Conexion(Isla islaOrigen, Isla islaDestino, double Distancia) {
        this.islaOrigen = islaOrigen;
        this.islaDestino = islaDestino;
        this.Distancia = Distancia;
    }

    public Isla getIslaOrigen() {
        return islaOrigen;
    }

    public void setIslaOrigen(Isla islaOrigen) {
        this.islaOrigen = islaOrigen;
    }

    public Isla getIslaDestino() {
        return islaDestino;
    }

    public void setIslaDestino(Isla islaDestino) {
        this.islaDestino = islaDestino;
    }

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double Distancia) {
        this.Distancia = Distancia;
    }
    
    @Override
    public String toString() {
        return "\n Conexion [origen=" + islaOrigen.getNombre() + ", destino =" + islaDestino.getNombre() + ", distancia="
                + Distancia + "]";
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author ANDRES ARIAS 
 */
public class Conexion implements Serializable{
    private String Peligrosidad;
    private String Tipo;
    private Isla islaOrigen;
    private Isla islaDestino;
    private double Distancia;
    public boolean HayMonstruo;
    public Monstruo Monstruo = new Monstruo(0, 0);

   

    
    
   

    public Conexion() {
    }

    /**ç
     * 
     * @param islaOrigen
     * @param islaDestino
     * @param Distancia
     * @param tipo 
     */
    public Conexion(Isla islaOrigen, Isla islaDestino, double Distancia,String tipo) {
        this.islaOrigen = islaOrigen;
        this.islaDestino = islaDestino;
        this.Distancia = Distancia;
        this.Tipo=tipo;
        this.HayMonstruo=false;
        
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
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public String getPeligrosidad() {
        return Peligrosidad;
    }

    public void setPeligrosidad(String Peligrosidad) {
        this.Peligrosidad = Peligrosidad;
    }
    
    
   
//    @Override
//    public Isla toString() {
//        return "\n Conexion [origen=" + islaOrigen + ", destino =" + islaDestino + ", distancia="
//                + Distancia + "]";
//    }
    
}

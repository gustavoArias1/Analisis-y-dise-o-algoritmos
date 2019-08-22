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
public class Esclavo {
    private int tiempoVida;
    private Isla edad;

    public Esclavo() {
    }

    /**
     * 
     * @param tiempoVida
     * @param edad 
     */
    public Esclavo(int tiempoVida, Isla edad) {
        this.tiempoVida = tiempoVida;
        this.edad = edad;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public Isla getEdad() {
        return edad;
    }

    public void setEdad(Isla edad) {
        this.edad = edad;
    }
    
    
}
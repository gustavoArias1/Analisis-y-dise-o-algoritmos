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
public class BarcoEnemigo {
    private int vida;
    private int peligrosidad;

    public BarcoEnemigo() {
    }

    public BarcoEnemigo(int vida, int peligrosidad) {
        this.vida = vida;
        this.peligrosidad = peligrosidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }
    
    
}

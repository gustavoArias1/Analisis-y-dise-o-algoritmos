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
public class Monstruo {
    private int vida;
    private Isla Peligrosidad;

    public Monstruo() {
    }

    public Monstruo(int vida, Isla Peligrosidad) {
        this.vida = vida;
        this.Peligrosidad = Peligrosidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Isla getPeligrosidad() {
        return Peligrosidad;
    }

    public void setPeligrosidad(Isla Peligrosidad) {
        this.Peligrosidad = Peligrosidad;
    }
    
    
}
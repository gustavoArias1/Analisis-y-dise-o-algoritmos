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
    private String Peligrosidad;

    public Monstruo() {
    }

    public Monstruo(int vida, String Peligrosidad) {
        this.vida = vida;
        this.Peligrosidad = Peligrosidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getPeligrosidad() {
        return Peligrosidad;
    }

    public void setPeligrosidad(String Peligrosidad) {
        this.Peligrosidad = Peligrosidad;
    }
    
    
}

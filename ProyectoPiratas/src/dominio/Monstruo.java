/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author ANDRES ARIAS
 */
public class Monstruo implements Serializable{
    private int vida;
    private int Peligrosidad;
    private ImageIcon imagen;


    public Monstruo() {
    }

    public Monstruo(int vida, int Peligrosidad) {
        this.imagen=new ImageIcon(getClass().getResource("../Imagenes/Monstruo.png"));
        this.vida = vida;
        this.Peligrosidad = Peligrosidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPeligrosidad() {
        return Peligrosidad;
    }

    public void setPeligrosidad(int Peligrosidad) {
        this.Peligrosidad = Peligrosidad;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
}
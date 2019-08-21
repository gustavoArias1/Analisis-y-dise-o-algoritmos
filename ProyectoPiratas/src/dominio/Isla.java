/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Rectangle;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author ANDRES ARIAS
 */
public class Isla implements Serializable{
    private int Estrellas;
    private int numeroEsclavos;
    private int Tesoros;
    public  LinkedList<Esclavo> ListaEsclavos=new LinkedList<>();
    private int x, y, ancho, alto;
    private String image;
    private ImageIcon imagen;
    private String Nombre;
    public  LinkedList<Conexion> Conexiones = new LinkedList<>();
    private Rectangle rectanguloIsla;

   

    public Isla(int x, int y, int ancho, int alto, String imagen) {
        this.imagen = new ImageIcon(getClass().getResource("../Imagenes/" + imagen));
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto; 
        this.rectanguloIsla= new Rectangle(this.x, this.y, this.ancho, this.alto);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
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
//    @Override
//    public Isla toString() {
//        return "\n \tIsla [Isla=" + Nombre + ", Conexiones=" + Conexiones + "]";
//    }
    
    public Rectangle getRectanguloIsla() {
        return rectanguloIsla;
    }

    public void setRectanguloIsla(Rectangle rectanguloIsla) {
        this.rectanguloIsla = rectanguloIsla;
    }
    
   }
             


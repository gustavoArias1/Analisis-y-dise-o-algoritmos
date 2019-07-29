package Dominio;
import java.util.*;
import javax.swing.*;
public class Continente {
    public LinkedList<Isla> islas = new LinkedList();
    private int x, y, ancho, alto;
    private String image;
    private ImageIcon imagen;
    public Continente(int x, int y, int ancho, int alto, String imagen) {
        this.imagen = new ImageIcon(getClass().getResource("../Imagenes/" + imagen));
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;        
    }    

    public LinkedList<Isla> getIslas() {
        return islas;
    }

    public void setIslas(LinkedList<Isla> islas) {
        this.islas = islas;
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
}

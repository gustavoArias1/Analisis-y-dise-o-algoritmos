/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author ANDRES ARIAS
 */
public class Barco implements Runnable{
    public static  int Esclavos;
    public static  int horasNavegacion;
    public static  int Velocidad;
    public static  int x;
    public static  int y;
    public static  int ancho;
    public static  int alto;
    public static String image;
    public static ImageIcon imagen;
    public static Rectangle rectanguloBarco;
    public static Isla Origen;
    public static Isla Destino;
    public  Thread T= new Thread(this);
    

    public Barco() {
        
    }
    
    public  void iniciarHilo(){
        T.start();
        
    }


    @Override
    public void run() {
        Barco.x=Origen.getX();
        Barco.y=Origen.getY();
        try {
            while (!(Barco.x == Destino.getX() && Barco.y == Destino.getY())) {

                if (Barco.x < Destino.getX()) {
                    Barco.x++;
                } else {
                    if (Barco.x > Destino.getX()) {
                        Barco.x--;
                    }
                }
                if (Barco.y < Destino.getY()) {
                    Barco.y++;
                } else {
                    if (Barco.y > Destino.getY()) {
                        Barco.y--;
                    }
                }
                Thread.sleep(10);

            }
        } catch (Exception e) {
        }
        
    }
    
    
}

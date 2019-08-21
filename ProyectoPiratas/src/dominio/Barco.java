/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import Procesos.Logica;
import java.awt.Rectangle;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author ANDRES ARIAS
 */
public class Barco implements Runnable{
    public static  int Esclavos;
    public static  int iteradorIsla=0;
    public static  Boolean rutaTerminada=false;
    public static  Boolean llegoIsla=false;
    public static  int horasNavegacion;
    public static  int Velocidad;
    public static  int x=30;
    public static  int y=30;
    public static  int ancho=30;
    public static  int alto=30;
    public static String image;
    public static ImageIcon imagen;
    public static Rectangle rectanguloBarco;
    public static Isla Origen;
    public static Isla Destino;
    public  Thread T= new Thread(this);
    public static LinkedList<Isla> Ruta= new LinkedList<>();
    

    public Barco() {
        
    }
    
    public  void iniciarHilo(){
        T.start();
        
    }


    @Override
    public void run() {
        Barco.x = Origen.getX();
        Barco.y = Origen.getY();
        double deltaY = Destino.getY() - Origen.getY();
        double deltaX = Destino.getX() - Origen.getX();
        double pendiente = deltaY / deltaX;
        double b = -1 * (Destino.getX() * pendiente - Destino.getY());
        try {
            while(!rutaTerminada){
                System.out.println("");
                while (!(Barco.x == Destino.getX() && Barco.y == Destino.getY())) {
                    System.out.println("");

                if (Barco.x < Destino.getX()) {
                    Barco.x++;
                } else {
                    if (Barco.x > Destino.getX()) {
                        Barco.x--;
                    }
                }
                Barco.y = (int) (pendiente * (Barco.x) + b);
                Thread.sleep(40);

            }
                
                llegoIsla=true;
                iteradorIsla++;
                Logica.siguienteIsla(Destino);
                
            }
           
        } catch (Exception e) {
        }

    }
    
}

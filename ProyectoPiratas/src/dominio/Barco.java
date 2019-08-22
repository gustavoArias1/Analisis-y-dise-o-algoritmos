/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import Procesos.Logica;
import Procesos.Mapa;
import Procesos.PanelControl;
import java.awt.Rectangle;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author ANDRES ARIAS
 */
public class Barco implements Runnable{
    public static boolean choque = false;
    public static  int Esclavos=10;
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
    public static LinkedList<Esclavo> listaEsclavos= new LinkedList<>();
    

    public Barco() {
        
    }
    
    public void horasNavegacion(){
        for (int i = 0; i < listaEsclavos.size(); i++) {
            horasNavegacion+=listaEsclavos.get(i).getTipo();
        }
    }
    
    public   void iniciarHilo(){
        T.start();
        
    }
    
    public  void pausarHilo(){
        T. interrupt();
        
    }
    public  void reanudarHilo(){
        T.resume();
        
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
                System.out.print("");
                while (!(Barco.x == Destino.getX() && Barco.y == Destino.getY())) {

                if (Barco.x < Destino.getX()) {
                    Barco.x++;
                } else {
                    if (Barco.x > Destino.getX()) {
                        Barco.x--;
                    }
                    
                }
                
                Barco.y = (int) (pendiente * (Barco.x) + b);
                Thread.sleep(20);
               
            }
                
                llegoIsla=true;
                iteradorIsla++;
                Barco.Origen=Destino;
                Barco.x=Origen.getX();
                Barco.y=Origen.getY();
                Barco.Destino=Barco.Ruta.get(2);
                deltaY = Destino.getY() - Origen.getY();
                deltaX = Destino.getX() - Origen.getX();
                pendiente = deltaY / deltaX;
                b = -1 * (Destino.getX() * pendiente - Destino.getY());
                if (choque == false) {
                    choque = true;
                    System.out.println(Barco.Esclavos);
                    
                    Thread.sleep(2000);
                    Mapa.p.setjLabel11(Barco.Esclavos+"");
                            
                }
                
            }
           
        } catch (Exception e) {
        }

    }
    
}

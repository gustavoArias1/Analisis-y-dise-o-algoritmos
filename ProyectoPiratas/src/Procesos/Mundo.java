package Procesos;
import dominio.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Mundo extends javax.swing.JPanel {
    private ImageIcon inicio = new ImageIcon(getClass().getResource("../Imagenes/Inicio.jpg")); 
    private ImageIcon itemC = null;
    public LinkedList <Continente> cont = new LinkedList<>();
    public Boolean Editar;
    public Boolean Edito;
    public Isla editarIsla=null;
    public  int MouseX=0;    
    public  int MouseY=0;    
    public Mundo() {
        initComponents();  
        Barco.imagen=new ImageIcon(getClass().getResource("../Imagenes/Barco.png"));
        Barco.alto=30;
        Barco.ancho=30;
        Barco.x=30;
        Barco.y=30;
        Editar=false;
        Edito=false;
    }

    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);  
        g.setColor(Color.GRAY);
        g.drawImage(inicio.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
        g.drawImage(Barco.imagen.getImage(), Barco.x, Barco.y, Barco.ancho, Barco.alto, this);
        if(Editar){
            for (int i = 0; i < Plano.Islas.size(); i++) {
                g.drawRect(MouseX, MouseY, 10, 10);
                if(new Rectangle(Plano.Islas.get(i).getX(),Plano.Islas.get(i).getY(),Plano.Islas.get(i).getAncho(),Plano.Islas.get(i).getAlto()).intersects(new Rectangle(MouseX,MouseY,40,40))){
                    Edito=true;
                    editarIsla=Plano.Islas.get(i);
                }
            }
        }
        
        if (Plano.Continentes.size() > 0) {    
            
            for (int i = 0; i < Plano.Continentes.size(); i++) { 
                
                g.drawImage(Plano.Continentes.get(i).getImagen().getImage(), Plano.Continentes.get(i).getX(), Plano.Continentes.get(i).getY(),
                        Plano.Continentes.get(i).getAncho(), Plano.Continentes.get(i).getAlto(), this);
            }
            for (int i = 0; i < Plano.Islas.size(); i++) {
                g.drawImage(Plano.Islas.get(i).getImagen().getImage(), Plano.Islas.get(i).getX(),
                        Plano.Islas.get(i).getY(), Plano.Islas.get(i).getAncho(),
                        Plano.Islas.get(i).getAlto(), this);
            }
            for (int j = 0; j < Plano.Conexiones.size() ; j++) {
                    g.drawLine(Plano.Conexiones.get(j).getIslaOrigen().getX()+50, Plano.Conexiones.get(j).getIslaOrigen().getY()+50, Plano.Conexiones.get(j).getIslaDestino().getX()+10, Plano.Conexiones.get(j).getIslaDestino().getY()+40);
               }
        }
        repaint();
    }
    
    public void NuevaImagen(String nombre)
    {
        inicio = new ImageIcon(getClass().getResource("../Imagenes/" + nombre));
        this.setSize(1100, 750);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

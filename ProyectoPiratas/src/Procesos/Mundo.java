package Procesos;
import dominio.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Mundo extends javax.swing.JPanel {
    private ImageIcon inicio = new ImageIcon(getClass().getResource("../Imagenes/Inicio.jpg")); 
    private ImageIcon itemC = null;
    public LinkedList <Continente> cont = new LinkedList<Continente>();
    public Mundo() {
        initComponents();  
    }

    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);  
        
        g.drawImage(inicio.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
        if (cont.size() > 0) {            
            for (int i = 0; i < cont.size(); i++) {  
                g.drawImage(cont.get(i).getImagen().getImage(), cont.get(i).getX(), cont.get(i).getY(),
                        cont.get(i).getAncho(), cont.get(i).getAlto(), this);
            }
            for (int i = 0; i < Plano.Islas.size(); i++) {
                g.drawImage(Plano.Islas.get(i).getImagen().getImage(), Plano.Islas.get(i).getX(),
                        Plano.Islas.get(i).getY(), Plano.Islas.get(i).getAncho(),
                        Plano.Islas.get(i).getAlto(), this);
            }
            for (int j = 0; j < Plano.Conexiones.size() ; j++) {
                    g.drawLine(Plano.Conexiones.get(j).getIslaOrigen().getX()+30, Plano.Conexiones.get(j).getIslaOrigen().getY()+40, Plano.Conexiones.get(j).getIslaDestino().getX()+10, Plano.Conexiones.get(j).getIslaDestino().getY()+40);
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

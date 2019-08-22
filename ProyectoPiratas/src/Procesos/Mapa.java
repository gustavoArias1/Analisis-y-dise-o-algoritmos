package Procesos;
import dominio.*;
import javax.swing.*;
public class Mapa extends javax.swing.JFrame {

    private ImageIcon itemC, itemI;
    private int x;
    private int y;
    private int itemContinente, itemIsla;
    public static Editar editar = new Editar();
    public static PanelControl p;
    public static Isla islaNueva;
    
    public Mapa() {
        initComponents();
        setLayout(null);
        this.setSize(1350, 700);
        this.setResizable(false);        
        mundo.setSize(1350, 700);
        p = new PanelControl();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        mundo = new Procesos.Mundo();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ConexionIslas = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        conexionContinental = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1350, 700));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Isla 1", "Isla 2", "Isla 3", "Isla 4" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setEnabled(false);
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 75));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Continente 1", "Continente 2", "Continente 3" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espada.png"))); // NOI18N
        jLabel2.setEnabled(false);

        mundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mundoMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Espada.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mundoLayout = new javax.swing.GroupLayout(mundo);
        mundo.setLayout(mundoLayout);
        mundoLayout.setHorizontalGroup(
            mundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mundoLayout.createSequentialGroup()
                .addContainerGap(523, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(477, 477, 477))
        );
        mundoLayout.setVerticalGroup(
            mundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mundoLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        jLabel4.setEnabled(false);
        jLabel4.setPreferredSize(new java.awt.Dimension(75, 75));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        ConexionIslas.setText("ConexionIslas");
        ConexionIslas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConexionIslasActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton2.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 70));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        conexionContinental.setText("ConexionContinental");
        conexionContinental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionContinentalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ConexionIslas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(conexionContinental))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Guardar)
                                        .addGap(34, 34, 34)
                                        .addComponent(Cargar)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConexionIslas)
                    .addComponent(conexionContinental))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cargar))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addComponent(mundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String sel = (String) jComboBox1.getSelectedItem();
        jLabel3.setEnabled(true);
        if ("Continente 1".equals(sel)) {
            itemC = new ImageIcon(getClass().getResource("../Imagenes/Americap.png")); 
            itemContinente = 1;
        }
        else if ("Continente 2".equals(sel)) {
            itemC = new ImageIcon(getClass().getResource("../Imagenes/Africap.png"));
            itemContinente = 2;
        }
        else
        {
            itemC = new ImageIcon(getClass().getResource("../Imagenes/Asiap.png")); 
            itemContinente = 3;
        }
        jLabel3.setIcon(itemC);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        if (itemContinente == 1) {
            Plano.Continentes.add(new Continente(evt.getXOnScreen() - 150, evt.getYOnScreen() - 130, 300, 300, "America.png"));
        } 
        if (itemContinente == 2) {
            Plano.Continentes.add(new Continente(evt.getXOnScreen() - 150, evt.getYOnScreen() - 130, 300, 300, "Africa.png"));
        } 
        if (itemContinente == 3) {
            Plano.Continentes.add(new Continente(evt.getXOnScreen() - 150, evt.getYOnScreen() - 130, 300, 300, "Asia.png"));
        } 
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        String imagenIsla="";        
        if (itemIsla == 1) {
            imagenIsla="Isla1.png";
        } 
        if (itemIsla == 2) {
            imagenIsla="Isla1.png";
        } 
        if (itemIsla == 3) {
            imagenIsla="Isla1.png";
        } 
        if (itemIsla == 4) {
            imagenIsla="Isla1.png";
        } 
        
        islaNueva = new Isla(evt.getXOnScreen() - 15, evt.getYOnScreen() - 25, 30, 30, imagenIsla);
        
        editar.setVisible(true); 
        editar.getjButton2().setVisible(false);
        editar.getjButton3().setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String sel = (String) jComboBox2.getSelectedItem();
        jLabel4.setEnabled(true);
        if (null == sel) {
            itemI = new ImageIcon(getClass().getResource("../Imagenes/ItemC3.png")); 
            itemIsla = 1;
        }
        else switch (sel) {
            case "Isla 1":
                itemI = new ImageIcon(getClass().getResource("../Imagenes/ItemI1.png"));
                itemIsla = 1;
                break;
            case "Isla 2":
                itemI = new ImageIcon(getClass().getResource("../Imagenes/ItemC2.png"));
                itemIsla = 2;
                break;
            case "Isla 3":
                itemI = new ImageIcon(getClass().getResource("../Imagenes/ItemC2.png"));
                itemIsla = 3;
                break;
            case "Isla 4":
                itemI = new ImageIcon(getClass().getResource("../Imagenes/ItemC2.png"));
                itemIsla = 4;
                break;      
            
        }
        jLabel4.setIcon(itemI);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void ConexionIslasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConexionIslasActionPerformed
        String islaOrigen=JOptionPane.showInputDialog(null,"Ingrese Isla Origen"); 
        String islaDestino=JOptionPane.showInputDialog(null,"Ingrese Isla Destino");
        int Distancia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la distancia"));
        Isla IslaOrigen= Plano.Islas.get(0);
        Isla IslaDestino= Plano.Islas.get(0);
        
        for (int i = 0; i < Plano.Islas.size(); i++) {
            if(Plano.Islas.get(i).getNombre().equals(islaOrigen)){
                IslaOrigen=Plano.Islas.get(i);
            }
            if(Plano.Islas.get(i).getNombre().equals(islaDestino)){
                IslaDestino=Plano.Islas.get(i);
            }
            
        }
        Plano.obtenerIsla(islaOrigen).adicionarConexiones(new Conexion(IslaOrigen, IslaDestino, Distancia,"Isleña"));
        //Plano.Conexiones.add(new Conexion(IslaOrigen, IslaDestino, Distancia,"Isleña"));
        //Plano.Conexiones.add(new Conexion(IslaDestino, IslaOrigen, Distancia,"Isleña"));
    }//GEN-LAST:event_ConexionIslasActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
           Archivos A = new Archivos();
           A.guardarArchivo();
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
          Archivos A = new Archivos();
          A.leerArchivo();
          mundo.repaint();
    }//GEN-LAST:event_CargarActionPerformed

    private void mundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mundoMouseClicked
        mundo.Editar = true;
        mundo.MouseX = evt.getXOnScreen() - 15;
        mundo.MouseY = evt.getYOnScreen() - 25;
        Editar editar = new Editar();
        if(mundo.Edito){
            editar.setVisible(true);
            editar.setjTextField1(Mundo.editarIsla.getNombre());
            editar.setjTextField2(Mundo.editarIsla.getNumeroEsclavos() + "");
            editar.setjTextField3(Mundo.editarIsla.getTesoros() + "");
            editar.setjTextField4(Mundo.editarIsla.getEstrellas() + "");
            mundo.Edito = false;
            mundo.Editar = false;
        }
        editar.getjButton1().setVisible(false);
        
    }//GEN-LAST:event_mundoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jLabel1.setVisible(false);
        mundo.NuevaImagen("Mapa.png");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel5.setEnabled(false);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        PanelControl panelcontrol = new PanelControl();
        panelcontrol.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void conexionContinentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionContinentalActionPerformed
        String islaOrigen=JOptionPane.showInputDialog(null,"Ingrese Isla Origen");     
        String islaDestino=JOptionPane.showInputDialog(null,"Ingrese Isla Destino");
        int Distancia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la distancia"));
        Isla IslaOrigen= Plano.Islas.get(0);
        Isla IslaDestino= Plano.Islas.get(0);
        for (int i = 0; i < Plano.Islas.size(); i++) {
            if(Plano.Islas.get(i).getNombre().equals(islaOrigen)){
                IslaOrigen=Plano.Islas.get(i);
            }
            if(Plano.Islas.get(i).getNombre().equals(islaDestino)){
                IslaDestino=Plano.Islas.get(i);
            }
            
            
        }
        Plano.Conexiones.add(new Conexion(IslaOrigen, IslaDestino, Distancia,"Continental"));
        //Plano.Conexiones.add(new Conexion(IslaDestino,IslaOrigen, Distancia,"Continental"));
        
    }//GEN-LAST:event_conexionContinentalActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);              
            }
        });
    }
    
    public static void AgregarIsla()
    {   
        islaNueva.setNombre(editar.getjTextField1().getText());
        islaNueva.setNumeroEsclavos(Integer.parseInt(editar.getjTextField2().getText()));
        islaNueva.setTesoros(Integer.parseInt(editar.getjTextField3().getText()));
        islaNueva.setEstrellas(Integer.parseInt(editar.getjTextField4().getText()));
        Plano.Islas.add(islaNueva);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton ConexionIslas;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton conexionContinental;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private Procesos.Mundo mundo;
    // End of variables declaration//GEN-END:variables
}
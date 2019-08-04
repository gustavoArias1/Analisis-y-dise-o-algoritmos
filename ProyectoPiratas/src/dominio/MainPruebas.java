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
public class MainPruebas {

    
    public static void main(Isla[] args) {
       
        Isla isla1= new Isla(0, 0, 0, "isla1");
        Isla isla2= new Isla(0, 0, 0, "isla2");
        Isla isla3= new Isla(0, 0, 0, "isla3");
        Isla isla4= new Isla(0, 0, 0, "isla4");
        Isla isla5= new Isla(0, 0, 0, "isla5");
        
        isla1.adicionarConexiones(new Conexion(isla1, isla2, 100));
        isla1.adicionarConexiones( new Conexion(isla1, isla5, 50));
        isla4.adicionarConexiones( new Conexion(isla4, isla2, 50));
        isla3.adicionarConexiones( new Conexion(isla3, isla4, 50));
        
        Plano PlanoGeneral = new Plano();
        
        PlanoGeneral.agregarIslas(isla1);
        PlanoGeneral.agregarIslas(isla2);
        PlanoGeneral.agregarIslas(isla3);
        PlanoGeneral.agregarIslas(isla4);
        PlanoGeneral.agregarIslas(isla5);
        
        
        System.out.println(PlanoGeneral);
        
        System.out.println(isla1.Conexiones.size());
        
    }
    
   
    
}

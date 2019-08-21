/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import dominio.Plano;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES ARIAS
 */
public class Archivos implements Serializable {
    public File miFile;
    LinkedList listaGeneralSalida = new LinkedList();
    LinkedList listaGeneralEntrada = new LinkedList();;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    
   
    

   
    
    
    public void guardarArchivo(){
        String nombre=JOptionPane.showInputDialog(null, "Ingresa nombre archivo");
        miFile=new File(nombre);
        listaGeneralSalida.add(Plano.Conexiones);
        listaGeneralSalida.add(Plano.Continentes);
        listaGeneralSalida.add(Plano.Islas);
        try {
            oos=new ObjectOutputStream(new FileOutputStream(miFile));
            oos.writeObject(listaGeneralSalida);
            oos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
    
    public void leerArchivo(){
        String nombre=JOptionPane.showInputDialog(null, "Ingresa nombre archivo");
        miFile=new File(nombre);
        try {
            ois = new ObjectInputStream(new FileInputStream(miFile));
            listaGeneralEntrada=(LinkedList)ois.readObject();
            deserializar(listaGeneralEntrada);
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    
    public void deserializar(LinkedList listaGeneralEntrada){
        Plano.Conexiones=(LinkedList)listaGeneralEntrada.get(0);
        Plano.Continentes=(LinkedList)listaGeneralEntrada.get(1);
        Plano.Islas=(LinkedList)listaGeneralEntrada.get(2);
        
    }
    
}

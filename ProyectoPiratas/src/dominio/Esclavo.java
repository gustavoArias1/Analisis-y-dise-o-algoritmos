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
public class Esclavo {
    private int tipo;
    private int poderAtaque;

    public Esclavo() {
        
    }

    public Esclavo(int tipo, int poderAtaque) {
        this.tipo = tipo;
        this.poderAtaque = poderAtaque;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
    
    
    
}
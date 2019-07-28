package dominio;
public class Barco {
    private  int Esclavos;
    private  int horasNavegacion;
    private  int Velocidad;

    public Barco() {
    }

    public Barco(int Esclavos, int horasNavegacion, int Velocidad) {
        this.Esclavos = Esclavos;
        this.horasNavegacion = horasNavegacion;
        this.Velocidad = Velocidad;
    }

    public int getEsclavos() {
        return Esclavos;
    }

    public void setEsclavos(int Esclavos) {
        this.Esclavos = Esclavos;
    }

    public int getHorasNavegacion() {
        return horasNavegacion;
    }

    public void setHorasNavegacion(int horasNavegacion) {
        this.horasNavegacion = horasNavegacion;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
}
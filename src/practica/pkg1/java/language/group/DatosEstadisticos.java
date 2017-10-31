package practica.pkg1.java.language.group;

public class DatosEstadisticos {
    private double tiempo;

    public DatosEstadisticos() {
    }

    public void añadeTiempo(double tiempoTemp) {
        tiempo += tiempoTemp;
    }

    public double dameTiempo() {
        return tiempo;
    }

    public void estableceTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
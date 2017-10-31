package practica.pkg1.java.language.group;
public class Ordenar1Vector implements OrdenarVector{
    @Override
    public String nombreMetodo() {
        return "Ordenar";
    }

    @Override 
    public void ordena(int[] v, DatosEstadisticos de) {
        int aux = 0;
        de.estableceTiempo(0);
        double tiempo = (double) System.currentTimeMillis();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }

        }
        double temp = System.currentTimeMillis() - tiempo;
        de.añadeTiempo(temp);
    }
}
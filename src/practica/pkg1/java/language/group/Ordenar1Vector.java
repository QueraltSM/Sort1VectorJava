package practica.pkg1.java.language.group;
public class Ordenar1Vector implements OrdenarVector{

    @Override
    public String nombreMetodo() {
        return "Intercambio de parejas";
    }
    
    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        boolean cambio;
        int aux;
        
        double time = System.currentTimeMillis();
        
        for (int j = 0; j < v.length; j++){
            cambio = false;
            for (int i = (j+1)%2; i < v.length-1; i+=2){
                if (v[i] > v[i+1]){
                    aux = v[i+1];
                    v[i+1] = v[i];
                    v[i] = aux;
                    cambio = true;
                }
            }
            if(!cambio && j>0){
                time = System.currentTimeMillis() - time;
                de.estableceTiempo(time);
                return;
            }
        }
        time = System.currentTimeMillis() - time;
        de.estableceTiempo(time);
        return;
    }
}

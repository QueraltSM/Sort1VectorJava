package practica.pkg1.java.language.group;
public class CalculadorEstadisticas {
    public static DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector m, int tam_vector){
        DatosEstadisticos[] resultados = new DatosEstadisticos[2];
        
        // Modo aleatorio
        resultados[1] = new DatosEstadisticos();
        for (int i = 0; i < 10; i++) {
            int[] v = GeneraCaso.generaVector(tam_vector, true);
            m.ordena(v, resultados[1]);
            CompruebaCaso.compruebaVector(v, tam_vector);
        }
       
        resultados[1].estableceTiempo(resultados[1].dameTiempo()/10.0);
        
        // Modo inverso
        resultados[0] = new DatosEstadisticos();
        int[] v = GeneraCaso.generaVector(tam_vector, false);
        m.ordena(v,resultados[0]);
        CompruebaCaso.compruebaVector(v, tam_vector);
            
        return resultados;
    }
    
    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores){
        DatosEstadisticos[][] resultados = new DatosEstadisticos[tam_vectores.length][2];
        for (int i = 0; i < tam_vectores.length; i++) {
            resultados[i] = estadisticaOrdenaVector(m, tam_vectores[i]);
        }
        return resultados;
    }
}

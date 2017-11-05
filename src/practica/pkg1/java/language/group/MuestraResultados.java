package practica.pkg1.java.language.group;
public class MuestraResultados{
    public static void main(String[] args){
        
        int tamaño = 32000;
        
        Ordenar1Vector a = new Ordenar1Vector();
        
        DatosEstadisticos tiempo = new DatosEstadisticos();
        
        DatosEstadisticos tiempoinv = new DatosEstadisticos();
        
        int[]w = GeneraCaso.generaVector(tamaño, false);
        int[]v = GeneraCaso.generaVector(tamaño, true);
        
        
        a.ordena(w,tiempoinv);
        a.ordena(v,tiempo);
        
        CompruebaCaso.compruebaVector(v, tamaño);
        CompruebaCaso.compruebaVector(w, tamaño);
        
        System.out.println("El tiempo de ordenación aleatoria es: " + tiempo.dameTiempo()/1000.0);
        System.out.println("El tiempo de ordenación inversa es: " + tiempoinv.dameTiempo()/1000.0 + "\n");
        
        
                
        OrdenarVector m = new Ordenar1Vector();
        int[] tam_vectores = {1000,2000,4000,8000,16000,32000};

        DatosEstadisticos[][] resultado = CalculadorEstadisticas.estadisticasOrdenaVectores(m, tam_vectores);
        
        System.out.println("Tamaño\tOrden inverso\tOrden aleatorio");

        for (int i = 0; i < tam_vectores.length; i++) { 
            System.out.printf("%5d\t%4.5f\t\t%4.5f\n",tam_vectores[i],resultado[i][0].dameTiempo()/1000.0,resultado[i][1].dameTiempo()/1000.0);
        }
    
        a.ordena(w,tiempoinv);
        a.ordena(v,tiempo);
        
        CompruebaCaso.compruebaVector(v, tamaño);
        CompruebaCaso.compruebaVector(w, tamaño);
        
        System.out.print("\n");
        System.out.println("El tiempo de ordenación aleatoria es: " + tiempo.dameTiempo()/1000.0);
        System.out.println("El tiempo de ordenación inversa es: " + tiempoinv.dameTiempo()/1000.0);
    }
}

/*
 * "
 * "
 */
package eva1_14_paso_ref;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_14_PASO_REF {

    public static void main(String[] args) {
        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
    }
    
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 100;
        }
    }
    
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" [" + arreglo[i] + "]");
        }
    }
    
    
}

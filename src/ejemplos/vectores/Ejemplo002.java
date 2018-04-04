package ejemplos.vectores;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo002 {
    /*
    Se requiere obtener la suma de las cantidades contenidas en un arreglo de
    10 elementos. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que suma las cantidades de un arreglo"
                + " ***\n");
        
        Scanner n = new Scanner(System.in);
        
        float [] cantidades = new float [10];
        float suma = 0;
        
        for(int i=0; i<cantidades.length; i++){
            System.out.print("Ingresa el valor ["+(i+1)+"]: ");
            cantidades[i] = n.nextFloat();
            suma+=cantidades[i];
        }
        
        System.out.println("La suma de las cantidades es: " +  suma);
    }
    
}

package ejemplos.arreglos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo002 {
    /*
    Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro 
    renglones y cuatro columnas, las cuales almacenan valores comprendidos 
    entre 0 y 9. 
    */
    public static void main(String[] args) {
        
        int arreglo[][] = new int[4][4];
        
        Scanner n = new Scanner(System.in);
        
        int contador = 0;
        
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo[i].length; j++){
                System.out.print("Ingresa el valor: ["+i+"]["+j+"]: ");
                arreglo[i][j] = n.nextInt();
                if (arreglo[i][j] == 0){
                    contador++;
                }
            }
        }                   
        
        System.out.println("\nCantidad de ceros en la matriz: " + contador);
    }
}

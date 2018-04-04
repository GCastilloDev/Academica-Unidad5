package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto014 {
    /*
    Lea un vector de cien elementos y que calcule su magnitud.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que lee un vector y cálcula la magnitud"
                + " del vector ***");
        
        int [] vector = new int[100];
        //int [] vector = {100,90,80,50,70,76};
        
        Scanner n = new Scanner(System.in);
        
        int magnitud = 0;
        
        for(int i=0; i<vector.length; i++){
            System.out.print("Ingresa el valor ["+(i+1)+"]: ");
            vector[i] = n.nextInt();
            magnitud+=vector[i];            
        }
        
        System.out.println("La magnitud del vector es: " + magnitud);
    }
}

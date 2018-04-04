package ejemplos.vectores;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo006 {
    /*
    Lea un vector de seis elementos e intercambie las posiciones de sus
    elementos, de tal forma que el primer elemento pase a ser el último y el
    último el primero, el segundo el penúltimo y así sucesivamente, e imprima 
    ese vector.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que intercambia posiciones de un vector ***\n");
        
        int [] vector = new int[6];
        
        Scanner n = new Scanner(System.in);
        
        for(int i=0; i<vector.length; i++){
            System.out.print("Ingrese el valor ["+(i+1)+"]: ");
            vector[i] = n.nextInt();
        }
        int j=0;
        
        for(int i=0; i<=2; i++){
            int aux = vector[i];
            vector[i] = vector[5-j];
            vector[5-j] = aux;
            j++;
        }
        
        for(int i=0; i<vector.length; i++){
            System.out.print(" " + vector[i] + " ");
        }
        
    }
}

package ejemplos.arreglos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo005 {
    /*
    Realice un algoritmo para obtener una matriz como el resultado de la suma 
    de dos matrices de orden M x N.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que realiza la suma de dos matrices ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = n.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = n.nextInt();
        
        int matrizA[][] = new int[filas][columnas];
        int matrizB[][] = new int[filas][columnas];
        int matrizC[][] = new int[filas][columnas];
        
        System.out.println("***** LLENADO DE MATRIZ A *****");
        
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matrizA[i][j] = n.nextInt();
            }
        }
        
        System.out.println("***** LLENADO DE MATRIZ B *****");
        
        for(int i=0; i<matrizB.length; i++){
            for(int j=0; j<matrizB[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matrizB[i][j] = n.nextInt();
            }
        }
        
        System.out.println("***** SUMA DE MATRICES C = A + B *****");
        
        for(int i=0; i<matrizC.length; i++){
            for(int j=0; j<matrizC[i].length; j++){                
                System.out.print((matrizC[i][j] = matrizA[i][j] + matrizB[i][j])+" ");
            }
            System.out.println("");
        }
    }
}

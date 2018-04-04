package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto001 {
    /*
    Obtener la matriz transpuesta de cualquier matriz de orden M x N.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Transponer una matriz ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = n.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = n.nextInt();
        
        int matrizA [][] = new int [filas][columnas];
        int matrizTrans [][] = new int [columnas][filas];
        
        System.out.println("***** LLENADO DE MATRIZ A *****");
        
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matrizA[i][j] = n.nextInt();
            }
        }
        
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                matrizTrans[j][i] = matrizA[i][j];
            }
        }
        
        System.out.println("***** MATRIZ TRANSPUESTA *****");
        
        for(int i=0; i<matrizTrans.length; i++){
            for(int j=0; j<matrizTrans[i].length; j++){                
                System.out.print(matrizTrans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

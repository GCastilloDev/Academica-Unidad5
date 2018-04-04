package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto004 {
    /*
    Obtener una matriz como el resultado de la resta de dos matrices de orden
    M x N. 
    */    
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula la resta de dos matrices ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa el número de filas de las matrices a restar: ");
        int filas = n.nextInt();
        System.out.print("Ingresa el número de columnas de las matrices a restar: ");
        int columnas = n.nextInt();
        
        System.out.println("*****LLENADO DE LA MATRIZ A*****\n");
        
        int matrizA[][] = new int[filas][columnas];
        
        for(int i=0; i<matrizA.length; i++){
                for(int j=0; j<matrizA[i].length; j++){
                    System.out.print("Ingresa el valor de la matriz \"A\" posición ["+i+"]["+j+"]: ");
                    matrizA[i][j] = n.nextInt();
                }
        }
       
        System.out.println("***** LLENADO DE MATRIZ B *****\n");
       
        int matrizB[][] = new int[filas][columnas];
       
        for(int i=0; i<matrizB.length; i++){
            for(int j=0; j<matrizB[i].length; j++){
            System.out.print("Ingresa el valor de la matriz \"B\" posición ["+i+"]["+j+"]: ");
            matrizB[i][j] = n.nextInt();
            }
        }
            
        int matrizC[][] = new int[filas][columnas];
        
        
        System.out.println("***** MATRIZ RESULTANTE DE A-B *****\n");
        
        //Llenado e impresión de la matriz C
        for(int i=0; i<matrizC.length; i++){
            for(int j=0; j<matrizC[i].length; j++){            
            matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
            System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }//Fin psvm
}

package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto016 {
    /*
    Calcule el producto de dos vectores. Uno de ellos es de una fila con diez 
    elementos y el otro con una columna de diez elementos. 
    */
    
    public static void main(String[] args) {        
        
        System.out.println("**** Programa que calcula el producto de dos matrices ****");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿Cuántas columnas tiene la primera matriz?: ");
        int columnas = n.nextInt();
        System.out.print("¿Cuántas filas tiene la segunda matriz?: ");
        int filas = n.nextInt();
        
        int matrizA[][] = new int [10][columnas];
        
        System.out.println("***** LLENADO DE MATRIZ A *****");
        
            for(int i=0; i<matrizA.length; i++){
                for(int j=0; j<matrizA[i].length; j++){
                    System.out.print("Ingresa el valor de la matriz \"A\" posición ["+i+"]["+j+"]: ");
                    matrizA[i][j] = n.nextInt();
                }
            }
            
        int matrizB[][] = new int [filas][10];
        
        System.out.println("***** LLENADO DE MATRIZ B *****");
        
            for(int i=0; i<matrizB.length; i++){
                for(int j=0; j<matrizB[i].length; j++){
                    System.out.print("Ingresa el valor de la matriz \"B\" posición ["+i+"]["+j+"]: ");
                    matrizB[i][j] = n.nextInt();
                }
            }
        
        int matrizAB[][] = new int[10][10];
        
        for(int i=0; i<matrizAB.length; i++){
                for(int j=0; j<matrizAB[i].length; j++){   
                    for(int k=0; k<matrizA[i].length; k++)
                    matrizAB[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }               
        
        System.out.println("***** RESULTADO DE LA MATRIZ AB *****");
        
            for(int i=0; i<matrizAB.length; i++){
                for(int j=0; j<matrizAB.length; j++){                  
                    System.out.print(matrizAB[i][j] + "\t");
                }
                System.out.println("");
            }       
        
    }
}

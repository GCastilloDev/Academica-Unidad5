package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto002 {
    /*
    Producto de dos matrices de orden M x N y P x Q
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el producto de dos matrices ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz A: ");
        int filasA = n.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        int columnasA = n.nextInt();
        System.out.print("Ingrese el número de filas de la matriz B: ");
        int filasB = n.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        int columnasB = n.nextInt();
        
        if (columnasA==filasB){          
            
            int matrizA[][] = new int [filasA][columnasA];//Se crea la matriz A
            int matrizB[][] = new int [filasB][columnasB];//Se crea la matriz B
            
            System.out.println("***** LLENADO DE MATRIZ A *****");
            for(int i=0; i<matrizA.length; i++){
                for(int j=0; j<matrizA[i].length; j++){
                    System.out.print("Ingresa el valor de la matriz \"A\" posición ["+i+"]["+j+"]: ");
                    matrizA[i][j] = n.nextInt();
                }
            }
            
            System.out.println("***** LLENADO DE MATRIZ B *****");
            for(int i=0; i<matrizB.length; i++){
                for(int j=0; j<matrizB[i].length; j++){
                    System.out.print("Ingresa el valor de la matriz \"B\" posición ["+i+"]["+j+"]: ");
                    matrizB[i][j] = n.nextInt();
                }
            }
            
            int matrizAB[][] = new int[filasA][columnasB];//Se crea la matriz resultante
            
            /*
            Se multiplican las matrices A y B y se almacenan en la matriz AB
            */
            for(int i=0; i<matrizAB.length; i++){
                for(int j=0; j<matrizAB[i].length; j++){   
                    for(int k=0; k<matrizA[i].length; k++)
                    matrizAB[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }            
            
            System.out.println("***** RESULTADO DE LA MATRIZ AB *****");
            for(int i=0; i<matrizAB.length; i++){
                for(int j=0; j<matrizAB.length; j++){                  
                    System.out.print(matrizAB[i][j] + " ");
                }
                System.out.println("");
            }                   
        }//Fin if
        
        else{
        System.out.println("****NO SE PUEDE OBTENER EL PRODUCTO DE LA MATRIZ A Y LA MATRIZ B****");
        }
        
    }
    
}

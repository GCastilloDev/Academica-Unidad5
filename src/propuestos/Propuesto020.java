package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto020 {
    /*
    Calcule el valor que se obtiene al multiplicar entre sí los elementos de la 
    diagonal principal de una matriz de 5 por 5 elementos.
    */
    
    public static void main(String[] args) {
        
        System.out.println("***** \tPrograma que multiplica elemento por elemento"
                + " la diagonal principal\n \ty muestra el resultado de dicha"
                + " multiplicación *****");
        
       Scanner n = new Scanner(System.in);
       
       int[][] matrizA = new int[5][5];
       int[][] matrizB = new int[5][5];
       
       /* Matrices de prueba
       int[][] matrizA = {{1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5}};
       
       int[][] matrizB = {{9,8,7,6,5},
                          {4,3,2,1,0},
                          {9,8,7,6,5},
                          {4,3,2,1,0},
                          {9,8,7,6,5}};
        */
            
       //Llenado de la matrizA
       System.out.println("\n**** LLENADO DE LA MATRIZ A ****");
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matrizA[i][j] = n.nextInt();
            }
        }
        
        //Llenado de la matrizB
        System.out.println("\n**** LLENADO DE LA MATRIZ B****\n");
        for(int i=0; i<matrizB.length; i++){
            for(int j=0; j<matrizB[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matrizB[i][j] = n.nextInt();
            }
        }
               
        //Resultado de la multiplicación de elemento por elemento de la diagonal de la matriz
        System.out.println("*** RESULTADO DE LA MULTIPLIACIÓN DE ELEMENTO POR ELEMENTO DE LA DIAGONAL ***");
        for (int i=0; i<matrizA.length; i++){
            int producto = matrizA[i][i]*matrizB[i][i];
            System.out.print(producto + " ");
        }
    }
}

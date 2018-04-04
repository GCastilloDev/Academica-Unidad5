package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto011 {
    /*
    Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una).
    Lea los arreglos y determine si la diagonal principal de la primera es igual
    a la diagonal principal de la segunda. (Diagonal principal es donde los 
    subíndices I, J son iguales). 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*****  Programa que determina si la diagonal de dos"
                + " matrices son iguales *****");
        
        int [][] matrizA = new int[12][12];
        int [][] matrizB = new int[12][12];
        
        /*
        int [][] matrizA = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        int [][] matrizB = {{1,2,3},
                            {4,5,6},
                            {7,8,10}};
        */
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("***** LLENADO DE MATRIZ A *****\n");
        
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matrizA[i][j] = n.nextInt();
            }
        }
        
        System.out.println("\n***** LLENADO DE MATRIZ B *****\n");
        
        for(int i=0; i<matrizB.length; i++){
            for(int j=0; j<matrizB[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matrizB[i][j] = n.nextInt();
            }
        }
                
        boolean diagonalPrincipal = false;
        
        for(int i=0; i<matrizA.length; i++){
            
            if(matrizA[i][i]==matrizB[i][i]){
                diagonalPrincipal = true;
            }
            else{
            diagonalPrincipal = false;
            break;
            }
            
        }
        
        if (diagonalPrincipal == true) System.out.println("\nLAS DIAGONALES PRINCIPALES"
                + " DE LOS ARREGLOS SON IGUALES");
        else System.out.println("\nLAS DIAGONALES PRINCIPALES DE LOS ARREGLOS NO SON IGUALES");
    }
}

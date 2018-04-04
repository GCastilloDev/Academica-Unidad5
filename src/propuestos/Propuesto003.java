package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto003 {
    /*
    Lea un arreglo de M filas y N columnas y que calcule la suma de los
    elementos de la diagonal principal. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula la suma de la diagonal "
                + "de una matriz ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = n.nextInt();
        System.out.print("Ingresa el número de columnas del la matriz: ");
        int columnas = n.nextInt();
        
        int matriz [][] = new int[filas][columnas];
        
        System.out.println("**** LLENADO DE LA MATRIZ ****\n");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }
        
        int suma = 0;
        for(int i=0; i<matriz.length; i++){
            suma += matriz[i][i];
        }
        
        System.out.println("La suma de la diagonal es: " + suma);
    }//Fin psvm
    
}

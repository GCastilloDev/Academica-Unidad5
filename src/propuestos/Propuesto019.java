package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto019 {
    /*
    Realice un algoritmo que lea una matriz de C columnas y R renglones.
    A partir de ella genere dos vectores que contengan la suma de sus
    renglones y la suma de sus columnas. 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que lee una matriz, y a partir de ella"
                + " genera dos vectores que contengan la suma de cada uno de sus"
                + " renglones y la suma de sus columnas ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas = n.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas = n.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        //Llenado de la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }
        
        //Crear y llenar el vector con la suma de las filas
        int [] vectorFilas = new int[filas];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                vectorFilas[i]+=matriz[i][j];
            }
        }
        
        //Crear y llenar el vector con la suma de las columnas
        int [] vectorColumnas = new int[columnas];
        
        for(int i=0; i<vectorColumnas.length; i++){
            for(int j=0; j<matriz.length; j++){
                vectorColumnas[i]+=matriz[j][i];
            }
        }
        
        //Imprimir matriz que contiene la suma de las filas
        System.out.println("\n**** SUMA DE LAS FILAS ****");
        for(int i=0; i<vectorFilas.length; i++){
            System.out.print(vectorFilas[i] + " ");
        }
        
        //Imprimir matriz que contiene la suma de las columnas
        System.out.println("\n**** SUMA DE LAS COLUMNAS ****");
        for(int i=0; i<vectorColumnas.length; i++){
            System.out.print(vectorColumnas[i] + " ");
        }
        
        
    }//Fin psvm
}

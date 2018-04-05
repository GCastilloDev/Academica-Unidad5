package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto012 {
    /*
    Se tiene una matriz de 12 filas por 19 columnas y se desea encontrar todos
    sus elementos negativos y para que les cambie ese valor negativo por un 
    cero.
    */
    
    public static void main(String[] args) {
        System.out.println("**** Programa que encuentra los valores negativos "
                + "en una matriz y los cambia por cero ****");
        
        int [][] matriz = new int[12][19];     
        
        /*Matriz de prueba
        int [][] matriz = {{1,2,3,4,5,6,7,8,9,-1},
                           {4,-1,6,8,10,11,12,19,-1,10},
                           {-1,1,2,3,4,5,6,7,8,9}};
        */    
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("***** LLENADO DE MATRIZ *****\n");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor en posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }        
        
        //Cambia los negativos de la matriz por cero
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]<0){
                    matriz[i][j] = 0;
                }
            }
        }
        
        //Muestra matriz nueva
        System.out.println("\n***** MATRIZ NUEVA *****\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
                }
            System.out.println("");
        }
    }
}

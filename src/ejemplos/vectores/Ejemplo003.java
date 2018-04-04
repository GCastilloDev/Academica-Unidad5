package ejemplos.vectores;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo003 {
    /*
    Obtener un vector (C) de N elementos que contenga la suma de los elementos
    correspondientes de otros dos vectores (A y B).
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que suma de los elementos correspondientes"
                + " de otros dos vectores en un tercer vector ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño de los vectores: ");
        int tamaño = n.nextInt();
        
        System.out.println("***** LLENADO DE VECTOR A *****");
        
        //Creo el primer vector con el tamaño de la variable tamaño:
        int [] vectorA = new int[tamaño];
        
        //Con este for lleno los valores de mi arreglo:
        for (int i=0; i<vectorA.length; i++){
            System.out.print("Ingresa el valor ["+(i+1)+"]: ");
            vectorA[i] = n.nextInt();
        }
        
        System.out.println("***** LLENADO DE VECTOR B *****");
        
        int [] vectorB = new int[tamaño];
        for (int i=0; i<vectorB.length; i++){
            System.out.print("Ingresa el valor ["+(i+1)+"]: ");
            vectorB[i] = n.nextInt();
        }
        
        //Creo mi vector c:
        int [] vectorC = new int[tamaño];
        
        //Con este for realizo la suma de los dos vectores y los almaceno en el tercer
        //vector 
        for(int i=0; i<vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        
        System.out.println("***** IMPRESION DE LA SUMA DEL VECTOR A Y EL VECTOR B *****");
        
        //Con este for imprimo el contenido de mi tercer vector
        for (int i=0; i<vectorC.length; i++){
            System.out.println("Suma del vectorA y vectorB en posición ["+i+"]: " +
                    vectorC[i]);
        }
    }
}

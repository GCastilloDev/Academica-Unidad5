package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto021 {
    /*
    De una matriz de 5 por 5 elementos, encuentre cuántos elementos tienen valor
    par y cuántos valores impares.
    */
    
    /*
    Nota: El 0 es par. En otras palabras, la «paridad» —es decir la cualidad de 
    un número entero de ser par o impar— que le corresponde al número cero es la 
    de un número par. El cero cumple con la definición de número par: es un 
    entero múltiplo del dos, 0 = 0 × 2.
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que cuenta cuantos elementos pares e"
                + " impares tiene una matriz de 5x5 ***");
        
        Scanner n = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        /*Matriz de prueba
        int[][] matriz = {{1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5},
                          {6,7,8,9,0},
                          {1,2,3,4,5}};
        */
        
        System.out.println("\n**** LLENADO DE LA MATRIZ****\n");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }     
        
        //Contar la cantidad de pares e impares
        int contadorPar = 0;
        int contadorImpar = 0;
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]%2==0){
                    contadorPar++;
                }
                else{
                    contadorImpar++;
                }
            }
        }
        
        System.out.println("Cantidad de elementos pares: " + contadorPar);
        System.out.println("Cantidad de elementos impares: " + contadorImpar);
        
    }//Fin psvm
}

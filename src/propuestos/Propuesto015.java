package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto015 {
    /*
    Lea una matriz de cinco filas y seis columnas y que cuente  los elementos
    negativos que contiene, así como también cuántos elementos de la diagonal
    principal son igual a cero. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que lee una matriz y calcula cuantos "
                + "elementos negativos tiene y cuantos elementos de su diagonal "
                + "principal son cero ***\n");
        
        Scanner n = new Scanner(System.in);
        
        //int [][] matriz = new int[5][6];
        int [][] matriz = {{0,1,2,3,4,5},
                           {6,1,7,8,9,0},
                           {-1,2,2,3,4,5},
                           {6,7,8,3,9,0},
                           {1,2,3,4,-1,5}};
        
        /*
        System.out.println("***** LLENADO DE MATRIZ *****\n");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingrese el valor de la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }
        */
        
        //Determinar cuantos elementos negativos hay y cuantos en su diagonal son cero
        int contadorNegativos = 0;
        int contadorCeros = 0;
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]<0){
                    contadorNegativos++;
                }
            }
            if(matriz[i][i]==0){
                contadorCeros++;
            }
        }
        
        System.out.println("Elementos negativos: " + contadorNegativos);
        System.out.println("Ceros en diagonal principal: " + contadorCeros);
    }
}

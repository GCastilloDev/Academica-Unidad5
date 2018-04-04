package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto005 {
    /*
    Determinar si una matriz es de tipo diagonal: es una matriz cuadrada en la 
    cual todos sus elementos son cero, excepto los electos de la diagonal principal. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Determinar si una matriz es tipo diagonal ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = n.nextInt();
        System.out.print("Ingresa el número de columnas del la matriz: ");
        int columnas = n.nextInt();
        
        boolean verificar = false;
        
        if(filas==columnas){
                       
            int matriz[][] = new int[filas][columnas];
            
        System.out.println("**** LLENADO DE LA MATRIZ ****\n");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor de la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = n.nextInt();
            }
        }
                
        for(int i=0; i<matriz.length; i++){
            int suma = 0;
                for(int j=0; j<matriz[i].length; j++){                   
                     
                    if (matriz[i][i] != 0){
                    suma+= matriz[i][j];
                    }
                    else{
                        verificar = false;
                        break;
                    }                        
                }               
                if(suma==matriz[i][i]){
                verificar = true;
                }
                else{
                verificar = false;
                break;
                }
            }
        
        if (verificar == true){
            System.out.println("\nLA MATRIZ ES DE TIPO DIAGONAL");
        }
        else{
            System.out.println("\nLA MATRIZ NO ES DE TIPO DIAGONAL");
        }
        
        }//Fin if principal
        else{
            System.out.println("***NO SE PUEDE CALCULAR LA MATRIZ, LA MATRIZ DEBE SER CUADRADA***");
        }      
                
    }//Fin psvm
}


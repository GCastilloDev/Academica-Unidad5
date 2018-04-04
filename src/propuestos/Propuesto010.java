package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto010 {
    /*
    Lea dos vectores de cien elementos y que calcule la suma de éstos guardando
    su resultado en otro vector, el cual se debe presentar en forma impresa.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que lee 200 valores divido en dos vectores"
                + " de cien elementos cada uno, y que al sumarlos lo muestre en otro"
                + " vector ***");
        
       Scanner n = new Scanner(System.in);
        
       int [] vectorA = new int[100];
       int [] vectorB = new int[100];
       int [] vectorC = new int[100];
       
        System.out.println("***** LLENADO VECTOR A *****\n");
        
        for(int i=0; i<vectorA.length; i++){
            System.out.print("Ingresa el valor del primer vector en la posición ["+i+"]: ");
            vectorA[i] = n.nextInt();
        }
        
        System.out.println("\n***** LLENADO VECTOR B *****\n");
        
        for(int i=0; i<vectorB.length; i++){
            System.out.print("Ingresa el valor del segundo vector en la posición ["+i+"]: ");
            vectorB[i] = n.nextInt();
        }        
        
        System.out.println("\n***** RESULTADO DE VECTOR A + VECTOR B *****\n");
        //Suma de vectorA y vectorB e impresión de vectorC:
        int salto=0;
        for(int i=0; i<vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.print(vectorC[i]+ " ");            
        }
    }
}

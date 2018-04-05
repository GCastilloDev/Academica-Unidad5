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
        
       //int [] vectorA = new int[100];
       //int [] vectorB = new int[100];
       int [] vectorC = new int[100];
       
       //Vectores de prueba
       int [] vectorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
                        27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
                        50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,
                        73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,
                        97,98,99,100};
       int [] vectorB = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
                        27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
                        50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,
                        73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,
                        97,98,99,100};
       
       /*
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
        */
        System.out.println("\n***** RESULTADO DE VECTOR A + VECTOR B *****\n");
        //Suma de vectorA y vectorB e impresión de vectorC:
        int salto=0;
        for(int i=0; i<vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.print(vectorC[i]+ "\t ");
            if((i+1)%10==0){
                System.out.println("");
            }
        }
    }
}

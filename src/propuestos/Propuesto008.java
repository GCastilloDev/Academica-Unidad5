package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto008 {
    /*
    Lea un vector y a partir de él forme un segundo vector, de tal forma que el 
    primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el
    último pase a ser el primero, y así sucesivamente. 
    */
    
    public static void main(String[] args) {
        System.out.println("Programa que ordena un vector en otro vector"
                + "resultante con los siguientes criterios: "
                + "\n*El primer elemento pase a ser el segundo"
                + "\n*El segundo pase a ser el tercero y asi sucesivamente hasta que"
                + "\n*El último pase a ser el primero\n");
        
        Scanner n = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño del vector: ");
        int tam = n.nextInt();
        
        int vectorA[] = new int [tam];
        
        for(int i=0; i<vectorA.length; i++){
            System.out.print("Ingresa el valor de la posición ["+(i+1)+"]: ");
            vectorA[i] = n.nextInt();
        }
        
        int vectorB[] = new int [tam];        
    
        //Ordenamiento vectorA en el vectorB
        for(int i=0; i<vectorA.length; i++){        
            if (i==0){
                vectorB[i] = vectorA[vectorA.length-1];
            }
            else{
            vectorB[i]=vectorA[i-1];
            }           
        }
    
        System.out.print("\nVector A: ");
        
        for(int i=0; i<vectorA.length; i++){        
            System.out.print(vectorA[i] + " ");
        }
        
        System.out.print("\nVector B: ");
        
        for(int i=0; i<vectorA.length; i++){        
          System.out.print(vectorB[i] + " ");
        }
    
    }
}

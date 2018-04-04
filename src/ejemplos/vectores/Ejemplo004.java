package ejemplos.vectores;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo004 {
    /*
    Se tienen los nombres de los N alumnos de una escuela, además de su promedio
    general. Realice un algoritmo para capturar esta información, la cual se 
    debe almacenar en arreglos, un vector para el nombre y otro para el 
    promedio, después de capturar la información se debe ordenar con base en su
    promedio, de mayor a menor, los nombres deben corresponder con los promedios. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que captura promedios de alumnos y los"
                + " ordena de mayor a menor ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa cuántos promedios ingresaras: ");
        int tamaño = n.nextInt();
        String [] nombre = new String[tamaño];
        float [] promedio = new float[tamaño];
        
        for (int i=0; i<nombre.length;  i++){
            System.out.print("Ingresa el nombre ["+(i+1)+"]: ");
            nombre[i] = n.next();
            System.out.print("Ingresa el promedio de "+nombre[i]+" :");
            promedio[i] = n.nextFloat();
        }
        
        for (int i=0; i<promedio.length; i++){            
            for (int j=i+1; j<promedio.length; j++){
               if (promedio[j] > promedio[i]){
                   float auxiliarPromedio = promedio[i];
                   String auxiliarNombre = nombre[i];
                   promedio[i] = promedio[j];
                   nombre[i] = nombre[j];
                   promedio[j] = auxiliarPromedio;
                   nombre[j] = auxiliarNombre;
               }
            }
        }
        
        System.out.println("\nNombre \t\tPromedio");
        for(int i=0; i<promedio.length; i++){
            System.out.println(nombre[i] + "\t\t" + promedio[i]);
        }
    }
}

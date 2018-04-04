package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto006 {
    /*
    Lea los nombres y las edades de diez alumnos, y que los datos se almacenen 
    en dos vectores, y con base en esto se determine el nombre del alumno con 
    la edad mayor del arreglo. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que devuelve el nombre del alumno con "
                + "mayor calificación ***\n");
        
        Scanner n = new Scanner(System.in);
        
        String nombres[] = new String[10];
        float calificaciones[] = new float[10];
        
        for(int i=0; i<nombres.length; i++){
            System.out.print("Ingresa el nombre ["+(i+1)+"]: ");
            nombres[i] = n.next();
            System.out.print("Ingrese la calificación de "+nombres[i]+": ");
            calificaciones[i] = n.nextFloat();
        }
        
        float cali = 0;
        int posicion = 0;
        
        for(int i=0; i<calificaciones.length; i++){
            if(calificaciones[i]>cali){
                cali = calificaciones[i];
                posicion=i;
            }
        }
        
        System.out.println("\nEl alumno con la calificación más alta es: " + nombres[posicion]);
    }
}

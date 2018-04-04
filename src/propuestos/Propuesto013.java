package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto013 {
    /*
    Se tiene en un arreglo cien elementos representando calificaciones de los
    estudiantes de una escuela. lea el arreglo y calcule la calificación 
    promedio del grupo, además, que cuente los estudiantes que obtuvieron
    calificaciones arriba del promedio del grupo. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el promedio de un grupo y "
                + " determina cuantos alumnos tiene una calificacion mayor al "
                + "promedio del grupo ***");
        
        Scanner n = new Scanner(System.in);
        
        float [] calificaciones = new float[100];
        //float [] calificaciones = {100,90,80,50,70,76};
        
        float suma = 0;
        float promedio = 0;
        int contador = 0;
        
        for(int i=0; i<calificaciones.length; i++){
            int condicion = calificaciones.length - 1;
            System.out.print("Ingresa el valor ["+(i+1)+"]: ");
            calificaciones[i] = n.nextFloat();
            suma+=calificaciones[i];
            if (i==condicion){
                promedio = suma / calificaciones.length;
                for(int j=0; j<calificaciones.length; j++){
                    if (calificaciones[j]>promedio){
                        contador++;
                    }
                }
            }
        }
        
        System.out.println("Promedio del grupo: " + promedio);
        System.out.println("Alumnos con calificación mayor al promedio del grupo: " + contador);
    }
}

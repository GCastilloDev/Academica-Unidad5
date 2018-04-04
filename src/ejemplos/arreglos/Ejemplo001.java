package ejemplos.arreglos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo001 {
    /*
    Suponga que tiene tres calificaciones, de las cuatro que tres alumnos 
    obtuvieron durante el período escolar. Esta información se puede almacenar
    de tal forma que los renglones representen las calificaciones de cada 
    alumno, mientras que las columnas representen esas calificaciones, pero de 
    cada materia en especial, realice la captura y la impresion de este arreglo
    bidimensional.
    */
    public static void main(String[] args) {
        
        System.out.println("*** Programa que almacena calificaciones de tres alumnos"
                + " de cuatro materias ***");
        
        int calificaciones[][] = new int[3][4];
        
        Scanner n = new Scanner(System.in);
        
        for (int i=0; i<calificaciones.length; i++){
            for(int j=0; j<calificaciones[i].length; j++){
                System.out.print("Ingresa la calificación ["+i+"]["+j+"]: ");
                calificaciones[i][j] = n.nextInt();
            }
        }
        
        for (int[] calificacione : calificaciones) {
            System.out.println("\n");
            for (int j = 0; j < calificacione.length; j++) {
                System.out.print("\t" + calificacione[j]);
            }
        }
    }
}

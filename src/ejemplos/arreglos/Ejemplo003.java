package ejemplos.arreglos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo003 {
    /*
    La empresa de transportes “The Big Old” cuenta con N choferes, de los cuales
    se conoce su nombre y los kilómetros que conducen durante cada día de la
    semana, esa información se guarda en un arreglo de N x 6. Se requiere un
    algoritmo que capture esa información y genere un vector con el total de
    kilómetros que recorrió cada chofer durante la semana. 
    */
    
    public static String obtenerDia(int dia){
       String diaN="";
        
       switch(dia) {
                    case 1:
                        diaN = "Lunes";
                        break;
                    case 2:
                        diaN = "Martes";
                        break;
                    case 3:
                        diaN = "Miércoles";
                        break;
                    case 4:
                        diaN = "Jueves";
                        break;
                    case 5:
                        diaN = "Viernes";
                        break;
                    case 6:
                        diaN = "Sábado";
                        break;
                }       
       return diaN;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el recorrido semanal de \"N\""
                + " choferes ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿Cuántos choferes almacenará? ");
        int tam = n.nextInt();
        
        String [] nombre = new String [tam];
        float [] kmSemana = new float[tam];
        float[][] kmDiario = new float[tam][6];
        
        //Lenado arreglo de nombres
        for (int i=0; i<nombre.length; i++){
            System.out.print("Ingresar nombre["+(i+1)+"]: ");
            nombre[i] = n.next();
        }
        
        //Llenado arreglo de km diario
        for (int i=0; i<kmDiario.length; i++){
            for (int j=0; j<kmDiario[i].length; j++){              
                
                System.out.print("Ingrese el km recorrido del "+obtenerDia(j+1)+" del chofer "+
                        nombre[i]+": ");
                kmDiario[i][j] = n.nextFloat();
            }
        }
        
        //Sumar km y ponerlos en el arreglo resultante
        for (int i=0; i<kmDiario.length; i++){
            for (int j=0; j<kmDiario[i].length; j++){              
                kmSemana[i]+=kmDiario[i][j];              
            }
        }
        
        //Mostrar el arreglo resultante
        for(int i=0; i<kmSemana.length; i++){
            System.out.println("\nEl km que recorrío "+nombre[i]+" toda la semana"
                    + " es de: "+kmSemana[i]+"Km.");
        }
    }
}

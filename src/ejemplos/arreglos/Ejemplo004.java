package ejemplos.arreglos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo004 {
    /*
    En un arreglo se tienen registradas las ventas de cinco empleados durante 
    cinco días de la semana. Se requiere determinar cuál fue la venta mayor 
    realizada. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que determina cual fué la venta mayor"
                + " de los empleados ***\n");
        
        Scanner n = new Scanner(System.in);
        
        float ventas [][] = new float[5][5];
        
        for(int i=0; i<ventas.length; i++){
            for(int j=0; j<ventas[i].length; j++){
                System.out.print("Ingrese la venta ["+(j+1)+"] del empleado ["+(i+1)+"]: ");
                ventas[i][j] = n.nextFloat();
            }
        }
        
        float ventaMayor = ventas[0][0];
        
        for (float[] venta : ventas) {
            for (int j = 0; j < venta.length; j++) {
                 ventaMayor = venta[j] > ventaMayor ? venta[j] : ventaMayor;
            }
        }
        
        System.out.println("Venta mayor $"+ventaMayor);
    }
}

package ejemplos.vectores;
/**
 *
 * @author Gustavo
 */

public class Ejemplo001 {
    /*
    Crear un arreglo de edades con cuatro edades
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que genera un arreglo de cuatro "
                + "posiciones con edades ***");
        
        int [] edad = {16,18,21,19};
        
        //Mostrar el contenido del arreglo:
        for(int i=0; i<edad.length;i++){
            System.out.println("Edad en posición ["+i+"]: " + edad[i]);
        }
        
    }
}

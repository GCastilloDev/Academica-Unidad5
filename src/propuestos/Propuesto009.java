package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto009 {
    /*
    Se tiene un arreglo de 15 filas y 12 columnas. Calcule y presente los
    resultados siguientes:
    *El menor elemento del arreglo
    *La suma de los elementos de las cinco primeras filas del arreglo
    *El total de elementos negativos en las columnas de la quinta a la nueve.
    */
    public static void main(String[] args) {
        System.out.println("Programa que genera un arreglo de 15 filas y 12 columnas, calcular:"
                + "\n*El menor elemento del arreglo"
                + "\n*La suma de los elementos de las cinco primeras filas del arreglo"
                + "\n*El total de elementos negativos en las columnas de la quinta a la nueve.\n");
        
       int arreglo [][] = new int[15][12];
       /*Arreglo de prueba
       int arreglo [][] = {{1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-9,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2},
                           {-1,-2,-3,-4,-5,-6,-7,-8,-10,0,-1,-2},
                           {1,2,3,4,5,6,7,8,9,0,1,2}};
       */
       
       
       Scanner n = new Scanner(System.in);
       
       //Lenado del arreglo
       for(int i=0; i<arreglo.length; i++){
           for(int j=0; i<arreglo[i].length; j++){
               System.out.print("Ingrese el valor de la posición ["+i+"]["+j+"]: ");
               arreglo[i][j] = n.nextInt();
           }
       }
       
       //Calcular el menor elemento del arreglo
       int filaMenor = 0;
       int columnaMenor = 0;
       int valor = 0;
       
       for(int i=0; i<arreglo.length; i++){
           for(int j=0; j<arreglo[i].length; j++){
              if(arreglo[i][j]<valor){
                  valor = arreglo[i][j];
                  filaMenor = i;
                  columnaMenor = j;
              } 
           }                       
       }
       
       //Sumar cinco primeras filas del arreglo
       int suma = 0;
       for(int i=0; i<5; i++){
           for(int j=0; j<arreglo[i].length; j++){
               suma+=arreglo[i][j];
           }                       
       }
       
       
       //Calcular los elementos negativos en las columnas de la quinta a la nueve
       int contador = 0;
             
       for(int i=0; i<arreglo.length; i++){
           int columna = arreglo[i].length - 1;
           for(int j=4; j<9; j++){
               if (arreglo[i][j]<0){
                   contador++;
               }           
           }                       
       }
       
       System.out.println("Menor elemento: "+arreglo[filaMenor][columnaMenor]);
       System.out.println("La suma de las primeras cinco filas es: " + suma);
       System.out.println("Elementos negativos en las columnas 5 a 9: " + contador);
       
    }
}

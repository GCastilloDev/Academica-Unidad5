package propuestos;
/**
 *
 * @author Gustavo
 */
public class Propuesto018 {
    /*
    Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un
    elemento negativo. Indique la posición que ese elemento ocupa en el arreglo
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que obtiene la posición en la matriz, sabiendo"
                + " que la matriz contien un elemento negativo ***\n");
        
        int[][] matriz = {{1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,-8}};
        
        int filas = 0;
        int columnas = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (matriz[i][j]<0){
                    filas = i;
                    columnas = j;
                }
                /*
                else{
                    filas = -1;
                    columnas = -1;
                }
                */
            }
        }
        
        System.out.println("Elemento negativo en posición: "+(filas+1)+","+(columnas+1));
    }
}

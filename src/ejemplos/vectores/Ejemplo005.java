package ejemplos.vectores;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo005 {
    /*
    Cierta empresa requiere controlar la existencia de diez productos, los
    cuales se almacenan en un vector A, mientras que los pedidos de los clientes
    de estos productos se almacenan en un vector B. Se requiere generar un tercer
    vector C con base en los anteriores que represente lo que se requiere comprar
    para mantener el stock de inventario, para esto se considera lo siguiente: 
    si los valores correspondientes de los vectores A y B son iguales se almacena
    este mismo valor, si el valor de B es mayor que el de A se almacena el doble 
    de la diferencia entre B y A, si se da el caso de que A es mayor que B, se 
    almacena B, que indica lo que se requiere comprar para mantener el stock de 
    inventario
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que determina los productos a comprar para mantener un stock ****\n");
        
        int existencia [] = new int[10];
        int pedido [] = new int[10];
        
        Scanner n = new Scanner(System.in);
        
        for(int i=0; i<existencia.length; i++){
            System.out.print("\nIngresa la existencia del producto ["+(i+1)+"]: ");
            existencia[i] = n.nextInt();
            System.out.print("Ingresa los pedidos del producto ["+(i+1)+"]: ");
            pedido[i] = n.nextInt();
        }
        
        int surtir [] = new int[10];
        
        for(int i=0; i<surtir.length; i++){
            
            if(existencia[i]==pedido[i]){
                surtir[i] = existencia[i];
            }
            else if(pedido[i] > existencia[i]){
                surtir[i] = (pedido[i] - existencia[i]) * 2;
            }
            else{
                surtir[i] = pedido[i];
            }
        }
        
        for(int i=0; i<surtir.length; i++){
            System.out.println("Cantidad a surtir del producto ["+(i+1)+"]: " +
                    surtir[i]);
        }
    }
}

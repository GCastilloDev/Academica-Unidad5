package propuestos;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto017 {
    /*
    Una compañía de transporte cuenta con cinco choferes, de los cuales se 
    conoce: nombre, horas trabajadas cada día de la semana (seis días) y sueldo 
    por hora. Realice un algoritmo que:
    *Calcule el total de horas trabajadas a la semana para cada trabajador. 
    *Calcule el sueldo semanal para cada uno de ellos. 
    *Calcule el total que pagará la empresa. 
    *Indique el nombre del trabajador que labora más horas el día lunes. 
    *Imprima un reporte con todos los datos anteriores.
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
        
        System.out.println("Programa de nómina que realiza: "
                + "\n\n*El calculo del total de horas trabajadas a la semana para cada trabajador. \n" +
                    "*El calculo del sueldo semanal para cada uno de ellos. \n" +
                    "*El total que pagará la empresa por la nómina semanal. \n" +
                    "*Indica el nombre del trabajador que labora más horas el día Lunes. \n" +
                    "*Imprime un reporte con todos los datos anteriores.");
        
        Scanner n = new Scanner(System.in);
        
        String [] nombre = new String [5];
        int [][] horasDiario = new int[5][6];
        int [] horasLunes = new int[5];
        int [] horasSemana = new int[5];
        float [] sueldoHora = new float[5];
        float [] sueldoSemana = new float[5];
        
        
        //Lenado arreglo de nombres, sueldo y horas trabajadas
        for (int i=0; i<nombre.length; i++){
            System.out.print("\nIngresar nombre del empleado a capturar: ");
            nombre[i] = n.next();
            System.out.print("Ingresa el sueldo por hora de "+nombre[i]+": $");
            sueldoHora[i] = n.nextFloat();
            for (int j=0; j<horasDiario[i].length; j++){       
                System.out.print("Ingrese las horas trabajadas el "+obtenerDia(j+1)+" por "+
                        nombre[i]+": ");
                horasDiario[i][j] = n.nextInt();
            }
        }       

        //Llenado arreglo de horas trabajadas
        /*
        for (int i=0; i<horasDiario.length; i++){
            for (int j=0; j<horasDiario[i].length; j++){       
                System.out.print("Ingrese las horas trabajadas el "+obtenerDia(j+1)+" del empleado "+
                        nombre[i]+": ");
                horasDiario[i][j] = n.nextInt();
            }
        }
        */
        
        //Sumar las horas y almacenarlos en el arreglo horasSemana
        
        for (int i=0; i<horasDiario.length; i++){
            for (int j=0; j<horasDiario[i].length; j++){              
                horasSemana[i]+=horasDiario[i][j];                
            }
        }
        
        //Calcular el sueldo del trabajador y almacenarlo en el arreglo sueldoSemana
        //Y almacenar el sueldo que pagara la empresa
        float nominaSemanal = 0;
        for (int i=0; i<sueldoSemana.length; i++){
            sueldoSemana[i] = sueldoHora[i] * horasSemana[i];
            nominaSemanal+=sueldoSemana[i];
        }
        
        //Crear un arreglo con las horas trabajadas de cada trabajador
        //Y obtener la posición del trabajador que mas trabajo el Lunes        
        int posicion = 0;
        int aux = 0;
        
        for (int i=0; i<horasLunes.length; i++){
            horasLunes[i] = horasDiario[i][0];
            
            if(horasLunes[i]>aux){
                posicion = i;
                aux = horasLunes[i];                
            }          
         }       
        
        //Crear el reporte********************************************************************
        
        //Horas trabajadas a la semana por cada trabajador
        System.out.println("\n***** HORAS TRABAJADAS A LA SEMANA POR CADA TRABAJADOR ****");
        System.out.println("Nombre \t\tHoras trabajadas a la semana");
        for (int i=0; i<nombre.length; i++){
            System.out.println(nombre[i] + "\t\t" + horasSemana[i]);
        }
        
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        System.out.println("\n***** SUELDO SEMANAL DE CADA TRABAJADOR ****");
        System.out.println("Nombre \t\tSalario semanal");
        for (int i=0; i<sueldoSemana.length; i++){
            System.out.println(nombre[i] + "\t\t" + f.format(sueldoSemana[i]));
        }
        
        //Costo de la nómina
        System.out.println("\nEl costo de la nómina semanal es: " + f.format(nominaSemanal));
        //Nombre del trabajador con más horas laboradas el Lunes:
        System.out.println("El empleado que más horas laboró el día Lunes es: " + nombre[posicion]);
        
    }

}

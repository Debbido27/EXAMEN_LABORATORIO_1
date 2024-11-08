
package primer_examen_laboratorio1;

import java.util.Scanner;


public class PRIMER_EXAMEN_LABORATORIO1 {
    

       public static void PIRAMIDE(Scanner entrada){
           
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\n\n\n\n**BIENVENIDO A EJERCICIO PIRAMIDE**\nDigite la cantidad de filas que desea en la piramide: ");
        int altura = entrada.nextInt();

        for (int i = 1; i <= altura; i++) {
            int sumaaltura = 0;
            int numeroImpar = 2 * i - 1; 
            
            System.out.print("Fila " + i + ": ");
            
            for (int j = 0; j < i; j++) {
                System.out.print(numeroImpar + " ");
                sumaaltura += numeroImpar;
                numeroImpar += 2; 
            }

            System.out.println("= " + sumaaltura); 

        }
           System.out.println("\n\n\n");

       }
       
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
       
       
       
       
       
       
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
     public static void MAYOR(Scanner entrada) {
        System.out.print("\n\n\n\n\n**BIENVENIDO A MAYOR**\nDigite un numero porfavor: ");
        int numero = entrada.nextInt();


        int numeromayor = numero;
        int sumanumeros = numero;
        int contadori = 1;

        int siguiente;
        
        
        do {
            System.out.print("\nDesea continuar con otro numero? (1=SI/2=NO): ");
            siguiente = entrada.nextInt();
           
            
            switch (siguiente){
                case 1:
                System.out.print("Digite un numero: ");
                numero = entrada.nextInt();
                
                sumanumeros += numero;
                contadori++;

                if (numero > numeromayor) {
                    numeromayor = numero;
                }
                    
                    break;
                    
                case 2:
                    break;
                    
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA!");
                    break;
            }
            
            }while(siguiente!=2);
                
    
        double promedio = (double) sumanumeros / contadori;
        System.out.println("Numero mayor ingresado: " + numeromayor);
        System.out.println("Promedio de los numeros ingresados: " + promedio);
        System.out.println("GRACIAS POR UTILIZAR MAYOR");
         System.out.println("\n\n\n\n");
    }
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
        
        
        
        
  
        
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int op;
        
        do{
            System.out.print("****MENU EJERCICIOS****\n1.Piramide\n2.El mayor\n3.Canales\n4.Caracteres vocales\n5.Salir\nDigite la opcion que desea: ");
            op = entrada.nextInt();
            
             switch(op){
               
                 case 1:
                     
                     PIRAMIDE(entrada);
                     
                     break;
                     
                     
                 case 2:
                     MAYOR(entrada);
                     break;
                     
                 case 3:
                     
                     break;
                     
                     
                 case 4:
                     
                     break;
                     
                 case 5:
                     
                     break;
                 
                     
                 default:
                     
                     break;
                     
                 
             }
            
            
            
        }while(op!=5);
    }
    
}

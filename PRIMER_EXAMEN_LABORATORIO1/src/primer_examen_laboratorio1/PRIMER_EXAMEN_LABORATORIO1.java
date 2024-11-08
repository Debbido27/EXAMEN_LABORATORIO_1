
package primer_examen_laboratorio1;

import java.util.Scanner;


public class PRIMER_EXAMEN_LABORATORIO1 {
    

       public static void PIRAMIDE(Scanner entrada){
           
                
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
            System.out.println("\n\n\n\n");
        }

       }
       
       
       

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

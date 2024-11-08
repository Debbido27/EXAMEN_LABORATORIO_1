
package primer_examen_laboratorio1;

import java.util.Scanner;


public class MEDINA_DAVID_E1 {
    

       public static void PIRAMIDE(Scanner entrada){
           
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\n\n\n\n\n\n**BIENVENIDO A EJERCICIO ERICKS ARQUITECTOS PYRAMIDE**\nDigite la cantidad de filas que desea en la piramide: ");
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
        System.out.print("\n\n\n\n\n**BIENVENIDO A MAYOR **\nDigite un numero porfavor: ");
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

        public static void CANALES (Scanner entrada){
            
            System.out.print("\n\n\n**BIENVENIDO A EJERCICIO CANALES ERICKS TV**\nIngrese su nombre porfavor: ");
            String nombre1 = entrada.next();
            
            int canalesHD=0;
            int CanalesNs=0;
            String tipodecanal;
            String seguir;
            
            do{
                System.out.print("\nIngrese el canal que desea agregar (HD, NORMAL): ");
                tipodecanal=entrada.next().toUpperCase();
                
                if(tipodecanal.equals("HD")){
                      canalesHD++;
                }else if (tipodecanal.equals("NORMAL")){
                    CanalesNs++;
                }
                
                System.out.println("Desea ingresar mas canales (SI/NO): ");
                seguir=entrada.next().toUpperCase();
                
                
            }while(seguir.equals("SI"));
            
            System.out.println("Digite el tipo de caja digital que desea \n 1.LIGHTBOX\n 2.HDBOX \n 3.DVRBOX: ");
            int SERVICIO = entrada.nextInt();
            int costoSERVICIO =0;
            
            
            
            if(SERVICIO==1){
                costoSERVICIO=50;                             
            }else if(SERVICIO==2){
                costoSERVICIO=100;
            }else if(SERVICIO==3){
                costoSERVICIO=150;
            }
            
            int costoCN = CanalesNs * 20;
            int costoHD =canalesHD * 30;//10 mas de la calidad hd
            int SUBTOTAL = costoCN + costoHD +costoSERVICIO;
            
            //impuesto
            double ISV = SUBTOTAL * 0.15;
            double TOTAL = SUBTOTAL +ISV;
            
            
            //RESULTADO
            System.out.println("\nSERVICIO ERICKS TV\nCleinte :"+nombre1+"\nCanales normales: "+CanalesNs+"\nCanales HD: "+canalesHD+"\nSubtotal:"+SUBTOTAL+"Lps"+"\nISV (15%):"+ISV+"Lps"+"\nTOTAL: "+TOTAL);
            
            System.out.println("\n\n\n");
            
        }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
        
        
        
        
        
        
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
      public static void VOCALES(Scanner entrada){
          
    
          System.out.println("\n\n**BIENVENIDO A VOCALES APRENDIENDO CONMIGO ERICKS**\nIngrese una palabra porfavor: ");
          String palabra = entrada.next();
          
          
          
          int vocales= 0;
          
          for (int i = 0; i < palabra.length(); i++) {
              char c =  palabra.charAt(i);
              
              switch (c){
                 case 'a': case 'e': case 'i': case 'o': case 'u':
                      vocales++;
                      break;
                  default:
                      break;
                       
              }
              
      }
              System.out.println("LAS VOCALES SON: "+vocales);
              System.out.println("GRACIAS POR USAR VOCALES");
              System.out.println("\n\n\n\n");
        
      }
        
        
        
        
        
        
        
        
        
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        
        
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("=====ERICKSQUIZ=====");
            System.out.print("\n****MENU EJERCICIOS****\n1.Piramide\n2.El mayor\n3.Canales\n4.Caracteres vocales\n5.Salir\nDigite la opcion que desea: ");
            op = entrada.nextInt();
            
             switch(op){
               
                 case 1:
                     
                     PIRAMIDE(entrada);
                     
                     break;
                     
                     
                 case 2:
                     MAYOR(entrada);
                     break;
                     
                 case 3:
                     CANALES(entrada);
                     break;
                     
                     
                 case 4:
                     VOCALES(entrada);
                     
                     break;
                     
                 case 5:
                     System.out.println("\n\nGRACIAS POR USAR EL PROGRAMA ERICKS QUIZ\n");
                     break;
                 
                     
                 default:
                     
                     break;
                     
                 
             }
            
            
            
        }while(op!=5);
    }
    
}

/******************************************************************************************************************
 * 
 * Nombre: Xabier Aramendi Gato 
 * Fecha: 30/09/2025 
 * Modulo: Programación. 
 * UD: UD1 Estructuras de un programa. 
 * Tarea: Tarea Evaluación 01. Realiza un programa en Java.
 * 
 * Descripción del programa: El objetivo de esta tarea es realizar un programa que visualice por consola una figura simétrica
 * 
 * Enlace autoevaluación: https://docs.google.com/document/d/1cPPVQjJh4EwcO-GC6tNvaFzn7fMaB__lOlTh1jKkWzc/edit?usp=sharing
 * 
 *******************************************************************************************************************/

public class Torre {
    
   static String v = "V";
   static String teja = "__/";
   static String tejaSombra = "\\__";
   static String ladrillo = ":::";
   static String pilar = "||";
   static int filasTejado = 4;
   
              
        public static void main(String[] args) {
        
         imprimirColumnas();     
         imprimirTejado();
         imprimirVentanal();
         imprimirSuelo();
         imprimirColumnas();
         imprimirTejado();
         imprimirVentanal();
         
        }
        
        // filas 1 al 4
        public static void imprimirColumnas() {
           for (int j = 1; j <= 4; j++) {
               for (int i = 1; i < 5; i++) {
                   System.out.print("   ");
               }
           System.out.print(pilar); 
           System.out.println(); 
           }  
        }   
        
        // filas 4 al 8
        public static void imprimirTejado() {
           for (int i = 1; i <= 4; i++) {
               for ( int j = i; j < filasTejado; j++) {  
                  System.out.print("   ");
                  }
               System.out.print("__/");
               for ( int j = 0; j < i - 1; j++) { 
                   System.out.print(ladrillo);
               }
              System.out.print(pilar);
           
              for (int j = 0; j < i - 1; j++) {
                   System.out.print(ladrillo);
               }
   
               System.out.println("\\__"); 
           } 
        }
        
        //fila 9
        public static void imprimirVentanal() {
            System.out.println("|========================|");
        }
        
        
        //filas 10 al 13
        //Aunque en el enunciado aparecen 25 "V"s, he sustituido el valor por 26, para dar con una regla que se repita entre las lineas 10 y 13 -> Cada fila tiene cuatro v-s menos que la anterior fila.
        public static void imprimirSuelo() {
           
           int ancho = 26;
           
           for (int i = 0; i < 4; i++) {
             
             for (int j = 0; j < i * 2; j++) { 
               System.out.print(" ");
             }   
             
             //Se reduce en cuatro "V"s la longitud de cada linea. 
             for (int j = 0; j < ancho - (i * 4); j++) {
                System.out.print("V");
             }
           
           System.out.println();
           }        
        }
        
        
      
}

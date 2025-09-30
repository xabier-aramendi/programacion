public class Piramide {
    public static void main(String[] args) {
    
        // patrones
        String v = "V";
        String teja = "__/";
        String tejaSombra = "\\__";
        String ladrillo = ":::";
        String pilar = "||";
        
        int filasTejado = 4;
        
        // filas 1 al 4
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i < 5; i++) {
                System.out.print("   ");
            }
        System.out.print(pilar); 
        System.out.println(); 
        }
        
        // filas 4 al 8
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
                System.out.print(":::");
            }

            System.out.println("\\__"); 
        } 
        
        //fila 9
        System.out.println("|========================|");
        
        //filas 10 al 13
        int ancho = 26;
        
        for (int i = 0; i <= 4; i++) {
          
          for (int j = 0; j < i * 2; j++) { 
            System.out.print(" ");
          }   
          
          for (int j = 0; j < ancho - (i * 4); j++) {
             System.out.print("V");
          }
        
        System.out.println();
        }
          
        
        //filas 14 al 25
        for (int j = 1; j <= 13; j++) {
            for (int i = 1; i < 5; i++) {
                System.out.print("   ");
            }
        System.out.print(pilar); 
        System.out.println(); 
        }
        
        // filas 25 al 28
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
                System.out.print(":::");
            }

            System.out.println("\\__"); 
        }
        
        //fila 29
        System.out.println("|========================|"); 

        
        
        
        
        
    }
}

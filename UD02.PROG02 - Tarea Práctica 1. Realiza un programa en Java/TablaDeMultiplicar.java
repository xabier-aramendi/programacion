/******************************************************************************************************************
 * 
 * Nombre: Xabier Aramendi Gato 
 * Fecha: 26/10/2025 
 * Modulo: Programaci�n. 
 * UD: UD2 Trabajando con m�todos y objetos. 
 * Tarea: Tarea Evaluaci�n 01. Realiza un programa en Java.
 * Descripci�n del programa: El objetivo de esta tarea es realizar un programa que visualizar� tablas de multiplicar. En cada fila acumula la suma de los productos y al final imprime tambi�n una suma global. * 
 * 
 *******************************************************************************************************************/

import java.util.Scanner;

/** Esta clase genera las tablas de multiplicar desde el 1 hasta un n�mero
introducido por el usuario, mostrando adem�s la suma parcial de cada tabla
y una suma global al final.*/
public class TablaDeMultiplicar {

   /** Punto de entrada del programa. Solicita al usuario un n�mero hasta el cual
   generar las tablas de multiplicar y muestra los resultados.*/
   public static void main(String[] args) {
      
      Scanner leerDatos = new Scanner(System.in);
      
      System.out.println("�Hasta que n�mero quieres crear la tabla de multiplicar?");
      int numTablas = leerDatos.nextInt();
      
      System.out.println("N�mero introducido: " + numTablas);
      System.out.println();
      
      System.out.println("TABLA DE MULTIPLICAR");
      System.out.println();

      // Se llama al m�todo que genera las tablas y devuelve la suma total
      int sumaGlobal = tablaMultiplicar(numTablas, leerDatos);
      
      System.out.println("Suma global = " + sumaGlobal);
      
   }
   
   /** Genera las tablas de multiplicar desde 1 hasta el n�mero indicado.
   Calcula la suma parcial de cada tabla y la suma global de todas ellas.*/
   public static int tablaMultiplicar(int numTablas, Scanner entrada) {
   
      int sumaGlobal = 0;
      
      // Bucle externo: genera las tablas desde 1 hasta numTablas
      for (int i = 1; i <= numTablas; i++) {
         
         System.out.println("Tabla de " + i);
         System.out.println("------------");
         int sumaParcial = 0;
         
         // Bucle interno: genera los 10 productos de la tabla actual
         for (int j = 1; j <= 10; j++) {
            int resultado = i * j;
            sumaParcial += resultado;
            
            // Se muestra el producto actual y la suma parcial acumulada
            System.out.println(i + " * " + j + " = " + resultado + " Suma parcial = " + sumaParcial);
         }
         
         System.out.println();
         System.out.println("Total de la tabla " + i + " = " + sumaParcial);
         System.out.println();
         
         // Acumulamos la suma parcial en la suma global
         sumaGlobal += sumaParcial;
      }
      
      //Devuelve el valor de la variable sumaGlobal
      return sumaGlobal;
   }
}

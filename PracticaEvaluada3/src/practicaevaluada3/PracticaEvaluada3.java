/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarar variables
        String nombreProducto = "";
        String diaSemana = "";
        int cantidadProducto = 0;  
        int suma = 0;
        
        //Inicializar el nombre del producto 
       
        
        //Datos random 2 ciclos for 
        int matrizVentas[][] = new int[7][3];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                Random rand = new Random();
                matrizVentas[i][j] = rand.nextInt(9);
                System.out.print(matrizVentas[i][j] + "-");
            }
            System.out.println("");    
        }
       //Sumar las filas o las columnas
       
      }
    
    }


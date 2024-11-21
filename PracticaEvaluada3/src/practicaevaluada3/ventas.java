/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author krist
 */
public class ventas {
    //Atributos
    private String nombreProducto;
    private String diaSemana;
    private int cantidadProducto;
    
    //Matriz
    int matrizVentas [][] = new int [7][3];
    
    //Método
    /*public void matrix (){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < cantidadProducto; j++) {
        }
      }      
    }
    */
    //
    
    //Constructor con parametros
    public ventas(String nombreProducto, String diaSemana) {
        this.nombreProducto = nombreProducto;
        this.diaSemana = diaSemana;
        
    }
    //Constructor sin parametros
    public ventas() {
        this.nombreProducto = "No se ha ingresado nada";
        this.diaSemana = "No se ha ingresado nada";
    }
    //Getter and Setter
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    //Métodos calcular el total de ventas por columnas 
    
    //Determine el día con mayores ventas totales
            
    //Encuentre el producto más vendido durante toda la semana
    
    //to string 
    /*@Override
    public String to String (){
      return "Nombre del producto: " + nombreProducto + "\n" + "Día de la Semana: " + diaSemana;
    }
    */
            
}  




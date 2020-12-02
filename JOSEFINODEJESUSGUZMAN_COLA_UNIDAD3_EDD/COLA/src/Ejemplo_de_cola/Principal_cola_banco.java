/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_de_cola;

/**
 *
 * @author JOSE
 */
public class Principal_cola_banco {
    public static void main(String[] args) {
    
   cola_de_un_banco c =new cola_de_un_banco(); // se crea un metodo con l variable c para imprimir los datos
   
    c.insertarcola();// se inserta la variable con el metodo de insertar datos 
    c.insertarcola();
    c.insertarcola();
    c.insertarcola();
    c.insertarcola();
        System.out.println("\n cola ingresada: ");// se imprime un mensaje con los datos ingresado
        c.eliminarcola();// // se utiliza la variable con la accion de nuestro metodo eliminar cola
     
   }
    
}
  
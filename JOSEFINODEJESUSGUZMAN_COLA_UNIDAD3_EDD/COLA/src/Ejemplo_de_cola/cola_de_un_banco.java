/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_de_cola;
import java.util.Scanner;
/**
 *
 * @author JOSE
 */
public class cola_de_un_banco{
   Cola_banco primero;// se  identifica la cabeza de nuestra cola
   Cola_banco ultimo;// se declara un metodo como  referencia para indicar el ultimo dato ingresado
   Scanner teclado=new Scanner(System.in);// se declara un tipo de escanner para leer nuestro dato desde el teclado
   
public cola_de_un_banco(){// se crea nuestro metodo costructor                                                                                                                                                                                             
    primero=null;//se crea el tipo de indicaciones con valor a null
    ultimo=null;
}
public void insertarcola(){//se declara un metodo de de inserta cola
    Cola_banco nuevo=new Cola_banco();// se declara nuestro metodo que contendra la cola
    System.out.println("ingrese el nombre que contendra la cola: ");// se pide el mensaje desde el teclado
    nuevo.nombre=teclado.next();// se ingresa nuestro datos por consola yse almacena en la variable nombre
    if (primero==null){// se usa una condicional para indicar si primer dato ingresado es igual al null
        primero=nuevo;// se indica que el primer dato ingresado pasa a ser nuestro dato
        primero.siguiente=null;// se indica que el el dato ingresado vaya al apuntador siguente y que guarde al null
        ultimo=nuevo;// se indica que el ultimo dato ingresado pase como nuevo en la cabeza de nuestro cola
    }else{// se usa la condicon sino se cumple la primera
        ultimo.siguiente=nuevo;//se indica que ultimo dato ingresado apunte hacia siguente si es que hay un  nuevo dato ingresado y que vaya aser el nuevo dato de la cola
        nuevo.siguiente=null;// se indica que el nuevo dato ingresado vaya y apunete hacia siguente y quees igual al null
        ultimo=nuevo;// se indica que el ultimo dato ingresado pase como nuevo dato
    }
    System.out.println("\n dato ingresado correctamente");// se imprime enl mensaje que el dato ha sido ingresado correctamente
}
 public void eliminarcola(){// se imprime nuestro metodo de eliminar nuestra cola
 Cola_banco actual=new Cola_banco();//  se crea un metodo actual para indicar los datos ingresado
 actual=primero;//se indica que nuestro dato ingresado va a ser actual
 if(primero != null){// se usa una condiccion si nuestro es ingresado es diferente de null
     while(actual != null){//se usa el while que recorra la cola indicando que actual es diferente de null
         System.out.println(""+actual.nombre);// se imprime un mensaje con los datos ingresado con los datos ingresado desde el teclado
         actual=actual.siguiente;// se indica que el dato actual pase a ser igual con el apuntador siguente
     }
 }else{// se usa la condicion sino se cumple la condicion
     System.out.println("\n la cola se encuentra vacia");// se indica al usuario que la cola esta vacia
 }
    }
}
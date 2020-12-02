# -*- coding: utf-8 -*-
"""
Created on Tue Nov  3 12:50:14 2020

@author: JOSE
"""

# crear un un programa de aereopuerto de vuelos
cola=["mario","jose","juan","carlos","londra,","miguel","paola"]# se crea la cola mediante listas

# agregamos elemento al final
cola.append("mike")# se inserta los elemtos  con el metodo append
cola.append("maria")
cola.append("rodrigo")
print(cola)# se imprime los datos de la cola
# sacendo elemento por el principio de la cola
n=cola.pop(0)# se utiliza el metodo pop para elinimar los datos ingresados
             #con la ayuda de de una variable para retornar los datos introducidos
print(f"atendiendo a {n}")# se imprime el mensaje con el metodo f para retornar el dato que se introdujo

n=cola.pop(0)
print(f"atendiendo a {n}")

n=cola.pop(0)
print(f"atendiendo a {n}")

print ("faltan: ",cola)# se imprime los datos de la cola
print("\n ''buen viaje '':")


  
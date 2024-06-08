/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3_estructura;

/**
 *
 * @author alext
 */
public class Rutinas {
   public Pila p1 = new Pila();
    
    public boolean encuentra(int x)
    {
        boolean respuesta = false;
        
        if(!p1.esVacia())
        {
            
            Nodo aux = p1.getCima();
            
            
            while(aux != null) 
            {
                if(x == Integer.parseInt(aux.getElemento().getNombre()))
                {
                    respuesta = true;
                    break;
                }
                else
                {
                    aux = aux.getSiguiente(); 
                }
            }
        }
        else
        {
            respuesta = false; 
        }
        
        return respuesta;
    }
    public void extrae(int x)
    {
        if(!p1.esVacia())
        {
            Nodo actual = p1.getCima(); 
            Nodo anterior = null;
            
            while(actual != null)
            {
                if(x == Integer.parseInt(actual.getElemento().getNombre()))
                {
                    if(anterior != null)
                    {
                        anterior.setSiguiente(actual.getSiguiente());
                        actual.setSiguiente(null);
                        actual = null;
                    }
                    else
                    {
                        p1.setCima(actual.getSiguiente());
                        actual.setSiguiente(null);
                        actual = null;
                    }
                    System.out.println("El elemento fue extraído");
                    break;
                }
                else
                {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
        }
        else
        {
            
            System.out.println("No se puede extraer el elemento, porque la Pila está vacía");
        }
    }

}
    


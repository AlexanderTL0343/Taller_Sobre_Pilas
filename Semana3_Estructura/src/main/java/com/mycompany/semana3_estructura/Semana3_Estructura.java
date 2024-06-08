/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana3_estructura;

/**
 *
 * @author alext
 */
public class Semana3_Estructura {

    public static void main(String[] args) {
       Pila nuevaPila = new Pila();
       
       nuevaPila.apilar();
       nuevaPila.apilar();
       nuevaPila.apilar();
       nuevaPila.apilar();
       nuevaPila.apilar();
       
       nuevaPila.mostar();
       
       
       
       Rutinas r = new Rutinas();
       
       r.p1 = nuevaPila;
       
       if(r.encuentra(9))
       {
           System.out.println("Encontrado");
       }
       else
       {
           System.out.println("No Encontrado");
       }
       r.extrae(6);
       
       nuevaPila.mostar();
    }
}

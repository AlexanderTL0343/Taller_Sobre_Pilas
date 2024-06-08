/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3_estructura;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }
    
    public boolean esVacia(){
        if(cima==null){
            return true;
        }else{
            return false;
        }
    }
     public void apilar()
    {
        Dato d = new Dato();
        
        d.setNombre(JOptionPane.showInputDialog(null, "Digite el numero:"));
        
        Nodo nuevo = new Nodo();
        
        nuevo.setElemento(d);
        
        if(esVacia())
        {
            cima = nuevo;
        }
        else
        {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
    public void desapilar(){
        if(!esVacia()){
            cima=cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "EL elemento fue extraido!");
        }else{
            JOptionPane.showMessageDialog(null, "No se puede extraer, pila vacia!");
        }
    }
    
    public void mostar(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        String s="";
        if(!esVacia()){
            Nodo aux=cima;
            while(aux != null){
                s=s+aux.getElemento().getNombre()+"\n";
                aux = aux.getSiguiente();
            }
       }
        return s;
    }
}

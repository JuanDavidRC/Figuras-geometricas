/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricass;

import java.util.Scanner;

/**
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
public class Circunferencia extends Figura2D {
     Scanner entrada = new Scanner(System.in);
    /**
     * Atributos de la clase triangulo
     */
    
   
    /**
     * la longitid de la cada punto de la figura
     */
    private String lado1;
    
     /**
    * metodo que recibe los lados del triangulo
    */
    @Override
    public void pedir() {
        System.out.println("Digite el radio");  
        lado1=entrada.nextLine();
        
        
    }
     @Override
    public double hallarArea() {
        double doble = Double.parseDouble(lado1);
        double area = (double)(Math.PI*((doble)*(doble)));
         return area;
    }
    /**
    * Retornara  el valor del perimetro de la circunferencia 
    *@return 
    */
    
     @Override
    public double hallarPerimetro() {
        double doble = Double.parseDouble(lado1);
        double perimetro = (double)(Math.PI*(2*doble));
        return perimetro;
    }
    
     /**
     * Imprime el Area y el perimetro del circunferencia
     */
    @Override
    public void mostrar() {
            System.out.println("Datos circulo");
            System.out.println("Radio : "+lado1);
            System.out.println("Area de la circunferencia : " + hallarArea());
            System.out.println("Perimetro de la circunferencia " + hallarPerimetro());   
    }
}

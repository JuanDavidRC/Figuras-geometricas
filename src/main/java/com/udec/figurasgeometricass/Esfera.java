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
public class Esfera extends Figura3D{
     Scanner entrada = new Scanner(System.in);
    /**
     * Atributos de la clase triangulo
     */
    private String radio;
    /**
      * metodo que recibe los datos
      */
     @Override
    public void pedir() {
        System.out.println("Digite el radio");  
        radio=entrada.nextLine();
        
    }
    /**
     * calcula el area de la figura y lo retorna para imprimir
     * @return area
     */

     @Override
    public double hallarArea() {
        double doble = Double.parseDouble(radio);
        double area=4 * Math.PI * Math.pow(doble, 2);
        
        return area;
    }
    /**
     * calcula el volumen de la figura y lo retorna para imprimir
     * @return volumen
     */
     @Override
     public double hallarVolumen(){
         double doble = Double.parseDouble(radio);
         double volumen=(4 * Math.PI * Math.pow(doble, 3))/3;
         return volumen;
     }
    /**
     * metodo que muestra los datos
     */
    
     @Override
    public void mostrar() {
            System.out.println("Datos Esfera");
            System.out.println("Radio : "+radio);
            System.out.println("Area de la Esfera : " + hallarArea());
            System.out.println("Volumen de la Esfera " + hallarVolumen());
    }

}

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
public class Piramide extends Figura3D {
      Scanner entrada = new Scanner(System.in);
    /**
     * Atributos de la clase triangulo
     */
    private String areaB;
    private String altura;
    private String areaL;
    /**
      * metodo que recibe los datos
      */
     @Override
    public void pedir() {
        System.out.println("Digite la longitid del area de la base");  
        areaB=entrada.nextLine();
         System.out.println("Digite la longitud de la altura de la pitamida ");  
        altura=entrada.nextLine();
         System.out.println("Digite la longitud de el area la cara ");  
        areaL=entrada.nextLine();
        
    }
     /**
     * calcula el area de la figura y lo retorna para imprimir
     * @return area
     */
     
    @Override
    public double hallarArea() {
        double doble = Double.parseDouble(areaB);
        double areaLa = Double.parseDouble(areaL);
        double area = areaLa+doble;
        return area;
    }
    /**
     * calcula el volumen de la figura y lo retorna para imprimir
     * @return volumen
     */
      @Override
     public double hallarVolumen(){
        double doble = Double.parseDouble(altura); 
        double areaBa = Double.parseDouble(areaB); 
        double volumen = (areaBa*doble)/3;
        return volumen;
    }
     /**
     * metodo que muestra los datos
     */
     @Override
    public void mostrar() {
        
            System.out.println("Datos piramide");
            System.out.println("Area de la Piramide : " + hallarArea());
            System.out.println("Volumen de la piramide " + hallarVolumen());
    }
}

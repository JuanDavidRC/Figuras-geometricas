/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricass;

import java.util.Scanner;

/**
 * Clase triangulo
 * @author JUAN DAVID REYES
 * @author  ALEJANDR TORRES
 */
public class Triangulo extends Figura2D {
    Scanner entrada = new Scanner(System.in);
    /**
     * Atributos de la clase triangulo
     */
    
    /**
     * perimetro de la figura
     */
    private double perimetro;
    /**
     * la longitid de la cada punto de la figura
     */
    private int lado1;
    
    private int lado2;
    
    private int lado3;
    
    private String tipo;

    public Triangulo() {
        
       
    }
    
    
   /**
    * metodo que recibe los lados del triangulo
    */
    @Override
    public void pedir() {
        System.out.println("Digite el primer lado");  
        lado1=entrada.nextInt();
        System.out.println("Digite el lado 2 del triangulo");
        lado2=entrada.nextInt();
        System.out.println("Digite el lado 3 del triangulo");
        lado3=entrada.nextInt();
    }
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean esTriangulo() {
        String resultado;
         if(lado1+lado2<lado3 || lado2+lado3<lado1 ||lado1+lado3<lado2){
            System.out.println("Estos valores no forman un triangulo");
        }
         else
             System.out.println("Este es el triangulo que digito");
        return true;
    }
    /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        if(lado1==lado2 && lado2==lado3) {
       tipo="equilatero";
        }
        if(lado1==lado2&&lado2!=lado3||lado2==lado2&&lado3!=lado1 || lado3==lado1 && lado1!=lado2) {
            tipo="isoceles";
        }
       if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1){
           tipo="escaleno";
        }
               
        return tipo; 
    }
    /**
     * metodo que cacula el perimetro y retorna 
     * para imprimir
     * @return perimetro
     */
    @Override
     public double hallarPerimetro() {      
        perimetro =  lado1 + lado2 + lado3;
        return perimetro;
    }
    /**
     * metodo que cacula el area y retorna 
     * para imprimir
     * @return area
     */ 
      @Override
    public double hallarArea() {
       
        double semiperimetro = perimetro / 2;        
        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        return area;
    }
    /**
     * metodo que muestra los datos
     */
    @Override
    public void mostrar() {
       
        if(esTriangulo()) {
            System.out.println("Datos Triangulo");
            System.out.println("Perimetro: " + hallarPerimetro());
            System.out.println("Area: " + hallarArea());
            System.out.println("Tipo de triangulo: "+ darTipoTriangulo() );
        } else {
            System.out.println("No es un triangulo");
        } 
    }

   
    
}

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
public class Cuadrado extends Figura2D {
    Scanner entrada = new Scanner(System.in);
    /**
     * Atributos de la clase triangulo
     */
    
    /**
     * perimetro de la figura
     */
  
    /**
     * la longitid de la cada punto de la figura
     */
    private int lado1;
    
    private int lado2;

   /**
    * metodo que recibe los lados del triangulo
    */
    @Override
    public void pedir() {
        System.out.println("Digite el primer lado");  
        lado1=entrada.nextInt();
        System.out.println("Digite el lado 2 del cuadrado");
        lado2=entrada.nextInt();   
    }
     /**
      * retorna verdadero si es un cuadrado o falso de no ser asi
      * @return 
      */
    private boolean esCuadrado() {
        if(lado1==lado2 ){
            System.out.print("Es un cuadrado");
        }
        else 
            System.out.print("Es un rectangulo");
        return true;
    }
    /**
     * retorna el tipo de figura que es cuadrado o rectangulo
     * @return 
     */
    public String Tipo() {
        
            String resultado=" ";
            
            if(lado1==lado2 ){
            resultado=" Cuadrado";
            }
            else
            {
            resultado="Rectangulo";
            }
            
        return resultado;
        }
     /**
     * Metodo que retorna el area de un Rectangulo o Cuadrado
     * @return  Area
     */
    @Override
    public double hallarArea() {
       double area;
       if(lado1==lado2){
             area=Math.pow(lado1,2);
        }
        else
            area=lado1*lado2;
        return area;
    }
     /**
     * Este metodo retornara el perimetro de un cuadrado o un rectangulo
     * @return 
     */
    
    @Override
     public double hallarPerimetro() {  
        double perimetro;
        //si los lados sin iguales retorna perimetro de un cuadrado
        if(lado1==lado2 ){
        perimetro=lado1*4;
    }   
        // sino retorna perimetro de un rectangulo
        else
            perimetro=lado1*2+lado1*2;
        return perimetro;
    }
    @Override
    public void mostrar() {
        
        if(esCuadrado()) {
           
            System.out.println("Perimetro: " + hallarPerimetro());
            System.out.println("Area: " + hallarArea());
            System.out.println(""+Tipo());
            } else {
            System.out.println("No es Cuadrado ");
        }  
    }

}

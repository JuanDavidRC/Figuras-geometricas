/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
public class Llamado {
     private Scanner teclado;
     private Triangulo triangulo;
     List<Operaciones> figuras = new ArrayList();
    /**
     * Constructor de la clase
     */
    public Llamado() {
        teclado = new Scanner(System.in);        
        
        iniciar();
    }
    /**
     * Metodo que da el menu al programa
     */
    private void menu(){
            System.out.println("1. Triangulo ");
            System.out.println("2.Circulo  ");
            System.out.println("3.Cuadrado ");
            System.out.println("4.esfera");
            System.out.println("5.cubo");
            System.out.println("6.piramide");
            System.out.println("7.Salir");
      
    }
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() { 
           while(true) {
            menu();
            byte opcion =  teclado.nextByte();
            if(opcion == 1) {
                Operaciones triangulo = new Triangulo();
                triangulo.pedir();
                figuras.add(triangulo);
            } else if(opcion == 2) {
                Operaciones circunferencia = new Circunferencia();
                circunferencia.pedir();
                figuras.add(circunferencia);
            } else if(opcion == 3) {
                Operaciones cuadrado = new Cuadrado();
                cuadrado.pedir();
                figuras.add(cuadrado);
            } else if(opcion == 4) {
                Operaciones esfera = new Esfera();
                esfera.pedir();
                figuras.add(esfera);
            }else if(opcion == 5) {
                Operaciones cubo = new Cubo();
                cubo.pedir();
                figuras.add(cubo);
            }
            else if(opcion == 6) {
                Operaciones piramide = new Piramide();
                piramide.pedir();
                figuras.add(piramide);
            }
             else if(opcion == 7) {
                Polimorfismo();
              break;
            }
        }
    }
    /**
     * metodo que llama los metodos mostrar
     */
    private void Polimorfismo( ){
        for(Operaciones recorrer :figuras){
            if(recorrer instanceof Triangulo ){
            ((Triangulo) recorrer).mostrar();
            }else if(recorrer instanceof Circunferencia){
                ((Circunferencia) recorrer).mostrar();
            }else if(recorrer instanceof Cuadrado){
                ((Cuadrado) recorrer).mostrar();
            }else if(recorrer instanceof Esfera){
                ((Esfera) recorrer).mostrar();
            }else if(recorrer instanceof Cubo){
                ((Cubo) recorrer).mostrar();
            }else if(recorrer instanceof Piramide){
                ((Piramide) recorrer).mostrar();
            }
        }  
    }
   
      
}

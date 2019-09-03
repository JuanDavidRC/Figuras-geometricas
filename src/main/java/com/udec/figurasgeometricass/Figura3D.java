/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricass;

/**
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
public abstract class Figura3D implements Operaciones{

    
    /**
     * metodos que se heredan e implementan
     * @return 
     */
    
    @Override
    public double hallarArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pedir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public abstract double hallarVolumen();
}

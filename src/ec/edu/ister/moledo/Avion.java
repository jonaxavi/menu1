/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.moledo;

/**
 *
 * @author LAB2-PC
 */
public class Avion {
    private int numeroPasajeros;
    private float cantidadCombustible;
    private String modelo;

    public Avion() {
    }

    public Avion(int numeroPasajeros, float cantidadCombustible, String modelo) {
        this.numeroPasajeros = numeroPasajeros;
        this.cantidadCombustible = cantidadCombustible;
        this.modelo = modelo;
    }

    public void setCantidadCombustible(float cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public float getCantidadCombustible() {
        return cantidadCombustible;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    
    
}

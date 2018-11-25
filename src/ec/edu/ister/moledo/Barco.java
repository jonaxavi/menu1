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
public class Barco {
    private int numeroTripulantes;
    private float capacidadCarga;
    private String nombreEmbarcacion;

    public Barco() {
    }

    public Barco(int numeroTripulantes, float capacidadCarga, String nombreEmbarcacion) {
        this.numeroTripulantes = numeroTripulantes;
        this.capacidadCarga = capacidadCarga;
        this.nombreEmbarcacion = nombreEmbarcacion;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setNombreEmbarcacion(String nombreEmbarcacion) {
        this.nombreEmbarcacion = nombreEmbarcacion;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getNombreEmbarcacion() {
        return nombreEmbarcacion;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }
    
}

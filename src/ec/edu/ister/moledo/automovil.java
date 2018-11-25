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
public class automovil {
    private String placa;
    private String chasis;
    private String marca;
    private String modelo;
    private String color;

    public automovil() {
    }

    public automovil(String placa, String chasis, String marca, String modelo, String color) {
        this.placa = placa;
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
}

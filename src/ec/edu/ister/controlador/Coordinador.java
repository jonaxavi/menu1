/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Coordinador {
    public String menuBarco(){
        String op=JOptionPane.showInputDialog("Opciones para embarcacion\n"
                + "1.-Asignar valores\n"
                + "2.-Retornar valores\n"
                + "3.-Salir");
        return op;
    }
    public String ingresoBarco(){
        String op=JOptionPane.showInputDialog("Opciones para embarcacion\n"
                + "1.-Asignar el nombre de la embarcacion\n"
                + "2.-Asignar capasidad en tonerladas\n"
                + "3.-Asignar numero de tripulantes");
        return op;
    }
    public String retornoBarco(){
        String op=JOptionPane.showInputDialog("Opciones para embarcacion\n"
                + "1.-Retorna el nombre de la embarcacion\n"
                + "2.-Retorna capasidad en tonerladas\n"
                + "3.-Retorna numero de tripulantes");
        return op;
    }
    
    public String menuAvion(){
        String op=JOptionPane.showInputDialog("Opciones para embarcacion\n"
                + "1.-Retorna el nombre de la embarcacion\n"
                + "2.-Retorna capasidad en tonerladas\n"
                + "3.-Retorna numero de tripulantes");
        return op;
    }
        
    public String ingresoAvion(){
        String op=JOptionPane.showInputDialog("Opciones para avion\n"
                + "1.-Asignar el numero de pasajeros\n"
                + "2.-Asignar cantidad de combustible\n"
                + "3.-Asignar modelo");
        return op;
    }
    
    public String retornoAvion(){
        String op=JOptionPane.showInputDialog("Opciones para avion\n"
                + "1.-Retorna el numero de pasajeros\n"
                + "2.-Retorna cantidad de combustible\n"
                + "3.-Retorna modelo");
        return op;
    }
    
    public String menuAutomovil(){
        String op=JOptionPane.showInputDialog("Opciones para automovil\n"
                + "1.-Asignar valores\n"
                + "2.-Retornar valores\n"
                + "3.-Salir");
        return op;
    }
        
    public String ingresoAutomovil(){
        String op=JOptionPane.showInputDialog("Opciones para automovil\n"
                + "1.-Asignar placa\n"
                + "2.-Asignar chasis\n"
                + "3.-Asignar marca\n"
                + "4.-Asignar modelo\n"
                + "5.-Asignar color\n");
        return op;
    }
    
    public String retornoAutomovil(){
        String op=JOptionPane.showInputDialog("Opciones para automovil\n"
                + "1.-Retornar placa\n"
                + "2.-Retornar chasis\n"
                + "3.-Retornar marca\n"
                + "4.-Retornar modelo\n"
                + "5.-Retornar color\n");
        return op;
    }
    public String menuPm(){
        String op=JOptionPane.showInputDialog("Escoja un transporte:\n"
                + "1.-Automovil\n"
                + "2.-Avion\n"
                + "3.-Barco\n"
                + "4.-salir\n");
        return op;
    }
    public void menuPrincipal(){
        String op="";
        do{
            op=menuPm();
            switch(op){
                case "1":
                    menuAutomovil();
                    break;
                case "2":
                    menuAvion();
                    break;
                case "3":
                    menuBarco();
                    break;  
            }
            
        }while(!op.equals("4"));
    }
    public void menuPrincipalAutomovil(){
        String op="";
        do{
            op=menuPm();
            switch(op){
                case "1":
                    ingresoAutomovil();
                    break;
                case "2":
                    retornoAutomovil();
                    break;
            }
            
        }while(!op.equals("3"));
    }
    public void menuPrincipalAvion(){
        String op="";
        do{
            op=menuPm();
            switch(op){
                case "1":
                    ingresoAvion();
                    break;
                case "2":
                    retornoAvion();
                    break;
            }  
        }while(!op.equals("3"));
    }
    public void menuPrincipalBarco(){
        String op="";
        do{
            op=menuPm();
            switch(op){
                case "1":
                    ingresoBarco();
                    break;
                case "2":
                    retornoBarco();
                    break;
            }  
        }while(!op.equals("3"));
    }
}

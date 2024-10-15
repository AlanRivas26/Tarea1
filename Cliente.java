/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Alan Rivas
 */


 public class Cliente extends Persona {
    private final String numeroCliente;

    // Constructor
    public Cliente(String nombre, int edad, String numeroCliente) {
        super(nombre, edad);
        this.numeroCliente = numeroCliente;
    }

    // Método para contactar representante
    public String contactarRepresentante() {
        return "Cliente " + getNombre() + " está contactando a un representante.";
    }

    // Método para solicitar información
    public String solicitarInformacion() {
        return "Cliente " + getNombre() + " ha solicitado información de su cuenta.";
    }
}   

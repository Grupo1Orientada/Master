/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author CINDY GONZALEZ
 */
public class Persona {
   
    private int edad;
    private String trabajo;
    private String nombre;
       
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public void MostrarInformacion(){
       System.out.println("Nombre: "+nombre);
       System.out.println("Edad: "+edad);
       System.out.println("lugar de trabajo: "+trabajo);
       
       
   }
    
    
}
package com.practica.modelo;

public class Persona {

    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;


    public Persona(int idPersona,String nombrePersona, String apellidoPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public String getNombre() {
        return nombrePersona;
    }

    public void setNombre(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellidoPersona;
    }

    public void setApellido(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}

package com.practica.vista;

import com.practica.controlador.PersonaControlador;
import com.practica.modelo.Persona;

public class PersonaVista {

    PersonaControlador controlador = new PersonaControlador();

    public void imprimirDatosPersonas(){
        System.out.println("LISTADO DE PERSONAS");
        for(Persona persona: controlador.obtenerPersonas()){
            System.out.println("ID: " + persona.getIdPersona());
            System.out.println("NOMBRE: " + persona.getNombre());
            System.out.println("APELLIDO: " + persona.getApellido());
            System.out.println("---------");
        }
    }

    public void registrarPersona(int id, String nombre, String apellido){
        controlador.registrarPersona(new Persona(id, nombre, apellido));
    }

    public void eliminarPersona(int idPersona){
        controlador.eliminarPersona(idPersona);
    }

    public void actualizarPersona(int idPersona, String nombrePersona, String apellidoPersona){
        controlador.actualizarPersona(idPersona,nombrePersona,apellidoPersona);
    }


}

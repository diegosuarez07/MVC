package com.practica.controlador;

import com.practica.dao.PersonaDAOImpl;
import com.practica.modelo.Persona;

import java.util.List;

public class PersonaControlador {

    private PersonaDAOImpl personaModelo = new PersonaDAOImpl();

    public void registrarPersona(Persona persona){
        personaModelo.registrar(persona);
    }

    public void eliminarPersona(int idPersona){
        personaModelo.eliminar(idPersona);
    }

    public void actualizarPersona(int idPersona, String nombrePersona, String apellidoPersona){
        personaModelo.actualizar(idPersona,nombrePersona,apellidoPersona);
    }


    public List<Persona> obtenerPersonas(){
        return personaModelo.listar();
    }




}

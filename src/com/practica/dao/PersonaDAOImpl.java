package com.practica.dao;

import com.practica.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO{

    List<Persona> listaPersonas;

    public PersonaDAOImpl() {
        listaPersonas = new ArrayList<>();
        Persona per1 = new Persona(1,"Diego", "Suarez");
        Persona per2 = new Persona(2,"Sebastian", "Dominguez");
        Persona per3 = new Persona(3, "Pablo", "Aimar");
        listaPersonas.add(per1);
        listaPersonas.add(per2);
        listaPersonas.add(per3);
    }

    @Override
    public List<Persona> listar() {
        return listaPersonas;
    }

    @Override
    public void registrar(Persona persona) {
        this.listaPersonas.add(persona);
    }

    @Override
    public void actualizar(int id, String nombre, String apellido) {
        for(Persona persona: listaPersonas){
            if(id == persona.getIdPersona()){
                persona.setIdPersona(id);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
            }
        }
    }

    @Override
    public void eliminar(int id) {
        for(Persona persona: listaPersonas){
            if(id == persona.getIdPersona()){
                listaPersonas.remove(persona);
            }
        }
    }

}

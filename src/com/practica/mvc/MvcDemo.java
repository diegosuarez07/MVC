package com.practica.mvc;

import com.practica.dao.CRUD;
import com.practica.dao.PersonaDAOImpl;
import com.practica.modelo.Persona;
import com.practica.controlador.PersonaControlador;
import com.practica.vista.PersonaVista;

import java.util.ArrayList;

public class MvcDemo {

    public static void main(String[] args) {


        PersonaVista vista = new PersonaVista();
        vista.registrarPersona(4,"Ivan", "Cortez");
        vista.registrarPersona(5,"Julieta", "Torres");
        vista.registrarPersona(6, "Gaston", "Rodriguez");
        vista.actualizarPersona(1,"Pablo", "Alarcon");
        vista.imprimirDatosPersonas();





    }







}

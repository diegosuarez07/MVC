package com.practica.dao;

import java.util.List;

public interface CRUD<T> {

    List<T> listar();
    void registrar(T t);
    void actualizar(int id,String nombre, String apellido);
    void eliminar(int id);

}

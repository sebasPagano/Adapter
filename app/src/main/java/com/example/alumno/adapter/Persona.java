package com.example.alumno.adapter;

/**
 * Created by alumno on 27/04/2017.
 */

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String Apellido)
    {
        this.apellido = Apellido;
        this.nombre = nombre;

    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }

    public void SetNombre(String nombre)
    {
     this.nombre = nombre;
    }
    public void SetApellido(String ape)
    {
        this.apellido = ape;
    }


}

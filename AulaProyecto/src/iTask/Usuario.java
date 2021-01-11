/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTask;

import java.io.Serializable;

/**
 *
 * @author danie
 */
public class Usuario implements Serializable{
   
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String contrasennia;
    private String fechaNa; 

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasennia() {
        return contrasennia;
    }

    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
    }

    public String getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(String fechaNa) {
        this.fechaNa = fechaNa;
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTask;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Usuario implements Serializable {

    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String contrasennia;
    private String fechaNa;
    private ArrayList<Tarea> listaTarea = new ArrayList<>();

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

    public ArrayList<Tarea> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(ArrayList<Tarea> listaTarea) {
        this.listaTarea = listaTarea;
    }
    
    public void agregarTarea(Tarea tarea) {
        listaTarea.add(tarea);
    }
    
     public void guardarTarea(Tarea objeto) {
        listaTarea.add(objeto);
    }
    public void MostrarTarea() {
        String lista = "";
        int size = listaTarea.size();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                lista += "Nombre de la tarea : " + listaTarea.get(i).getNombreDeTarea()
                        + "\nFecha De la tarea : " + listaTarea.get(i).getFechaTarea()
                        + "\nNota de la tarea : " + listaTarea.get(i).getContenido()
                        + "\n==============================================\n";
            }
        } else {
            lista = "no hay registros";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
    public void EliminarTarea(){
        listaTarea.remove(0);
    }

}

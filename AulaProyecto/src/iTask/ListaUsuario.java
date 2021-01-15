package iTask;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaUsuario {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private Serializacion serial = new Serializacion();
    
    
    public ListaUsuario() {
        this.listaUsuarios = serial.leer();
    }
    
    
    public void agregarUsuario (Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public int traePosicion(String usuario) {
        int posicion = -1;
        int sizeArralist = listaUsuarios.size();
        boolean existe = false;
        if (listaUsuarios.isEmpty()) {
        } else {
            for (int i = 0; i < sizeArralist; i++) {
                if (usuario.equals(listaUsuarios.get(i).getNombreUsuario())) {
                    posicion = i;
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                posicion = -1;
            }
        }
        return posicion;
    }
    
    public String obtenerPass(int pos) {
        return listaUsuarios.get(pos).getContrasennia();
    }
    
    public void guardar() {
        serial.serializar(listaUsuarios);
    }
    
    public Usuario obtenerUsuario(int pos) {
        return listaUsuarios.get(pos);
    }
    
    public void modificarUsuario(Usuario user, int pos) {
        this.listaUsuarios.set(pos, user);
    }
    
    public String obtenerUsuarios() {
        int size = listaUsuarios.size();
        String usuarios = "";
        if (size != 0){
            for (int i = 0; i < size; i++){
                 usuarios += "Nombre de Usuario : " + listaUsuarios.get(i).getNombreUsuario()
                        + "\nNombre : " + listaUsuarios.get(i).getNombre()
                        + "\nApellidos : " + listaUsuarios.get(i).getApellidos()
                        + "\n==============================================\n";
            }
        }
        else {
            usuarios = "No hay usuarios registrados";
        }
        return usuarios;
    }
}

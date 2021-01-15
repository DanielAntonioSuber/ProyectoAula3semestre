package iTask;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializacion {

    ArrayList<Usuario> listRecuperada = new ArrayList<>();

    public ArrayList<Usuario> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"));
            listRecuperada = (ArrayList<Usuario>) in.readObject();

        } catch (Exception e) {

        }
        return listRecuperada;
    }

    public void serializar(ArrayList<Usuario> ListaSeriar) {
        try {
            FileOutputStream out = new FileOutputStream("datos.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author danie
 */
public class VentanaPadre extends JFrame{
    
    public VentanaPadre() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);//metodo que hace que no se pueda modificar el tamaño de la ventana
        setSize(640, 480);//definimos el tamaño de la ventana
        setLocationRelativeTo(null);//definimos la posicion de la ventana en medio
        //creamos la una imagen de tipo icono
        ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/Logo_iTask.png"));
        setIconImage(logo.getImage());//colocamos el icono de la ventana
        setTitle("iTask");//definimos el titulo de la ventana
        this.setContentPane(new Fondo());//colocamos nuestro fondo
        getContentPane().setLayout(null);
    }
}

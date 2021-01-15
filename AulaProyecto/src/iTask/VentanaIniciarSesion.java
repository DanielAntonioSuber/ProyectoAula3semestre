package iTask;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaIniciarSesion extends VentanaPadre implements ActionListener,
        KeyListener {

    private JButton regresar, iniciarSesion;
    JLabel usua, contrase, inicio, olvi;
    JPasswordField constrasennia;
    JTextField usuario1;

    public VentanaIniciarSesion() {
        super();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        inicio = new JLabel("Inicio de sesion");
        inicio.setBounds(225, 100, 200, 30);
        inicio.setForeground(Color.WHITE);
        inicio.setFont(new Font("Arial", Font.BOLD, 25));
        add(inicio);

        olvi = new JLabel("¿Olvidaste la contraseña?");
        olvi.setBounds(225, 250, 200, 30);
        olvi.setForeground(Color.WHITE);
        add(olvi);

        usuario1 = new JTextField();
        usuario1.setBounds(180, 150, 300, 25);
        usuario1.setFont(new Font("Arial", 0, 15));
        usuario1.addKeyListener(this);
        add(usuario1);

        constrasennia = new JPasswordField(10);
        //constrasennia.setEchoChar('.');
        constrasennia.setBounds(180, 200, 300, 25);
        constrasennia.addKeyListener(this);
        constrasennia.setFont(new Font("Arial", 2, 20));
        add(constrasennia);

        usua = new JLabel("Usuario");
        usua.setBounds(70, 150, 300, 25);
        usua.setForeground(Color.WHITE);
        add(usua);

        contrase = new JLabel("Contraseña");
        contrase.setBounds(70, 200, 300, 25);
        contrase.setForeground(Color.WHITE);
        add(contrase);

        regresar = new JButton("Regresar");
        regresar.setBounds(70, 300, 150, 40);
        regresar.setBackground(new Color(250, 250, 250));
        regresar.setFont(new Font("Arial Black", 0, 14));
        regresar.addActionListener(this);
        add(regresar);

        iniciarSesion = new JButton("Iniciar Sesión");
        iniciarSesion.setBounds(410, 300, 150, 40);
        iniciarSesion.setBackground(new Color(250, 250, 250));
        iniciarSesion.setFont(new Font("Arial Black", 0, 14));
        iniciarSesion.addActionListener(this);
        add(iniciarSesion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ocultamos esta ventana y volvemos al inicio
        if (e.getActionCommand().equals("Regresar")) {
            dispose();
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new VentanaInicial().setVisible(true);
                }
            });
        }
        if (e.getActionCommand().equals("Iniciar Sesión")) {
            accionIniciarSesion();
        }
    }

    private void accionIniciarSesion() {
        String usuario = usuario1.getText();
        String pass = String.valueOf(constrasennia.getPassword());

        ListaUsuario lista = new ListaUsuario();
        int posicion = lista.traePosicion(usuario);

        if (posicion == -1) {
            JOptionPane.showMessageDialog(this, "El usuario no existe");
        } else 
            if (pass.equals(lista.obtenerPass(posicion))) {
                JOptionPane.showMessageDialog(this, "Validado");
                dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        
                        new Calendario(posicion).setVisible(true);
                    }
                });
            } 
            else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
            }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        String cadena = " ";
        //no permitimos espacion en ninguno de los dos campos de textos
        if (ke.getSource() == usuario1 || ke.getSource() == constrasennia) {
            char car = ke.getKeyChar();
            if (cadena.contains(String.valueOf(car))) {
                ke.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}

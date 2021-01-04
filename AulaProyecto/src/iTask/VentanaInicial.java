package iTask;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaInicial extends VentanaPadre implements ActionListener {

    private JButton RegistrarJButton;
    private JButton InicioSesionJButton;
    private JLabel saludoJLabel;
    private JLabel logoJLabel;
    private JLabel iTask;
    private JLabel sloganJLabel;
    private JLabel pregunta1;
    private JLabel pregunta2;

    public VentanaInicial() {
        super();
        componentes();
    }

    private void componentes() {
        //saludo
        saludoJLabel = new JLabel("Bienvenid@");
        saludoJLabel.setForeground(Color.white);//color de fuente
        saludoJLabel.setFont(new Font("Arial Black", 0, 40));//tamaño y tipo de fuente
        saludoJLabel.setBounds(197, 10, 246, 50);
        add(saludoJLabel);

        //colocamos el logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/Logo_iTask.png"));
        logoJLabel = new JLabel();
        logoJLabel.setIcon(new ImageIcon(logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        logoJLabel.setBounds(270, 80, 100, 100);
        add(logoJLabel);
        
        iTask = new JLabel("iTask");
        iTask.setBounds(298, 190, 44, 22);
        iTask.setForeground(Color.white);
        iTask.setFont(new Font("Arial", 0, 18));
        add(iTask);
        //texto
        sloganJLabel = new JLabel("\"Controla tu tiempo\"");
        sloganJLabel.setBounds(223, 250, 194, 40);
        sloganJLabel.setForeground(Color.white);
        sloganJLabel.setFont(new Font("Arial", 1, 20));
        add(sloganJLabel);

        //texto
        pregunta1 = new JLabel("¿Aún no te has registrado?");
        pregunta1.setForeground(Color.white);
        pregunta1.setBounds(60, 350, 200, 30);
        add(pregunta1);

        //boton de registro
        RegistrarJButton = new JButton("Registrarse");
        RegistrarJButton.setBounds(60, 380, 150, 40);
        RegistrarJButton.setBackground(new Color(250, 250, 250));
        RegistrarJButton.setFont(new Font("Arial Black", 0, 14));
        RegistrarJButton.addActionListener(this);
        add(RegistrarJButton);

        //texto
        pregunta2 = new JLabel("¿Ya tienes una cuenta?");
        pregunta2.setBounds(440, 350, 200, 30);
        pregunta2.setForeground(Color.white);
        add(pregunta2);

        //boton Inicio de sesion
        InicioSesionJButton = new JButton("Iniciar Sesión");
        InicioSesionJButton.setBounds(430, 380, 150, 40);
        InicioSesionJButton.setOpaque(true);
        InicioSesionJButton.setBackground(new Color(250, 250, 250));
        InicioSesionJButton.setFont(new Font("Arial Black", 0, 14));
        InicioSesionJButton.addActionListener(this);
        add(InicioSesionJButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Registrarse")) {
            dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new VentanaRegistro().setVisible(true);
                }
            });
        }
        else if (e.getActionCommand().equals("Iniciar Sesión")) {
            
        }
    }
    
}

package iTask;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaRegistro extends VentanaPadre implements ActionListener {

    private JTextField campoDeTextos[];
    private JLabel textoJLabel;
    private JLabel jLabels[];
    private JComboBox combos[];
    private JButton botonRegresar;
    private JButton botonRegistrar;

    public VentanaRegistro() {
        super();
        componetes();
    }

    private void componetes() {
        campoDeTextos = new JTextField[4];
        jLabels = new JLabel[9];
        combos = new JComboBox[3];
        Calendar fecha = Calendar.getInstance();
        int annio = fecha.get(Calendar.YEAR);
        int JlabelWidth = 0;
        int x = 0, y = 0;
        int xOfJlabel = 0;
        int yOfJlabel = 0;
        String textos[] = {"Nombre(s)", "Apellido(s)", "Nombre de usuario",
            "Contraseña", "Fecha de nacimiento"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
             "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        //texto 
        textoJLabel = new JLabel("Crea una cuenta nueva");
        textoJLabel.setForeground(Color.white);
        textoJLabel.setFont(new Font("Arial Black", 0, 32));
        textoJLabel.setBounds(120, 20, 400, 30);
        add(textoJLabel);

        //creamos dos labels
        for (int i = 0; i < 2; i++) {
            jLabels[i] = new JLabel(textos[i]);
            jLabels[i].setForeground(Color.white);
            jLabels[i].setFont(new Font("Arial", 1, 18));
        }
        jLabels[0].setBounds(126, 75, 92, 22);
        jLabels[1].setBounds(413, 75, 94, 22);
        add(jLabels[0]);
        add(jLabels[1]);

        //creamos dos campos de texto
        x = 80;
        for (int i = 0; i < 2; i++) {
            campoDeTextos[i] = new JTextField();
            campoDeTextos[i].setBounds(x, 102, 200, 30);
            campoDeTextos[i].setHorizontalAlignment(JTextField.CENTER);
            campoDeTextos[i].setFont(new Font("Arial", 0, 18));
            x = 360;
            add(campoDeTextos[i]);
        }

        //creamos los campos de textos con labes arriba de ellos
        y = 167;
        xOfJlabel = 237;
        yOfJlabel = 140;
        JlabelWidth = 167;
        for (int i = 2; i < 4; i++) {
            jLabels[i] = new JLabel(textos[i]);
            jLabels[i].setForeground(Color.white);
            jLabels[i].setFont(new Font("Arial", 1, 18));
            jLabels[i].setBounds(xOfJlabel, yOfJlabel, JlabelWidth, 22);
            add(jLabels[i]);

            JlabelWidth = 100;
            xOfJlabel = 270;
            yOfJlabel = 205;

            campoDeTextos[i] = new JTextField();
            campoDeTextos[i].setBounds(80, y, 480, 30);
            campoDeTextos[i].setHorizontalAlignment(JTextField.CENTER);
            campoDeTextos[i].setFont(new Font("Arial", 0, 18));
            add(campoDeTextos[i]);

            y += 65;
        }

        //colocamano el label con texto Fecha de nacimientos
        jLabels[4] = new JLabel(textos[4]);
        jLabels[4].setForeground(Color.white);
        jLabels[4].setFont(new Font("Arial", 1, 18));
        jLabels[4].setBounds(80, 270, 182, 22);
        add(jLabels[4]);

        x = 80;
        for (int i = 0; i < 3; i++) {
            combos[i] = new JComboBox();
            combos[i].setBounds(x, 300, 100, 30);
            combos[i].setBackground(Color.white);
            x += 190;
            add(combos[i]);
        }

        combos[0].addItem("Día");
        for (int i = 1; i <= 31; i++) {
            combos[0].addItem(i);
        }

        combos[1].addItem("Mes");
        for (String i : meses) {
            combos[1].addItem(i);
        }

        combos[2].addItem("Año");
        for (int i = annio; i > (annio - 120); i--) {
            combos[2].addItem(i);
        }
        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(410, 380, 150, 40);
        botonRegistrar.setBackground(new Color(250, 250, 250));
        botonRegistrar.setBackground(new Color(250, 250, 250));
        botonRegistrar.setFont(new Font("Arial Black", 0, 14));
        botonRegistrar.addActionListener(this);
        add(botonRegistrar);

        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(80, 380, 150, 40);
        botonRegresar.setBackground(new Color(250, 250, 250));
        botonRegresar.setBackground(new Color(250, 250, 250));
        botonRegresar.setFont(new Font("Arial Black", 0, 14));
        botonRegresar.addActionListener(this);
        add(botonRegresar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Regresar")) {
            dispose();
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new VentanaInicial().setVisible(true);
                }
            });
        } else if (e.getActionCommand().equals("Registrar")) {

        }
    }

}

package iTask;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaRegistro extends JFrame implements ActionListener,
        KeyListener {

    private JTextField campoDeTextos[];
    private JLabel textoJLabel;
    private JLabel JLabels[];

    public VentanaRegistro() {
        configuracionVentana();
        componetes();
    }

    private void configuracionVentana() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("iTask");
        this.setContentPane(new Fondo());
        getContentPane().setLayout(null);

    }

    private void componetes() {
        int x;
        textoJLabel = new JLabel("Crea una cuenta nueva");
        textoJLabel.setForeground(Color.white);
        textoJLabel.setFont(new Font("Arial Black", 0, 32));
        textoJLabel.setBounds(120, 20, 400, 30);
        add(textoJLabel);

        String textos[] = {"Nombre(s)", "Apellido(s)", "Nombre de usuario",
            "Contraseña", "Fecha de nacimiento", "Día", "Mes"};
        campoDeTextos = new JTextField[4];
        JLabels = new JLabel[9];

        for (int i = 0; i < 2; i++) {
            JLabels[i] = new JLabel(textos[i]);
            JLabels[i].setForeground(Color.white);
            JLabels[i].setFont(new Font("Arial", 1, 18));
        }
        JLabels[0].setBounds(126, 75, 92, 22);
        JLabels[1].setBounds(413, 75, 94, 22);
        add(JLabels[0]);
        add(JLabels[1]);
        
        x = 80;
        for (int i = 0; i < 2; i++) {
            campoDeTextos[i] = new JTextField();
            campoDeTextos[i].setBounds(x, 102, 200, 30);
            campoDeTextos[i].setHorizontalAlignment(JTextField.CENTER);
            campoDeTextos[i].setFont(new Font("Arial", 0, 18));
            x = 360;
            add(campoDeTextos[i]);
        }
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

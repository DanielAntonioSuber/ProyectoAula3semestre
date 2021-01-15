
package iTask;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calendario extends JFrame {

    private JLabel IngresaFecha;
    private JButton botonAgregarTarea;
    private JButton botonVerTareas;
    private JLabel ingresaNombreDeTarea;
    private JCalendar jCalendar1;
    private JDateChooser jDateChooser1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JLabel notaDeTarea;
    private JTextArea notaTarea;
    private JButton quitarTareas;
    private JButton salir;
    private JLabel saludo;
    private ListaUsuario listaUsuario = new ListaUsuario();
    private Usuario user = new Usuario();
    private int pos;

    public Calendario(int pos) {
        this.user = listaUsuario.obtenerUsuario(pos);
        this.pos = pos;
        initComponents();
        
        setLocationRelativeTo(null);//definimos la posicion de la ventana en medio
        //creamos la una imagen de tipo icono
        ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/Logo_iTask.png"));
        setIconImage(logo.getImage());//colocamos el icono de la ventana
        setTitle("iTask");//definimos el titulo de la ventana

    }

    
                         
    private void initComponents() {

        jPanel1 = new JPanel();
        botonVerTareas = new JButton();
        quitarTareas = new JButton();
        botonAgregarTarea = new JButton();
        jCalendar1 = new JCalendar();
        jTextField1 = new JTextField();
        IngresaFecha = new JLabel();
        ingresaNombreDeTarea = new JLabel();
        notaDeTarea = new JLabel();
        jDateChooser1 = new JDateChooser();
        saludo = new JLabel();
        salir = new JButton();
        jScrollPane1 = new JScrollPane();
        notaTarea = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(107, 27, 62));
        jPanel1.setLayout(null);

        botonVerTareas.setBackground(new java.awt.Color(255, 255, 255));
        botonVerTareas.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        botonVerTareas.setText("Ver Tareas");
        botonVerTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerTareasActionPerformed(evt);
            }
        });
        jPanel1.add(botonVerTareas);
        botonVerTareas.setBounds(270, 480, 120, 78);

        quitarTareas.setBackground(new java.awt.Color(255, 255, 255));
        quitarTareas.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        quitarTareas.setText("Quitar tarea");
        quitarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarTareasActionPerformed(evt);
            }
        });
        jPanel1.add(quitarTareas);
        quitarTareas.setBounds(60, 500, 155, 56);

        botonAgregarTarea.setBackground(new java.awt.Color(255, 255, 255));
        botonAgregarTarea.setFont(new java.awt.Font("Arial Black", 0, 14));
        botonAgregarTarea.setText("Agregar tarea");
        botonAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTareaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarTarea);
        botonAgregarTarea.setBounds(60, 390, 156, 56);

        jCalendar1.setBackground(new java.awt.Color(255, 0, 0));
        jCalendar1.setFont(new java.awt.Font("Arial", 0, 11)); 
        jCalendar1.setSundayForeground(new java.awt.Color(255, 0, 0));
        jCalendar1.setTodayButtonVisible(true);
        jCalendar1.setWeekOfYearVisible(false);
        jCalendar1.setWeekdayForeground(new java.awt.Color(0, 51, 255));
        
        jPanel1.add(jCalendar1);
        jCalendar1.setBounds(540, 90, 350, 310);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); 
        
        jPanel1.add(jTextField1);
        jTextField1.setBounds(50, 190, 360, 30);

        IngresaFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        IngresaFecha.setForeground(new java.awt.Color(255, 255, 255));
        IngresaFecha.setText("Ingresa la fecha");
       
        jPanel1.add(IngresaFecha);
        IngresaFecha.setBounds(50, 110, 160, 22);

        ingresaNombreDeTarea.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        ingresaNombreDeTarea.setForeground(new java.awt.Color(255, 255, 255));
        ingresaNombreDeTarea.setText("Ingresa el nombre la tarea");
        jPanel1.add(ingresaNombreDeTarea);
        ingresaNombreDeTarea.setBounds(50, 170, 250, 22);

        notaDeTarea.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        notaDeTarea.setForeground(new java.awt.Color(255, 255, 255));
        notaDeTarea.setText("Nota de la tarea");
        jPanel1.add(notaDeTarea);
        notaDeTarea.setBounds(50, 230, 160, 22);

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 14)); 
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(50, 130, 190, 30);

        saludo.setFont(new java.awt.Font("Arial Black", 1, 36)); 
        saludo.setForeground(new java.awt.Color(255, 255, 255));
        saludo.setText("Bienvenido(a) " + user.getNombre());
        jPanel1.add(saludo);
        saludo.setBounds(50, 10, 680, 50);

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Arial Black", 0, 14));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir);
        salir.setBounds(740, 490, 140, 70);

        notaTarea.setColumns(20);
        notaTarea.setFont(new java.awt.Font("Arial", 0, 14)); 
        notaTarea.setLineWrap(true);
        notaTarea.setRows(5);
        notaTarea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(notaTarea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 250, 360, 91);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                    

    private void quitarTareasActionPerformed(java.awt.event.ActionEvent evt) {
        user.EliminarTarea();
        listaUsuario.modificarUsuario(user, pos);
        listaUsuario.guardar();
        JOptionPane.showMessageDialog(this, "La tarea fue eliminada");
    }

    private void botonAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {
        Tarea dato = new Tarea();
        if (jTextField1.getText().equals("") || jDateChooser1.getDateFormatString().equals("") || notaTarea.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene los campos");
        } else {
            dato.setNombreDeTarea(jTextField1.getText());
            dato.setFechaTarea(jDateChooser1.getDate().toLocaleString());
            dato.setContenido(notaTarea.getText());
            user.guardarTarea(dato);
            JOptionPane.showMessageDialog(this, "La tarea fue agregada");
            listaUsuario.modificarUsuario(user, pos);
            listaUsuario.guardar();
        }

        notaTarea.setText("");
        notaDeTarea.setText("");
        jDateChooser1.setDate(null);
    }

    private void botonVerTareasActionPerformed(java.awt.event.ActionEvent evt) {
        user.MostrarTarea();

    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

      
}

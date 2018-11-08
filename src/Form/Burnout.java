/*
Author:
 Luis Fuentes Auraad
 Autómata Industrial
 Back-end Developer
 Cel: 3004386841
 */
package Form;

import Modelo.Reloj;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Burnout extends javax.swing.JFrame implements Runnable{

    private javax.swing.JFrame inicioForm;
    Reloj reloj = new Reloj();
    Thread hilo;
    FileInputStream direccion;
    AudioStream audio;
    
    public Burnout() throws FileNotFoundException, IOException {
        initComponents();
        this.direccion = new FileInputStream("G:\\PROYECTOS\\Psicología\\Audio\\Principal.wav");
        this.audio = new AudioStream(direccion);        
        AudioPlayer.player.start(audio);
        hilo = new Thread(this);
        hilo.start();
        fechaLB.setText(reloj.fechaActual());
        
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass()
                .getResource("/Imagenes/question.v1.1.png")).getImage();
        setIconImage(icon);
        this.setTitle("¿Qué es el síndrome Burnout?");
        
        sindrome_txPane.setText("El Síndrome de Burnout consiste en la evolución"
                + " del estrés laboral hacia un estado de estrés crónico.\n" +
            "Se caracteriza por un progresivo agotamiento"
                + " físico y mental, una falta de motivación absoluta por las "
                + "tareas realizadas, y en especial, por importantes cambios de "
                + "comportamiento en quienes lo padecen.");
        
        sintomas_txPane.setText("SÍNTOMAS A NIVEL EMOCIONAL\n\n" +
"AGOTAMIENTO EMOCIONAL: un desgaste profesional que lleva a la persona a un "
                + "agotamiento psíquico y fisiológico. Aparece una pérdida de "
                + "energía, fatiga a nivel físico y psíquico. El agotamiento "
                + "emocional se produce al tener que realizar unas funciones "
                + "laborales diariamente y permanentemente con personas que hay "
                + "que atender como objetos de trabajo.\n\n" +
"DESPERSONALIZACIÓN: se manifiesta en actitudes negativas en relación con los "
                + "usuarios/clientes, se da un incremento de la irritabilidad, "
                + "y pérdida de motivación. Por el endurecimiento de las "
                + "relaciones puede llegar a la deshumanización en el trato.\n\n" +
"FALTA DE REALIZACIÓN PERSONAL: disminución de la autoestima personal, "
                + "frustración de expectativas y manifestaciones de estrés a "
                + "nivel fisiológico, cognitivo y comportamiento.\n\n" +
"CAMBIOS EN EL ESTADO DE ÁNIMO: Es frecuente que el trabajador se encuentre "
                + "irritable y de mal humor.\n\n" +
"DESMOTIVACIÓN: El trabajador pierde toda ilusión por trabajar. \n\n" +
"FALTA DE ENERGÍA Y MENOR RENDIMIENTO: Se trata de una consecuencia lógica del "
                + "punto anterior; como el organismo gestiona de modo deficiente"
                + " los recursos de que dispone, su capacidad de producción "
                + "disminuye y el rendimiento por tanto baja. Además, produce "
                + "a medio y largo plazo un deterioro cognitivo, lo que puede "
                + "provocar pérdidas de memoria, falta de concentración y mayor "
                + "dificultad para aprender tareas o habilidades nuevas.\n"
                + "_________________________________________________________\n\n"
                + "SÍNTOMAS A NIVEL FÍSICO\n\n"
                + "AFECCIONES DEL SISTEMA LOCOMOTOR: Es frecuente la aparición "
                + "de dolores musculares y articulares, que se dan como resul"
                + "tado de la tensión generada por el estrés laboral y que por "
                + "lo general están provocadas por contracturas musculares.\n\n" +
"OTRAS ALTERACIONES PSICOSOMÁTICAS: como problemas gastrointestinales, "
                + "cardiovasculares, afecciones de la piel, dolores de cabeza o "
                + "cefaleas, mareos, alteraciones del apetito sexual y mayor "
                + "riesgo de obesidad entre otros.");
        
        causas_txPane.setText("CAUSAS DEL SÍNDROME DE BURNOUT\n\n" +
"°Puestos relacionados con atención al público, clientes o usuarios. \n" +
"°Acoso laboral.\n" +
"*Elevado nivel de responsabilidad\n" +
">Jornadas laborales o \"turnos\" demasiado largos\n" +
"°Trabajos muy monótonos\n" +
"\n" +
"CONSECUENCIAS DEL SÍNDROME DE BURNOUT\n\n" +
"°Aumento del riesgo de alcoholismo o consumo de drogas.\n" +
"°Alteraciones del sueño.\n" +
"°Bajada de las defensas.");
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaLB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        horaLB = new javax.swing.JLabel();
        tags = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        sindrome_txPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sintomas_txPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        causas_txPane = new javax.swing.JTextPane();
        recomendacion_button = new javax.swing.JButton();
        home_button = new javax.swing.JButton();
        audio_ok = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_Coachandling_v1.4.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel7.setText("COACHANDLIG");

        jLabel8.setFont(new java.awt.Font("Muli", 0, 8)); // NOI18N
        jLabel8.setText("BURNOUT  S.A");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario_.png"))); // NOI18N

        fechaLB.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        fechaLB.setText("Fecha");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj_.png"))); // NOI18N

        horaLB.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        horaLB.setText("hora");

        tags.setFont(new java.awt.Font("ABeeZee", 1, 12)); // NOI18N

        sindrome_txPane.setEditable(false);
        sindrome_txPane.setBackground(new java.awt.Color(151, 222, 151));
        sindrome_txPane.setFont(new java.awt.Font("ABeeZee", 0, 20)); // NOI18N
        sindrome_txPane.setAutoscrolls(false);
        jScrollPane1.setViewportView(sindrome_txPane);

        tags.addTab("SÍNDROME DE BURNOUT", jScrollPane1);

        jScrollPane2.setHorizontalScrollBar(null);

        sintomas_txPane.setEditable(false);
        sintomas_txPane.setFont(new java.awt.Font("ABeeZee", 0, 17)); // NOI18N
        sintomas_txPane.setAutoscrolls(false);
        jScrollPane2.setViewportView(sintomas_txPane);

        tags.addTab("SÍNTOMAS DEL BURNOUT", jScrollPane2);

        causas_txPane.setEditable(false);
        causas_txPane.setFont(new java.awt.Font("ABeeZee", 0, 20)); // NOI18N
        causas_txPane.setAutoscrolls(false);
        jScrollPane3.setViewportView(causas_txPane);

        tags.addTab("CAUSAS Y CONSECUENCIAS", jScrollPane3);

        recomendacion_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        recomendacion_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio.png"))); // NOI18N
        recomendacion_button.setText("Recomendaciones");
        recomendacion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomendacion_buttonActionPerformed(evt);
            }
        });

        home_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        home_button.setText("Inicio");
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        audio_ok.setSelected(true);
        audio_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audio_okActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audio (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tags, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(recomendacion_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_button)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addComponent(audio_ok, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(audio_ok)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(1, 1, 1))))))
                .addGap(18, 18, 18)
                .addComponent(tags, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recomendacion_button)
                    .addComponent(home_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        try {
            inicio();
        }
        catch (IOException ex) {
            Logger.getLogger(Burnout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_home_buttonActionPerformed

    private void recomendacion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomendacion_buttonActionPerformed
        try {
            recomendaciones();
        } catch (IOException ex) {
            Logger.getLogger(Burnout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_recomendacion_buttonActionPerformed

    private void audio_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audio_okActionPerformed
        if(audio_ok.isSelected())
        {
            AudioPlayer.player.start(audio);
        }
        if(!audio_ok.isSelected())
        {
            AudioPlayer.player.stop(audio);
        }
    }//GEN-LAST:event_audio_okActionPerformed

    
    public JFrame getInicioForm() {
        return inicioForm;
    }

    public void setInicioForm(JFrame form) {
        this.inicioForm = form;
    }  
    
    public void inicio() throws IOException
    {
        AudioPlayer.player.stop(audio);
        this.hide();
        Inicio inicio = new Inicio();
        inicio.setInicio(this);
        inicio.setVisible(true);
        inicio.setAutoRequestFocus(true);
        inicio.show(true);
        System.gc();        
        this.setVisible(false);
    }
    
    public void recomendaciones() throws IOException, IOException
    {
        AudioPlayer.player.stop(audio);
        Recomendaciones recomendaciones = new Recomendaciones();
        recomendaciones.setInicioForm(this);
        recomendaciones.setAutoRequestFocus(true);
        recomendaciones.show(true);
        System.gc();
        this.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Burnout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burnout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burnout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burnout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Burnout().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Burnout.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox audio_ok;
    private javax.swing.JTextPane causas_txPane;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel horaLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton recomendacion_button;
    private javax.swing.JTextPane sindrome_txPane;
    private javax.swing.JTextPane sintomas_txPane;
    private javax.swing.JTabbedPane tags;
    // End of variables declaration//GEN-END:variables
        
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == hilo) {
            Reloj reloj = new Reloj();
            horaLB.setText(reloj.horaActual());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}


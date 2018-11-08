/*
Author:
 Luis Fuentes Auraad
 Autómata Industrial
 Back-end Developer
 Cel: 3004386841
 */

package Form;

import Modelo.Preguntas;
import Modelo.Reloj;
import Modelo.Respuestas;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

//Este form usa la interfaz Runnable para manejar hilos. programa multiproceso.
public class Test extends javax.swing.JFrame implements Runnable {

    private javax.swing.JFrame inicioForm;
    
    Reloj reloj = new Reloj();
    Thread hilo;
    FileInputStream direccion;
    AudioStream audio;
    
    Preguntas preguntas = new Preguntas();
    List<Preguntas> test = preguntas.preguntasDeTest();
    Vector<String> testItems = new Vector<>();   
    
    Respuestas respuestas = new Respuestas();
    List<Respuestas> opciones = respuestas.respuestasDeTest();
    Vector<String> opcionesItems = new Vector<>();
   
    public Test() throws FileNotFoundException, IOException {
        this.direccion = new FileInputStream("G:\\PROYECTOS\\Psicología\\Audio\\Test.wav");
        this.audio = new AudioStream(direccion);
        AudioPlayer.player.start(audio);
        setResizable(false);
        initComponents();
        UIManager.put( "nimbusOrange", new Color( 97, 209, 105));
        hilo = new Thread(this);//Instanciar el objeto Thread con el form actual como argumento.
        hilo.start();//Inicia el hilo.
        fechaLB.setText(reloj.fechaActual());//Obtiene la fecha de reloj y lo muestra.
        this.setTitle("Test");
        this.setLocationRelativeTo(null);
        //pregunta_textA.setLineWrap(true);
        Image icon = new ImageIcon(getClass()
                .getResource("/Imagenes/test.v1.1.png")).getImage();
        setIconImage(icon);//Colocar icono a la ventana.   
        
        resultados_button.setVisible(false);
        recomendacion_button.setVisible(false);
        nivel.setVisible(false);
        label.setVisible(false);
        total_tx.setVisible(false);
        l100_tx.setVisible(false);
        l0_tx.setVisible(false);
        resultado_pane.setVisible(false);
        resultado_scroll.setVisible(false);
        
        nivel.setStringPainted(true);
        nivel.setForeground(Color.blue);
        
        for (Preguntas pregunta : test) 
        {
            testItems.add(pregunta.getPregunta());
        }
        for (Respuestas respuesta : opciones) 
        {
            opcionesItems.add(respuesta.getOpcion1());
            opcionesItems.add(respuesta.getOpcion2());
            opcionesItems.add(respuesta.getOpcion3());
            opcionesItems.add(respuesta.getOpcion4());
            opcionesItems.add(respuesta.getOpcion5());
        }
        System.out.println(opcionesItems.size());
        text_pane.setText(testItems.elementAt(0));
        /*respuesta1_RB.setText(opcionesItems.elementAt(0));
        respuesta2_RB.setText(opcionesItems.elementAt(1));
        respuesta3_RB.setText(opcionesItems.elementAt(2));
        respuesta4_RB.setText(opcionesItems.elementAt(3));
        respuesta5_RB.setText(opcionesItems.elementAt(4));*/
    }

    int contPreguntas = 1, contRespuestas, contador=1, total = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1234 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fechaLB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        horaLB = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        respuesta1_RB = new javax.swing.JRadioButton();
        respuesta2_RB = new javax.swing.JRadioButton();
        respuesta3_RB = new javax.swing.JRadioButton();
        respuesta4_RB = new javax.swing.JRadioButton();
        respuesta5_RB = new javax.swing.JRadioButton();
        next_button = new javax.swing.JButton();
        nivel = new javax.swing.JProgressBar();
        home_button = new javax.swing.JButton();
        pane = new javax.swing.JScrollPane();
        text_pane = new javax.swing.JTextPane();
        resultados_button = new javax.swing.JButton();
        audio_ok = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        total_tx = new javax.swing.JLabel();
        l0_tx = new javax.swing.JLabel();
        l100_tx = new javax.swing.JLabel();
        resultado_scroll = new javax.swing.JScrollPane();
        resultado_pane = new javax.swing.JTextPane();
        recomendacion_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 255, 255));
        setFocusable(false);
        setResizable(false);

        label1234.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_Coachandling_v1.4.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel12.setText("COACHANDLIG");

        jLabel13.setFont(new java.awt.Font("Muli", 0, 8)); // NOI18N
        jLabel13.setText("BURNOUT  S.A");

        fechaLB.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        fechaLB.setText("Fecha");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario_.png"))); // NOI18N

        horaLB.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        horaLB.setText("hora");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj_.png"))); // NOI18N

        respuesta1_RB.setBackground(new java.awt.Color(151, 222, 151));
        buttonGroup1.add(respuesta1_RB);
        respuesta1_RB.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        respuesta1_RB.setText("Muy satisfecho");
        respuesta1_RB.setFocusPainted(false);

        respuesta2_RB.setBackground(new java.awt.Color(151, 222, 151));
        buttonGroup1.add(respuesta2_RB);
        respuesta2_RB.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        respuesta2_RB.setText("Satisfecho");
        respuesta2_RB.setFocusPainted(false);
        respuesta2_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta2_RBActionPerformed(evt);
            }
        });

        respuesta3_RB.setBackground(new java.awt.Color(151, 222, 151));
        buttonGroup1.add(respuesta3_RB);
        respuesta3_RB.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        respuesta3_RB.setText("Neutro");
        respuesta3_RB.setFocusPainted(false);

        respuesta4_RB.setBackground(new java.awt.Color(151, 222, 151));
        buttonGroup1.add(respuesta4_RB);
        respuesta4_RB.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        respuesta4_RB.setText("Insatisfecho");
        respuesta4_RB.setFocusPainted(false);

        respuesta5_RB.setBackground(new java.awt.Color(151, 222, 151));
        buttonGroup1.add(respuesta5_RB);
        respuesta5_RB.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        respuesta5_RB.setText("Muy insatisfecho");
        respuesta5_RB.setFocusPainted(false);
        respuesta5_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta5_RBActionPerformed(evt);
            }
        });

        next_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        next_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next.png"))); // NOI18N
        next_button.setText("Siguiente");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        nivel.setMaximum(105);

        home_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        home_button.setText("Inicio");
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        text_pane.setEditable(false);
        text_pane.setBackground(new java.awt.Color(151, 222, 151));
        text_pane.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        pane.setViewportView(text_pane);

        resultados_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        resultados_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resultado.png"))); // NOI18N
        resultados_button.setText("Ver resultados");
        resultados_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultados_buttonActionPerformed(evt);
            }
        });

        audio_ok.setSelected(true);
        audio_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audio_okActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audio (1).png"))); // NOI18N

        label.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        label.setText("Resultado:");

        total_tx.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        total_tx.setText("-------");

        l0_tx.setFont(new java.awt.Font("ABeeZee", 0, 12)); // NOI18N
        l0_tx.setText("100%");

        l100_tx.setFont(new java.awt.Font("ABeeZee", 0, 12)); // NOI18N
        l100_tx.setText("0%");

        resultado_pane.setFont(new java.awt.Font("ABeeZee", 0, 16)); // NOI18N
        resultado_scroll.setViewportView(resultado_pane);

        recomendacion_button.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        recomendacion_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio.png"))); // NOI18N
        recomendacion_button.setText("Recomendaciones");
        recomendacion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomendacion_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout label1234Layout = new javax.swing.GroupLayout(label1234);
        label1234.setLayout(label1234Layout);
        label1234Layout.setHorizontalGroup(
            label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(label1234Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(audio_ok)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13))
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(label1234Layout.createSequentialGroup()
                                .addComponent(next_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultados_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recomendacion_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(home_button))
                            .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(label1234Layout.createSequentialGroup()
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(label)
                        .addGap(18, 18, 18)
                        .addComponent(total_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(label1234Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(resultado_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, label1234Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(l100_tx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l0_tx)
                .addGap(100, 100, 100))
            .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(label1234Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(label1234Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(respuesta2_RB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(respuesta3_RB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(respuesta4_RB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(respuesta5_RB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(respuesta1_RB, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                        .addGroup(label1234Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(label1234Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel13))
                                .addComponent(jLabel12)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
        label1234Layout.setVerticalGroup(
            label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(label1234Layout.createSequentialGroup()
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(label1234Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(audio_ok)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, label1234Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_tx)
                    .addComponent(label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l0_tx)
                    .addComponent(l100_tx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_button)
                    .addComponent(resultados_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(next_button)
                    .addComponent(recomendacion_button))
                .addGap(19, 19, 19))
            .addGroup(label1234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(label1234Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel13)
                    .addGap(101, 101, 101)
                    .addComponent(respuesta1_RB)
                    .addGap(18, 18, 18)
                    .addComponent(respuesta2_RB)
                    .addGap(18, 18, 18)
                    .addComponent(respuesta3_RB)
                    .addGap(18, 18, 18)
                    .addComponent(respuesta4_RB)
                    .addGap(18, 18, 18)
                    .addComponent(respuesta5_RB)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void resultados_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultados_buttonActionPerformed
        resultado();
    }//GEN-LAST:event_resultados_buttonActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        try {
            inicio();
        }
        catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_home_buttonActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        avanzar();
    }//GEN-LAST:event_next_buttonActionPerformed

    private void respuesta5_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta5_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta5_RBActionPerformed

    private void respuesta2_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta2_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta2_RBActionPerformed

    private void recomendacion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomendacion_buttonActionPerformed
        try {
            recomendacion();
        } catch (IOException ex) {
            Logger.getLogger(Burnout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_recomendacion_buttonActionPerformed

    public JFrame getInicioForm() {
        return inicioForm;
    }

    public void setInicioForm(JFrame form) {
        this.inicioForm = form;
    }            
    
    public void avanzar() {      

        if (respuesta1_RB.isSelected() || respuesta2_RB.isSelected()
                || respuesta3_RB.isSelected() || respuesta4_RB.isSelected()
                || respuesta5_RB.isSelected()) {
            
            //pregunta_textArea.setText(testItems.elementAt(cont));
            text_pane.setText(testItems.elementAt(contPreguntas));
            contRespuestas+=5;
            respuesta1_RB.setText(opcionesItems.elementAt(contRespuestas));
            respuesta2_RB.setText(opcionesItems.elementAt(contRespuestas+1));
            respuesta3_RB.setText(opcionesItems.elementAt(contRespuestas+2));
            respuesta4_RB.setText(opcionesItems.elementAt(contRespuestas+3));
            respuesta5_RB.setText(opcionesItems.elementAt(contRespuestas+4));
            contPreguntas++;
           

            if (respuesta1_RB.isSelected()) {
                total += 1;
            }
            else if (respuesta2_RB.isSelected()) {
                total += 2;
            }
            else if (respuesta3_RB.isSelected()) {
                total += 3;
            }
            else if (respuesta4_RB.isSelected()) {
                total += 6;
            }
            else if (respuesta5_RB.isSelected()) {
                total += 7;
            }
            contador++;
            
            if(contador>=16)
            {
                resultados_button.setVisible(true);
                next_button.setVisible(false);
                UIManager.put( "nimbusOrange", new Color( 15, 15, 15));
            }

        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione una opción");
    }
    
    public void resultado()
    {
        text_pane.setVisible(false);
        pane.setVisible(false);
        respuesta1_RB.setVisible(false);
        respuesta2_RB.setVisible(false);
        respuesta3_RB.setVisible(false);
        respuesta4_RB.setVisible(false);
        respuesta5_RB.setVisible(false);  
        nivel.setValue(total);
        nivel.setVisible(true);
        l100_tx.setVisible(true);
        l0_tx.setVisible(true);
        recomendacion_button.setVisible(true);
        
        if(total>=0 & total<=35)
        {
            UIManager.put( "nimbusOrange", new Color( 20,138,0));
            total_tx.setText("Nivel bajo de estrés");
            label.setVisible(true);
            total_tx.setVisible(true);
            resultado_pane.setText("¡Buen trabajo! Continúe manteniéndose en forma"
                    + " con los recursos que ponemos a su disposición."
                    + "Use el botón -Recomendaciones-");
            resultado_scroll.setVisible(true);
            resultado_pane.setVisible(true);
        }
        else if(total>=36 & total<=70)
        {
            UIManager.put( "nimbusOrange", new Color( 255, 105, 2));
            total_tx.setText("Nivel moderado de estrés");
            label.setVisible(true);
            total_tx.setVisible(true);
            resultado_pane.setText("Debido a que su nivel de estrés es "
                    + "considerable, le ponemos a disposición recursos "
                    + "útiles para combatirlo. Use el botón -Recomendaciones-");
            resultado_scroll.setVisible(true);
            resultado_pane.setVisible(true);
        }
        else if(total>=71)
        {
            UIManager.put( "nimbusOrange", new Color( 249, 8, 0));
            if(total>100)
            {
                total_tx.setText("Nivel alto de estrés");
            }
            total_tx.setText("Nivel alto de estrés");
            
            label.setVisible(true);
            total_tx.setVisible(true);
            resultado_pane.setText("Debido a que su nivel de estrés es "
                    + "ALTO, le ponemos a disposición recursos "
                    + "útiles para combatirlo. Use el botón -Recomendaciones-");
            resultado_scroll.setVisible(true);
            resultado_pane.setVisible(true);
        }
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
    
    public void recomendacion() throws IOException
    {
        AudioPlayer.player.stop(audio);
        Recomendaciones recomendaciones = new Recomendaciones();
        recomendaciones.setInicioForm(this);
        recomendaciones.setAutoRequestFocus(true);
        recomendaciones.show(true);
        System.gc();
    }
    
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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Test().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox audio_ok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel horaLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l0_tx;
    private javax.swing.JLabel l100_tx;
    private javax.swing.JLabel label;
    private javax.swing.JPanel label1234;
    private javax.swing.JButton next_button;
    private javax.swing.JProgressBar nivel;
    private javax.swing.JScrollPane pane;
    private javax.swing.JButton recomendacion_button;
    private javax.swing.JRadioButton respuesta1_RB;
    private javax.swing.JRadioButton respuesta2_RB;
    private javax.swing.JRadioButton respuesta3_RB;
    private javax.swing.JRadioButton respuesta4_RB;
    private javax.swing.JRadioButton respuesta5_RB;
    private javax.swing.JTextPane resultado_pane;
    private javax.swing.JScrollPane resultado_scroll;
    private javax.swing.JButton resultados_button;
    private javax.swing.JTextPane text_pane;
    private javax.swing.JLabel total_tx;
    // End of variables declaration//GEN-END:variables

    //Método multiproceso que siempre se ejecuta. Usado para crear el reloj.
    @Override
    public void run() {
        Thread ct = Thread.currentThread();/*La variable ct adoptará el valor del CurrenThread, es decir, el hilo que 
                                                               se esté ejecutando en determinado instante.*/
        while (ct == hilo) {
            Reloj reloj = new Reloj();//Crea el objeto Reloj
            horaLB.setText(reloj.horaActual());//Muestra la hora obtenida con el método horaActual de reloj.    

            try {
                Thread.sleep(1000);//Pausa el proceso un segundo.
            }
            catch (InterruptedException e) {
            }
        }
    }

}

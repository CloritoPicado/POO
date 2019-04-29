/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.UI;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import proyecto1.Controlador;
import proyecto1.EEstado;
import proyecto1.EEstilo;
import proyecto1.ESede;
import proyecto1.ETransmision;
import proyecto1.ListaVehiculos;
import proyecto1.RegEx;
import proyecto1.Vehiculo;

/**
 *
 * @author Patrixito
 */
public class AgregarVehiculo extends javax.swing.JFrame {
    String foto = "";
    Controlador controlador;

    /**
     * Creates new form AgregarVehiculo
     */
    public AgregarVehiculo(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarElementos();
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tVIN = new javax.swing.JTextField();
        tAnho = new javax.swing.JTextField();
        tMarca = new javax.swing.JTextField();
        tKilometro = new javax.swing.JTextField();
        tMPG = new javax.swing.JTextField();
        tCostoXDia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cEstilo = new javax.swing.JComboBox<>();
        cColor = new javax.swing.JComboBox<>();
        cPasajeros = new javax.swing.JComboBox<>();
        cPuertas = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tMaletero = new javax.swing.JTextField();
        cTransmision = new javax.swing.JComboBox<>();
        cSede = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lImagen = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Vehículo");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setText("VIN");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setText("Kilometraje");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel6.setText("MPG");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel7.setText("Costo por día");

        tVIN.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tVIN.setPreferredSize(new java.awt.Dimension(150, 30));
        tVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVINActionPerformed(evt);
            }
        });

        tAnho.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        tMarca.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        tKilometro.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tKilometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKilometroActionPerformed(evt);
            }
        });

        tMPG.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        tCostoXDia.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel8.setText("Estilo");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel9.setText("Color");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel10.setText("Pasajeros");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel11.setText("Puertas");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel13.setText("Transmisión");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel14.setText("Sede");

        cEstilo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cEstilo.setPreferredSize(new java.awt.Dimension(100, 21));
        cEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstiloActionPerformed(evt);
            }
        });

        cColor.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Amarillo", "Blanco", "Negro", "Verde", "Gris", "Café", " " }));
        cColor.setPreferredSize(new java.awt.Dimension(100, 21));

        cPasajeros.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        cPasajeros.setPreferredSize(new java.awt.Dimension(100, 21));
        cPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPasajerosActionPerformed(evt);
            }
        });

        cPuertas.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        cPuertas.setPreferredSize(new java.awt.Dimension(100, 21));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel15.setText("Capacidad maletero");

        tMaletero.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        cTransmision.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automática" }));
        cTransmision.setPreferredSize(new java.awt.Dimension(100, 21));

        cSede.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cSede.setPreferredSize(new java.awt.Dimension(100, 21));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel12.setText("Agregar imagen");

        lImagen.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lImagen.setToolTipText("");
        lImagen.setMaximumSize(new java.awt.Dimension(100, 100));
        lImagen.setMinimumSize(new java.awt.Dimension(100, 100));
        lImagen.setPreferredSize(new java.awt.Dimension(450, 280));

        bCancelar.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jButton3.setText("Browse...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel16.setText("Placa");

        tPlaca.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tCostoXDia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tMPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tKilometro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tAnho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tMaletero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tVIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(92, 92, 92)
                                .addComponent(cEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(lImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(tVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(tAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(tMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(tKilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(tMPG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(tCostoXDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(cEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(cColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(cPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(cPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(cTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(cSede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(tMaletero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bAceptar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tKilometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKilometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKilometroActionPerformed

    private void cPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPasajerosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //lImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/Imagenes/Vehiculos/fortunerToyota.png")));
        
        
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();               
                System.out.println(convertirPath(selectedFile.getAbsolutePath()));
                foto = selectedFile.getName();
                BufferedImage imagen = null;
            try {
                imagen = ImageIO.read(selectedFile);
                
            } catch (IOException ex) {
                Logger.getLogger(AgregarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try
            {
                lImagen.setIcon(new ImageIcon(imagen));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
                
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstiloActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

       new PantallaPrincipal(controlador).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        Vehiculo vehiculo = new Vehiculo();
        RegEx regEx = new RegEx();
        if(regEx.chequearID(tVIN.getText()))
        {
            vehiculo.setNumVim(tVIN.getText());
            if(!controlador.getListaVehiculos().isRepetidoVIN(tVIN.getText()))
            {
                
            if(regEx.chequearAnho(tAnho.getText()))
            {
                vehiculo.setAnho(Integer.parseInt(tAnho.getText()));
                
                if(regEx.chequearNombre(tMarca.getText()))
                {
                    vehiculo.setMarca(tMarca.getText());
                    
                    if(regEx.chequearKilometraje(tKilometro.getText()))
                    {
                        vehiculo.setKilometraje(Float.parseFloat(tKilometro.getText()));
                        
                        if(regEx.chequearKilometraje(tMPG.getText()))
                        {
                            vehiculo.setMpg(Integer.parseInt(tMPG.getText()));
                            
                            if(regEx.chequearPrecio(tCostoXDia.getText()))
                            {
                                vehiculo.setCostoPorDia(Float.parseFloat(tCostoXDia.getText()));
                                
                                if(regEx.chequearKilometraje(tMaletero.getText()))
                                {
                                    vehiculo.setCapacidadMaletas(Integer.parseInt(tMaletero.getText()));
                                    
                                    if(regEx.chequearPlaca(tPlaca.getText()))
                                    {
                                        if(!controlador.getListaVehiculos().isRepetidaPlaca(tPlaca.getText()))
                                        {
                                               vehiculo.setPlaca(tPlaca.getText());
                                        
                                            if(!foto.equals(""))
                                            {
                                                vehiculo.setEstilo((EEstilo) cEstilo.getSelectedItem());
                                                vehiculo.setColor((String) cColor.getSelectedItem());
                                                vehiculo.setCapacidad(Integer.parseInt((String)cPasajeros.getSelectedItem()));
                                                vehiculo.setNumPuertas(Integer.parseInt((String)cPuertas.getSelectedItem()));
                                                vehiculo.setTransmision((ETransmision) cTransmision.getSelectedItem());
                                                vehiculo.setSedePertenencia((ESede) cSede.getSelectedItem());
                                                vehiculo.setImagen(foto);
                                                ListaVehiculos listaVehiculos = controlador.getListaVehiculos();
                                                listaVehiculos.getlVehiculos().add(vehiculo);
                                                controlador.serializador(listaVehiculos, "vehiculos.json");
                                                foto = "";
                                                new PantallaPrincipal(controlador).setVisible(true);
                                                this.setVisible(false);
                                            }
                                            else
                                                System.out.println("Error foto");
                                        }
                                        else
                                            System.out.println("Error placa repetida");
                                    }
                                    else
                                        System.out.println("Error placa");
                                }
                                else
                                    System.out.println("Error maletero");
                            }
                            else
                                System.out.println("Error costo por día");
                        }
                        else
                            System.out.println("Error MPG");
                    }
                    else
                        System.out.println("Error kilometraje");
                }
                else
                    System.out.println("Error marca");
            }
            else
                System.out.println("Error año");
            }
            else
                System.out.println("Error VIN repetido");
        }
        else
            System.out.println("Error VIN");
    }//GEN-LAST:event_bAceptarActionPerformed

    private void tVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tVINActionPerformed

    private String convertirPath(String s)
    {
        String resultado = "";
        for(int a = 0; a < s.length(); a++)
        {
            if(s.charAt(a) == '\\')
            {
                resultado = resultado + "/";
            }
            else
                resultado = resultado + s.charAt(a);
        }
        return resultado;
    }
    
    public void inicializarElementos()
    {    
        cEstilo.setModel(new DefaultComboBoxModel(EEstilo.values()));
        cTransmision.setModel(new DefaultComboBoxModel(ETransmision.values()));
        cSede.setModel(new DefaultComboBoxModel(ESede.values()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cColor;
    private javax.swing.JComboBox<String> cEstilo;
    private javax.swing.JComboBox<String> cPasajeros;
    private javax.swing.JComboBox<String> cPuertas;
    private javax.swing.JComboBox<String> cSede;
    private javax.swing.JComboBox<String> cTransmision;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lImagen;
    private javax.swing.JTextField tAnho;
    private javax.swing.JTextField tCostoXDia;
    private javax.swing.JTextField tKilometro;
    private javax.swing.JTextField tMPG;
    private javax.swing.JTextField tMaletero;
    private javax.swing.JTextField tMarca;
    private javax.swing.JTextField tPlaca;
    private javax.swing.JTextField tVIN;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.UI;

import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import proyecto1.Controlador;
import proyecto1.EEstilo;
import proyecto1.Reserva;
import proyecto1.Vehiculo;

/**
 *
 * @author Patrixito
 */
public class SeleccionarCarro extends javax.swing.JFrame {
    Controlador controlador;
    Reserva reserva;
    List<Vehiculo> lista;
    EEstilo estilo = EEstilo.SUV;
    int pasajeros = 5;
    /**
     * Creates new form SeleccionarCarro
     */
    public SeleccionarCarro(Controlador controlador, Reserva reserva) {
        initComponents();
        this.controlador = controlador;
        this.reserva = reserva;        
        lista = controlador.getListaVehiculos().filtrarSede(reserva.getSedeInicio());
        lista = controlador.getListaVehiculos().filtrarEstilo(estilo, lista);
        desplegarCarros(lista,0);        
        inicializarElementos();
        
    }
    
    public void inicializarElementos()
    {   
        cEstilo.setModel(new DefaultComboBoxModel(EEstilo.values()));
        cEstilo.setSelectedIndex(3);
        cPasajeros.setSelectedIndex(3);
        /*cEstilo.setModel(new DefaultComboBoxModel(EEstilo.values()));
        cTransmision.setModel(new DefaultComboBoxModel(ETransmision.values()));
        cSede.setModel(new DefaultComboBoxModel(ESede.values()));*/
    }
    
    public void desplegarCarros(List<Vehiculo> v, int pagina)
    {
        if(v.size() > 0+3*pagina)
        {
            
            int a = 0+3*pagina;
            lFoto1.setIcon(new ImageIcon("Imagenes/Vehiculos/"+v.get(a).getImagen()));
            lMarca1.setText(v.get(a).getMarca());
            lPrecio1.setText(v.get(a).getCostoPorDia()+"");
            lColor1.setText(v.get(a).getColor());
            mostrar(1);
        }
        else
            mostrar(0);
        if(v.size() > 1+3*pagina)
        {
            int a = 1+3*pagina;
            lFoto2.setIcon(new ImageIcon("Imagenes/Vehiculos/"+v.get(a).getImagen()));
            lMarca2.setText(v.get(a).getMarca());
            lPrecio2.setText(v.get(a).getCostoPorDia()+"");
            lColor2.setText(v.get(a).getColor());
            mostrar(2);
        }
        if(v.size() > 2+3*pagina)
        {
            int a = 2+3*pagina;
            lFoto3.setIcon(new ImageIcon("Imagenes/Vehiculos/"+v.get(a).getImagen()));
            lMarca3.setText(v.get(a).getMarca());
            lPrecio3.setText(v.get(a).getCostoPorDia()+"");
            lColor3.setText(v.get(a).getColor());
            mostrar(3);
        }
        
    }
    
    public void mostrar(int i)
    {
        switch (i) {
            case 0:
                lFoto1.setVisible(false);
                lMarca1.setVisible(false);
                lTransmision1.setVisible(false);
                lColor1.setVisible(false);
                lPrecio1.setVisible(false);

                
                
                lFoto2.setVisible(false);
                lMarca2.setVisible(false);
                lTransmision2.setVisible(false);
                lColor2.setVisible(false);
                lPrecio2.setVisible(false);

                
                lFoto3.setVisible(false);
                lMarca3.setVisible(false);
                lTransmision3.setVisible(false);
                lColor1.setVisible(false);
                lPrecio1.setVisible(false);

                break;
            case 1:
                lFoto1.setVisible(true);
                lMarca1.setVisible(true);
                lTransmision1.setVisible(true);
                lColor1.setVisible(true);
                lPrecio1.setVisible(true);

                
                lFoto2.setVisible(false);
                lMarca2.setVisible(false);
                lTransmision2.setVisible(false);
                lColor2.setVisible(false);
                lPrecio2.setVisible(false);

                
                lFoto3.setVisible(false);
                lMarca3.setVisible(false);
                lTransmision3.setVisible(false);
                lColor3.setVisible(false);
                lPrecio3.setVisible(false);

                break;
            case 2:
                lFoto1.setVisible(true);
                lMarca1.setVisible(true);
                lTransmision1.setVisible(true);
                lColor1.setVisible(true);
                lPrecio1.setVisible(true);

                
                lFoto2.setVisible(true);
                lMarca2.setVisible(true);
                lTransmision2.setVisible(true);;
                lColor2.setVisible(true);
                lPrecio2.setVisible(true);
                
                lFoto3.setVisible(false);
                lMarca3.setVisible(false);
                lTransmision3.setVisible(false);
                lColor3.setVisible(false);
                lPrecio3.setVisible(false);

                break;
            case 3:
                lFoto1.setVisible(true);
                lMarca1.setVisible(true);
                lTransmision1.setVisible(true);
                lColor1.setVisible(true);
                lPrecio1.setVisible(true);

                
                lFoto2.setVisible(true);
                lMarca2.setVisible(true);
                lTransmision2.setVisible(true);
                lColor2.setVisible(true);
                lPrecio2.setVisible(true);

                
                lFoto3.setVisible(true);
                lMarca3.setVisible(true);
                lTransmision3.setVisible(true);
                lFoto3.setVisible(true);
                lColor3.setVisible(true);
                lPrecio3.setVisible(true);

                break;
}
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cEstilo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cPasajeros = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        lFoto2 = new javax.swing.JLabel();
        lFoto1 = new javax.swing.JLabel();
        lFoto3 = new javax.swing.JLabel();
        lMarca1 = new javax.swing.JLabel();
        lTransmision1 = new javax.swing.JLabel();
        lColor1 = new javax.swing.JLabel();
        lMarca2 = new javax.swing.JLabel();
        lTransmision2 = new javax.swing.JLabel();
        lColor2 = new javax.swing.JLabel();
        lMarca3 = new javax.swing.JLabel();
        lTransmision3 = new javax.swing.JLabel();
        lColor3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cPrecio = new javax.swing.JComboBox<>();
        lPrecio1 = new javax.swing.JLabel();
        lPrecio2 = new javax.swing.JLabel();
        lPrecio3 = new javax.swing.JLabel();
        bSeleccionar1 = new javax.swing.JButton();
        bSeleccionar2 = new javax.swing.JButton();
        bSeleccionar3 = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        bAdelante = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 650));
        setSize(new java.awt.Dimension(1050, 650));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Seleccionar vehículo");

        jLabel2.setText("Estilo vehículo");

        cEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstiloActionPerformed(evt);
            }
        });

        jLabel3.setText("Pasajeros");

        cPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        cPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPasajerosActionPerformed(evt);
            }
        });

        lFoto2.setText("jLabel5");

        lFoto1.setText("jLabel5");

        lFoto3.setText("jLabel5");

        lMarca1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lMarca1.setText("Marca");

        lTransmision1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lTransmision1.setText("Transmision");

        lColor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lColor1.setText("Color");

        lMarca2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lMarca2.setText("Marca");

        lTransmision2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lTransmision2.setText("Transmision");

        lColor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lColor2.setText("Color");

        lMarca3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lMarca3.setText("Marca");

        lTransmision3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lTransmision3.setText("Transmision");

        lColor3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lColor3.setText("Color");

        cPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio: Mayor a menor", "Precio: Menor a mayor" }));

        lPrecio1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lPrecio1.setText("jLabel17");

        lPrecio2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lPrecio2.setText("jLabel17");

        lPrecio3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lPrecio3.setText("jLabel17");

        bSeleccionar1.setText("Seleccionar");

        bSeleccionar2.setText("Seleccionar");

        bSeleccionar3.setText("Seleccionar");

        bAtras.setText("<");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        bAdelante.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lMarca2)
                                    .addComponent(lTransmision2)
                                    .addComponent(lColor2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lMarca1)
                                    .addComponent(lTransmision1)
                                    .addComponent(lColor1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lMarca3)
                                    .addComponent(lTransmision3)
                                    .addComponent(lColor3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lPrecio1)
                                .addGap(115, 115, 115)
                                .addComponent(bSeleccionar1)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lPrecio2)
                                .addGap(115, 115, 115)
                                .addComponent(bSeleccionar2)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lPrecio3)
                                .addGap(117, 117, 117)
                                .addComponent(bSeleccionar3)
                                .addGap(97, 97, 97))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAdelante))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lMarca1)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTransmision1)
                            .addComponent(lPrecio1)
                            .addComponent(bSeleccionar1))
                        .addGap(22, 22, 22)
                        .addComponent(lColor1)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMarca2)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTransmision2)
                            .addComponent(lPrecio2)
                            .addComponent(bSeleccionar2))
                        .addGap(20, 20, 20)
                        .addComponent(lColor2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMarca3)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTransmision3)
                            .addComponent(lPrecio3)
                            .addComponent(bSeleccionar3))
                        .addGap(20, 20, 20)
                        .addComponent(lColor3)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAtras)
                    .addComponent(bAdelante))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtrasActionPerformed

    private void cEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstiloActionPerformed
        estilo = (EEstilo) cEstilo.getSelectedItem();
    }//GEN-LAST:event_cEstiloActionPerformed

    private void cPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPasajerosActionPerformed
        pasajeros = Integer.parseInt((String) cPasajeros.getSelectedItem());
    }//GEN-LAST:event_cPasajerosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdelante;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bSeleccionar1;
    private javax.swing.JButton bSeleccionar2;
    private javax.swing.JButton bSeleccionar3;
    private javax.swing.JComboBox<String> cEstilo;
    private javax.swing.JComboBox<String> cPasajeros;
    private javax.swing.JComboBox<String> cPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lColor1;
    private javax.swing.JLabel lColor2;
    private javax.swing.JLabel lColor3;
    private javax.swing.JLabel lFoto1;
    private javax.swing.JLabel lFoto2;
    private javax.swing.JLabel lFoto3;
    private javax.swing.JLabel lMarca1;
    private javax.swing.JLabel lMarca2;
    private javax.swing.JLabel lMarca3;
    private javax.swing.JLabel lPrecio1;
    private javax.swing.JLabel lPrecio2;
    private javax.swing.JLabel lPrecio3;
    private javax.swing.JLabel lTransmision1;
    private javax.swing.JLabel lTransmision2;
    private javax.swing.JLabel lTransmision3;
    // End of variables declaration//GEN-END:variables
}

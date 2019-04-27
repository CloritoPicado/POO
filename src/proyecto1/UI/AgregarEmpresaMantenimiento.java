/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.UI;

import javax.swing.DefaultComboBoxModel;
import proyecto1.Canton;
import proyecto1.Controlador;
import proyecto1.Direccion;
import proyecto1.EmpresaMantenimiento;
import proyecto1.Provincia;
import proyecto1.RegEx;

/**
 *
 * @author Francisco
 */
public class AgregarEmpresaMantenimiento extends javax.swing.JFrame {
    Controlador controlador;
    Provincia p;
    Canton c;
    Direccion d = new Direccion();
    boolean ingresado = false;
    /**
     * Creates new form AgregarEmpresaMantenimiento
     */
    public AgregarEmpresaMantenimiento(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarElementos();
    }
    
    public void inicializarElementos()
    {    
        cDistritos.setEnabled(false);
        cCantones.setEnabled(false);
        cProvincias.setModel(new DefaultComboBoxModel(controlador.getUbicacion().listaProvincias()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        TituloVentana = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cProvincias = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        cCantones = new javax.swing.JComboBox<>();
        cDistritos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        tRazonSocial = new javax.swing.JTextField();
        tCedula = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tSenhas = new javax.swing.JTextArea();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 600));

        TituloVentana.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TituloVentana.setText("Agregar Empresa Mantenimiento");

        jLabel1.setText("Razón Social");

        jLabel2.setText("Cédula Jurídica");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 14));

        jLabel3.setText("Teléfono");

        jLabel4.setText("Dirección");

        cProvincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cProvincias.setPreferredSize(new java.awt.Dimension(150, 30));
        cProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProvinciasActionPerformed(evt);
            }
        });

        cCantones.setPreferredSize(new java.awt.Dimension(150, 30));
        cCantones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantonesActionPerformed(evt);
            }
        });

        cDistritos.setPreferredSize(new java.awt.Dimension(150, 30));
        cDistritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDistritosActionPerformed(evt);
            }
        });

        jLabel5.setText("Provincia");

        jLabel6.setText("Cantón");

        jLabel7.setText("Distrito");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        tRazonSocial.setPreferredSize(new java.awt.Dimension(150, 30));

        tCedula.setPreferredSize(new java.awt.Dimension(150, 30));
        tCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCedulaActionPerformed(evt);
            }
        });

        tTelefono.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel8.setText("Señas");

        tSenhas.setColumns(20);
        tSenhas.setRows(5);
        jScrollPane1.setViewportView(tSenhas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloVentana)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cDistritos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cCantones, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cProvincias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(bAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TituloVentana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cCantones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       new PantallaPrincipal(controlador).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCedulaActionPerformed

    private void cProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cProvinciasActionPerformed
        p = controlador.getUbicacion().buscarProvincia((String) cProvincias.getSelectedItem());
        cCantones.setEnabled(true);        
        cCantones.setModel(new DefaultComboBoxModel(p.listaCantones()));
        cDistritos.setModel(new DefaultComboBoxModel());
        cDistritos.setEnabled(false);
        ingresado = false;
        d.setProvincia(p.getTitle());
    }//GEN-LAST:event_cProvinciasActionPerformed

    private void cDistritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDistritosActionPerformed
        d.setDistrito((String) cDistritos.getSelectedItem());
        ingresado = true;
        
    }//GEN-LAST:event_cDistritosActionPerformed

    private void cCantonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantonesActionPerformed
        c = p.buscarCanton((String) cCantones.getSelectedItem());
        cDistritos.setEnabled(true);
        cDistritos.setModel(new DefaultComboBoxModel(c.listaDistritos()));
        d.setCanton(c.getTitle());
        ingresado = false;
    }//GEN-LAST:event_cCantonesActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        EmpresaMantenimiento m = new EmpresaMantenimiento();
        RegEx regEx = new RegEx();
        if(regEx.chequearRazonSocial(tRazonSocial.getText()))
        {
            m.setRazonSocial(tRazonSocial.getText());
            
            if(regEx.chequearCedulaJuridica(tCedula.getText()))
            {
                m.setCedulaJuridica(tCedula.getText());
                
                if(regEx.chequearTelefono(tTelefono.getText()))
                {
                    m.setTelefono(Integer.parseInt(tTelefono.getText()));
                         
                    if(ingresado)
                    {
                        d.setSenhas(tSenhas.getText());
                        m.setDireccion(d);
                        controlador.getListaEmpresas().getEmpresas().add(m);
                        controlador.serializador(m,"empresas.json");
                        new PantallaPrincipal(controlador).setVisible(true);
                        this.setVisible(false);
                    }
                    else
                       System.out.println("Error dirección");
                }
                
                else
                    System.out.println("Error teléfono");
            }
            else
                System.out.println("Error cédula jurídica");
        }
        else
            System.out.println("Error razón social");
        
    }//GEN-LAST:event_bAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cCantones;
    private javax.swing.JComboBox<String> cDistritos;
    private javax.swing.JComboBox<String> cProvincias;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tRazonSocial;
    private javax.swing.JTextArea tSenhas;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}

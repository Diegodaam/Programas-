/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.maincotizacion;


import javax.swing.DefaultListModel;
/**
 *
 * @author Diego
 */
public class JFrameCotizador extends javax.swing.JFrame {

    private ListaCotizacion lista;
    int cantidadDias;
    String tipoHabitacion;
    int precioHabitacion;
    String tipoPago;
    String pais;
    String ciudad;
    
    public JFrameCotizador(ListaCotizacion lista) {
        initComponents();
    }
    
    public JFrameCotizador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCiudad = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonSensilla = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonDoble = new javax.swing.JRadioButton();
        jRadioButtonSuite = new javax.swing.JRadioButton();
        jRadioButtonTarjeta = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonMensualidad = new javax.swing.JRadioButton();
        jScrollBarDias = new javax.swing.JScrollBar();
        jLabel6 = new javax.swing.JLabel();
        jLabelDias = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCotizar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelPrecioDia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cotizacion");

        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "Colombia", "EEUU", "Brazil", "Canada" }));
        jComboBoxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaisActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListCiudad);

        jLabel2.setText("Pais: ");

        jLabel3.setText("Ciudad: ");

        buttonGroup1.add(jRadioButtonSensilla);
        jRadioButtonSensilla.setText("Sensilla - $1200");

        jLabel4.setText("Tipo de habitacion: ");

        buttonGroup1.add(jRadioButtonDoble);
        jRadioButtonDoble.setText("Doble - $2100");

        buttonGroup1.add(jRadioButtonSuite);
        jRadioButtonSuite.setText("Suite - $3500");

        buttonGroup2.add(jRadioButtonTarjeta);
        jRadioButtonTarjeta.setText("Tarjeta");

        jLabel5.setText("Tipo de pago: ");

        buttonGroup2.add(jRadioButtonMensualidad);
        jRadioButtonMensualidad.setText("Mensualidad ");

        jScrollBarDias.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBarDias.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBarDiasAdjustmentValueChanged(evt);
            }
        });

        jLabel6.setText("Dias a quedarse: ");

        jLabelDias.setText("0");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonCotizar.setText("Cotizar");
        jButtonCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCotizarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelPrecioDia.setText("$0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCotizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegresar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSensilla)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonDoble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMensualidad)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButtonTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollBarDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonSuite, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrecioDia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecioDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabelDias)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBarDias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSensilla)
                    .addComponent(jRadioButtonTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDoble)
                    .addComponent(jRadioButtonMensualidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSuite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCotizar)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        if(jComboBoxPais.getSelectedIndex() == -1 && jListCiudad.getSelectedValue() == null && !jRadioButtonSensilla.isSelected() &&
                !jRadioButtonDoble.isSelected() && !jRadioButtonSuite.isSelected() && !jRadioButtonTarjeta.isSelected() && !jRadioButtonMensualidad.isSelected()){
            jLabelMensaje.setText("Ingresa todos los valores");
            return;
        }else{
        
            if(lista == null){
                lista = new ListaCotizacion(null, false);
            }
            if(lista != null){
                pais = jComboBoxPais.getSelectedItem().toString();
                ciudad = jListCiudad.getSelectedValue().toString();
                
                
                if(pais == "Mexico"){
                    int precioHa = 1200;
                }

                tipoHabitacion = "";

                if(jRadioButtonSensilla.isSelected()){
                    tipoHabitacion = "Sensilla - $1200";
                    precioHabitacion = 1200;
                }else if(jRadioButtonDoble.isSelected()){
                    tipoHabitacion = "Doble - $2100";
                    precioHabitacion = 2100;
                }else if(jRadioButtonSuite.isSelected()){
                    tipoHabitacion = "Suite - $3500";
                    precioHabitacion = 3500;
                }

                tipoPago = "";

                if(jRadioButtonTarjeta.isSelected()){
                    tipoPago = "Tarjeta";
                }else if(jRadioButtonMensualidad.isSelected()){
                    tipoPago = "Mensualidad";
                }

                cantidadDias = jScrollBarDias.getValue();

                lista.add(cantidadDias,tipoHabitacion,precioHabitacion, tipoPago, pais, ciudad);
                jLabelMensaje.setText("Registro correcto");
            }else{
                jLabelMensaje.setText("Error");
            }
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jScrollBarDiasAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBarDiasAdjustmentValueChanged
        int valorBarra = jScrollBarDias.getValue() * 100;
        
        jLabelDias.setText(String.valueOf(jScrollBarDias.getValue()));
        
        jLabelPrecioDia.setText("$" +String.valueOf(valorBarra));
    }//GEN-LAST:event_jScrollBarDiasAdjustmentValueChanged

    private void jComboBoxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaisActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        
        jListCiudad.removeAll();
        
        switch(jComboBoxPais.getSelectedIndex()){
            case 0:
                modelo.addElement("Guadalajara");
                modelo.addElement("Monterrey");
                modelo.addElement("Cancun");
                modelo.addElement("Merida");
                modelo.addElement("Ciudad de Mexico");
                break;
            case 1:
                modelo.addElement("Bogota");
                modelo.addElement("Medellin");
                modelo.addElement("Cali");
                modelo.addElement("Barranquilla");
                modelo.addElement("Cartagena");
                break;
            case 2:
                modelo.addElement("Nueva York");
                modelo.addElement("Los Angeles");
                modelo.addElement("Chicago");
                modelo.addElement("Houston");
                modelo.addElement("Miami");
                break;
            case 3:
                modelo.addElement("Sao Paolo");
                modelo.addElement("Rio de Janeiro");
                modelo.addElement("Brasilia");
                modelo.addElement("Salvador");
                modelo.addElement("Belo Horizonte");
                break;
            case 4: 
                modelo.addElement("Toronto");
                modelo.addElement("Vancouver");
                modelo.addElement("Montreal");
                modelo.addElement("Calgary");
                modelo.addElement("Ottawa");
        }
        jListCiudad.setModel(modelo);
    }//GEN-LAST:event_jComboBoxPaisActionPerformed

    private void jButtonCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCotizarActionPerformed
        if(lista == null || lista.vacia()){
            jLabelMensaje.setText("La lista esta vacia");
        }else{
            JFrameMostrar mostrar = new JFrameMostrar(lista);
            mostrar.setVisible(true);
            
        }
    }//GEN-LAST:event_jButtonCotizarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jComboBoxPais.setSelectedIndex(-1);
        jListCiudad.clearSelection();
        jScrollBarDias.setValue(jScrollBarDias.getMinimum());
        
        buttonGroup1.clearSelection();
        
        buttonGroup2.clearSelection();
        
        jLabelMensaje.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        JFrameIngreso ingreso = new JFrameIngreso();
        ingreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonCotizar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelPrecioDia;
    private javax.swing.JList<String> jListCiudad;
    private javax.swing.JRadioButton jRadioButtonDoble;
    private javax.swing.JRadioButton jRadioButtonMensualidad;
    private javax.swing.JRadioButton jRadioButtonSensilla;
    private javax.swing.JRadioButton jRadioButtonSuite;
    private javax.swing.JRadioButton jRadioButtonTarjeta;
    private javax.swing.JScrollBar jScrollBarDias;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

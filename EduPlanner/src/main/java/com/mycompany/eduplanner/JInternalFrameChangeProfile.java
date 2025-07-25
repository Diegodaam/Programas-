/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.eduplanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class JInternalFrameChangeProfile extends javax.swing.JInternalFrame {

    private PilaUsers pila;
    private NodoUsers user;
    
    private String changeName;
    private String changeLastName;
    private int changePassword;
    private String changeGender;
    private int changeAge;
    
    public JInternalFrameChangeProfile(PilaUsers pilaUser, NodoUsers user) {
        initComponents();
        
        this.pila = pilaUser;
        this.user = user;
        
        
    }
    public JInternalFrameChangeProfile() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabelAge = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jCheckBoxName = new javax.swing.JCheckBox();
        jCheckBoxLastName = new javax.swing.JCheckBox();
        jCheckBoxGender = new javax.swing.JCheckBox();
        jCheckBoxAge = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonChange = new javax.swing.JButton();
        jCheckBoxPassword = new javax.swing.JCheckBox();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cambiar de datos");

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jTextFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameKeyTyped(evt);
            }
        });

        jLabel4.setText("Apellido:");

        jLabel5.setText("Edad:");

        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });

        jLabelAge.setText("0");

        jLabel7.setText("Genero:");

        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Femenino");

        buttonGroup1.add(jRadioButtonOther);
        jRadioButtonOther.setText("Otro");

        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setText("Masculino");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nota:");

        jLabel9.setText("Selecciona la casilla que no quieras cambiar");

        jButtonChange.setText("Cambiar");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jTextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPasswordKeyTyped(evt);
            }
        });

        jLabel6.setText("Contrasena:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBoxName)
                                        .addComponent(jCheckBoxLastName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldLastName)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61)
                        .addComponent(jCheckBoxAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAge)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonOther)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonFemale)
                                    .addComponent(jRadioButtonMale))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonChange)
                                .addGap(48, 48, 48))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBoxName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCheckBoxLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jCheckBoxGender)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabelAge))
                            .addComponent(jCheckBoxAge)))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jButtonChange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOther)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
         if((jTextFieldName.getText().isEmpty() && !jCheckBoxName.isSelected()) || (jTextFieldLastName.getText().isEmpty() && !jCheckBoxLastName.isSelected()) 
                 || (jTextFieldPassword.getText().isEmpty() && !jCheckBoxPassword.isSelected()) 
                 || (jScrollBar1.getValue() == 0 && !jCheckBoxAge.isSelected())
                 || ((!jRadioButtonMale.isSelected() && !jRadioButtonFemale.isSelected() && !jRadioButtonOther.isSelected()) && !jCheckBoxGender.isSelected())){
                JOptionPane.showMessageDialog(this, "LLena todos los espacios");
            
        }else{
            //Cambio de nombre
            if(jCheckBoxName.isSelected()){
                changeName = user.getName();
                jTextFieldName.setText(changeName);
            }else{
                changeName = jTextFieldName.getText();
                user.setName(changeName);

            }
            //Cmabio de apellido
            if(jCheckBoxLastName.isSelected()){
                changeLastName = user.getLastName();
                jTextFieldLastName.setText(changeLastName);
            }else{
                changeLastName = jTextFieldLastName.getText();
                user.setLastName(changeLastName);
            }
            //Cambio de contrasena
            if(jCheckBoxPassword.isSelected()){
                changePassword = user.getPassword();
                jTextFieldPassword.setText(String.valueOf(changePassword));
            }else{
                changePassword = Integer.parseInt(jTextFieldPassword.getText());
                user.setPassword(changePassword);
            }
            //Cambio de Genero
            if(jCheckBoxGender.isSelected()){
                changeGender = user.getGender();
                if(changeGender.equals("Masculino")){
                    jRadioButtonMale.setSelected(true);
                }
                if(changeGender.equals("Femenino")){
                    jRadioButtonFemale.setSelected(true);
                }
                if(changeGender.equals("Otro")){
                    jRadioButtonOther.setSelected(true);
                }
            }else{
                if(jRadioButtonMale.isSelected()){
                    changeGender = "Masculino";
                }else if(jRadioButtonFemale.isSelected()){
                    changeGender = "Femenino";
                }else if(jRadioButtonOther.isSelected()){
                    changeGender = "Otro";
                }
                user.setGender(changeGender);
            }
            //Cambio de edad
            if(jCheckBoxAge.isSelected()){
                changeAge = user.getAge();
                jLabelAge.setText(String.valueOf(changeAge));
            }else{
                changeAge = jScrollBar1.getValue();
                user.setAge(changeAge);
            }
            JOptionPane.showMessageDialog(this, "Cambio de datos exitoso");
        }
        
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        jLabelAge.setText(String.valueOf(jScrollBar1.getValue()));
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged

    private void jTextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNameKeyTyped

    private void jTextFieldLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldLastNameKeyTyped

    private void jTextFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasswordKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(jTextFieldPassword.getText().length() >= 4){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPasswordKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JCheckBox jCheckBoxAge;
    private javax.swing.JCheckBox jCheckBoxGender;
    private javax.swing.JCheckBox jCheckBoxLastName;
    private javax.swing.JCheckBox jCheckBoxName;
    private javax.swing.JCheckBox jCheckBoxPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables
}

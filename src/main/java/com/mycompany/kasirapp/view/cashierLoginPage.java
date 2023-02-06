/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.kasirapp.view;

import com.mycompany.kasirapp.authentication.Auth;
import com.mycompany.kasirapp.controller.controller;
import com.mycompany.kasirapp.model.Cashier;
import com.mycompany.kasirapp.model.Supermarket;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Acer SPIN
 */
public class cashierLoginPage extends javax.swing.JPanel {
    private JPanel index;
    private orderPage orderPage;
    /**
     * Creates new form loginPage
     */
    public cashierLoginPage() {
        initComponents();
        this.setSize(1280, 832);
        passwordAlert.setVisible(false);
    }
    private void clearField(){
        inputUsername.setText("");
        inputPass.setText("");
        passwordAlert.setVisible(false);
    }
    public void setIndex(JPanel index) {
        this.index = index;
    }

    public void setOrderPage(orderPage orderPage) {
        this.orderPage = orderPage;
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
        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        passwordAlert = new javax.swing.JLabel();
        inputPass = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 146, 255));
        setPreferredSize(new java.awt.Dimension(360, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\user.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 116, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginLabel.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        loginLabel.setText("Login");

        passwordAlert.setForeground(new java.awt.Color(255, 0, 0));
        passwordAlert.setText("Username or Password doesnt match");

        inputPass.setPreferredSize(new java.awt.Dimension(331, 34));
        inputPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPassFocusLost(evt);
            }
        });
        inputPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPassKeyTyped(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        PasswordLabel.setText("Password");

        inputUsername.setPreferredSize(new java.awt.Dimension(331, 34));
        inputUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputUsernameKeyTyped(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        usernameLabel.setText("Username");

        loginBtn.setBackground(new java.awt.Color(33, 146, 255));
        loginBtn.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setMaximumSize(new java.awt.Dimension(331, 23));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLabel)
                            .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordAlert)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(loginLabel)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(loginLabel)
                .addGap(28, 28, 28)
                .addComponent(usernameLabel)
                .addGap(6, 6, 6)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(PasswordLabel)
                .addGap(6, 6, 6)
                .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordAlert)
                .addGap(40, 40, 40)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 144, -1, 534));

        backBtn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\arrow-back.png")); // NOI18N
        backBtn1.setContentAreaFilled(false);
        backBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Cashier kasir = new Cashier();
        kasir.setUsername(inputUsername.getText());
        kasir.setPassword(new String(inputPass.getPassword()));
       
        if(kasir.login() == true){
            Cashier kasirAuth = Auth.cashier;      
            this.setVisible(false);
            orderPage.setVisible(true);
            this.orderPage.fillTableBarang(kasirAuth.HasManyBarang());
            clearField();
        }else passwordAlert.setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void inputPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPassFocusLost

    }//GEN-LAST:event_inputPassFocusLost

    private void inputPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPassKeyTyped
      
    }//GEN-LAST:event_inputPassKeyTyped

    private void inputUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUsernameKeyTyped
        
    }//GEN-LAST:event_inputUsernameKeyTyped

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        this.setVisible(false);
        index.setVisible(true);
    }//GEN-LAST:event_backBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton backBtn1;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordAlert;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
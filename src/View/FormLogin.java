/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Huy PC
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
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

        layoutChinh = new javax.swing.JPanel();
        pannelHeader = new javax.swing.JPanel();
        titleHeader = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);

        layoutChinh.setBackground(new java.awt.Color(244, 246, 248));
        layoutChinh.setMaximumSize(new java.awt.Dimension(1920, 1080));
        layoutChinh.setMinimumSize(new java.awt.Dimension(1920, 1080));
        layoutChinh.setPreferredSize(new java.awt.Dimension(1920, 1080));

        pannelHeader.setBackground(new java.awt.Color(242, 157, 56));
        pannelHeader.setMaximumSize(new java.awt.Dimension(1920, 64));
        pannelHeader.setMinimumSize(new java.awt.Dimension(1920, 64));
        pannelHeader.setPreferredSize(new java.awt.Dimension(1920, 64));

        titleHeader.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        titleHeader.setForeground(new java.awt.Color(255, 255, 255));
        titleHeader.setText("PHẦM MỀM QUẢN LÝ BÁN HÀNG");
        titleHeader.setMaximumSize(new java.awt.Dimension(297, 22));
        titleHeader.setMinimumSize(new java.awt.Dimension(297, 22));
        titleHeader.setPreferredSize(new java.awt.Dimension(297, 22));

        javax.swing.GroupLayout pannelHeaderLayout = new javax.swing.GroupLayout(pannelHeader);
        pannelHeader.setLayout(pannelHeaderLayout);
        pannelHeaderLayout.setHorizontalGroup(
            pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelHeaderLayout.createSequentialGroup()
                .addGap(844, 844, 844)
                .addComponent(titleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(771, Short.MAX_VALUE))
        );
        pannelHeaderLayout.setVerticalGroup(
            pannelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelHeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setMaximumSize(new java.awt.Dimension(480, 470));
        LoginPanel.setMinimumSize(new java.awt.Dimension(480, 470));
        LoginPanel.setPreferredSize(new java.awt.Dimension(480, 470));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 50, 56));
        jLabel1.setText("Vui lòng nhập tài khoản của bạn");
        jLabel1.setMaximumSize(new java.awt.Dimension(378, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(378, 28));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(378, 28));

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setMaximumSize(new java.awt.Dimension(423, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(423, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(423, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtUsername.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(84, 110, 122));
        txtUsername.setText("  Tên tài khoản (Email)");
        txtUsername.setToolTipText("");
        txtUsername.setMaximumSize(new java.awt.Dimension(423, 56));
        txtUsername.setMinimumSize(new java.awt.Dimension(423, 56));
        txtUsername.setPreferredSize(new java.awt.Dimension(423, 56));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtPass.setForeground(new java.awt.Color(84, 110, 122));
        txtPass.setText("  Mật khẩu");
        txtPass.setMaximumSize(new java.awt.Dimension(423, 56));
        txtPass.setMinimumSize(new java.awt.Dimension(423, 56));
        txtPass.setPreferredSize(new java.awt.Dimension(423, 56));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(242, 157, 56));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(423, 46));
        jButton1.setMinimumSize(new java.awt.Dimension(423, 46));
        jButton1.setPreferredSize(new java.awt.Dimension(423, 46));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layoutChinhLayout = new javax.swing.GroupLayout(layoutChinh);
        layoutChinh.setLayout(layoutChinhLayout);
        layoutChinhLayout.setHorizontalGroup(
            layoutChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutChinhLayout.createSequentialGroup()
                .addComponent(pannelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layoutChinhLayout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layoutChinhLayout.setVerticalGroup(
            layoutChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutChinhLayout.createSequentialGroup()
                .addComponent(pannelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        if (txtUsername.getForeground().equals(Color.decode("#546E7A"))) {
            txtUsername.setText("");
            txtUsername.setForeground(Color.BLACK);
            if (txtPass.getText().isEmpty()) {
                txtPass.setForeground(Color.decode("#546E7A"));
                txtPass.setText("  Mật khẩu");
            }
        }
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        // TODO add your handling code here:
        if (txtPass.getForeground().equals(Color.decode("#546E7A"))) {
            txtPass.setText("");
            txtPass.setForeground(Color.BLACK);
            if (txtUsername.getText().isEmpty()) {
                txtUsername.setForeground(Color.decode("#546E7A"));
                txtUsername.setText("  Tên tài khoản (Email)");
            }
        }
    }//GEN-LAST:event_txtPassMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel layoutChinh;
    private javax.swing.JPanel pannelHeader;
    private javax.swing.JLabel titleHeader;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Edward
 */
public class HomeForm extends javax.swing.JFrame {
        private String userEmail;
    
    

    public HomeForm() {
        initComponents(); 
    }
    
        public void setEmail(String email) {
        this.userEmail = email;
        displayRegistrationDetails();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        namee = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        genderr = new javax.swing.JLabel();
        hobbiess = new javax.swing.JLabel();
        coursee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(25, 20, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(511, 500));

        logout.setBackground(new java.awt.Color(30, 215, 96));
        logout.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        namee.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        namee.setForeground(new java.awt.Color(255, 255, 255));
        namee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        emaill.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        emaill.setForeground(new java.awt.Color(255, 255, 255));
        emaill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        genderr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        genderr.setForeground(new java.awt.Color(255, 255, 255));
        genderr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        hobbiess.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        hobbiess.setForeground(new java.awt.Color(255, 255, 255));
        hobbiess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        coursee.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        coursee.setForeground(new java.awt.Color(255, 255, 255));
        coursee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(genderr, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hobbiess, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(coursee, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(namee, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(namee, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hobbiess, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(logout)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        loginform.show();
        this.hide();
    }//GEN-LAST:event_logoutActionPerformed

    private void displayRegistrationDetails() {
        String directoryPath = "C:\\Users\\Edward\\Documents\\form";
        String filePath = directoryPath + "\\" + userEmail + ".txt";

        File accountFile = new File(filePath);

        if (accountFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(accountFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Fullname: ")) {
                        namee.setText("Welcome " + line.substring("Fullname: ".length()));
                    } else if (line.startsWith("Email: ")) {
                        emaill.setText("Email: " + line.substring("Email: ".length()));
                    } else if (line.startsWith("Gender: ")) {
                        genderr.setText("Gender: " + line.substring("Gender: ".length()));
                    } else if (line.startsWith("Hobbies: ")) {
                        hobbiess.setText("Hobbies: " + line.substring("Hobbies: ".length()));
                    } else if (line.startsWith("Course: ")) {
                        coursee.setText("Course: " + line.substring("Course: ".length()));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coursee;
    private javax.swing.JLabel emaill;
    private javax.swing.JLabel genderr;
    private javax.swing.JLabel hobbiess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel namee;
    // End of variables declaration//GEN-END:variables
}

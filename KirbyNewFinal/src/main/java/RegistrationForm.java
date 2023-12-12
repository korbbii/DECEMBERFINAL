


import java.awt.Color;
import static java.awt.Color.WHITE;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class RegistrationForm extends javax.swing.JFrame {
    
    public RegistrationForm() {
        initComponents();
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        createaccount = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginhere = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        courseComboBox = new javax.swing.JComboBox<>();
        showpassword = new javax.swing.JCheckBox();
        confirmpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        bb = new javax.swing.JCheckBox();
        wm = new javax.swing.JCheckBox();
        pog = new javax.swing.JCheckBox();
        soccer = new javax.swing.JCheckBox();
        tt = new javax.swing.JCheckBox();

        button2.setLabel("button2");

        jRadioButton2.setText("jRadioButton2");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(25, 20, 20));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 215, 96));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Sign Up");

        email.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        createaccount.setBackground(new java.awt.Color(30, 215, 96));
        createaccount.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        createaccount.setText("Create Account");
        createaccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Already have an account? ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        loginhere.setBackground(new java.awt.Color(25, 20, 20));
        loginhere.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loginhere.setForeground(new java.awt.Color(255, 255, 255));
        loginhere.setText("Log in here.");
        loginhere.setBorder(null);
        loginhere.setBorderPainted(false);
        loginhere.setContentAreaFilled(false);
        loginhere.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginhere.setMargin(new java.awt.Insets(2, 1, 2, 14));
        loginhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginhereActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(25, 20, 20));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setBackground(new java.awt.Color(25, 20, 20));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email address");

        jLabel5.setBackground(new java.awt.Color(25, 20, 20));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm password");

        jLabel7.setBackground(new java.awt.Color(25, 20, 20));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fullname");

        fullname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fullname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        other.setForeground(new java.awt.Color(255, 255, 255));
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });

        courseComboBox.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course", "Bachelor of Science in Information Technology", "Bachelor of Science in Education(English)", "Bachelor of Science in Education(Filipino)", "Bachelor of Science in Education(P.E)", "Bachelor of Science in Business Administration", "Bachelor of Science in Office Administration", "Bachelor of Science in Criminology" }));
        courseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboBoxActionPerformed(evt);
            }
        });

        showpassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });

        confirmpassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        confirmpassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        password.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bb.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bb.setForeground(new java.awt.Color(255, 255, 255));
        bb.setText("Basketball");
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        wm.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        wm.setForeground(new java.awt.Color(255, 255, 255));
        wm.setText("Watching Movies");

        pog.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pog.setForeground(new java.awt.Color(255, 255, 255));
        pog.setText("Playing Online Games");
        pog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogActionPerformed(evt);
            }
        });

        soccer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        soccer.setForeground(new java.awt.Color(255, 255, 255));
        soccer.setText("Soccer");

        tt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tt.setForeground(new java.awt.Color(255, 255, 255));
        tt.setText("Table Tennis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(male)
                                .addGap(0, 304, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wm, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soccer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pog))
                            .addComponent(showpassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(female)
                                .addGap(46, 46, 46)
                                .addComponent(other)))
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fullname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginhere)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(createaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(other))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pog, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soccer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginhere, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginhereActionPerformed
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        loginform.show();
        this.hide();
    }//GEN-LAST:event_loginhereActionPerformed

    private void createaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountActionPerformed
        String fn = fullname.getText();
        String eml = email.getText();
        String pass = password.getText();
        String pass2 = confirmpassword.getText();

    
    if (eml.isEmpty() || pass.isEmpty() || pass2.isEmpty() || fn.isEmpty()) {
        fullname.setBackground(Color.RED);
        email.setBackground(Color.RED);
        password.setBackground(Color.RED);
        confirmpassword.setBackground(Color.RED);
        showMessage("Please fill in all fields.");
        return;
    }
    
    if (!isValidString(fn)) {
        fullname.setBackground(Color.RED);
        showMessage("Enter valid fullname.");
        return;
        }

       if (!pass.equals(pass2)) {
        
        confirmpassword.setBackground(Color.RED);
        showMessage("Passwords do not match. Please try again.");
        return;
    }

    if (!isValidEmail(eml)) {
        email.setBackground(Color.RED);
        showMessage("Invalid email format. Please enter a valid email.");
        return;
    }
    
        String course = (String) courseComboBox.getSelectedItem();
    if (course.equals("Course")) {
        showMessage("Please select a course.");
        return;
    }
    
    String gender = "";
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    } else if (other.isSelected()) {
        gender = "Other";
    } else {
        showMessage("Please select a gender.");
        return;
    }

    String hobbies = "";
    if (bb.isSelected()) {
    hobbies += "Basketball";
    }
    if (pog.isSelected()) {
    if (!hobbies.isEmpty()) {
        hobbies += ", ";
    }
    hobbies += "Playing Online Games";
}
    if (wm.isSelected()) {
    if (!hobbies.isEmpty()) {
        hobbies += ", ";
    }
    hobbies += "Watching Movies";
}
    
    if (soccer.isSelected()) {
    if (!hobbies.isEmpty()) {
        hobbies += ", ";
    }
    hobbies += "Soccer";
}
    
if (tt.isSelected()) {
    if (!hobbies.isEmpty()) {
        hobbies += ", ";
    }
    hobbies += "Table Tennis";
}

if (hobbies.isEmpty()) {
    showMessage("Please select at least one hobby.");
    return;
}

    String directoryPath = "C:\\Users\\Edward\\Documents\\form";
    new File(directoryPath).mkdirs();

    String filePath = directoryPath + "\\" + eml + ".txt";
    
    if (new File(filePath).exists()) {
        email.setBackground(Color.RED);
        showMessage("Email already exists, please use a new one.");
        return;
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write("Fullname: " + fn);
        writer.newLine();
        writer.write("Email: " + eml);
        writer.newLine();
        writer.write("Password: " + pass);
        writer.newLine();
        writer.write("Gender: " + gender);
        writer.newLine();
        writer.write("Hobbies: " + hobbies);
        writer.newLine();
        writer.write("Course: " + course);
        writer.newLine();
        showmessage("Account created successfully!");

        email.setBackground(null);
        fullname.setBackground(null);
        password.setBackground(null);
        confirmpassword.setBackground(null);
        
    } catch (IOException e) {
        e.printStackTrace();
     }
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        loginform.show();
        this.hide();
    }//GEN-LAST:event_createaccountActionPerformed

    private void showMessage(String message) {
    JOptionPane.showMessageDialog(this, message, " ", JOptionPane.ERROR_MESSAGE);
    
        email.setBackground(WHITE);
        fullname.setBackground(WHITE);
        password.setBackground(WHITE);
        confirmpassword.setBackground(WHITE);
} 
    
        private void showmessage(String message) {
    JOptionPane.showMessageDialog(this, message, " ", JOptionPane.PLAIN_MESSAGE);
    
        email.setBackground(WHITE);
        fullname.setBackground(WHITE);
        password.setBackground(WHITE);
        confirmpassword.setBackground(WHITE);
} 
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed

    }//GEN-LAST:event_fullnameActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherActionPerformed

    private void courseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboBoxActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        if(showpassword.isSelected()){
            password.setEchoChar((char) 0);
            confirmpassword.setEchoChar((char) 0);
        }else{
            password.setEchoChar('*');
            confirmpassword.setEchoChar('*');
            
        }
    }//GEN-LAST:event_showpasswordActionPerformed

    private void pogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pogActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbActionPerformed
    
    private boolean isValidEmail(String email) {
    return email.matches("^[A-Za-z0-9._%+-]+@(gmail|yahoo)\\.com$");
}
    private boolean isValidString(String input) {
    return input.matches("^[a-zA-Z .]+$");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bb;
    private java.awt.Button button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JButton createaccount;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginhere;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox pog;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JCheckBox soccer;
    private javax.swing.JCheckBox tt;
    private javax.swing.JCheckBox wm;
    // End of variables declaration//GEN-END:variables
}

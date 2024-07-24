package Gui;

import Logica.User;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends javax.swing.JFrame {

    private int mouseX;
    private int mouseY;

    public Registration() {
        // Set the frame to be undecorated before initializing components
        setUndecorated(true);
        
        initComponents();
        //setSize(455, 350);
        setResizable(false);

        // Add mouse listeners to enable window dragging
        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                mouseX = evt.getX();
                mouseY = evt.getY();
            }
        });

        jPanel1.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameRegistration = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageRegistration = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idRegistration = new javax.swing.JTextField();
        usernameRegistration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        createAccount = new javax.swing.JButton();
        passwordRegistration = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        surnameRegistration1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 247, 252));
        jPanel1.setMinimumSize(new java.awt.Dimension(272, 533));
        jPanel1.setPreferredSize(new java.awt.Dimension(272, 533));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 85, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 75, 192, 30));

        nameRegistration.setBackground(new java.awt.Color(255, 247, 252));
        nameRegistration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRegistrationActionPerformed(evt);
            }
        });
        jPanel1.add(nameRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 192, 28));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Enter your name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, -1));

        ageRegistration.setBackground(new java.awt.Color(255, 247, 252));
        ageRegistration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ageRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageRegistrationActionPerformed(evt);
            }
        });
        jPanel1.add(ageRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 192, 28));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Enter your surname");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 192, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Enter your age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 192, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Enter your id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 192, -1));

        idRegistration.setBackground(new java.awt.Color(255, 247, 252));
        idRegistration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRegistrationActionPerformed(evt);
            }
        });
        jPanel1.add(idRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 192, 28));

        usernameRegistration.setBackground(new java.awt.Color(255, 247, 252));
        usernameRegistration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegistrationActionPerformed(evt);
            }
        });
        jPanel1.add(usernameRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 192, 28));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Enter your username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 192, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Enter your password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 190, -1));

        createAccount.setBackground(new java.awt.Color(87, 85, 254));
        createAccount.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        createAccount.setForeground(new java.awt.Color(235, 244, 246));
        createAccount.setText("Create account");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 465, 210, 35));

        passwordRegistration.setBackground(new java.awt.Color(255, 247, 252));
        passwordRegistration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(passwordRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 192, 28));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gitHub1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 15, 50, -1));

        closeBtn.setBackground(new java.awt.Color(255, 247, 252));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x.png"))); // NOI18N
        closeBtn.setBorder(null);
        closeBtn.setBorderPainted(false);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 20, 20, 20));

        surnameRegistration1.setBackground(new java.awt.Color(255, 247, 252));
        surnameRegistration1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        surnameRegistration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameRegistration1ActionPerformed(evt);
            }
        });
        jPanel1.add(surnameRegistration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 192, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRegistrationActionPerformed

    private void ageRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageRegistrationActionPerformed

    private void idRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRegistrationActionPerformed

    private void usernameRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegistrationActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        String inputName = nameRegistration.getText().trim();
        String inputSurname = ageRegistration.getText().trim();
        String inputAgeObj = ageRegistration.getText().trim();
        String inputIdText = idRegistration.getText().trim();
        String inputUsername = usernameRegistration.getText().trim();
        String inputPassword = new String(passwordRegistration.getPassword()).trim();

        if (inputName.isEmpty() || inputSurname.isEmpty() || inputAgeObj.isEmpty() || inputIdText.isEmpty() || inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }

        int inputId;
        int inputAge;
        try {
            inputAge = Integer.parseInt(inputAgeObj);
            inputId = Integer.parseInt(inputIdText);
        } catch (NumberFormatException e) {
            System.out.println("Age and ID must be numbers.");
            return;
        }

        User newUser = new User(inputName, inputSurname, inputAge, inputId, inputUsername, inputPassword);
        System.out.println("New user has been created: " + newUser.getUserName());
        this.dispose(); //close window
    }//GEN-LAST:event_createAccountActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_closeBtnActionPerformed

    private void surnameRegistration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameRegistration1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameRegistration1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageRegistration;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton createAccount;
    private javax.swing.JTextField idRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameRegistration;
    private javax.swing.JPasswordField passwordRegistration;
    private javax.swing.JTextField surnameRegistration1;
    private javax.swing.JTextField usernameRegistration;
    // End of variables declaration//GEN-END:variables
}

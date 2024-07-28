package Gui;

import Logica.MyExceptions;
import Logica.User;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Login extends javax.swing.JFrame {
    
   private ArrayList<User> dataBase = new ArrayList<>();
   private int mouseX;
   private int mouseY;
   
    public Login(ArrayList<User> dataBase) {
        this.dataBase = dataBase;
        // Set the frame to be undecorated before initializing components
        setUndecorated(true);
        initComponents();
        //setSize(572, 350);
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
        inputUserName = new javax.swing.JTextField();
        inputUserPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leftCorner2 = new javax.swing.JLabel();
        leftCorner = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(560, 350));

        jPanel1.setBackground(new java.awt.Color(255, 247, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputUserName.setBackground(new java.awt.Color(255, 247, 252));
        inputUserName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        inputUserName.setForeground(new java.awt.Color(51, 51, 51));
        inputUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputUserName.setText(" username");
        inputUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(inputUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 28));

        inputUserPassword.setBackground(new java.awt.Color(255, 247, 252));
        inputUserPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        inputUserPassword.setForeground(new java.awt.Color(51, 51, 51));
        inputUserPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputUserPassword.setText(" password");
        inputUserPassword.setToolTipText("");
        inputUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(inputUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 28));

        btnLogin.setBackground(new java.awt.Color(87, 85, 254));
        btnLogin.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(235, 244, 246));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 85, 254), 1, true));
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 35));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gitHub1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 280, 50, -1));

        jPanel2.setBackground(new java.awt.Color(87, 85, 254));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp.setBackground(new java.awt.Color(87, 85, 254));
        btnSignUp.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(235, 244, 246));
        btnSignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 244, 246), 1, true));
        btnSignUp.setFocusPainted(false);
        btnSignUp.setLabel("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 35));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 244, 246));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("of the site's features.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 260, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 244, 246));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hello, Friend!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 244, 246));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register with your personal details to use all");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, -1));

        leftCorner2.setBackground(new java.awt.Color(255, 247, 252));
        leftCorner2.setForeground(new java.awt.Color(235, 244, 246));
        leftCorner2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bb.png"))); // NOI18N
        jPanel2.add(leftCorner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        leftCorner.setBackground(new java.awt.Color(255, 247, 252));
        leftCorner.setForeground(new java.awt.Color(235, 244, 246));
        leftCorner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aa.png"))); // NOI18N
        jPanel2.add(leftCorner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(87, 85, 254));
        jButton1.setForeground(new java.awt.Color(87, 85, 254));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String btnUserName = inputUserName.getText().trim();
        String btnUserPassword = new String(inputUserPassword.getPassword()).trim();

        if (btnUserName.isEmpty() || btnUserPassword.isEmpty()) {
            System.out.println("Please enter both username and password.");
            return;
        }
//
        boolean isAuthenticated = false;
        for (User user : dataBase) {
            if (user.getUserName().equals(btnUserName) && user.getUserPassword().equals(btnUserPassword)) {
                isAuthenticated = true;
                break;
            }
        }
        try{
            if (isAuthenticated) {
                System.out.println("Login successful!");
                Home home = new Home(dataBase);
                home.setVisible(true);
                home.setLocationRelativeTo(null);
            } else {
                throw new MyExceptions("Login failed. Check your username and password.");     
            }
        }
        catch(MyExceptions e){          
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void inputUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserNameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        Registration regis = new Registration(dataBase);
        regis.setVisible(true);
        regis.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void inputUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JToggleButton btnSignUp;
    private javax.swing.JTextField inputUserName;
    private javax.swing.JPasswordField inputUserPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel leftCorner;
    private javax.swing.JLabel leftCorner2;
    // End of variables declaration//GEN-END:variables
}

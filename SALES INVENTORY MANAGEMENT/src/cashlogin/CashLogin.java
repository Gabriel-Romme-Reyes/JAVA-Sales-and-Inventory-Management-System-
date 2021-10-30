package cashlogin;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MyFrames.mysqlconnection;
import adminlogin.AdminLogin;
import adminmain.MainFrame;
import cashmain.CashMain;
import home.Home;


public class CashLogin extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
	Connection con = mysqlconnection.getConnection1();
	
	
    public static void main(String args[]) {
   	 try {
            
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");


         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
   	 
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new CashLogin().setVisible(true);
           }
       });
   }

    public CashLogin() {
        initComponents();
           this.setLocation(400,90);
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier Login");
        setBackground(new java.awt.Color(46, 61, 99));
        setMaximizedBounds(new java.awt.Rectangle(300, 0, 550, 435));
        setMaximumSize(new java.awt.Dimension(550, 435));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 61, 99));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 50, 310, 50);

        Password.setFont(new java.awt.Font("Meiryo UI", 1, 22)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");
        jPanel1.add(Password);
        Password.setBounds(110, 220, 130, 27);

        Username.setFont(new java.awt.Font("Meiryo UI", 1, 22)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username:");
        jPanel1.add(Username);
        Username.setBounds(100, 160, 130, 27);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 160, 250, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(250, 220, 250, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/ulogin.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 350, 130, 40);

        jCheckBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(380, 270, 140, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/clear.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 350, 130, 40);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();

   PreparedStatement ps;
        try {
            
            ps=con.prepareStatement("SELECT `name`,`password` FROM `cash` WHERE `name`=? AND `password`=?;");
            ps.setString(1,jTextField1.getText());
            ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {   
                String msg = jTextField1.getText();
                new CashMain(msg).setVisible(true);
                
      //  CashMain ca=new CashMain();
    // ca.setVisible(true);
            }else
            {
                 JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
                                        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
        }
        else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           
       close();

   PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT `name`,`password` FROM `cash` WHERE `name`=? AND `password`=?;");
            ps.setString(1,jTextField1.getText());
            ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {     
         String msg = jTextField1.getText();
                new CashMain(msg).setVisible(true);
                
      //  CashMain ca=new CashMain();
    // ca.setVisible(true);
            }else
            {
                 JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        } 
           
           
       }
       
       
       
       
         if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
       }    
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           
       close();

   PreparedStatement ps;
        try {

            ps=con.prepareStatement("SELECT `name`,`password` FROM `cash` WHERE `name`=? AND `password`=?;");
            ps.setString(1,jTextField1.getText());
            ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {     
         String msg = jTextField1.getText();
                new CashMain(msg).setVisible(true);
                
      //  CashMain ca=new CashMain();
    // ca.setVisible(true);
            }else
            {
                 JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        } 
           
           
       }
         
         
           if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
       }    
         
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
       }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
  if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
     lo.setVisible(true);
     this.setVisible(false);
       }    
    }//GEN-LAST:event_jButton2KeyPressed



}

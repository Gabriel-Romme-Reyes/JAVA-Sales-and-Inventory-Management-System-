package adminlogin;


import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import MyFrames.mysqlconnection;
import adminmain.MainFrame;
import home.Home;
import newadmin.NewAdmin;

public class AdminLogin extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

    public AdminLogin() {
        initComponents();
       
       
        this.setLocation(400,90);
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    
public void Checkadmin(){
           NewAdmin nd = new NewAdmin();
           nd.setVisible(true);
           this.setVisible(false);
}

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        at1 = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        abtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1a = new javax.swing.JTable();
        holdcount = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();



        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Login");
        setMaximizedBounds(new java.awt.Rectangle(400, 0, 530, 432));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 61, 99));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Login");

        Password.setFont(new java.awt.Font("Meiryo UI", 1, 22)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");

        Username.setFont(new java.awt.Font("Meiryo UI", 1, 22)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username:");

        at1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                at1ActionPerformed(evt);
            }
        });
        at1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                at1KeyPressed(evt);
            }
        });

        passfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                at2KeyPressed(evt);
            }
        });

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

        abtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        abtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/alogin.png"))); // NOI18N
        abtn.setText("Login");
        abtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abtnActionPerformed(evt);
            }
        });
        abtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                abtnKeyPressed(evt);
            }
        });

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

   

        jTable1a.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1aMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1a);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(at1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(abtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))    
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 530, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(holdcount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 482, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(Username)
                .addGap(22, 22, 22)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(at1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(abtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(370, 370, 370)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(337, 337, 337)
                    .addComponent(holdcount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Create New Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Forgot Password?");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);



        jMenuBar1.add(jMenu1);




        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void at1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_at1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_at1ActionPerformed

    private void abtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtnActionPerformed
 close();

   PreparedStatement ps;
        try {

           
        	con = mysqlconnection.getConnection1();
            ps=con.prepareStatement("SELECT `username`,`password` FROM `admin` WHERE `username`=? AND `password`=?;");
            ps.setString(1,at1.getText());
            ps.setString(2, String.valueOf(passfield.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {  
                
                
                
            MainFrame main=new MainFrame();
            main.setVisible(true); 
            this.setVisible(false);
           }
            else
            {
                 JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_abtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home lo = new Home();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void at2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_at2KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           
          close();
           Connection con;
   PreparedStatement ps;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
            ps=con.prepareStatement("SELECT `username`,`password` FROM `admin` WHERE `username`=? AND `password`=?;");
            ps.setString(1,at1.getText());
            ps.setString(2, String.valueOf(passfield.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {  
            MainFrame main=new MainFrame();
            main.setVisible(true);  
           }
            else
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
       
    }//GEN-LAST:event_at2KeyPressed

    private void at1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_at1KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           
          close();
           Connection con;
   PreparedStatement ps;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
            ps=con.prepareStatement("SELECT `username`,`password` FROM `admin` WHERE `username`=? AND `password`=?;");
            ps.setString(1,at1.getText());
            ps.setString(2, String.valueOf(passfield.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {  
            MainFrame main=new MainFrame();
            main.setVisible(true);  
           }
            else
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
        
    }//GEN-LAST:event_at1KeyPressed

    private void abtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_abtnKeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
        lo.setVisible(true);
        this.setVisible(false);
      }
    }//GEN-LAST:event_abtnKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
        Home lo = new Home();
        lo.setVisible(true);
        this.setVisible(false);
      }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     Checkadmin();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   JOptionPane.showMessageDialog(null,"    PLEASE UPGRADE TO PRO VERSION   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1aMouseClicked
       
    }//GEN-LAST:event_jTable1aMouseClicked

    private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            Home lo = new Home();
            lo.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            passfield.setEchoChar((char)0);
        }
        else{
            passfield.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abtn;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField at1;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField holdcount;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1a;
    Connection con = null;
    // End of variables declaration//GEN-END:variables
}

package newadmin;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import MyFrames.mysqlconnection;
import adminlogin.AdminLogin;


public class NewAdmin extends javax.swing.JFrame {
	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NewAdmin() {
        initComponents();
       
        this.setLocation(360,20);
          requirefirsta.setVisible(false);
          requirefirst2a.setVisible(false);
    }
     
      public void executeSQlQuery1(String query, String message)
   {
       
       Statement st;
       try{
    	   con = mysqlconnection.getConnection1();
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
           
               jTextField7a.setText("");
               jTextField2a.setText("");
               
              
               jTextField6a.setText("");
               sq.setSelectedItem("-Select-");
               sa.setText("");
              
               
               JOptionPane.showMessageDialog(null, "ADMIN USER "+message+" SUCCESSFULLY");
                this.setVisible(false);
                AdminLogin ad = new AdminLogin();
                ad.setVisible(true);
                
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
    
 


    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1a = new javax.swing.JTextField();
        jTextField2a = new javax.swing.JTextField();
        jTextField6a = new javax.swing.JTextField();
        requirefirsta = new javax.swing.JLabel();
        requirefirst2a = new javax.swing.JLabel();
        jTextField7a = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        anew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        sq = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        sa = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 177));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Account Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Admin Id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Password:");

        jTextField1a.setEditable(false);
        jTextField1a.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1aMouseClicked(evt);
            }
        });

        jTextField2a.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2aMouseClicked(evt);
            }
        });

        jTextField6a.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6aMouseClicked(evt);
            }
        });

        requirefirsta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirsta.setForeground(new java.awt.Color(255, 0, 0));
        requirefirsta.setText("*some fields missing!");
        requirefirsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirstaMouseClicked(evt);
            }
        });

        requirefirst2a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst2a.setForeground(new java.awt.Color(255, 0, 0));
        requirefirst2a.setText("* Please confirm your password!");
        requirefirst2a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst2aMouseClicked(evt);
            }
        });

        jTextField7a.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField7a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7aMouseClicked(evt);
            }
        });
        jTextField7a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7aActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Confirm Password:");

        anew.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/an.png"))); // NOI18N
        anew.setText("Add New");
        anew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Security Question");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Create New Admin");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("1.");

        label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        label.setText("Answer:");

        sq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-", "Your Favourite Number?", "Your Favourite Game?", "Your Best Pet?", "Your Childhood Name?" }));

        sa.setColumns(20);
        sa.setRows(5);
        sa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(sa);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requirefirsta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requirefirst2a)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7a, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6a, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2a, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1a, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(anew))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sq, 0, 258, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(requirefirst2a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requirefirsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(anew))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 93, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jTextField1aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1aMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_jTextField1aMouseClicked

    private void jTextField2aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2aMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_jTextField2aMouseClicked

    private void jTextField6aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6aMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_jTextField6aMouseClicked

    private void requirefirst2aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst2aMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst2aMouseClicked

    private void jTextField7aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7aMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_jTextField7aMouseClicked

    private void jTextField7aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7aActionPerformed

    private void anewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anewActionPerformed

            if ( jTextField6a.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   
         
      
        
     else   if (jTextField7a.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   
  
  else if (sq.getSelectedItem().toString().equals("-Select-")){
      
       JOptionPane.showMessageDialog(null,"Please Fill The Security Question", "NOTICE!",JOptionPane.ERROR_MESSAGE);   
      
  }
       
     else   if (sa.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   

     else{
        
       if (jTextField6a.getText().equals( jTextField7a.getText())){

String upname = jTextField2a.getText();
       String uppername =  upname.toUpperCase();

 

 
  
            String query="INSERT INTO `admin`(`username`,`password`,`sq`,`sa`) VALUES('"+uppername+"','"+jTextField6a.getText()+"','"+sq.getSelectedItem()+"','"+sa.getText()+"');";
            executeSQlQuery1(query, "CREATED");

      
      
      
      
      
  }
      
       
       
         else {

            JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATCH", "PASSWORD VERIFICATION" , JOptionPane.ERROR_MESSAGE);

        }
       
     }
 
    }//GEN-LAST:event_anewActionPerformed

    private void requirefirstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirstaMouseClicked

    }//GEN-LAST:event_requirefirstaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        AdminLogin al=new AdminLogin();

        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
               AdminLogin al=new AdminLogin();

        al.setVisible(true);
        this.setVisible(false);
        }
    }

    private void saKeyPressed(java.awt.event.KeyEvent evt) {
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           
       
            if ( jTextField6a.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   
         
      
        
     else   if (jTextField7a.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   
  
  else if (sq.getSelectedItem().toString().equals("-Select-")){
      
       JOptionPane.showMessageDialog(null,"Please Fill The Security Question", "NOTICE!",JOptionPane.ERROR_MESSAGE);   
      
  }
       
     else   if (sa.getText().equals("")){
     requirefirsta.setVisible(true);  
 }   

     else{
        
       if (jTextField6a.getText().equals( jTextField7a.getText())){

String upname = jTextField2a.getText();
       String uppername =  upname.toUpperCase();

 

 
  
            String query="INSERT INTO `admin`(`username`,`password`,`sq`,`sa`) VALUES('"+uppername+"','"+jTextField6a.getText()+"','"+sq.getSelectedItem()+"','"+sa.getText()+"');";
            executeSQlQuery1(query, "CREATED");

      
      
      
      
      
  }
      
       
       
         else {

            JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATCH", "PASSWORD VERIFICATION" , JOptionPane.ERROR_MESSAGE);

        }
       
     }
            
       }
        
// TODO add your handling code here:
    }//GEN-LAST:event_saKeyPressed

    
    
    

    
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
            for (@SuppressWarnings("unused") javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               
              UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                /*
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                */
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anew;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1a;
    private javax.swing.JTextField jTextField2a;
    private javax.swing.JTextField jTextField6a;
    private javax.swing.JTextField jTextField7a;
    private javax.swing.JLabel label;
    private javax.swing.JLabel requirefirst2a;
    private javax.swing.JLabel requirefirsta;
    private javax.swing.JTextArea sa;
    private javax.swing.JComboBox<?> sq;
    Connection con = null; 
    // End of variables declaration//GEN-END:variables
}

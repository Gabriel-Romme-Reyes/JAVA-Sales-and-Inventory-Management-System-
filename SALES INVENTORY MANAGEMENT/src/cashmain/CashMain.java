package cashmain;




import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import MyFrames.JTable_Search;
import MyFrames.Sell_item;
import adminmain.MainFrame;
import home.Home;
import MyFrames.Customer;



public class CashMain extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form CashMain
     */
    public CashMain() {
        initComponents();
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO CLOSE THIS APP? ", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_NO_OPTION){
               e.getWindow().dispose();    
           }  
       }                      
   });
 }
     public CashMain(String para){
        
          initComponents();        
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO CLOSE THIS APP?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_NO_OPTION){
               e.getWindow().dispose();    
           }
                                                     }
                                                         });
          user.setText(para);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<Object>();
        jComboBox5 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        user = new javax.swing.JButton();
        user1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CASHIER");
        setPreferredSize(new java.awt.Dimension(1370, 1041));


        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, Short.MAX_VALUE)
        );
        desk.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tran.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 30, 40));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 153));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-EXPIRATION-", "About To Expire", "Expired" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 150, -1));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 153));
        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-BILLS-", "Add Customer", "Balance", "Debtor", "Check Bill" }));
        jComboBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox5MouseClicked(evt);
            }
        });
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 130, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new-32.png"))); // NOI18N
        jButton2.setText("SELL ITEM");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 150, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        jButton6.setText("PRODUCTS");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 150, 40));

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 102));
        user.setText("XXXXX");
        user.setBorderPainted(false);
        user.setContentAreaFilled(false);
        user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 200, -1));

        user1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user1.setForeground(new java.awt.Color(0, 0, 102));
        user1.setText("USERNAME:");
        user1.setBorderPainted(false);
        user1.setContentAreaFilled(false);
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        jPanel1.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 140, -1));

        jButton5.setFont(new java.awt.Font("KBZipaDeeDooDah", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/logout.png"))); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 40, 140, 30));



        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventorylogo.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menubg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	String para = user.getText();
    	Sell_item sell = new Sell_item(para);
    	this.desk.add(sell);
    	sell.setVisible(true);
    
          
               // new CashMain(msg).setVisible(true);
                           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   int x = JOptionPane.showConfirmDialog(null, "                                 ARE YOU SURE YOU WANT TO LOGOUT?  ", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
           if (x == JOptionPane.YES_NO_OPTION){
               Home qb = new  Home();
       qb.setVisible(true);
       this.setVisible(false);    
           }
                else{
               
               
                     }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        
         if (jComboBox5.getSelectedItem().toString().equals("Add Customer")){
         Customer customer = new Customer();
         this.desk.add(customer);
         customer.setVisible(true);
        	 
        
         jComboBox5.setSelectedItem("-BILLS-");

        }
        else if (jComboBox5.getSelectedItem().toString().equals("Balance")){
       JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
        
         jComboBox5.setSelectedItem("-BILLS-");

        }

        else if (jComboBox5.getSelectedItem().toString().equals("Debtor")){
         JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         jComboBox5.setSelectedItem("-BILLS-");

        }
        
         else if (jComboBox5.getSelectedItem().toString().equals("Check Bill")){
          JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
        
         jComboBox5.setSelectedItem("-BILLS-");

        }
         
        
       

        else{

        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JTable_Search js=new JTable_Search();
        this.desk.add(js);
        js.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (jComboBox2.getSelectedItem().toString().equals("About To Expire")){
             JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   

            jComboBox2.setSelectedItem("-EXPIRATION-");
        }

        else if (jComboBox2.getSelectedItem().toString().equals("Expired")){
          JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
            jComboBox2.setSelectedItem("-EXPIRATION-");

        }

        else{

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
                new CashMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
	private javax.swing.JComboBox<?> jComboBox2;
    private javax.swing.JComboBox<?> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton user;
    private javax.swing.JButton user1;
    // End of variables declaration//GEN-END:variables
}

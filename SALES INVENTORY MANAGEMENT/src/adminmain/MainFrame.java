package adminmain;



import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import MyFrames.UpdateStock;
import home.Home;
import updatepass.UpdatePass;
import MyFrames.Saleslist;

public class MainFrame extends javax.swing.JFrame {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
      
            new MainFrame().setVisible(true); 
       
    }
    
	public MainFrame() {
        initComponents();
        setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to close this App? ", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_NO_OPTION){
               e.getWindow().dispose();    
           }
                 }
        });
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })

    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        Sales = new javax.swing.JComboBox();
        Stocks = new javax.swing.JComboBox();
        Expiration = new javax.swing.JComboBox();
        Settings = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Menubg = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        logo = new JLabel();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMIN");
        setMinimumSize(new java.awt.Dimension(1370, 1041));
        setPreferredSize(new java.awt.Dimension(1370, 1041));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

   

        
        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        
        desktopLayout.setHorizontalGroup(
        		
        		desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
              )
            	
        );
        
        desktopLayout.setVerticalGroup(
        		
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE))
            
        );
        
        desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);


        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 100, 1510, 1041));
        
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventorylogo.png")));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 70));

        Sales.setBackground(new java.awt.Color(255, 255, 153));
        Sales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SALES-", "Sales List", "Sales Chart" }));
        Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesActionPerformed(evt);
            }
        });
         
        getContentPane().add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, -1));

        Stocks.setBackground(new java.awt.Color(255, 255, 153));
        Stocks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Stocks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-STOCKS-", "Products", "Create Database List" }));
        Stocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StocksActionPerformed(evt);
            }
        });
        getContentPane().add(Stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 170, -1));

        Expiration.setBackground(new java.awt.Color(255, 255, 153));
        Expiration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Expiration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-EXPIRATION-", "About To Expire", "Expired" }));
        Expiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpirationActionPerformed(evt);
            }
        });
        getContentPane().add(Expiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 150, -1));

        Settings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Settings.setForeground(new java.awt.Color(0, 0, 102));
        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/settings.png"))); // NOI18N
        Settings.setText("ACCOUNT SETTINGS");
        Settings.setBorderPainted(false);
        Settings.setContentAreaFilled(false);
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 40));

        Logout.setFont(new java.awt.Font("KBZipaDeeDooDah", 0, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(0, 0, 102));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 150, 40));

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 40, 40));
  
 


        Menubg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menubg.jpg"))); // NOI18N
        getContentPane().add(Menubg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale.png"))); // NOI18N
        jButton8.setText("Sales");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
   int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout", "LOGOUT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
           if (x == JOptionPane.YES_NO_OPTION){
               Home qb = new  Home();
       qb.setVisible(true);
       this.setVisible(false);    
           } 
    }//GEN-LAST:event_LogoutActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        UpdatePass updatepass=new  UpdatePass();
        this.desktop.add(updatepass);
        
        updatepass.setVisible(true);
    }//GEN-LAST:event_SettingsActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    	
    	
    	
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
             
    	
    }//GEN-LAST:event_jButton7ActionPerformed


    private void SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesActionPerformed

    
         if (Sales.getSelectedItem().toString().equals("Sales List")){
         Saleslist sales = new Saleslist();
         this.desktop.add(sales);
         sales.setVisible(true);   
         Sales.setSelectedItem("-SALES-");
         }
         
         else if (Sales.getSelectedItem().toString().equals("Sales Chart")){
           JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         Sales.setSelectedItem("-SALES-");
             
         }
        
          else{
              
              
          }
    }//GEN-LAST:event_SalesActionPerformed

    private void StocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StocksActionPerformed
       
         if (Stocks.getSelectedItem().toString().equals("Products")){
           UpdateStock up =new UpdateStock();
            this.desktop.add(up);
            
            up.setVisible(true);
         Stocks.setSelectedItem("-STOCKS-");
         }
         
         else if (Stocks.getSelectedItem().toString().equals("Create Database List")){
          JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
         Stocks.setSelectedItem("-STOCKS-");
             
         }
        
          else{
              
              
          }
    }//GEN-LAST:event_StocksActionPerformed

    private void ExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpirationActionPerformed

        if (Expiration.getSelectedItem().toString().equals("About To Expire")){
          JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   
            Expiration.setSelectedItem("-EXPIRATION-");
        }

        else if (Expiration.getSelectedItem().toString().equals("Expired")){
           JOptionPane.showMessageDialog(null,"    FEATURE NOT ADDED YET   ", "INFORMATION",JOptionPane.INFORMATION_MESSAGE); 
   

            Expiration.setSelectedItem("-EXPIRATION-");

        }

        else{

        }
    }//GEN-LAST:event_ExpirationActionPerformed



    

    public javax.swing.JDesktopPane desktop;
    private JLabel logo;
    private javax.swing.JButton Settings;
    private javax.swing.JButton Logout;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox Expiration;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox Sales;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox Stocks;
    private javax.swing.JLabel Menubg;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;

}

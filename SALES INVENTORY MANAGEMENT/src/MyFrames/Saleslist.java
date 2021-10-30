package MyFrames;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import MyFrames.JTable_Search.FunctionBar;
import net.proteanit.sql.DbUtils;

public class Saleslist extends JInternalFrame{
	   public Saleslist() {
	        initComponents();

	     this.setLocation(30, 10);

	      
	        
	    }
	    public void doDefaultCloseAction() {
	        
            
	    	 
	        dispose(); 
	              
	     
	      } 
	    @SuppressWarnings("unchecked")

	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        pname = new javax.swing.JTextField();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable_Users = new javax.swing.JTable();
	        barcode = new javax.swing.JTextField();
	        jLabel12 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();

	        setBackground(new java.awt.Color(255, 255, 177));
	        setClosable(true);
	        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	        setMaximizable(true);
	        setResizable(true);
	        setTitle("SALES LIST");

	        jPanel1.setBackground(new java.awt.Color(255, 255, 255));


	        pname.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyReleased(java.awt.event.KeyEvent evt) {
	                pnameKeyReleased(evt);
	            }

	        });

	        jTable_Users.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

	        jScrollPane1.setViewportView(jTable_Users);

	        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyReleased(java.awt.event.KeyEvent evt) {
	                barcodeKeyReleased(evt);
	            }
	        });

	        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
	        jLabel12.setText("Barcode:");

	        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
	        jLabel4.setText("Product Name:");

	        jLabel5.setFont(new java.awt.Font("Meiryo UI", 1, 24)); // NOI18N
	        jLabel5.setText("SALES LIST");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addContainerGap(22, Short.MAX_VALUE)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(191, 191, 191)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGap(112, 112, 112)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap())
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(jLabel5)
	                .addGap(524, 524, 524))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(31, 31, 31)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(92, 92, 92))
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
	        refreshTable(con,jTable_Users);
	    }// </editor-fold>//GEN-END:initComponents

	    private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased

	    }//GEN-LAST:event_pnameKeyReleased

	    private void barcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyReleased

	    }//GEN-LAST:event_barcodeKeyReleased



	  
	    
		public void refreshTable(final Connection connection,final JTable table){
			
			try {
				String query = "select ID,CUSTOMER,PRODUCT,PRICE,QUANTITY,CASHIER,DATE from SALES";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	 
	    Connection con = mysqlconnection.getConnection1();
	    private javax.swing.JTextField barcode;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable_Users;
	    private javax.swing.JTextField pname;

}

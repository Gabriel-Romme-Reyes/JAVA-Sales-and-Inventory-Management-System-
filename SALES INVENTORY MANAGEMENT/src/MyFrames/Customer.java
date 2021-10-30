package MyFrames;

import java.awt.event.ActionEvent;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class Customer extends JInternalFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con = mysqlconnection.getConnection1();
 	private JLabel addresslbl = new JLabel() ; 
 	private JPanel panel = new JPanel();
 	private JLabel idlbl = new JLabel();
 	private JLabel customerdetails = new JLabel();
 	private JLabel namelbl = new JLabel();
 	private JLabel contactlbl = new JLabel();
 	private JLabel datelbl = new JLabel();
 	private JLabel requirefirst = new JLabel();
 	private JLabel requirefirst2 = new JLabel();
 	private JLabel typelbl = new JLabel();
 	private JTextField addresstxt = new JTextField();
 	private JTextField idtext = new JTextField();
 	private JTextField nametxt = new JTextField();
 	private JTextField datetxt = new JTextField();
 	private JTextField contactnotxt = new JTextField();
 	private JComboBox typecb = new JComboBox();
 	private JButton addbtn = new JButton();
 	private JButton delbtn = new JButton();
 	private JButton upbtn = new JButton();
 	private JTable table = new JTable();
 	private JScrollPane scrollpane = new JScrollPane();
	
	
	
	public Customer() {
		initComponents();
        this.setLocation(250,0);
	}
	 private void initComponents() {

		 	requirefirst.setVisible(false);
		 	requirefirst2.setVisible(false);
		 	
	        addresslbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        addresslbl.setText("Address:");
	        
	        addresstxt.setFont(new java.awt.Font("Tahoma", 0, 16));
	        

	        setClosable(true);
	        setMaximizable(false);
	        setResizable(false);
	        setTitle("Customer");


	        panel.setBackground(new java.awt.Color(255, 255, 255));

	        customerdetails.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        customerdetails.setText("Customer Details");

	        idlbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        idlbl.setText("Customer Id:");

	        namelbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        namelbl.setText("Name:");
	        
	        contactlbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        contactlbl.setText("Contact:");

	        idtext.setEditable(false);
	        idtext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        idtext.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jTextField1MouseClicked(evt);
	            }

				private void jTextField1MouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });

	        nametxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        nametxt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jTextField2MouseClicked(evt);
	            }

				private void jTextField2MouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });
	        
	        typelbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        typelbl.setText("Type:");
	        
	        typecb.setBackground(new java.awt.Color(255, 255, 153));
	        typecb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        typecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wholesale", "Retail"}));
	        typecb.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                
	            }
	        });

	        addbtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/an.png"))); // NOI18N
	        addbtn.setText("New");
	        addbtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
			        if ( nametxt.getText().equals("")){
			            requirefirst.setVisible(true);
			        }

			        else {

			            String query="INSERT INTO `customer`(`name`,`type`,`address`,`contactno`,`date_added`) VALUES('"+nametxt.getText()+"','"+typecb.getSelectedItem().toString()+"','"+addresstxt.getText()+"','"+contactnotxt.getText()+"','"+datetxt.getText()+"');";
			            executeSQlQuery1(query, "Inserted");				
			        }
	            }
	        });

	        upbtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        upbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/up.png"))); // NOI18N
	        upbtn.setText("update");
	        upbtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                if ( idtext.getText().equals("")){
	                    requirefirst2.setVisible(true);
	                }

	                else {

	                    String query="UPDATE `customer` SET `name`='"+nametxt.getText()+"',`type`='"+typecb.getSelectedItem().toString()+"',`address`='"+addresstxt.getText()+"',`contactno`='"+contactnotxt.getText()+"',`date_added`='"+datetxt.getText()+"' WHERE `id`="+idtext.getText();
	                    executeSQlQuery1(query,"Update");

	                }
	            }
	        });

	        delbtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/del.png"))); // NOI18N
	        delbtn.setText("Delete");
	        delbtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                if ( idtext.getText().equals("")){
	                    requirefirst2.setVisible(true);
	                }
	                else{

	                    int response=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this Record?", "Delete Record",JOptionPane.YES_NO_OPTION);

	                    if (response==JOptionPane.YES_OPTION){
	                        String query="DELETE FROM `customer` WHERE `id`="+idtext.getText();
	                        executeSQlQuery1(query,"Delete");
	                    }
	                }
	            }
	        });

	        table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Id", "Name", "Type","Address","Contactno.", "Date Added"
	            }
	        )  {

				private static final long serialVersionUID = 1L;
				boolean[] canEdit = new boolean [] {
	                false, false, false, false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        table.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
					try {
						int row = table.getSelectedRow();
						String ID = (table.getModel().getValueAt(row, 0).toString());				
						String query = "select * from customer where ID = '" + ID + "' ";
						PreparedStatement pst = con.prepareStatement(query);					
						ResultSet rs = pst.executeQuery();					
						while(rs.next()){
							idtext.setText(rs.getString("ID"));
							nametxt.setText(rs.getString("NAME"));
							contactnotxt.setText(rs.getString("CONTACTNO"));
							addresstxt.setText(rs.getString("ADDRESS"));

							
						}
						pst.close();					
						
					} catch (Exception e) {
						e.printStackTrace();
					}
	            }


	        });
	        scrollpane.setViewportView(table);

	        contactnotxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        contactnotxt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jTextField6MouseClicked(evt);
	            }

				private void jTextField6MouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });

	        requirefirst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
	        requirefirst.setForeground(new java.awt.Color(255, 0, 0));
	        requirefirst.setText("* All fields must be filled!");
	        requirefirst.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                requirefirstMouseClicked(evt);
	            }

				private void requirefirstMouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });

	        requirefirst2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
	        requirefirst2.setForeground(new java.awt.Color(255, 0, 0));
	        requirefirst2.setText("* Select a cashier name from table!");
	        requirefirst2.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                requirefirst2MouseClicked(evt);
	            }

				private void requirefirst2MouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });

	        datetxt.setEditable(false);
	        datetxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        datetxt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                pdateMouseClicked(evt);
	            }

				private void pdateMouseClicked(MouseEvent evt) {
					// TODO Auto-generated method stub
					
				}
	        });
	        String DateFormat = "yyyy-MM-dd";


	          Calendar cal= Calendar.getInstance();
	          SimpleDateFormat format = new SimpleDateFormat(DateFormat);
	          datetxt.setText(format.format(cal.getTime()));       
	        

	        datelbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
	        datelbl.setText("Date:");

	        javax.swing.GroupLayout panellayout = new javax.swing.GroupLayout(panel);
	        panel.setLayout(panellayout);
	        panellayout.setHorizontalGroup(
	            panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panellayout.createSequentialGroup()
	                .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(panellayout.createSequentialGroup()
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(panellayout.createSequentialGroup()
	                                .addGap(84, 84, 84)
	                                .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(requirefirst, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(requirefirst2)))
	                            .addGroup(panellayout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(contactlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(addresslbl,javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(typelbl,javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(panellayout.createSequentialGroup()
	                                        .addComponent(addbtn)
	                                        .addGap(36, 36, 36)
	                                        .addComponent(upbtn)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
	                                        .addComponent(delbtn))))
	                            .addGroup(panellayout.createSequentialGroup()
	                                .addContainerGap()
	                                .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(panellayout.createSequentialGroup()
	                                        .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addComponent(contactnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(typecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    )))
	                        .addGap(10, 10, 10))
	                    .addGroup(panellayout.createSequentialGroup()
	                        .addGap(94, 94, 94)
	                        .addComponent(customerdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        panellayout.setVerticalGroup(
	            panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(panellayout.createSequentialGroup()
	                .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(panellayout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(panellayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(customerdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(16, 16, 16)
	                        .addComponent(requirefirst2)
	                        .addGap(2, 2, 2)
	                        .addComponent(requirefirst)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(13, 13, 13)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(contactlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(contactnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(addresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        	.addComponent(typelbl,javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        	.addComponent(typecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(110, 110, 110)
	                        .addGroup(panellayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(addbtn)
	                            .addComponent(upbtn)
	                            .addComponent(delbtn))))
	                .addContainerGap(109, Short.MAX_VALUE))
	        );
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        pack();
	        refreshTable(con,table);
	 }
	       
	 public void executeSQlQuery1(String query, String message)
	        {
	            Statement st;
	            try{
	                st = con.createStatement();
	                if((st.executeUpdate(query)) == 1)
	                {
	                    // refresh jtable data
	                	refreshTable(con,table);
	                	idtext.setText("");
	                    addresstxt.setText("");
	                    nametxt.setText("");

	                    contactnotxt.setText("");
	                    
	                    JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
	                }else{
	                    JOptionPane.showMessageDialog(null, "Data Not "+message);
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
	        
	 }
	 
	    
		public void refreshTable(final Connection connection,final JTable table){
			
			try {
				String query = "select ID,NAME,TYPE,ADDRESS,CONTACTNO,DATE_ADDED from customer";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	 
	 
}

package MyFrames;

import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

public class Sell_item extends JInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con = mysqlconnection.getConnection1();
    String DateFormat = "yyyy-MM-dd";
    Calendar cal= Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat(DateFormat);
 	private JPanel panel = new JPanel();
 	private JLabel stockdetails = new JLabel();
 	private JLabel customerdetails = new JLabel();
 	private JLabel customerlbl = new JLabel();
 	private JLabel cashierlbl = new JLabel();
 	private JLabel productlbl = new JLabel();
 	private JLabel pricelbl = new JLabel();
 	private JLabel quantitylbl = new JLabel();
 	private JLabel totallbl = new JLabel();
 	private JLabel typelbl = new JLabel();
 	private JLabel requirefirst = new JLabel();
 	private JLabel requirefirst2 = new JLabel();
 	
 	private JTextField customeridtxt = new JTextField();
 	private JTextField customertxt = new JTextField();
 	private JTextField producttext = new JTextField();
 	private JTextField pricetxt = new JTextField();
 	private JTextField quantitytxt = new JTextField();
 	private JTextField totaltxt = new JTextField();
 	private JTextField datetxt = new JTextField();
 	private JTextField typetxt = new JTextField();
 	private JButton sellbtn = new JButton();
 	private JTable producttable = new JTable();
 	private JTable customertable = new JTable();
 	private JScrollPane productscrollpane = new JScrollPane();
 	private JScrollPane customerscrollpane = new JScrollPane();
 	private int productavailable ;
 	private int productid ;
	
 	
 	public Sell_item(String user) {
 		
 		initComponents();
        this.setLocation(50,0);
        cashierlbl.setText(user);
 	}
 	
	public void initComponents(){
        panel.setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("SELL ITEM");
        
        customerdetails.setFont(new java.awt.Font("Tahoma", 0, 16));
        customerdetails.setText("Customer");
        customerlbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        customerlbl.setText("Name:");
        typelbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        typelbl.setText("Type:");
        
        stockdetails.setFont(new java.awt.Font("Tahoma", 0, 16));
        stockdetails.setText("Stock");
        productlbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        productlbl.setText("Name:");
        pricelbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        pricelbl.setText("Price:");
        quantitylbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        quantitylbl.setText("Quantity:");
        
        quantitytxt.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
            	if(pricetxt.getText().equals(""))
            		pricetxt.setText("0");
            	if(quantitytxt.getText().equals(""))
            		quantitytxt.setText("0");
            		
            	int sum = Integer.parseInt(pricetxt.getText()) * Integer.parseInt(quantitytxt.getText());
            	totaltxt.setText(Integer.toString(sum));
              }

            });
        totallbl.setFont(new java.awt.Font("Tahoma", 0, 16));
        totallbl.setText("Total");
        
        
        pricetxt.setEditable(false);
        customeridtxt.setEditable(false);
        customertxt.setEditable(false);
        producttext.setEditable(false);
        totaltxt.setEditable(false);
        typetxt.setEditable(false);
        
        sellbtn.setText("Sell");
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if ( customertxt.getText().equals("")){
                    requirefirst2.setVisible(true);
                }

                else {

                    String query="INSERT INTO `sales`(`customer`,`product`,`price`,`quantity`,`total`,`cashier`,`date`) VALUES('"+customertxt.getText()+"','"+producttext.getText()+"','"
                    +pricetxt.getText()+"','"+quantitytxt.getText()+"','"+totaltxt.getText()+"','"+cashierlbl.getText()+"','"+format.format(cal.getTime())+"');";
                    executeSQlQuery1(query,"Sold");
                    
                    String sellquery = "UPDATE `STOCK` SET AVAILABLE = "+(productavailable-Integer.parseInt( quantitytxt.getText()))+ " WHERE ID = " + productid;
                    executeSQlQuery1(sellquery,"Subtracted");
                }
            }
        });
        
        customertable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Id", "Name", "Type"
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
	        customertable.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
					try {
						int row = customertable.getSelectedRow();
						String ID = (customertable.getModel().getValueAt(row, 0).toString());				
						String query = "select * from customer where ID = '" + ID + "' ";
						PreparedStatement pst = con.prepareStatement(query);					
						ResultSet rs = pst.executeQuery();					
						while(rs.next()){
							customeridtxt.setText(rs.getString("Id"));
							customertxt.setText(rs.getString("Name"));
							typetxt.setText(rs.getString("Type"));
							
						}
						pst.close();					
						
					} catch (Exception e) {
						e.printStackTrace();
					}
	            }


	        });
	        customerscrollpane.setViewportView(customertable);
	        
	        
	        producttable.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {

		            },
		            new String [] {
		                "Id", "Name", "Available","Retail","Wholesale"
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
		        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseClicked(java.awt.event.MouseEvent evt) {
						try {
							int row = producttable.getSelectedRow();
							String ID = (producttable.getModel().getValueAt(row, 0).toString());				
							String query = "select * from stock where ID = '" + ID + "' ";
							PreparedStatement pst = con.prepareStatement(query);					
							ResultSet rs = pst.executeQuery();					
							while(rs.next()){
								productavailable = Integer.parseInt(rs.getString("Available"));
								productid = Integer.parseInt(rs.getString("Id"));
								producttext.setText(rs.getString("Name"));
								if(typetxt.getText().equalsIgnoreCase("Retail")) {
								pricetxt.setText(rs.getString("Retail"));
								}
								else if(typetxt.getText().equalsIgnoreCase("Wholesale")) {
									pricetxt.setText(rs.getString("Wholesale"));
								}
							}
							pst.close();					
							
						} catch (Exception e) {
							e.printStackTrace();
						}
		            }


		        });
		        productscrollpane.setViewportView(producttable);
		
		GroupLayout panellayout = new GroupLayout(panel);
		panel.setLayout(panellayout);
		panellayout.setHorizontalGroup(panellayout.createSequentialGroup()
				.addGroup( panellayout.createParallelGroup()
				.addComponent(customerdetails)
				.addComponent(customerlbl)
				.addComponent(typelbl)
				.addComponent(stockdetails)
				.addComponent(productlbl)
				.addComponent(pricelbl)
				.addComponent(quantitylbl)
				.addComponent(totallbl)
				.addComponent(sellbtn))
				
				.addGroup(panellayout.createParallelGroup()
				.addComponent(customertxt,215,215,215)
				.addComponent(typetxt,215,215,215)
				.addComponent(producttext,215,215,215)
				.addComponent(pricetxt,215,215,215)
				.addComponent(quantitytxt,215,215,215)
				.addComponent(totaltxt,215,215,215))
				
				.addGroup(panellayout.createParallelGroup()
				.addComponent(customerscrollpane,642,642,642)
				.addComponent(productscrollpane,642,642,642)
				)

		);
		panellayout.setVerticalGroup(panellayout.createParallelGroup()
				.addGroup(panellayout.createSequentialGroup()
						.addComponent(customerdetails)
						.addGap(10)
						.addGroup(panellayout.createParallelGroup()
						.addComponent(customerlbl)				
						.addComponent(customertxt,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(panellayout.createParallelGroup()
						.addComponent(typelbl)
						.addComponent(typetxt,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addComponent(stockdetails)
						.addGap(10)
						.addGroup(panellayout.createParallelGroup()
						.addComponent(productlbl)
						.addComponent(producttext,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(panellayout.createParallelGroup()
						.addComponent(pricelbl)
						.addComponent(pricetxt,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(panellayout.createParallelGroup()
						.addComponent(quantitylbl)
						.addComponent(quantitytxt,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(panellayout.createParallelGroup()
						.addComponent(totallbl)
						.addComponent(totaltxt,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(sellbtn))
						
				
				.addGroup(panellayout.createSequentialGroup()					
				.addComponent(customerscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(productscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				
				
				.addGap(40)
				
				);
		
		
		GroupLayout layout = new GroupLayout(getContentPane());
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
		refreshTable(con,customertable);
		refreshTable2(con,producttable);
	}
	
	 public void executeSQlQuery1(String query, String message)
     {
         Statement st;
         try{
             st = con.createStatement();
             if((st.executeUpdate(query)) == 1)
             {
                 // refresh jtable data
            	 refreshTable2(con,producttable);

                 JOptionPane.showMessageDialog(null, "Stock "+message+" Succefully");
             }else{
                 JOptionPane.showMessageDialog(null, "Stock Not "+message);
             }
         }catch(Exception ex){
             ex.printStackTrace();
         }
     
     }
		public void refreshTable(final Connection connection,final JTable table){
			
			try {
				String query = "select ID,NAME,TYPE from customer";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		public void refreshTable2(final Connection connection,final JTable table){
			
			try {
				String query = "select ID,NAME,AVAILABLE,RETAIL,WHOLESALE from stock";
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

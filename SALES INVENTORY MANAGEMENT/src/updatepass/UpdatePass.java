
package updatepass;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import MyFrames.Cash;
import MyFrames.mysqlconnection;



public class UpdatePass extends javax.swing.JInternalFrame {

   


	private static final long serialVersionUID = 1L;

    public UpdatePass() {
       
        initComponents();
        this.setLocation(250,0);
          requirefirsta.setVisible(false);
          requirefirst2a.setVisible(false);
           showdate();
           show_cash();
          requirefirst.setVisible(false);
          requirefirst2.setVisible(false);
        
    } 
 private void initComponents() {
    	
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        anew = new javax.swing.JButton();
        update = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        requirefirst = new javax.swing.JLabel();
        requirefirst2 = new javax.swing.JLabel();
        pdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        auser = new javax.swing.JTextField();
        apass = new javax.swing.JTextField();
        requirefirsta = new javax.swing.JLabel();
        requirefirst2a = new javax.swing.JLabel();
        acpass = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        anew1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        sq = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        sa = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Address");


        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Password");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Add Cashier Details");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Cashier Id:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Username:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Password:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        anew.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/an.png"))); // NOI18N
        anew.setText("New");
        anew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anewActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/up.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/del.png"))); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password", "Date Registered"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        requirefirst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst.setForeground(new java.awt.Color(255, 0, 0));
        requirefirst.setText("* All fields must be filled!");
        requirefirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirstMouseClicked(evt);
            }
        });

        requirefirst2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst2.setForeground(new java.awt.Color(255, 0, 0));
        requirefirst2.setText("* Select a cashier name from table!");
        requirefirst2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst2MouseClicked(evt);
            }
        });

        pdate.setEditable(false);
        pdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdateMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(requirefirst, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requirefirst2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(anew)
                                        .addGap(36, 36, 36)
                                        .addComponent(update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(del))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pdate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(requirefirst2)
                        .addGap(2, 2, 2)
                        .addComponent(requirefirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anew)
                            .addComponent(update)
                            .addComponent(del))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Cashier", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Account Details");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Admin Id:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Username:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Password:");

        aid.setEditable(false);
        aid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        aid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aidMouseClicked(evt);
            }
        });

        auser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        auser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                auserMouseClicked(evt);
            }
        });
        auser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auserKeyReleased(evt);
            }
        });

        apass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        apass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apassMouseClicked(evt);
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

        acpass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        acpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acpassMouseClicked(evt);
            }
        });
        acpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acpassActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Confirm Password:");

        anew1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        anew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/upd.png"))); // NOI18N
        anew1.setText("Update");
        anew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anew1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Security Question");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Update Details");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("1.");

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
        jScrollPane3.setViewportView(sa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sq, 0, 258, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addComponent(jLabel17)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel18)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requirefirsta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requirefirst2a)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(acpass, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apass, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(auser, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(anew1)))
                .addContainerGap(672, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(requirefirst2a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requirefirsta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anew1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update Admin Account", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static  String DateFormat = "yyyy-MM-dd";
    public void showdate()
    {
      Calendar cal= Calendar.getInstance();
      SimpleDateFormat format = new SimpleDateFormat(DateFormat);
      pdate.setText(format.format(cal.getTime()));       
    }


    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void anewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anewActionPerformed
        if ( jTextField2.getText().equals("")){
            requirefirst.setVisible(true);
        }

   
        else if (jTextField6.getText().equals("")){
            requirefirst.setVisible(true);
        }
        else {

            String query="INSERT INTO `cash`(`name`,`password`,`pdate`) VALUES('"+jTextField2.getText()+"','"+jTextField6.getText()+"','"+pdate.getText()+"');";
            executeSQlQuery1(query, "Inserted");

        }

    }//GEN-LAST:event_anewActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if ( jTextField1.getText().equals("")){
            requirefirst2.setVisible(true);
        }

        else {

            String query="UPDATE `cash` SET `name`='"+jTextField2.getText()+"',`password`='"+jTextField6.getText()+"',`pdate`='"+pdate.getText()+"' WHERE `id`="+jTextField1.getText();
            executeSQlQuery1(query,"Update");

        }
    }//GEN-LAST:event_updateActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        if ( jTextField1.getText().equals("")){
            requirefirst2.setVisible(true);
        }
        else{

            int response=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this Record?", "Delete Record",JOptionPane.YES_NO_OPTION);

            if (response==JOptionPane.YES_OPTION){
                String query="DELETE FROM `cash` WHERE `id`="+jTextField1.getText();
                executeSQlQuery1(query,"Delete");

            }
            else{
            }
        }
    }//GEN-LAST:event_delActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();        // TODO add your handling code here:
        TableModel model=jTable1.getModel();
        jTextField1.setText(model.getValueAt(i, 0).toString());
        jTextField2.setText(model.getValueAt(i, 1).toString());
      
        //jTextField4.setText(model.getValueAt(i, 3).toString());
        // jTextField5.setText(model.getValueAt(i, 4).toString());
        jTextField6.setText(model.getValueAt(i, 2).toString());
        pdate.setText(model.getValueAt(i, 3).toString());

        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void requirefirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirstMouseClicked

    }//GEN-LAST:event_requirefirstMouseClicked

    private void requirefirst2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst2MouseClicked

    private void pdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pdateMouseClicked

    private void aidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aidMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_aidMouseClicked

    private void auserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auserMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_auserMouseClicked

    private void apassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apassMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_apassMouseClicked

    private void requirefirstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirstaMouseClicked

    }//GEN-LAST:event_requirefirstaMouseClicked

    private void requirefirst2aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst2aMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst2aMouseClicked

    private void acpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acpassMouseClicked
        requirefirsta.setVisible(false);
        requirefirst2a.setVisible(false);
    }//GEN-LAST:event_acpassMouseClicked

    private void acpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acpassActionPerformed

    private void anew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anew1ActionPerformed

        if ( aid.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else   if (auser.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else if (sq.getSelectedItem().toString().equals("-Select-")){

            JOptionPane.showMessageDialog(null,"Please Fill The Security Question", "NOTICE!",JOptionPane.ERROR_MESSAGE);

        }

        else   if (sa.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else{

            if (apass.getText().equals( acpass.getText())){

                String upname = auser.getText();
                String uppername =  upname.toUpperCase();

              //  String query="INSERT INTO `admin`(`username`,`password`,`sq`,`sa`) VALUES('"+uppername+"','"+jTextField6a.getText()+"','"+sq.getSelectedItem()+"','"+sa.getText()+"');";
             //   executeSQlQuery1(query, "Inserted");
                
                 String query="UPDATE `admin` SET `username`='"+uppername+"',`password`='"+apass.getText()+"',`sq`='"+sq.getSelectedItem()+"',`sa`='"+sa.getText()+"' WHERE `id`="+aid.getText();
            executeSQlQuery(query,"Update");

            }

            else {

                JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATCH", "PASSWORD VERIFICATION" , JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_anew1ActionPerformed

    private void saKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            if ( aid.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else   if (auser.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else if (sq.getSelectedItem().toString().equals("-Select-")){

            JOptionPane.showMessageDialog(null,"Please Fill The Security Question", "NOTICE!",JOptionPane.ERROR_MESSAGE);

        }

        else   if (sa.getText().equals("")){
            requirefirsta.setVisible(true);
        }

        else{

            if (apass.getText().equals( acpass.getText())){

                String upname = auser.getText();
                String uppername =  upname.toUpperCase();

              //  String query="INSERT INTO `admin`(`username`,`password`,`sq`,`sa`) VALUES('"+uppername+"','"+jTextField6a.getText()+"','"+sq.getSelectedItem()+"','"+sa.getText()+"');";
             //   executeSQlQuery1(query, "Inserted");
                
                 String query="UPDATE `admin` SET `username`='"+uppername+"',`password`='"+apass.getText()+"',`sq`='"+sq.getSelectedItem()+"',`sa`='"+sa.getText()+"' WHERE `id`="+aid.getText();
            executeSQlQuery(query,"Update");

            }

            else {

                JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATCH", "PASSWORD VERIFICATION" , JOptionPane.ERROR_MESSAGE);

            }

        }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_saKeyPressed

    private void auserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auserKeyReleased
      
    
    
    }//GEN-LAST:event_auserKeyReleased
    
    

    
    public ArrayList<Cash>getCashList()
    {
        ArrayList<Cash>cashList=new ArrayList<Cash>();

        String query="SELECT * FROM `cash`;";
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery(query);
            Cash cash;
            while(rs.next())
            {
                cash = new Cash(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("pdate"));
               cashList.add(cash);
            }
            
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
        return cashList;
    }
 // Display data in JTable
    public void show_cash()
    {
        ArrayList<Cash> list=getCashList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
           
           // row[3]=list.get(i).getaddress();
          //  row[4]=list.get(i).getemail();
            row[2]=list.get(i).getpassword();
             row[3]=list.get(i).getpdate();
            
            model.addRow(row);
        }
        
    }
    
    public void executeSQlQuery1(String query, String message)
   {
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               show_cash();
               jTextField1.setText("");
               jTextField2.setText("");
               
              
               jTextField6.setText("");
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
                this.setVisible(false);
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
    public void executeSQlQuery(String query, String message)
   {
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
             
            
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    Connection con = mysqlconnection.getConnection1();
    private javax.swing.JTextField acpass;
    private javax.swing.JTextField aid;
    private javax.swing.JButton anew;
    private javax.swing.JButton anew1;
    private javax.swing.JTextField apass;
    private javax.swing.JTextField auser;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel label;
    private javax.swing.JTextField pdate;
    private javax.swing.JLabel requirefirst;
    private javax.swing.JLabel requirefirst2;
    private javax.swing.JLabel requirefirst2a;
    private javax.swing.JLabel requirefirsta;
    private javax.swing.JTextArea sa;
    private javax.swing.JComboBox sq;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    

    
}

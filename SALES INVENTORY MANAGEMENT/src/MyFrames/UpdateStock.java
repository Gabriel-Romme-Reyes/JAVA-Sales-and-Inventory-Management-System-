package MyFrames;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import MyFrames.mysqlconnection;
import java.awt.Color;


public class UpdateStock extends javax.swing.JInternalFrame {

    public UpdateStock() {
        initComponents();
        

       // show_stock();
        findUsers();
        this.setLocation(137,0);
        requirefirst.setVisible(false);
          requirefirst2.setVisible(false);
         //   requirefirst3.setVisible(false);
        //    requirefirst4.setVisible(false);
           
          //  medium.setSelected(true);
        
    }


    
@Override
    public void doDefaultCloseAction() {
       
               
 
              int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to close this Section? ", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
           if (x == JOptionPane.YES_NO_OPTION){
               dispose(); 
            
                   
                          } 
            else{
        }    
            
   
    }

    
     public class FunctionBar{
            
            ResultSet rs = null;
            PreparedStatement ps = null;
            public ResultSet find(String s){
                try{
                    con = mysqlconnection.getConnection1();
                    ps = con.prepareStatement("select * from stock where barcode = ?");
                    ps.setString(1,s);
                    rs = ps.executeQuery();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                return rs;
            }
       
   }
 // function to return users arraylist with particular data 
    public ArrayList<UserUp> ListUsers(String ValToSearch)
    {
        ArrayList<UserUp> usersList = new ArrayList<UserUp>();
        
        Statement st;
        ResultSet rs;
        
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `stock` WHERE CONCAT(`id`,`barcode`, `name`, `available`, `retail`, `retailpack`  ,`wholesale` , `expdate`, `pack`, `discount`, `gravity`) LIKE '%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            
            UserUp user;
            
            while(rs.next())
            {
                user = new UserUp(
                                 rs.getInt("id"),
                                 rs.getString("barcode"),
                                 rs.getString("name"),
                                 rs.getInt("available"),
                                 rs.getInt("Retail"),
                                rs.getInt("retailpack"),                                
                                rs.getInt("wholesale"),
                                 rs.getString("expdate"),
                                 rs.getInt("pack"),
                                  rs.getInt("discount"),
                                    rs.getString("gravity")
                        
                                );
                usersList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }
    
    
    
    
     public void findUsersBar()
    {
       
        ArrayList<UserUp> users = ListUsers(barcode.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Pid","Barcode","Name","Available","Retail","RetailPack","wholesale","ExpiryDate1","ExpiryDate2","ExpiryDate3","PerPack","Discount","Gravity"});
        Object[] row = new Object[13];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getId();
            row[1] = users.get(i).getBarcode();
            row[2] = users.get(i).getPname();
            row[3] = users.get(i).getAvailable();
            row[4] = users.get(i).getRetailpack();
            row[5] = users.get(i).getRetailpack();
            row[6] = users.get(i).getwholesale();       
            row[7] = users.get(i).getExpdate();
            row[8] = users.get(i).getExpdate2();
            row[9] = users.get(i).getExpdate3();
             row[10] = users.get(i).getPack();
              row[11] = users.get(i).getDiscount();
               row[12] = users.get(i).getGravity();
            model.addRow(row);
        }
       jTable2.setModel(model);
       
       
        TableColumnModel columnModel = jTable2.getColumnModel();
		
               
                 columnModel.getColumn(0).setPreferredWidth(4);
                columnModel.getColumn(1).setPreferredWidth(1);
                  columnModel.getColumn(2).setPreferredWidth(490);
                columnModel.getColumn(3).setPreferredWidth(30);
                  columnModel.getColumn(4).setPreferredWidth(35);
                    columnModel.getColumn(5).setPreferredWidth(40);
                     columnModel.getColumn(6).setPreferredWidth(40);
                   //   columnModel.getColumn(7).setPreferredWidth(35);
                       columnModel.getColumn(7).setPreferredWidth(1);
                columnModel.getColumn(8).setPreferredWidth(1);
                  columnModel.getColumn(9).setPreferredWidth(1);
                columnModel.getColumn(10).setPreferredWidth(1);
                  columnModel.getColumn(11).setPreferredWidth(1);
                  columnModel.getColumn(12).setPreferredWidth(1);
                  
                   columnModel.getColumn(1).setMinWidth(1);
                   columnModel.getColumn(7).setMinWidth(1);
                   columnModel.getColumn(8).setMinWidth(1);
                  columnModel.getColumn(9).setMinWidth(1);
                columnModel.getColumn(10).setMinWidth(1);
                  columnModel.getColumn(11).setMinWidth(1);
                   columnModel.getColumn(12).setMinWidth(1);
                  
                   columnModel.getColumn(1).setMaxWidth(1);
                   columnModel.getColumn(7).setMaxWidth(1);
                   columnModel.getColumn(8).setMaxWidth(1);
                    columnModel.getColumn(9).setMaxWidth(1);
                columnModel.getColumn(10).setMaxWidth(1);
                  columnModel.getColumn(11).setMaxWidth(1);
                   columnModel.getColumn(12).setMaxWidth(1);
                    
       
       
       
    }
    
    
    
    // function to display data in jtable
    public void findUsers()
    {
       
        ArrayList<UserUp> users = ListUsers(jText_Search.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Pid","Barcode","name","Available","Retail","RetailPack","wholesale","ExpiryDate1","ExpiryDate2","ExpiryDate3","PerPack","Discount","Gravity"});
        Object[] row = new Object[13];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getId();
            row[1] = users.get(i).getBarcode();
            row[2] = users.get(i).getPname();
            row[3] = users.get(i).getAvailable();
            row[4] = users.get(i).getRetail();
            row[5] = users.get(i).getRetailpack();
            row[6] = users.get(i).getwholesale();
        //    row[7] = users.get(i).getHosp();
            row[7] = users.get(i).getExpdate();
            row[8] = users.get(i).getExpdate2();
            row[9] = users.get(i).getExpdate3();
             row[10] = users.get(i).getPack();
              row[11] = users.get(i).getDiscount();
               row[12] = users.get(i).getGravity();
            model.addRow(row);
        }
       jTable2.setModel(model);
       
       

	    TableColumnModel columnModel = jTable2.getColumnModel();
		
               
                 columnModel.getColumn(0).setPreferredWidth(4);
                columnModel.getColumn(1).setPreferredWidth(1);
                  columnModel.getColumn(2).setPreferredWidth(490);
                columnModel.getColumn(3).setPreferredWidth(30);
                  columnModel.getColumn(4).setPreferredWidth(35);
                    columnModel.getColumn(5).setPreferredWidth(40);
                     columnModel.getColumn(6).setPreferredWidth(40);
                   //   columnModel.getColumn(7).setPreferredWidth(35);
                       columnModel.getColumn(7).setPreferredWidth(1);
                columnModel.getColumn(8).setPreferredWidth(1);
                  columnModel.getColumn(9).setPreferredWidth(1);
                columnModel.getColumn(10).setPreferredWidth(1);
                  columnModel.getColumn(11).setPreferredWidth(1);
                  columnModel.getColumn(12).setPreferredWidth(1);
                  
                   columnModel.getColumn(1).setMinWidth(1);
                   columnModel.getColumn(7).setMinWidth(1);
                   columnModel.getColumn(8).setMinWidth(1);
                  columnModel.getColumn(9).setMinWidth(1);
                columnModel.getColumn(10).setMinWidth(1);
                  columnModel.getColumn(11).setMinWidth(1);
                   columnModel.getColumn(12).setMinWidth(1);
                  
                   columnModel.getColumn(1).setMaxWidth(1);
                   columnModel.getColumn(7).setMaxWidth(1);
                   columnModel.getColumn(8).setMaxWidth(1);
                    columnModel.getColumn(9).setMaxWidth(1);
                columnModel.getColumn(10).setMaxWidth(1);
                  columnModel.getColumn(11).setMaxWidth(1);
                   columnModel.getColumn(12).setMaxWidth(1);
       
       
    }
    
    
    
   
    
    
    
     
    // function to display data in jtable
    public void findUsersz()
    {
       
        ArrayList<UserUp> users = ListUsers(name.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Pid","Barcode","name","Available","Retail","RetailPack","wholesale","ExpiryDate1","ExpiryDate2","ExpiryDate3","PerPack","Discount","Gravity"});
        Object[] row = new Object[14];
        
        for(int i = 0; i < users.size(); i++)
        {
            row[0] = users.get(i).getId();
            row[1] = users.get(i).getBarcode();
            row[2] = users.get(i).getPname();
            row[3] = users.get(i).getAvailable();
            row[4] = users.get(i).getRetailpack();
            row[5] = users.get(i).getRetailpack();
            row[6] = users.get(i).getwholesale();
          //  row[7] = users.get(i).getHosp();
            row[7] = users.get(i).getExpdate();
            row[8] = users.get(i).getExpdate2();
            row[9] = users.get(i).getExpdate3();
             row[10] = users.get(i).getPack();
              row[11] = users.get(i).getDiscount();
               row[12] = users.get(i).getGravity();
            model.addRow(row);
        }
       jTable2.setModel(model);
       
       
            TableColumnModel columnModel = jTable2.getColumnModel();
		
               
                 columnModel.getColumn(0).setPreferredWidth(4);
                columnModel.getColumn(1).setPreferredWidth(1);
                  columnModel.getColumn(2).setPreferredWidth(490);
                columnModel.getColumn(3).setPreferredWidth(30);
                  columnModel.getColumn(4).setPreferredWidth(35);
                    columnModel.getColumn(5).setPreferredWidth(40);
                     columnModel.getColumn(6).setPreferredWidth(40);
                   //   columnModel.getColumn(7).setPreferredWidth(35);
                       columnModel.getColumn(7).setPreferredWidth(1);
                columnModel.getColumn(8).setPreferredWidth(1);
                  columnModel.getColumn(9).setPreferredWidth(1);
                columnModel.getColumn(10).setPreferredWidth(1);
                  columnModel.getColumn(11).setPreferredWidth(1);
                  columnModel.getColumn(12).setPreferredWidth(1);
                  
                   columnModel.getColumn(1).setMinWidth(1);
                   columnModel.getColumn(7).setMinWidth(1);
                   columnModel.getColumn(8).setMinWidth(1);
                  columnModel.getColumn(9).setMinWidth(1);
                columnModel.getColumn(10).setMinWidth(1);
                  columnModel.getColumn(11).setMinWidth(1);
                   columnModel.getColumn(12).setMinWidth(1);
                  
                   columnModel.getColumn(1).setMaxWidth(1);
                   columnModel.getColumn(7).setMaxWidth(1);
                   columnModel.getColumn(8).setMaxWidth(1);
                    columnModel.getColumn(9).setMaxWidth(1);
                columnModel.getColumn(10).setMaxWidth(1);
                  columnModel.getColumn(11).setMaxWidth(1);
                   columnModel.getColumn(12).setMaxWidth(1);

    }
    
    

    
 // function to return users arraylist with particular data 
    public ArrayList<UserUp> ListUsers1(String ValToSearch)
    {
        ArrayList<UserUp> usersList = new ArrayList<UserUp>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Connection con =mysqlconnection.getConnection1();
            st = con.createStatement();
             String searchQuery="SELECT * FROM `stock` WHERE `barcode`="+barcode.getText()+";";
             rs = st.executeQuery(searchQuery);
            
            UserUp user;
            
            if(rs.next())
            {
                user = new UserUp(
                                 rs.getInt("id"),
                                 rs.getString("barcode"),
                                 rs.getString("name"),
                                 rs.getInt("available"),
                                 rs.getInt("Retail"),
                                rs.getInt("retailpack"),                               
                                rs.getInt("wholesale"),
                                 rs.getString("expdate"),
                                 rs.getInt("pack"),
                                  rs.getInt("discount"),
                                    rs.getString("gravity")
                        
                        
                                );
                usersList.add(user);
                 //bab.setText(rs.getCursorName());
          
               
              
                
            }
          
            // bab.setText(rs.getString(2));
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
   
                               

    
    
}
    // function to display data in jtable
 
       
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barcodelbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        qava = new javax.swing.JTextField();
        qadd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        del = new javax.swing.JButton();
        requirefirst = new javax.swing.JLabel();
        requirefirst2 = new javax.swing.JLabel();
        jText_Search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        barcode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chooser = new com.toedter.calendar.JDateChooser();
        showdate = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        bkshow2 = new javax.swing.JTextField();
        bkshow1 = new javax.swing.JTextField();
        amtw = new javax.swing.JTextField();
        requirefirst5 = new javax.swing.JLabel();
        requirefirst7 = new javax.swing.JLabel();
        requirefirst9 = new javax.swing.JLabel();
        requirefirst10 = new javax.swing.JLabel();
        pack = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<Object>();
        retailpack = new javax.swing.JTextField();
        requirefirst11 = new javax.swing.JLabel();
        bkshow3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jdatechooser3 = new javax.swing.JButton();
        reload = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Retail Stock");

        jPanel1.setBackground(new java.awt.Color(46, 61, 99));

        barcodelbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        barcodelbl.setForeground(new java.awt.Color(255,255,255));
        barcodelbl.setText("Barcode:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255,255,255));
        jLabel3.setText("Quantity Available:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255,255,255));
        jLabel4.setText("Product Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setText("Amount:");

        pid.setEditable(false);
        pid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pidMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        qava.setEditable(false);
        qava.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        qava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qavaMouseClicked(evt);
            }
        });

        qadd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        qadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qaddMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/07_plus-20.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Barcode", "Product Name", "Available", "Retail", "wholesale", "ExpiryDateStock1", "ExpiryDateStock2", "Gravity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(8).setMinWidth(1);
            jTable2.getColumnModel().getColumn(8).setPreferredWidth(1);
            jTable2.getColumnModel().getColumn(8).setMaxWidth(1);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255,255,255));
        jLabel7.setText("Quantity Added:");

        amt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        amt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amtMouseClicked(evt);
            }
        });
        amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amtKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/upd.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/clear.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
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

        requirefirst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst.setForeground(new java.awt.Color(255, 0, 0));
        requirefirst.setText("* Some Fields Missing!");
        requirefirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirstMouseClicked(evt);
            }
        });

        requirefirst2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst2.setForeground(new java.awt.Color(255, 0, 0));
        requirefirst2.setText("* Select A Product!");
        requirefirst2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst2MouseClicked(evt);
            }
        });

        jText_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_SearchKeyReleased(evt);
            }
        });

        jButton_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/search-32.png"))); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        barcode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        barcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barcodeMouseClicked(evt);
            }
        });
        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barcodeKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new Color(255,255,255));
        jLabel8.setText("Product Id:");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new Color(255,255,255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/search-32.png"))); // NOI18N
        jLabel9.setText("Product Name:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new Color(255,255,255));
        jLabel10.setText("Expiry Date 1:");

        chooser.setDateFormatString("yyyy-MM-dd");
        chooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chooserMouseExited(evt);
            }
        });
        chooser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                chooserComponentShown(evt);
            }
        });
        chooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chooserFocusGained(evt);
            }
        });
        chooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chooserPropertyChange(evt);
            }
        });
        chooser.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                chooserCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                chooserInputMethodTextChanged(evt);
            }
        });
        chooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chooserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chooserKeyTyped(evt);
            }
        });

        showdate.setEditable(false);
        showdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showdateMouseClicked(evt);
            }
        });







        amtw.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        amtw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amtwMouseClicked(evt);
            }
        });
        amtw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtwActionPerformed(evt);
            }
        });

        requirefirst5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst5.setForeground(new java.awt.Color(0, 0, 153));
        requirefirst5.setText("wholesale");
        requirefirst5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst5MouseClicked(evt);
            }
        });

        requirefirst7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst7.setForeground(new java.awt.Color(0, 0, 153));
        requirefirst7.setText("Retail");
        requirefirst7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst7MouseClicked(evt);
            }
        });

        requirefirst9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst9.setForeground(new java.awt.Color(0, 0, 153));
        requirefirst9.setText("Pack:");
        requirefirst9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst9MouseClicked(evt);
            }
        });

        requirefirst10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst10.setForeground(new java.awt.Color(0, 0, 153));
        requirefirst10.setText("Discount(%):");
        requirefirst10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst10MouseClicked(evt);
            }
        });

        pack.setEditable(false);
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        pack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                packKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                packKeyTyped(evt);
            }
        });

        discount.setEditable(false);
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discountKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Stock Gravity:");

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Type-", "Very Low", "Low", "Medium", "High", "Very High" }));
        type.setToolTipText("(Very Low 0)    (Low 1)     (Medium 5)    (High 80)    (Very High 2000)");

        retailpack.setEditable(false);
        retailpack.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        retailpack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retailpackMouseClicked(evt);
            }
        });

        requirefirst11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        requirefirst11.setForeground(new java.awt.Color(0, 0, 153));
        requirefirst11.setText("RetailPack");
        requirefirst11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requirefirst11MouseClicked(evt);
            }
        });





        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("(0, 1, 5, 80, 2000)");

        jdatechooser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/up.png"))); // NOI18N
        jdatechooser3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdatechooser3MouseClicked(evt);
            }
        });
        jdatechooser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdatechooser3ActionPerformed(evt);
            }
        });
        jdatechooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdatechooser3KeyPressed(evt);
            }
        });

        reload.setText("9999-01-01");
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadMouseClicked(evt);
            }
        });
        reload.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reloadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reloadKeyTyped(evt);
            }
        });



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bkshow2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(bkshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(showdate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdatechooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                )
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    ))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)

                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(bkshow3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addGap(95, 95, 95)
                        .addComponent(del))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barcode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qadd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qava)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(requirefirst11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(requirefirst9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(requirefirst10))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(requirefirst7)
                                        .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(retailpack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(amtw, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(requirefirst5)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)
                                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requirefirst2)
                    .addComponent(requirefirst, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Search)
                                .addGap(363, 363, 363))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        
        
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(requirefirst2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(requirefirst)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(clear)
                            .addComponent(del))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reload, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bkshow3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requirefirst7)
                            .addComponent(requirefirst5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(amtw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(retailpack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pack)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requirefirst10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requirefirst9)
                            .addComponent(requirefirst11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(showdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdatechooser3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                      
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(bkshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                               
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                      
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                          
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            )))))
                                        
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                  )
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bkshow2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          requirefirst.setVisible(false);
     requirefirst2.setVisible(false); 
//      requirefirst3.setVisible(false);
   //   requirefirst4.setVisible(false);
      
      
      
            
     String uname = name.getText();
       String uppername =  uname.toUpperCase();

       
       
       
             Connection con;
   PreparedStatement ps;
        try {
             con=mysqlconnection.getConnection1();
           
     
            ps=con.prepareStatement("SELECT `name` FROM `stock` WHERE `name`=?;");
            ps.setString(1,name.getText());
          //  ps.setString(2, String.valueOf(at2.getPassword()));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {  
                
               JOptionPane.showMessageDialog(null,"PRODUCT NAME ALREADY EXIST!", "NOTICE!",JOptionPane.ERROR_MESSAGE);
          
         //   MainFrame main=new MainFrame();
          //  main.setVisible(true);  
           }
            else
            {
          
            if ( name.getText().equals("")){
     requirefirst.setVisible(true);  
 }   
  
  else if (qadd.getText().equals("")){
      requirefirst.setVisible(true);  
 } 
 else if (amt.getText().equals("")){
      requirefirst.setVisible(true);  
 } 
 
 else {
          if(Integer.parseInt(qadd.getText())<= 0 ){
           JOptionPane.showMessageDialog(null,"INVALID AMOUNT INPUT ENTERED", "NOTICE!",JOptionPane.ERROR_MESSAGE);
        
    }
          
        
          
      else {
               
              if ( chooser.getDate() != null) {
                       
                         
                SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
         //      SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dFormat.format(chooser.getDate());

        showdate.setText(date);
        bkshow1.setText(date);
        
                       
                   }
              
              
              
              
              
 
                        

                
                
                
   Connection con1;
   PreparedStatement ps1;
        try {
        	con1=mysqlconnection.getConnection1();
           
            
           // con=DriverManager.getConnection("jdbc:mysql://localhost/qb", "root", "password");
            ps1=con1.prepareStatement("SELECT `barcode` FROM `stock` WHERE `barcode`=?;");
            ps1.setString(1,barcode.getText());
          //  ps.setString(2, String.valueOf(at2.getPassword()));
            ResultSet rs1=ps1.executeQuery();
            if(rs1.next())
            { 
                
              
        
                
           }
            else
            {
         //        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException ex) {
           // Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
              
            
              
           if ( barcode.getText().equals("")){
             barcode.setText("default");  
 } 
         
           
                   if ( showdate.getText().equals("")){
             showdate.setText("9999-01-01");  
 }
       
                   if ( pack.getText().equals("")){             
        pack.setText("1");  
               int s = Integer.parseInt(amt.getText());
        String ss= Integer.toString(s);
        
        retailpack.setText(ss);
             // retailpack.getText();
        
 } 
                   if ( discount.getText().equals("")){
             discount.setText("0");  
 } 
                   
     /*             if ( amt.getText().equals("")){
             amt.setText("0");  
 } 
                  
   */                if ( amtw.getText().equals("")){
             amtw.setText("0");  
 } 
                   
 
                   
                         if ( type.getSelectedItem().toString().equals("-Type-")){
             type.setSelectedItem("Medium");
 } 
               //     int s = Integer.parseInt(amt.getText());
       // String ss= Integer.toString(s);
        
       // retailpack.setText(ss);
             // retailpack.getText();
                  
        String query="INSERT INTO `stock`(`barcode`,`name`,`available`,`retail`,`retailpack`,`wholesale`,`expdate`,`pack`,`discount`,`gravity`) VALUES('"+barcode.getText()+"','"+uppername+"','"+qadd.getText()+"','"+amt.getText()+"','"+retailpack.getText()+"','"+amtw.getText()+"','"+showdate.getText()+"','"+pack.getText()+"','"+discount.getText()+"','"+type.getSelectedItem()+"');";
    executeSQlQuery(query, "Inserted");   // TODO add your handling code here:
    
    
    barcode.requestFocus();
 }
        }
                
            }
        } catch (SQLException ex) {
           // Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   requirefirst.setVisible(false);
     requirefirst2.setVisible(false); 
//        requirefirst3.setVisible(false);
    //    requirefirst4.setVisible(false);
        
 
        String uname = name.getText();
       String uppername =  uname.toUpperCase();
        
                  if (qadd.getText().equals("")){
              qadd.setText("0");  
 }
        
                if ( pid.getText().equals("")){
     requirefirst2.setVisible(true);  
 }   
                
            else    if ( name.getText().equals("")){
     requirefirst2.setVisible(true);  
 }   
  
//  else if (qadd.getText().equals("")){
  //    JOptionPane.showMessageDialog(null,"Please enter a Quantity \n If you are not adding Product to stock \n \n  INPUT: 0 ", "QUANTITY" , JOptionPane.INFORMATION_MESSAGE);  
// } 
  
  else if (chooser.getDate() != null && showdate.getText().equals("")){
//   requirefirst3.setVisible(true);
      
  }
 

    else if (chooser.getDate() != null && bkshow1.getText().equals("")){
 //  requirefirst3.setVisible(true);
      
  }
 

  //   else if (!(verylow.isSelected() || low.isSelected() || medium.isSelected() || high.isSelected() || veryhigh.isSelected())){
   //requirefirst.setVisible(true);
      
  //}
   
        else if (type.getSelectedItem().toString().equals("-Type-")){
            requirefirst.setVisible(true);
        }
  
 else {
        
                   if(Integer.parseInt(qadd.getText())< 0 ){
           JOptionPane.showMessageDialog(null,"INVALID AMOUNT INPUT ENTERED", "NOTICE!",JOptionPane.ERROR_MESSAGE);
        
    }       
      else {
                       
            
        
                 String s2= qava.getText();
                 String s1=qadd.getText();
                 int a=Integer.parseInt(s1);
                 int b=Integer.parseInt(s2);
                 int c=a+b;
                 String result=String.valueOf(c);
                 qava.setText(result);
                 
          
                             
        String query;
        query ="UPDATE `stock` SET `id`="+pid.getText()+",`barcode`='"+barcode.getText()+"',`name`='"+uppername+"',`available`='"+qava.getText()+"',`Retail`='"+amt.getText()+"',`retailpack`='"+retailpack.getText()+"',`wholesale`='"+amtw.getText()+"',`expdate`='"+showdate.getText()
        +"',`pack`='"+pack.getText()+"',`discount`='"+discount.getText()+"',`gravity`='"+type.getSelectedItem()+"' WHERE `id`="+pid.getText();
        executeSQlQuery(query,"Updated");   
    
      findUsers();
      
      barcode.requestFocus();
  }
               
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    int i=jTable2.getSelectedRow();        // TODO add your handling code here:
    TableModel model=jTable2.getModel();
    pid.setText(model.getValueAt(i, 0).toString());
    barcode.setText(model.getValueAt(i, 1).toString());
    name.setText(model.getValueAt(i, 2).toString());
    qava.setText(model.getValueAt(i, 3).toString());
    //jTextField4.setText(model.getValueAt(i, 3).toString());
   amt.setText(model.getValueAt(i, 4).toString());
    retailpack.setText(model.getValueAt(i, 5).toString());
    amtw.setText(model.getValueAt(i, 6).toString());
   // amth.setText(model.getValueAt(i, 7).toString());
     showdate.setText(model.getValueAt(i, 7).toString());
    jText_Search.setText(model.getValueAt(i, 2).toString());
    //jTextField6.setText(model.getValueAt(i, 5).toString());
            // TODO add your handling code here:
     pack.setText(model.getValueAt(i, 10).toString());
      discount.setText(model.getValueAt(i, 11).toString());
        type.setSelectedItem(model.getValueAt(i, 12).toString()); 
    
        /* String sex = model.getValueAt(i, 11).toString();
       if (sex.equals("Very Low")){
           verylow.setSelected(true);
       }
       else if (sex.equals("Low")){
           low.setSelected(true);
       }
        else if (sex.equals("Medium")){
           medium.setSelected(true);
       }
        else if (sex.equals("High")){
           high.setSelected(true);
       }
       else if (sex.equals("Very High")){
           veryhigh.setSelected(true);
       }
       */
       
     requirefirst.setVisible(false);
       requirefirst2.setVisible(false);
//        
    }//GEN-LAST:event_jTable2MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         pid.setText("");
           barcode.setText("");
    name.setText("");
    qava.setText("");
    qadd.setText("");
    amt.setText("");
    retailpack.setText("");
//    amth.setText("");
    amtw.setText("");
    jText_Search.setText("");
   // chooser.setDateFormatString("");
    chooser.setDate(null);
    showdate.setText("");
    bkshow1.setText("");
     bkshow2.setText("");
      bkshow3.setText("");
      pack.setText("");
       discount.setText("");
       type.setSelectedItem("-Type-");

               
       
     
     barcode.requestFocus();
      
    }//GEN-LAST:event_clearActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
  if ( pid.getText().equals("")){
            requirefirst2.setVisible(true);
        }
       else{
                      
       int response=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this Record?", "Delete Record",JOptionPane.YES_NO_OPTION);
       
       if (response==JOptionPane.YES_OPTION){
        String query="DELETE FROM `stock` WHERE `id`="+pid.getText();
      executeSQlQuery(query,"Deleted");
      
        findUsers();
         barcode.requestFocus();
       }
       else{
       }
       
  }
    }//GEN-LAST:event_delActionPerformed

    private void requirefirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirstMouseClicked

    }//GEN-LAST:event_requirefirstMouseClicked

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
       requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
//           requirefirst3.setVisible(false);
      //     requirefirst4.setVisible(false);
           
    }//GEN-LAST:event_nameMouseClicked

    private void qaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qaddMouseClicked
      requirefirst.setVisible(false);
       requirefirst2.setVisible(false);
     //     requirefirst3.setVisible(false);
    //      requirefirst4.setVisible(false);
          
    }//GEN-LAST:event_qaddMouseClicked

    private void amtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amtMouseClicked
    requirefirst.setVisible(false);
     requirefirst2.setVisible(false);
//        requirefirst3.setVisible(false);
   //      requirefirst4.setVisible(false);
          
    }//GEN-LAST:event_amtMouseClicked

    private void requirefirst2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst2MouseClicked

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void barcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyReleased
         
       FunctionBar f = new FunctionBar();
    ResultSet rs = null;
   
     String ba = "barcode";
    String pn = "name";
    
  
    
    
    
    rs = f.find(barcode.getText());
    try{
      if(rs.next()){
             
         
           barcode.setText(rs.getString("barcode"));
           // findUsers();
           
               if ( barcode.getText().isEmpty()){ 
                   findUsersBar();
               }
               else{
                   findUsersBar(); 
               }
           
       
      } 
      else{
           findUsersBar(); 
         // JOptionPane.showMessageDialog(null, "NO MATCH FOUND");
         
            // barcode.setText("");
    // barcode.setText("");
    //qty.setText("");
 
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }//GEN-LAST:event_barcodeKeyReleased

    private void barcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyTyped
     
    }//GEN-LAST:event_barcodeKeyTyped

    private void chooserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chooserKeyTyped
                                                
     
    }//GEN-LAST:event_chooserKeyTyped

    private void chooserCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_chooserCaretPositionChanged
     
    }//GEN-LAST:event_chooserCaretPositionChanged

    private void chooserInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_chooserInputMethodTextChanged
       
    }//GEN-LAST:event_chooserInputMethodTextChanged

    private void chooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chooserPropertyChange
      
    }//GEN-LAST:event_chooserPropertyChange

    private void chooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chooserFocusGained
       
    }//GEN-LAST:event_chooserFocusGained

    private void chooserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooserMouseExited
     
    }//GEN-LAST:event_chooserMouseExited

    private void chooserComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_chooserComponentShown
      
    }//GEN-LAST:event_chooserComponentShown

    private void jText_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_SearchKeyReleased
      findUsers();
    }//GEN-LAST:event_jText_SearchKeyReleased

    private void chooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooserMouseClicked
         requirefirst.setVisible(false);
     requirefirst2.setVisible(false);
     //   requirefirst3.setVisible(false);
    //     requirefirst4.setVisible(false);
          
    }//GEN-LAST:event_chooserMouseClicked

    private void showdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showdateMouseClicked
         requirefirst.setVisible(false);
     requirefirst2.setVisible(false);  
      //  requirefirst3.setVisible(false);
     //    requirefirst4.setVisible(false);
          
    }//GEN-LAST:event_showdateMouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_DELETE){
            
           if ( pid.getText().equals("")){
            requirefirst2.setVisible(true);
        }
       else{
                      
       int response=JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete this Record?", "Delete Record",JOptionPane.YES_NO_OPTION);
       
       if (response==JOptionPane.YES_OPTION){
        String query="DELETE FROM `stock` WHERE `id`="+pid.getText();
      executeSQlQuery(query,"Delete");
      
        findUsers();
       }
       else{
       }
       
  } 
            
            
        }
    }//GEN-LAST:event_jTable2KeyPressed

    private void chooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chooserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooserKeyPressed

    private void amtwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amtwMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_amtwMouseClicked

    private void requirefirst5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst5MouseClicked

    private void requirefirst7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst7MouseClicked

    private void pidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pidMouseClicked
        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
//           requirefirst3.setVisible(false);
       //    requirefirst4.setVisible(false);
           
    }//GEN-LAST:event_pidMouseClicked

    private void barcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeMouseClicked
       requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
     //      requirefirst3.setVisible(false);
      //     requirefirst4.setVisible(false);
           
    }//GEN-LAST:event_barcodeMouseClicked

    private void qavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qavaMouseClicked
        requirefirst.setVisible(false);
        requirefirst2.setVisible(false);
//           requirefirst3.setVisible(false);
   //        requirefirst4.setVisible(false);
            
    }//GEN-LAST:event_qavaMouseClicked

    private void requirefirst9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst9MouseClicked

    private void requirefirst10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst10MouseClicked

    private void amtwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtwActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packActionPerformed

    private void packKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packKeyReleased
      
         
    }//GEN-LAST:event_packKeyReleased

    private void retailpackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retailpackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_retailpackMouseClicked

    private void packKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packKeyTyped
       
        
    }//GEN-LAST:event_packKeyTyped

    private void discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyReleased
           
    }//GEN-LAST:event_discountKeyReleased

    private void discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyTyped

    }//GEN-LAST:event_discountKeyTyped

    private void amtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amtKeyReleased
        
    }//GEN-LAST:event_amtKeyReleased

    private void amtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amtKeyTyped
       
    }//GEN-LAST:event_amtKeyTyped

    private void requirefirst11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requirefirst11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_requirefirst11MouseClicked

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
          findUsersz();    // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void jdatechooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdatechooser3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdatechooser3KeyPressed

    private void jdatechooser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdatechooser3ActionPerformed
          showdate.setText(reload.getText());
        bkshow1.setText(reload.getText());
    }//GEN-LAST:event_jdatechooser3ActionPerformed

    private void jdatechooser3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdatechooser3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdatechooser3MouseClicked

    private void reloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reloadMouseClicked

    private void reloadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reloadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_reloadKeyReleased

    private void reloadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reloadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_reloadKeyTyped

    public void executeSQlQuery(String query, String message)
   {
       Connection con = mysqlconnection.getConnection1();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
               model.setRowCount(0);
               //show_stock();
                findUsers();
                
                
                
                  String qz =   qadd.getText();
                   
                    String nz = name.getText().toString();
                    
                     qadd.setText(qz);
                     
                    name.setText(nz);
                    
                 
                 JOptionPane.showMessageDialog(null, qz+ " "  +nz+ ", has been " +message+ " Successfully");
                
                
                
                
               pid.setText("");
                barcode.setText("");
               name.setText("");
               qava.setText("");
               qadd.setText("");
               amt.setText("");
               retailpack.setText("");
//               amth.setText("");
               amtw.setText("");
               jText_Search.setText("");
               pack.setText("");
               discount.setText("");
                type.setSelectedItem("-Type-");
               //chooser.setDateFormatString("");
                chooser.setDate(null);
               showdate.setText("");

                 bkshow1.setText("");
                 bkshow2.setText("");
                 bkshow3.setText("");
               
              // JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
                //  this.setVisible(false);
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }

    private javax.swing.JTextField amt;
    private javax.swing.JTextField amtw;
    private javax.swing.JTextField barcode;
    private javax.swing.JTextField bkshow1;
    private javax.swing.JTextField bkshow2;
    private javax.swing.JTextField bkshow3;
    private com.toedter.calendar.JDateChooser chooser;
    private javax.swing.JButton clear;
    private javax.swing.JButton del;
    private javax.swing.JTextField discount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel barcodelbl;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Search;
    private javax.swing.JButton jdatechooser3;
    private javax.swing.JTextField pack;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField name;
    private javax.swing.JTextField qadd;
    private javax.swing.JTextField qava;
    private javax.swing.JTextField reload;
    private javax.swing.JLabel requirefirst;
    private javax.swing.JLabel requirefirst10;
    private javax.swing.JLabel requirefirst11;
    private javax.swing.JLabel requirefirst2;
    private javax.swing.JLabel requirefirst5;
    private javax.swing.JLabel requirefirst7;
    private javax.swing.JLabel requirefirst9;
    private javax.swing.JTextField retailpack;
    private javax.swing.JTextField showdate;

    private javax.swing.JComboBox<?> type;
    Connection con = mysqlconnection.getConnection1();
}

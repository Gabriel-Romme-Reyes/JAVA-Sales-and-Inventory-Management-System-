package MyFrames;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class mysqlconnection {
	static Connection con = null;
	
	
    public static Connection getConnection1()
   {
     
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/qb","root","");
           return con;
       } catch(Exception e)
       {
    		JOptionPane.showMessageDialog(null, e);    
   }
       return null;
}
    }

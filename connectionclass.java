/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;
  
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionclass {
    
    public static Connection getCon()
            
    {
        try
        {
            Class.forName("com.mysql.jdbc.driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medicinemart","root"," ");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}

    

    


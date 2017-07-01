/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangmentsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mudy
 */
public class Javaconnect {
    
    Connection conn;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\mudy\\Documents\\NetBeansProjects\\LibraryMangmentSystem\\LibraryNew.sqlite");
            return conn;
            
        }
        catch(Exception ex)
        {JOptionPane.showMessageDialog(null,ex);}
    return null;
    }
    
}

package mulesoft;
import java.sql.*;
public class createtable {
	public static void createNewTable() {  
        String url = "jdbc:sqlite:C:\\Users\\Rashika\\OneDrive\\Desktop\\Mulesoft\\mulesoftrashika.db";   
        String sql = "CREATE TABLE IF NOT EXISTS movies (\n"  
                + " moviename text,\n"  
                + " leadactor text,\n"  
                + " actress text,\n"  
                + " yearofrelease integer,\n"  
                + " director text\n"  
                + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}

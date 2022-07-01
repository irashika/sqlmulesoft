package mulesoft;
import java.sql.*;
public class select {
	 public static void selectAll(){  
	        String sql = "SELECT * FROM movies"; 
	        System.out.println("Select All query");
	          
	        try {  
	            Connection conn =Dbconnection.connect();  
	            Statement stmt  = conn.createStatement();  
	            ResultSet rs    = stmt.executeQuery(sql);  
	            while (rs.next()) {  
	                System.out.println(rs.getString("moviename") +  "\t" +   
	                                   rs.getString("leadactor") + "\t" +  
	                                   rs.getString("actress") + "\t" +
	                                   rs.getString("director") + "\t" +  
	                                   rs.getInt("yearofrelease"));  
	            }  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  
	 public static void selectactormovie(){
		 	System.out.println("Select MOVIENAME By Actor Dhanush");
	        String sql = "SELECT moviename FROM movies WHERE leadactor LIKE'%Dhanush%'"; 
	          
	        try {  
	            Connection conn =Dbconnection.connect();  
	            Statement stmt  = conn.createStatement();  
	            ResultSet rs    = stmt.executeQuery(sql);  
	            while (rs.next()) {  
	                System.out.println(rs.getString("moviename"));  
	            }  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }
}

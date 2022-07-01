package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  DOCTOR STRANGE ","  Benedict  ","RachelMcadams  ",2022,"Sam Raimi");
	insert("  THOR: LOVE & THUNDER  "," Chris Hemsworth","Tessa Thompson ",2022,"Taika Waititi");
	insert("  BLACK PANTHER "," Chadwick"," Angela ",2018,"Ryan Coogler");
	insert("  TAMASHA "," Ranveer kapoor   "," Deepoka padukone ",2015,"Imtiaz Ali");
	insert("  AMBIKAPATHY  "," Dhanush   "," Sonam Kapoor   ",2013,"Aanand L. Rai");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}

package Train.SF;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class searchFlightDao implements ConnectJdbc{
	
	

	List<List<String>> flightlist = new ArrayList<>();
	
	
	@Override
	public void insertData(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectData(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}
	public List<List<String>> flightlistdata(){
		try {
			String url = "jdbc:mysql://localhost:3306/webtrainsf";
			String username = "root";
			String password = "Atharv@2004";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "select * from arrangeflight";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(query);

			
			while (rs.next()) {
				List<String> flightlistrows = new ArrayList<>();
				flightlistrows.add(rs.getString(1));
				flightlistrows.add(rs.getString(2));
				flightlistrows.add(rs.getString(3));
				flightlistrows.add(rs.getString(4));
				flightlistrows.add(rs.getString(5));
				flightlistrows.add(rs.getString(6));
				flightlistrows.add(rs.getString(7));
				flightlistrows.add(rs.getString(8));
				flightlist.add(flightlistrows);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flightlist;
		
	}
	@Override
	public boolean selectDatabool(ArrayList<String> list) {
		
		return false;
	}
	
}	
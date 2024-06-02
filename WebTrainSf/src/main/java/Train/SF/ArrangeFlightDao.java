package Train.SF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ArrangeFlightDao implements ConnectJdbc{

	@Override
	public void insertData(ArrayList<String> list) {
		try {
			String url = "jdbc:mysql://localhost:3306/webtrainsf";
			String username = "root";
			String password = "Atharv@2004";

			Connection conn = DriverManager.getConnection(url, username, password);
			String flname=list.get(0);
			String leavefrom=list.get(1);
			String arriveat=list.get(2);
			String depdate=list.get(3);
			String deptime=list.get(4);
			String arrtime=list.get(5);
			String numofseats=list.get(6);
			String costperseat=list.get(7);
			String query = "INSERT INTO arrangeflight() VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.setString(1,flname );
			pstm.setString(2, leavefrom);
			pstm.setString(3, arriveat);
			pstm.setString(4, depdate);
			pstm.setString(5, deptime);
			pstm.setString(6, arrtime);
			pstm.setString(7, numofseats);
			pstm.setString(8, costperseat);
			pstm.execute();
			System.out.println("Done");

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void selectData(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean selectDatabool(ArrayList<String> list) {
		// TODO Auto-generated method stub
		return false;
	}

}

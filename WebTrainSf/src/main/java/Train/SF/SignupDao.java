package Train.SF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class SignupDao implements ConnectJdbc{
	@Override
	public void insertData(ArrayList<String> list) {
		try {
			String url = "jdbc:mysql://localhost:3306/webtrainsf";
			String username = "root";
			String password = "Atharv@2004";

			Connection conn = DriverManager.getConnection(url, username, password);
			String susername=list.get(0);
			String semail=list.get(1);
			String spassword=list.get(2);
			String scontact=list.get(3);
			String query = "INSERT INTO signup() VALUES(?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.setString(1,susername );
			pstm.setString(2, semail);
			pstm.setString(3, spassword);
			pstm.setString(4, scontact);
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

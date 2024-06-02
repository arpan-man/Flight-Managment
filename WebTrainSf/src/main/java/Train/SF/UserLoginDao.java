package Train.SF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserLoginDao implements ConnectJdbc{
	String userCheck="Null";
	String userCheck2="Null";
	@Override
	public void insertData(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectData(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean selectDatabool(ArrayList<String> list) {
		try {
			String url = "jdbc:mysql://localhost:3306/webtrainsf";
			String username = "root";
			String password = "Atharv@2004";

			Connection conn = DriverManager.getConnection(url, username, password);
			String clientusername = list.get(0);
			String clientpassword = list.get(1);
			userCheck2=clientusername;
			String query = "select * from signup";
			Statement stm = conn.createStatement();
			String clientName;
			String clientPass;
			ArrayList<String> listuser = new ArrayList<>();
			ArrayList<String> listpass = new ArrayList<>();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				clientName = rs.getString(1);
				listuser.add(clientName);
				clientPass = rs.getString(3);
				listpass.add(clientPass);
			}
			
			for(int i=0;i<listuser.size();i++) {
				if(listuser.get(i).equals(clientusername) && listpass.get(i).equals(clientpassword)) {
					System.out.println("You have an account...");
					userCheck=listuser.get(i);
					break;
				}
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(userCheck.equals(userCheck2)) {
			System.out.println("You have an account,checked ");
			return true;
		}else {
			return false;
		}
	}

}

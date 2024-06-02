package Train.SF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public  class AdminLoginDao implements ConnectJdbc {
	String adminCheck="Null";
	String adminCheck2="Null";
	@Override
	public void selectData(ArrayList<String> list) {
		
	}

	@Override
	public void insertData(ArrayList<String> list) {

	}

	@Override
	public boolean selectDatabool(ArrayList<String> list) {
		try {
			String url = "jdbc:mysql://localhost:3306/webtrainsf";
			String username = "root";
			String password = "Atharv@2004";

			Connection conn = DriverManager.getConnection(url, username, password);
			String ausername = list.get(0);
			String apassword = list.get(1);
			adminCheck2=ausername;
			String query = "select * from adminlogin";
			Statement stm = conn.createStatement();
			String auser;
			String apass;
			ArrayList<String> listuser = new ArrayList<>();
			ArrayList<String> listpass = new ArrayList<>();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				auser = rs.getString(1);
				listuser.add(auser);
				apass = rs.getString(2);
				listpass.add(apass);
			}
			
			for(int i=0;i<listuser.size();i++) {
				if(listuser.get(i).equals(ausername) && listpass.get(i).equals(apassword)) {
					System.out.println("Your are Admin ");
					adminCheck=listuser.get(i);
					break;
				}
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(adminCheck.equals(adminCheck2)) {
			System.out.println("Your are Admin,checked ");
			return true;
		}else {
			return false;
		}
	}
}

package Train.SF;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
public class ControllerRest {

	@GetMapping("/home")
	public String index() {
		return "Hello";
	}
	
	@PostMapping(value = "/signup",
			consumes = "application/json")
	public boolean userSignup(@RequestBody SignUp user) {
		
		 ArrayList<String> list=new ArrayList<>();
		 list.add(user.getUsername());
		 list.add(user.getEmail());
		 list.add(user.getPassword());
		 list.add(user.getContact());
		 System.out.println(list);
		 
		 SignupDao su1=new SignupDao();
		 su1.insertData(list);
		
		return true;
	}
	
	@PostMapping(value = "/adminlogin",
			consumes = "application/json")
	public boolean adminLogin(@RequestBody AdminLogin admin) {
		
		 ArrayList<String> list=new ArrayList<>();
		 list.add(admin.getUsername());
		 list.add(admin.getPassword());
		 System.out.println(list);
		 
		 AdminLoginDao alogin=new AdminLoginDao();
		 if(alogin.selectDatabool(list)==true) {
			 return true;
		 }else {
			 return false;
		 }
		
	}
	
	
	@PostMapping(value = "/userlogin",
			consumes = "application/json")
	public String userLogin(@RequestBody UserLogin userClient) {
		
		 ArrayList<String> list=new ArrayList<>();
		 list.add(userClient.getUsername());
		 list.add(userClient.getPassword());
		 System.out.println(list);
		 Gson gson = new Gson();
	     String json = gson.toJson(list);
		 UserLoginDao ulogin=new UserLoginDao();
		 if(ulogin.selectDatabool(list)==true) {
			 return json;
		 }else {
//			 return false;
		 }
		return json;
		
		
	}
	
	
	@PostMapping(value = "/arrangeflight",
			consumes = "application/json")
	public boolean arrangeFlight(@RequestBody ArrangeFlight arrflight) {
		
		 ArrayList<String> list=new ArrayList<>();
		 list.add(arrflight.getFlightname());
		 list.add(arrflight.getDepfrom());
		 list.add(arrflight.getDepto());
		 list.add(arrflight.getLeavedate());
		 list.add(arrflight.getDeparturetime());
		 list.add(arrflight.getArrivaltime());
		 list.add(arrflight.getNumofseats());
		 list.add(arrflight.getCostperseat());
		 
		 System.out.println(list);
		 
		 ArrangeFlightDao su1=new ArrangeFlightDao();
		 su1.insertData(list);
		
		return true;
	}
	
	
	
	
	
	@GetMapping(value = "/searchflight",
			produces = "application/json")
	public String searchflight() {
		searchFlightDao su1=new searchFlightDao();
		List<List<String>> flightdata = su1.flightlistdata();
		 System.out.println(flightdata);
		 Gson gson = new Gson();
	     String json = gson.toJson(flightdata);
		 
			 return json;
		 
		
		
	}
}

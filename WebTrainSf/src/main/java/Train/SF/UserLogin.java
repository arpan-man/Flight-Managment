package Train.SF;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonAutoDetect
public class UserLogin {
	private String username;
	private String password;

	UserLogin() {
	}

	@JsonCreator
	public static UserLogin newInstance() {
		return new UserLogin();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}

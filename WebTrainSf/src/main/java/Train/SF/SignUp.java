package Train.SF;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonAutoDetect
public class SignUp{
	private String username;
	private String email;
	private String password;
	private String contact;

	SignUp() {
	}

	@JsonCreator
	public static SignUp newInstance() {
		return new SignUp();
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getContact() {
		return contact;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}

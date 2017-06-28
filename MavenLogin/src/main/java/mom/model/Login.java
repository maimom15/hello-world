package mom.model;

public class Login {
	//for hiding data
	private int user_id;
	private String name;
	private String password;
	private boolean checkLogin;	
	private String role;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isCheckLogin() {
		return checkLogin;
	}
	public void setCheckLogin(boolean checkLogin) {
		this.checkLogin = checkLogin;
	}
	
	
	
	

}

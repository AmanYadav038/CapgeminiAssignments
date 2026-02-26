package com.learning.assignments.gameselling;

public class User implements IValidate{
	private String userid;
	private String password;
	
	private User(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	@Override
	public boolean IsAuthenticated(String userid, String password) {
		if(this.userid.equals(userid) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	public boolean IsAuthenticated(User user) {
		if(user == null) {
			System.out.println("Not a Valid User.");
			return false;
		}
		return IsAuthenticated(user.userid, user.password);
	}
	
	public static User addUser(String userid, String password) {
		return new User(userid, password);
	}
	
}

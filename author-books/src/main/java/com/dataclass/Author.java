package com.dataclass;

public class Author {
	private int authorId;
	private String fName;
	private String mName;
	private String lName;
	private String phoneNum;
	public Author(int authorId, String fName, String mName, String lName, String phoneNum) {
		super();
		this.authorId = authorId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phoneNum = phoneNum;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setnName(String name) {
		mName = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}

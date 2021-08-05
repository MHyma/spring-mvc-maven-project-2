package com.springmvc.ic.dto;

public class UserInfoDto {

	private String userName="Enter your name";
	private String courseName="Enter course name";
	
	public UserInfoDto() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "UserInfoDto [userName=" + userName + ", courseName=" + courseName + "]";
	}
	
}

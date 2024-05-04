// IT22128386
// Hettiarachchi S.R 
// 9.2

package com.login;

public class Member {

	private String name;
	private String email ;
	private String username;
	private String password;
	private String country;

	private int id;
	
	public Member(int id , String name, String email, String username, String password, String country) 
	{
		
		this.id=id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.country = country;
		
	}


	public int getid() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}

	

	public String getCountry() {
		return country;
	}





	
}
 



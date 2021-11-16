package com.thp.spring.simplecontext;

public class Moussaillon {
	String firstName;
	String lastName;
	String config;
	
	public Moussaillon(String firstNAme, String lastNAme, String config) {
		super();
		this.firstName = firstNAme;
		this.lastName = lastNAme;
		this.config = config;
	}

	public Moussaillon() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstNAme) {
		this.firstName = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNAme) {
		this.lastName = lastNAme;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	
	
	

}

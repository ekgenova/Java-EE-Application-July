package com.qa.domain;

import javax.persistence.*;

import com.qa.constants.Constants;

@Entity
public class Account {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column (name = Constants.ACCOUNT_ID)
	private Long id;
	
	@Column (length = 50, name = Constants.FIRST_NAME)
	private String firstName;
	
	@Column (length = 50, name = Constants.LAST_NAME)
	private String secondName;
	
	@Column (length = 6, name = Constants.ACCOUNT_NUMBER)
	private String accountNumber;
	
	public Account() {
		
	}
	
	public Account(String firstName, String secondName, String accountNumber) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", AccountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName="
				+ secondName + "]";
	}
}

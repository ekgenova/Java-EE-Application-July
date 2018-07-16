package com.qa.service.repository;

import com.qa.domain.Account;

public interface IAccountRepository {

	String getAllAccounts();
	String addAccount(String account);
	String updateAccount(long id, String account);
	String deleteAccount(long id);
	Account findAccount(long id);
	
}

package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.business.AccountService;
import com.qa.service.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = Logger.getLogger(AccountService.class);

	@Inject
	private AccountRepository repo;
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
	
	public String getAllAccounts() {
		LOGGER.info("In AccountServiceImpl --> getAllAccounts");
		return null;
	}

	public String addAccount(String account) {
		LOGGER.info("In AccountServiceImpl --> addAccount");
		return null;
	}

	public String updateAccount(Long id, String account) {
		LOGGER.info("In AccountServiceImpl --> updateAccount");
		return null;
	}

	public String deleteAccount(Long id) {
		LOGGER.info("In AccountServiceImpl --> deleteAccount");
		return null;
	}

}

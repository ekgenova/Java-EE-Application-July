package com.qa.service.business;

import com.qa.constants.Constants;
import com.qa.domain.Account;
import com.qa.service.repository.IAccountRepository;

import org.apache.log4j.Logger;

import javax.inject.Inject;

public class AccountService implements IAccountService{

	private static final Logger LOGGER = Logger.getLogger(AccountService.class);

	@Inject
	private IAccountRepository repo;

	@Inject
	private IAccountChecker accountChecker;

	public String getAllAccounts() {
		LOGGER.info("In AccountServiceImpl --> getAllAccounts");
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
		LOGGER.info("In AccountServiceImpl --> addAccount");
		if (!accountChecker.checkAccountNumber(account)) {
			return Constants.BANNED_ACCOUNT_MESSAGE;
		} else {
			return repo.addAccount(account);
		}
	}

	public String updateAccount(Long id, String accountToUpdate) {
		LOGGER.info("In AccountServiceImpl --> updateAccount");
		if (!accountChecker.checkAccountNumber(accountToUpdate)) {
			return Constants.BANNED_ACCOUNT_MESSAGE;
		} else {
			return repo.updateAccount(id, accountToUpdate);
		}
	}

	public String deleteAccount(Long id) {
		LOGGER.info("In AccountServiceImpl --> deleteAccount");
		return repo.deleteAccount(id);
	}

	public Account findAccount(Long id) {
		return repo.findAccount(id);
	}

}


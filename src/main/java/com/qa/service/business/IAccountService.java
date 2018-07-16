package com.qa.service.business;

import com.qa.domain.Account;

public interface IAccountService {

    String addAccount(String account);

    String getAllAccounts();

    String updateAccount(Long id, String accountToUpdate);

    String deleteAccount(Long id);

    Account findAccount(Long id);

}

package com.qa.service.business;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;

import javax.inject.Inject;

public class AccountChecker implements IAccountChecker {

    @Inject
    private JSONUtil util;

    @Override
    public boolean checkAccountNumber(String account) {
        return util.getObjectForJson(account, Account.class).getAccountNumber().equals("999999")? false:true;
    }
}

package com.qa.service.repository;

import com.qa.constants.Constants;
import com.qa.domain.Account;
import com.qa.service.business.IAccountService;
import com.qa.util.JSONUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.transaction.Transactional.TxType;

import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
@Alternative
public class AccountMapRepository implements IAccountRepository {

    private Long ID;
    private Map<Long, Account> accountMap;

    @Inject
    private JSONUtil util;

    public AccountMapRepository(){
        this.accountMap = new HashMap<>();
        ID = 0L;
    }

    @Override
    public String addAccount(String account){
        ID++;
        Account newAccount = util.getObjectForJson(account, Account.class);
        newAccount.setId(ID);
        accountMap.put(newAccount.getId(),newAccount);
        return Constants.NEW_MESSAGE;
    }

    public Account findAccount(Long id){
        return accountMap.get(id);
    }

    @Override
    public String getAllAccounts(){
        return util.getJSONForObject(accountMap.values());
    }

    @Override
    public String deleteAccount(long id){
        if (accountMap.containsKey(id)){
            accountMap.remove(id);
            return Constants.DELETE_MESSAGE;
        }else {
            return Constants.NO_EXIST;
        }
    }

    @Override
    public String updateAccount(long id, String account){
        Account updatedAccount = util.getObjectForJson(account,Account.class);
        updatedAccount.setId(id);
        accountMap.put(id,updatedAccount);
        return Constants.UPDATE_MESSAGE;
    }
    
    @Override
    public Account findAccount(long id) {
    	return accountMap.get(id);
    }
}

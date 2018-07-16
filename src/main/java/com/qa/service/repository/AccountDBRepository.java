package com.qa.service.repository;

import com.qa.constants.Constants;
import com.qa.domain.Account;
import com.qa.service.business.IAccountService;
import com.qa.util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Default
@Transactional(Transactional.TxType.SUPPORTS)
public class AccountDBRepository implements IAccountRepository {

    @PersistenceContext(unitName = Constants.UNIT_NAME)
    private EntityManager manager;

    @Inject
    private JSONUtil util;

    @Transactional(Transactional.TxType.REQUIRED)
    public String addAccount(String account){
        Account newAccount = util.getObjectForJson(account,Account.class);
        manager.persist(newAccount);
        return Constants.NEW_MESSAGE;
    }

    public String getAllAccounts(){
        TypedQuery<Account> query = manager.createQuery(Constants.FIND_ALL_ACCOUNTS, Account.class);
        return util.getJSONForObject(query.getResultList());
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public String deleteAccount(long id){
        Account accountToDelete = findAccount(id);
        if (accountToDelete != null){
            manager.remove(accountToDelete);
            return Constants.DELETE_MESSAGE;
        }else {
            return Constants.NO_EXIST;
        }
    }


    @Transactional(Transactional.TxType.REQUIRED)
    public String updateAccount(long id, String account){
        Account updatedAccount = util.getObjectForJson(account,Account.class);
        Account accountToUpdate = findAccount(id);
        if (accountToUpdate != null){
            accountToUpdate = updatedAccount;
            accountToUpdate.setId(id);
            manager.merge(accountToUpdate);
            return Constants.UPDATE_MESSAGE;
        } else {
            return Constants.NO_EXIST;
        }
    }

    public Account findAccount(long id) {
        return manager.find(Account.class, id);
    }
}

package com.qa.integration;

import com.qa.constants.Constants;
import com.qa.domain.Account;
import com.qa.service.business.AccountService;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path(Constants.ACCOUNT_PATH)
public class HTTP_Requests {

    @Inject
    private AccountService transaction;

    @Path(Constants.JSON_PATH)
    @GET
    @Produces({Constants.PRODUCED_PATH})
    public String getAllAccounts() { return transaction.getAllAccounts();}

    @Path(Constants.JSON_PATH_ID)
    @GET
    @Produces({Constants.PRODUCED_PATH})
    public Account findAccount(@PathParam("id") long id) { return transaction.findAccount(id);}

    @Path(Constants.JSON_PATH)
    @POST
    @Produces({Constants.PRODUCED_PATH})
    public String addAccount(String account) { return transaction.addAccount(account);}

    @Path(Constants.JSON_PATH_ID)
    @DELETE
    @Produces({Constants.PRODUCED_PATH})
    public String deleteAccount(@PathParam("id") Long id){
        return transaction.deleteAccount(id);
    }

    @Path(Constants.JSON_PATH_ID)
    @PUT
    @Produces({Constants.PRODUCED_PATH})
    public String updateAccount(@PathParam("id") Long id, String accountToUpdate){
        return transaction.updateAccount(id, accountToUpdate);
    }

}

package com.qa.constants;

public class Constants {

    public final static String NEW_MESSAGE = "{\"Message\": \"Account Sucessfully Added\"}";
    public final static String UPDATE_MESSAGE = "{\"Message\": \"Account Sucessfully Updated\"}";
    public final static String ERROR_MESSAGE = "{\"Message\": \"Error has Occured\"}";
    public final static String DELETE_MESSAGE = "{\"Message\": \"Account Sucessfully Deleted\"}";
    public final static String NO_EXIST = "{\"Message\": \"Account does not Exist\"}";
    public final static String BANNED_ACCOUNT_MESSAGE = "{\"Message\": \"Account Blocked!\"}";
    
	public static final String FIND_ALL_ACCOUNTS = "SELECT a FROM Account a";
	public static final String DELETE_ACCOUNT = "DELETE a FROM Account a WHERE a.id =";
	public static final String FIND_ONE_ACCOUNT = "SELECT a FROM Account a WHERE a.id =";
	
	public static final String FIRST_NAME = "First_Name";
	public static final String LAST_NAME = "Last_Name";
	public static final String ACCOUNT_NUMBER = "Acc_Number";
	public static final String ACCOUNT = "account";
	public static final String UNIT_NAME = "primary";
	public static final String ACCOUNT_ID = "ACCOUNTID";
	
	public static final String ACCOUNT_PATH = "/account";
	public static final String JSON_PATH = "/json";
	public static final String PRODUCED_PATH = "application/json";
	public static final String JSON_PATH_ID = "/json/{id}";
	public static final String REST = "rest";
}

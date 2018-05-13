package com.cronoss.portfolio.tracker.account.service;

import com.cronoss.portfolio.tracker.account.domain.Account;
import com.cronoss.portfolio.tracker.account.domain.Asset;

/**
 * Account Service class to provide account administration functionality
 */

public interface AccountService {

    /**
     * Find an account by username
     *
     * @param username
     * @return the Account object associated with the given username
     */
    Account findByUsername(String username);

    /**
     * Create a new account from a given username and email
     *
     * @param username
     * @param email
     */
    Account createAccount(String username, String email);

    /**
     * Add a new asset to the given username, if asset already exists in given users portfolio it will be overriddent
     * with the information here
     *
     * @param username
     * @param assetToAdd
     * @return
     */
    Account addAsset(String username, Asset assetToAdd);

}

package com.cronoss.portfolio.tracker.account.service;

import com.cronoss.portfolio.tracker.account.domain.Account;
import com.cronoss.portfolio.tracker.account.domain.Asset;
import com.cronoss.portfolio.tracker.account.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.Instant;
import java.util.ArrayList;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository repository;

    public AccountServiceImpl(AccountRepository repository){
        this.repository = repository;
    }

    public Account findByUsername(String username) {
        Assert.hasLength(username, "Username is empty");
        return this.repository.findByUsername(username);
    }

    public Account createAccount(String username, String email) {
        Account alreadyExists = this.findByUsername(username);
        Assert.isNull(alreadyExists, "Account with username '" + username + "' already exists");

        Account newAccount = new Account(username, email, Instant.now(), new ArrayList());

        this.repository.save(newAccount);

        return newAccount;
    }

    public Account addAsset(String username, Asset assetToAdd) {
        Account account = this.findByUsername(username);
        Assert.notNull(account, "Account could not be found with name: " + username);
        account.getAssetList().add(assetToAdd);

        this.repository.save(account);

        return account;
    }
}

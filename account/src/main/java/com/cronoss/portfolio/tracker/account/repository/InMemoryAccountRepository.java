package com.cronoss.portfolio.tracker.account.repository;

import com.cronoss.portfolio.tracker.account.domain.Account;

import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements  AccountRepository {

    private static final Map<String, Account> inMemoryAccountData = new HashMap();

    public Account findByUsername(String username) {
        return inMemoryAccountData.get(username);
    }

    public <S extends Account> S save(S entity) {
        inMemoryAccountData.put(entity.getUsername(), entity);
        return entity;
    }

    public <S extends Account> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    public Account findOne(String s) {
        return null;
    }

    public boolean exists(String s) {
        return inMemoryAccountData.containsKey(s);
    }

    public Iterable<Account> findAll() {
        return null;
    }

    public Iterable<Account> findAll(Iterable<String> strings) {
        return null;
    }

    public long count() {
        return inMemoryAccountData.size();
    }

    public void delete(String s) {
        inMemoryAccountData.remove(s);
    }

    public void delete(Account entity) {
        inMemoryAccountData.remove(entity.getUsername());
    }

    public void delete(Iterable<? extends Account> entities) {

    }

    public void deleteAll() {
        inMemoryAccountData.clear();
    }
}
package com.cronoss.portfolio.tracker.account.repository;

import com.cronoss.portfolio.tracker.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String>{

    Account findByUsername(String username);
}

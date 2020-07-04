package cn.sudst.service;

import cn.sudst.domain.Account;

import java.util.List;

/**
 * @author JiadeChen
 */
public interface AccountService {

    /**
     * find all account from table
     * @return List<Account>
     */
    public List<Account> findAll();

    /**
     * save account to table
     * @param account
     */
    public void saveAccount(Account account);
}

package cn.sudst.service.impl;

import cn.sudst.dao.AccountDao;
import cn.sudst.domain.Account;
import cn.sudst.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JiadeChen
 */
@Service(value = "accountService")
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}

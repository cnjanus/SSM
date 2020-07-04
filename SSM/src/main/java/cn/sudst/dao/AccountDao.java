package cn.sudst.dao;

import cn.sudst.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JiadeChen
 */
@Repository(value = "accountDao")
public interface AccountDao {

    /**
     * find all account from table
     * @return List<Account>
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * save account to table
     * @param account
     */
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    public void saveAccount(Account account);
}

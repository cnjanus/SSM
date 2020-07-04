package cn.sdust;

import cn.sudst.service.aspect.AccountServiceAspect;
import cn.sudst.domain.Account;
import cn.sudst.service.AccountService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationConfig.xml"})
public class TestSpring {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Resource(name = "accountServiceAspect")
    private AccountServiceAspect accountServiceAspect;

    @Test
    public void testAccountService() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.findAll();
        accountService.saveAccount(new Account());
    }

    @Test
    public void testMybatis() {
        System.out.println(accountServiceAspect);
        for (Account account : accountService.findAll()) {
            System.out.println(account);
        }
    }

    @Test
    public void testSaveAccount() {
        Account account = new Account();
        account.setMoney(321.0);
        account.setName("ding_ding");

        accountService.saveAccount(account);
    }
}

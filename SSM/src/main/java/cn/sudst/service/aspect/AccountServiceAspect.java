package cn.sudst.service.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author JiadeChen
 */
@Component(value = "accountServiceAspect")
@Aspect
public class AccountServiceAspect {
    @Pointcut("execution(public * cn.sudst.service.impl.AccountServiceImpl.findAll())")
    private void findAll() {}

    @Before(value = "findAll()")
    public void before() {
        System.out.println("before...");
    }

    @After(value = "findAll()")
    public void after() {
        System.out.println("after...");
    }
}

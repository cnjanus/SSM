package cn.sudst.controller;

import cn.sudst.domain.Account;
import cn.sudst.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JiadeChen
 */
@Controller
@RequestMapping(path = {"/account"})
public class AccountController {
    private static String SUCCESS = "success";

    @Resource(name = "accountService")
    private AccountService accountService;

    @RequestMapping(path = {"/findAllAccount"})
    public String finaAllAccount(Model model) {
        model.addAttribute("accountList", accountService.findAll());
        return SUCCESS;
    }

    @RequestMapping(path = {"/saveAccount"})
    public String saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAllAccount");
        return SUCCESS;
    }
}

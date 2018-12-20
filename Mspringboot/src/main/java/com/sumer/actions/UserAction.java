package com.sumer.actions;

import com.sumer.entity.User;
import com.sumer.service.IUserService;
import com.sumer.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@Controller
public class UserAction {
    @Resource
    private IUserService iUserService;
    @RequestMapping("/login.action")
    public String login(User user){
        if (iUserService.loginCheck(user)){
            return "redirect:/success.html";
        }else {
            return "redirect:/error12.html";
        }

    }
}
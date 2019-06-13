package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.UserService;
import web.entity.User;

import org.springframework.ui.Model;

//返回页面字符串信息
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("")
    String getUser(Model model) {
        User user = userService.selectUserById(12);
        System.out.println(user.toString());
        return "userMessage: " + user.toString();
    }
}

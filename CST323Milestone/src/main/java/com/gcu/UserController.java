package com.gcu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gcu.data.entity.UserEntity;
import com.gcu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/create-user")
    public String addUserMessage(Model model) {
        model.addAttribute("message", "This is where you create a user");
        model.addAttribute("userModel", new UserEntity());
        logger.trace("/create user was accessed");
        return "create-user";
    }
    @PostMapping("/create-user")
    public String doCreateUser(UserEntity user, BindingResult bindingResult, Model model) {
        System.out.println("USER FIRST NAME: " + user.getFirstname());
        userService.createUser(user);
        model.addAttribute("newUser", user);
        logger.trace("a user was created");
        return "loggedin";
    }

}
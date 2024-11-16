package iuh.fit.se.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.se.domain.User;
import iuh.fit.se.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handleHello();
        model.addAttribute("name1", test);
        model.addAttribute("name2", "from controller with model");
        return "hello";

    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {

        model.addAttribute("newUser", new User());

        return "admin/user/create";

    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User name1) {
        System.out.println("run here" + name1);
        return "hello";
    }

}

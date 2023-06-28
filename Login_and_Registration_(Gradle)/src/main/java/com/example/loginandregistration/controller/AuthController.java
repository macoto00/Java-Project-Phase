package com.example.loginandregistration.controller;

import com.example.loginandregistration.dto.UserDto;
import com.example.loginandregistration.model.User;
import com.example.loginandregistration.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:index";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model, Principal principal) {
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);

        String loggedInUserEmail = principal.getName();
        User loggedInUser = userService.findByEmail(loggedInUserEmail);

        model.addAttribute("loggedInUserEmail", loggedInUser.getEmail());

        return "users";
    }

}

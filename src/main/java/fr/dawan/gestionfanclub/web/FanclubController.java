package fr.dawan.gestionfanclub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FanclubController {
    @GetMapping("/register")
    public String showForm() {
        return "register_form";
    }

    @GetMapping("/newaccount")
    public String showCreateNewAccountForm() {
        return "new_account_form";
    }
}
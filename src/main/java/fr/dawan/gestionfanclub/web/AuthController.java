package fr.dawan.gestionfanclub.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.dawan.gestionfanclub.service.IServiceUser;

@Controller
public class AuthController {
	
	private IServiceUser iServiceUser;
	
	public AuthController(IServiceUser iServiceUser) {
		this.iServiceUser = iServiceUser;
	}
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
    @GetMapping("/register")
    public String showForm(Model model) {
    	
        return "register_form";
    }

    @GetMapping("/newaccount")
    public String showCreateNewAccountForm() {
        return "new_account_form";
    }
}
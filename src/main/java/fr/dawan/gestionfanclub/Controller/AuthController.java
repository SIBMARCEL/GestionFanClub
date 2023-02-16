package fr.dawan.gestionfanclub.Controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.gestionfanclub.dto.UserDto;
import fr.dawan.gestionfanclub.entities.User;
import fr.dawan.gestionfanclub.enums.Role;
import fr.dawan.gestionfanclub.service.IServiceUser;
import jakarta.validation.Valid;

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
    public String showForm() {
    	
        return "register_form";
    }

    @GetMapping("/newaccount")
    public String showCreateNewAccountForm(Model model) {
    	UserDto user = new UserDto();
    	model.addAttribute("user",user);
        return "new_account_form";
    }
    
    @PostMapping("/newaccount/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model){
        User existingUser = iServiceUser.findUserByPseudo(userDto.getPseudo());

        if(existingUser != null && existingUser.getPseudo() != null && !existingUser.getPseudo().isEmpty()){
            result.rejectValue("pseudo", null, "There is already an account registered with the same pseudo");
        }

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "/new_account_form";
        }
        User user = new User(0l,0,LocalDate.now(),LocalDate.now(),userDto.getEmail(),userDto.getFirstName(),userDto.getLastName(),userDto.getPseudo(),false ,Role.USER, userDto.getPassword(),"", new ArrayList<>());
        iServiceUser.createUser(user);
        return "redirect:/index";
    }
    
    
}
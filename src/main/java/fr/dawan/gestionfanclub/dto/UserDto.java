package fr.dawan.gestionfanclub.dto;

import fr.dawan.gestionfanclub.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private long id;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String pseudo;
	
	@NotEmpty(message = "Email should not be empty")
    @Email
	private String email;
	
	@NotEmpty(message = "Password should not be empty")
	private String password;
	
	@NotEmpty
	private Role role;
}

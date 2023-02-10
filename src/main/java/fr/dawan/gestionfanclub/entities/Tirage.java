package fr.dawan.gestionfanclub.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@DiscriminatorValue("Tirage")
public class Tirage extends Cadeaux {

	private static final long serialVersionUID = 61978318807944281L;
	

	
}
